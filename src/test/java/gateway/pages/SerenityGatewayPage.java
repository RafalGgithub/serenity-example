package gateway.pages;

import gateway.data.TestData;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static gateway.locators.GatewayPageLocators.*;

@DefaultUrl("https://sms.priv.pl/")

public class SerenityGatewayPage extends PageObject
{

    TestData testData = new TestData();
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

    public void typeMessage() {
        LOGGER.info("Type " + TestData.getData_String() + testData.getCurrent_Date() + " into message field");

        WebElement messageBox = getDriver().findElement(MESSAGE_BOX);
        waitFor(messageBox).waitUntilVisible();
        messageBox.clear();
        messageBox.sendKeys(TestData.getData_String() + testData.getCurrent_Date());
    }

    public void verifyCaptchaIsDisplayed() {
        LOGGER.info("Verify captcha is visible");

        WebElement captcha = getDriver().findElement(CAPTCHA);
        Assert.assertTrue("Captcha is not displayed", captcha.isDisplayed());
    }
}
