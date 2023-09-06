package com.niranjan.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Login {
    private WebDriver driver;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("User navigates to javaTpoint.com")
    public void user_is_on_javatpoint_com() {
        driver.get("https://www.javatpoint.com/");
    }

    @When("When the user clicks on Feedback then feedback page opens")
    public void user_clicks_on_feedback_button() {
        WebElement feedbackButton = driver.findElement(By.id("feedback_button"));
        feedbackButton.click();
    }

    @And("The user submits the feedback message")
    public void user_submits_the_feedback() {
        WebElement feedbackForm = driver.findElement(By.id("feedback_form"));
        feedbackForm.findElement(By.name("name")).sendKeys("hi");
        feedbackForm.findElement(By.name("email")).sendKeys("hi@gmail.com");
        feedbackForm.findElement(By.name("message")).sendKeys("sample feedback.");
        feedbackForm.submit();
    }

    @Then("feedback should be received on the admin page")
    public void feedback_should_be_received_on_admin_page() {
        driver.get("https://www.javatpoint.com/admin");
        WebElement loginForm = driver.findElement(By.id("login_form"));
        loginForm.findElement(By.name("username")).sendKeys("admin");
        loginForm.findElement(By.name("password")).sendKeys("admin");
        loginForm.submit();

        WebElement feedbackSection = driver.findElement(By.id("feedback_section"));
        List<WebElement> feedbacks = feedbackSection.findElements(By.tagName("li"));
    }

    @And("admin reply the user")
    public void admin_should_be_able_to_reply_to_user() {
        WebElement replyForm = driver.findElement(By.id("reply_form"));
        replyForm.findElement(By.name("message")).sendKeys("Thank you for your feedback.");
        replyForm.submit();
    }
}
