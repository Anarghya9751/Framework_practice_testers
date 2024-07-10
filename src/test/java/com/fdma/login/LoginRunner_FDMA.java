package com.fdma.login;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test",
        glue={"com.fdma.login"},
        tags="@Login",
        plugin={"pretty","html:target/report.html/login.html"}



)

public class LoginRunner_FDMA {
}
