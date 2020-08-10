package gateway.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static gateway.locators.GatewayPageLocators.*;

@DefaultUrl("https://sms.priv.pl/")

public class SerenityGatewayPage extends PageObject
{

    private static final Logger LOGGER = LoggerFactory.getLogger(SerenityGatewayPage.class);

    public void clickSomeButton() {
        LOGGER.info("Click some button");

        WebElement button = getDriver().findElement(SOME_BUTTON);
        waitFor(button).waitUntilClickable();
        button.click();
    }

    public void clickSendButton() {
        LOGGER.info("Click send button");

        WebElement button = getDriver().findElement(SEND_BUTTON);
        waitFor(button).waitUntilClickable();
        button.click();
    }
}
