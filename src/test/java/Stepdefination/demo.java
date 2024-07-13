package Stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
    WebDriver driver;
    @Given("open the urls")
    public void open_the_urls() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");


    }

    @Given("Enter the datails")
    public void enter_the_datails() {
        driver.findElement(By.id("email")).sendKeys("sappidi");
        driver.findElement(By.id("pass")).sendKeys("poojitha");


    }

    @When("click the login page")
    public void click_the_login_page() {
        driver.findElement(By.id("loginbutton")).click();

    }



    @Given("open  urls")
    public void open_urls() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");


    }

    @Given("Enter the username")
    public void enter_the_username() {
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("mobiles");


    }




}
