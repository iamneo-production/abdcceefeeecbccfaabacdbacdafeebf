package stepdefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/home/coder/project/workspace/Cucumber/src/test/java/stepdefinitions/feedback.feature", glue = "stepdefinitions")
public class TestRunner {
}
