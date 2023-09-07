package your.package.name; // Replace with the actual package name where your step definitions are located

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "your.package.name")
public class FeedbackTestRunner {
}
