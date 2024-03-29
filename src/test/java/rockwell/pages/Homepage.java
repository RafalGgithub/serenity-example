package rockwell.pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import rockwell.data.TestData;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import rockwell.helper.WaitForMethods;

import java.util.List;

import static rockwell.locators.HomepageLocators.*;

@DefaultUrl("https://www.morizon.pl/")
@Slf4j
public class Homepage extends PageObject
{

    WaitForMethods waitForMethods = new WaitForMethods(getDriver());
    JavascriptExecutor js = (JavascriptExecutor) getDriver();

    public void pickSearchOption(String option) {
        log.info("Picking %s option".formatted(option));

        WebElement button = getDriver().findElement(SEARCH_OPTION_BUTTON);
        waitFor(button).waitUntilClickable();
        button.click();

        waitForMethods.visibilityOf(By.xpath("//*[@id='search']/div[2]//span[text()='" + option + "']"));
        WebElement optionButton = getDriver().findElement(By.xpath("//*[@id='search']/div[2]//span[text()='" + option + "']"));
        optionButton.click();
        log.info("Option picked");
    }

    public void inputCity(String city) {
        log.info("Input %s city in search bar".formatted(city));
        WebElement cityInput = getDriver().findElement(CITY_INPUT);
        cityInput.sendKeys(city);
        getDriver().findElement(CITY_INPUT_EXPAND).click();
        waitForMethods.visibilityOf(By.xpath("//*[@id='search']/div[4]/div/div/div[3]/div/ul[2]/li[1]/div/span[text()='" + city + "']"));
        getDriver().findElement(By.xpath("//*[@id='search']/div[4]/div/div/div[3]/div/ul[2]/li[1]/div/span[text()='" + city + "']")).click();
        log.info("City inputted");
    }

    public void acceptCookies() {
        log.info("Accepting cookies");
        waitForMethods.visibilityOf(COOKIE_ACCEPT_BUTTON);
        getDriver().findElement(COOKIE_ACCEPT_BUTTON).click();
        log.info("Cookies accepted");
    }

    public void inputPriceRange(String priceFrom, String priceTo) {
        log.info("Inputting %s-%s price range".formatted(priceFrom,priceTo));

        TestData.setPriceFrom(priceFrom);
        TestData.setPriceTo(priceTo);

        getDriver().findElement(MORE_FILTERS_BUTTON).click();

        getDriver().findElement(PRICE_FROM_INPUT).sendKeys(priceFrom);
        getDriver().findElement(PRICE_TO_INPUT).sendKeys(priceTo);
        log.info("Price range entered");
    }

    public void pickAdvancedFilteringOptionByText(String option) {
        log.info("Picking advanced filtering option %s".formatted(option));
        By optionLocator = By.xpath(
                "//*[@id='search']/div[5]/div/div/div/div[1]/div[4]/div[2]/div[4]/label//*[text()='" + option + "']");
        List<WebElement> button = getDriver().findElements(optionLocator);
        if (button.isEmpty()) {
            getDriver().findElement(MORE_FILTERS_BUTTON).click();
            waitForMethods.visibilityOf(optionLocator);
        }
        getDriver().findElement(optionLocator).click();
        log.info("Advanced filtering option picked");
    }

    public void clickSearchButton() {
        log.info("Clicking search button");
        waitForMethods.clickable(SEARCH_BUTTON);
        WebElement button = getDriver().findElement(SEARCH_BUTTON);
        js.executeScript("arguments[0].click();", button);
        log.info("Search clicked");
    }
}
