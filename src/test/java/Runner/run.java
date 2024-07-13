package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Feature",
        glue = {"Stepdefination"},
        tags = "@pooja",

        plugin = {"pretty","html:target/report.html/login.html"}
)
public class run {
}
