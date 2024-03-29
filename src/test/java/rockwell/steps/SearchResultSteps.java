package rockwell.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import rockwell.pages.SearchResult;

public class SearchResultSteps {
    SearchResult page = new SearchResult();

    @When("User picks {int} search result")
    public void pickSearchOption(Integer option) {
        page.pickResult(option);
    }

}
