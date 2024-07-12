package RunnerClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/featurefiles",
        glue = {"StepDefintion"},
        plugin = {"pretty","html:target/report.html/login.html"},
tags =" @ramya"


)
public class runnerclass {
}
