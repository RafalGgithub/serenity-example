package rockwell.pages;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import rockwell.data.TestData;

import java.math.BigDecimal;

import static rockwell.locators.OfferPageLocators.OFFER_PRICE;

@Slf4j
public class OfferPage extends PageObject {

    public void verifyPriceIsInRange() {
        log.info("Checking if price is in previously selected range");
       BigDecimal price = new BigDecimal(getDriver().findElement(OFFER_PRICE).getText()
               .replace(" zł", "")
               .replace(" ", ""));

        MatcherAssert.assertThat(price, Matchers.both(Matchers.greaterThanOrEqualTo(new BigDecimal(TestData.getPriceFrom())))
                .and(Matchers.lessThanOrEqualTo(new BigDecimal(TestData.getPriceTo()))));
        log.info("Price %s is between %s and %s".formatted(price, TestData.getPriceFrom(), TestData.getPriceTo()));
    }
}
