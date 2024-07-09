package com.stepdefinition.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Login",
        glue = {"com.stepdefinition"},
        plugin = {"pretty","html:target/report.html/class.html"}

)
public class Run {
}
