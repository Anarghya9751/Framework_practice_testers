package com.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class step {
    public WebDriver driver;
    @Given("open the url")
    public void open_the_url() {

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");




    }
    @And("open the username  and password")
    public void open_the_username_and_password() {
        driver.findElement(By.id("email")).sendKeys("varsh@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");

    }
    @Then("click the login click")
    public void click_the_login_click() {
        driver.findElement(By.name("login")).click();

    }

}


