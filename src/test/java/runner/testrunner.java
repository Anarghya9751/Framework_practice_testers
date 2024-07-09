package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/Resources/featureFiles",
            glue = "Steps",
            plugin = {"pretty","html:target/report.html/login.html"},
            tags = "@login"

    )


    public class EVM_Runner {

    }

runner class


