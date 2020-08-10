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
    public void clickSomeButton() {
        page.clickSomeButton();
    }

    @Step
    public void clickSendButton() {
        page.clickSendButton();
    }

}
