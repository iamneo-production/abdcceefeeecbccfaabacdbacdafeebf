package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class FeedbackStepDefinitions {

    @Given("the user navigates to JavaTpoint.com")
    public void navigateToJavaTpoint() {
        // Implement navigation logic here
    }

    @When("the user clicks on Feedback, then the Feedback page opens")
    public void clickOnFeedback() {
        // Implement click action logic here
    }

    @When("the user submits feedback message")
    public void submitFeedback() {
        // Implement feedback submission logic here
    }

    @Then("feedback should be received on the admin page")
    public void verifyFeedbackReceived() {
        // Implement feedback verification logic here
    }

    @Then("admin can reply to the user")
    public void adminRepliesToUser() {
        // Implement admin reply logic here
    }
}
