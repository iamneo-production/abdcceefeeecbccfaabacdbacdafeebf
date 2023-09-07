package your.package.name; // Replace with your actual package name

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "your.package.name")
public class FeedbackTestRunner {
}
