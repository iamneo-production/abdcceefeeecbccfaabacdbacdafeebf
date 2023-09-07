package your.srikanth.name; // Replace with your actual package name

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.After;

public class FeedbackSteps {
    private WebDriver driver;

    @Given("the user navigates to JavaTpoint.com")
    public void navigateToJavaTpoint() {
        // Set up the WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();

        // Navigate to JavaTpoint.com
        driver.get("https://www.javatpoint.com");
    }

    @When("the user clicks on Feedback, then the Feedback page opens")
    public void clickFeedback() {
        // Click on the Feedback link
        WebElement feedbackLink = driver.findElement(By.linkText("Feedback"));
        feedbackLink.click();
    }

    @When("the user submits feedback message")
    public void submitFeedback() {
        // Fill out and submit the feedback form
        WebElement feedbackForm = driver.findElement(By.id("feedback-form"));
        WebElement feedbackMessage = feedbackForm.findElement(By.id("message"));
        feedbackMessage.sendKeys("This is a test feedback message.");
        WebElement submitButton = feedbackForm.findElement(By.id("submit-button"));
        submitButton.click();
    }

    @Then("feedback should be received on the admin page")
    public void verifyFeedbackReceived() {
        // Implement code to verify feedback is received on the admin page
        // This depends on the actual behavior of the website and admin page structure.
    }

    @Then("admin can reply to the user")
    public void adminReplyToUser() {
        // Implement code to verify admin can reply to the user
        // This depends on the actual behavior of the website and admin reply functionality.
    }

    @After
    public void closeBrowser() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
