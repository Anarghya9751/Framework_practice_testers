package com.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Stepde {

public WebDriver driver;
    @Given("Open the url")
    public void Open_the_url() {

        driver=new ChromeDriver();
        driver.manage().window().maximize();;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");

    }

    @And("Enter the Username and password")
    public void enter_the_username_and_password() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("pooja@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("pooja@gmail.com");
         }

    @When("click the button")
    public void click_the_button() {
        driver.findElement(By.name("login")).click();
        }


}
