package rockwell.pages;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import rockwell.helper.WaitForMethods;
import rockwell.locators.SearchResultLocators;

import java.util.List;

@Slf4j
public class SearchResult extends PageObject {
    WaitForMethods waitForMethods = new WaitForMethods(getDriver());
    public void pickResult(Integer option) {
        log.info("Picking %s result".formatted(option));
        waitForMethods.visibilityOf(SearchResultLocators.SEARCH_RESULT);
        List<WebElement> resultList = getDriver().findElements(SearchResultLocators.SEARCH_RESULT);
        try {
            waitForMethods.staleness(resultList.get(option), 1000);
        } catch (TimeoutException e) {
            //required for stability, mvn verify is slower than local run which results in timeout
        }
        resultList = getDriver().findElements(SearchResultLocators.SEARCH_RESULT);
        resultList.get(option).click();
        log.info("Result picked");
    }
}
