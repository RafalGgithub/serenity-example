package gateway.steps;

import gateway.pages.SerenityGatewayPage;
import net.thucydides.core.annotations.Step;

public class SerenityGatewaySteps {

    private SerenityGatewayPage page;

    @Step("Open gateway homepage")
    public void open() {
        page.open();
    }

    @Step("Click some button")
    public void clickCookiesAcceptButton() {
        page.clickCookiesAcceptButton();
    }

    @Step("Click send button")
    public void clickSendButton() {
        page.clickSendButton();
    }

    @Step("Input text into message field")
    public void typeMessage() { page.typeMessage(); }

    @Step("Verify captcha is displayed")
    public void verifyCaptchaIsDisplayed() { page.verifyCaptchaIsDisplayed(); }

}
