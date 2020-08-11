package gateway.pages;

import gateway.helper.WaitForMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static gateway.locators.GatewayPageLocators.*;



public class VanillaGatewayPage {


    public static final Logger LOGGER =  LoggerFactory.getLogger(VanillaGatewayPage.class);

    public WebDriver driver;
    private WaitForMethods waitForMethods;

    public VanillaGatewayPage(WebDriver driver) {
        this.driver = driver;
        waitForMethods = new WaitForMethods(driver);
    }

    public WebDriver getDriver() {return driver;}

    public VanillaGatewayPage open() {
        getDriver().get("https://sms.priv.pl/");
        return this;
    }

    public VanillaGatewayPage clickSomeButton() {
        LOGGER.info("Click some button");

        WebElement button = getDriver().findElement(SOME_BUTTON);
        waitForMethods.clickable(SOME_BUTTON, 5);
        button.click();
        return this;
    }

    public VanillaGatewayPage clickSendButton() {
        LOGGER.info("Click send button");

        WebElement button = getDriver().findElement(SEND_BUTTON);
        waitForMethods.clickable(SEND_BUTTON, 5);
        button.click();
        return this;
    }
}
