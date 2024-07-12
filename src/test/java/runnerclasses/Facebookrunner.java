package runnerclasses;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/featurefiles/facebook.feature",
        glue = "stepdeffiles",
        plugin = {"pretty","html:target/report.html/login.html"}
)

public class Facebookrunner {


}

