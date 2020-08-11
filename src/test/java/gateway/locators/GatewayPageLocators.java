package gateway.locators;

import org.openqa.selenium.By;

public class GatewayPageLocators {
    public static final By SOME_BUTTON = By.xpath("//*[@id='cookies']/a[@class='accept']");
    public static final By SEND_BUTTON = By.id("send");
    public static final By MESSAGE_BOX = By.cssSelector("#bramka_div > div.sms_message > textarea");
    public static final By CAPTCHA = By.xpath("/html/body/div[8]/div[2]");
}
