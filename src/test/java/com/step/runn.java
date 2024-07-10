package com.step;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Feature",
        glue = {"com.step"},
        plugin = {"pretty","html:target/report.html/class.html"}

)


public class runn {
}
