package rockwell.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import rockwell.pages.OfferPage;

public class OfferPageSteps {

    OfferPage page = new OfferPage();
    @Then("Price should be in selected range")
    public void priceShouldBeInSelectedRange() {
        page.verifyPriceIsInRange();
    }

    @And("User checks credit rate")
    public void userChecksCreditRate() {
        //no idea what credit rate is regarding offers for rent, is it a mistake? Scenario specifies I need to search
        //offers for rent. I'm up for some live-coding during interview once I know what was meant to be done here
    }
}
