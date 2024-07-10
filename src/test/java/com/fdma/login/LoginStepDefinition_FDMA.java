package com.fdma.login;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagemodel.datapageobject;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinition_FDMA {
        public WebDriver driver;
    //datapageobject data;


    @Given("open the Browser")
    public void open_the_browser() {
        driver=new ChromeDriver();
    }
    @And("navigate to the url")
    public void navigate_to_the_url() {
        driver.get("http://localhost:3000/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    }

    @And("click the login button")
    public void click_the_login_button() {
        driver.findElement(By.xpath("//a[text()='Login']")).click();

    }
    @And("click the user button")
    public void click_the_user_button() {
        driver.findElement(By.xpath("//a[text()='User']")).click();

    }
    @And("click the signup link")
    public void click_the_signup_link() {
        driver.findElement(By.xpath("//a[text()='signup']")).click();

    }
    @When("^Enter the username as (.*)$")
    public void enter_the_username_as_(String username) {
        driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(username);
      //data.usernametext(username);
    }
    @When("^Enter the Email as (.*)$")
    public void enter_the_email_as(String email) {
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys(email);
       //data.emailtext(email);
    }
    @When("^Enter the phoneno as (.*)$")
    public void enter_the_phoneno_as(String phno1) {
       driver.findElement(By.xpath("//*[@name='phno']")).sendKeys("6584841234");
       //data.phnotext(phno);
    }
    @When("^Enter the password (.*)$")
    public void enter_the_password(String pass) {

            driver.findElement(By.xpath("//*[@name='pwd']")).sendKeys(pass);
       // data.pwdtext(pass);
    }
    @When("^Enter the confirmpassword (.*)$")
    public void enter_the_confirmpassword(String Confirm) {
        driver.findElement(By.xpath("//*[@name='confirmed']")).sendKeys("Sathya@2020");
       //data.pwdtext(Confirm);
    }
    @Then("click the register button1")
    public void click_the_register_button1() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
       //data.clickbutton(text);
        driver.switchTo().alert().accept();


    }


}





