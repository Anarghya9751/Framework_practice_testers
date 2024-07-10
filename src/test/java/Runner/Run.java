package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/Features",
        glue={"StepDefination"},
        plugin = {"pretty","html:target/report.html/ajay.html"}

)


public class Run {
}
