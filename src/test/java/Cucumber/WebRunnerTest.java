package Cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        format = {"pretty", "html:target/html/"},
        features = {"src/test/resources/feature_suite/"},
        tags = {"@WebDriver"}
)
public class WebRunnerTest {

}