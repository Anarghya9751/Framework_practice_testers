package Stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step {
    WebDriver driver;

    @Given("url")
    public void url() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");



    }

    @And("Enter the username and password")
    public void enter_the_username_and_password() {
        driver.findElement(By.id("email")).sendKeys("poojitha");
        driver.findElement(By.id("pass")).sendKeys("poojitha");
    }

    @Then("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.id(" loginbutton")).click();

    }





}
