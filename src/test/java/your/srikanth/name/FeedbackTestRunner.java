package your.srikanth.name; // Replace with the actual package name where your step definitions are located

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "your.package.name")
public class FeedbackTestRunner {
}
