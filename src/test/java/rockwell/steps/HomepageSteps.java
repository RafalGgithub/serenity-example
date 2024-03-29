package rockwell.steps;

import io.cucumber.java.en.And;
import rockwell.pages.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps {

    private Homepage page = new Homepage();

    @Given("User opens homepage")
    public void open() {
        page.open();
    }

    @Then("User accepts cookie policy")
    public void acceptCookies() {
        page.acceptCookies();
    }
    @When("User picks {} option")
    public void pickSearchOption(String option) {
        page.pickSearchOption(option);
    }

    @When("User inputs {} city")
    public void inputCity(String city) {
        page.inputCity(city);
    }

    @When("User inputs from {} to {} price range")
    public void userInputsFromToPriceRange(String priceFrom, String priceTo) {
        page.inputPriceRange(priceFrom, priceTo);
    }

    @When("User filters {} advanced filtering option")
    public void userFiltersAdvancedFilteringOption(String option) {
        page.pickAdvancedFilteringOptionByText(option);
    }

    @When("User clicks search button")
    public void userClicksSearchButton() {
        page.clickSearchButton();
    }
}
