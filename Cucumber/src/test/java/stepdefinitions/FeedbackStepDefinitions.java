package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class FeedbackStepDefinitions {

    private WebDriver driver;

    @Given("the user navigates to JavaTpoint.com")
    public void navigateToJavaTpoint() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();

        // Navigate to JavaTpoint.com
        driver.get("https://www.javatpoint.com/");
    }

    @When("the user clicks on Feedback, then the Feedback page opens")
    public void clickOnFeedback() {
        // Simulate clicking on Feedback link
        WebElement feedbackLink = driver.findElement(By.linkText("Feedback"));
        feedbackLink.click();
    }

    @When("the user submits feedback message")
    public void submitFeedback() {
        // Simulate submitting feedback form
        WebElement feedbackText = driver.findElement(By.id("feedback-text"));
        feedbackText.sendKeys("This is a test feedback message.");

        WebElement submitButton = driver.findElement(By.id("submit-button"));
        submitButton.click();
    }

    @Then("feedback should be received on the admin page")
    public void verifyFeedbackReceived() {
        // Simulate verifying feedback on admin page
        WebElement feedbackMessage = driver.findElement(By.id("admin-feedback"));
        assertNotNull(feedbackMessage);
    }

    @Then("admin can reply to the user")
    public void adminRepliesToUser() {
        // Simulate admin replying to the user
        WebElement replyBox = driver.findElement(By.id("admin-reply"));
        replyBox.sendKeys("Thank you for your feedback!");
        
        WebElement sendButton = driver.findElement(By.id("send-reply"));
        sendButton.click();
    }
    
    @After
    public void tearDown() {
        // Close the browser after each scenario
        if (driver != null) {
            driver.quit();
        }
    }
}
