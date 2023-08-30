import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class FeedbackStepDefinitions {

    @Given("the user navigates to JavaTpoint.com")
    public void navigateToJavaTpoint() {
        // Add code to navigate to the website
    }

    @When("the user clicks on Feedback, then the Feedback page opens")
    public void clickOnFeedback() {
        // Add code to simulate clicking on Feedback
    }

    @When("the user submits feedback message")
    public void submitFeedback() {
        // Add code to simulate submitting feedback
    }

    @Then("feedback should be received on the admin page")
    public void verifyFeedbackReceived() {
        // Add code to verify feedback received on admin page
    }

    @Then("admin can reply to the user")
    public void adminRepliesToUser() {
        // Add code to simulate admin replying to the user
    }
}
