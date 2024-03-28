package gateway.steps;

import gateway.pages.SerenityGatewayPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SerenityGatewaySteps {

    private SerenityGatewayPage page = new SerenityGatewayPage();

    @Given("Open gateway homepage")
    public void open() {
        page.open();
    }

    @When("Click cookie accept button")
    public void clickCookiesAcceptButton() {
        page.clickCookiesAcceptButton();
    }

    @When("Click send button")
    public void clickSendButton() {
        page.clickSendButton();
    }

    @When("Input text into message field")
    public void typeMessage() { page.typeMessage(); }

    @Then("Verify captcha is displayed")
    public void verifyCaptchaIsDisplayed() { page.verifyCaptchaIsDisplayed(); }

}
