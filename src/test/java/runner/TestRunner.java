package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/feature",
        glue={"Steps","hooks" },
        tags = "@Login",
        plugin ={"pretty","html:target/report.html/class.html"}
)


public class TestRunner {
}
