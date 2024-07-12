package stepdeffiles;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Facebook {
    WebDriver driver;
    @Given("open url into browser")
    public void open_url_into_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.facebook.com/login/");
    }

    @And("enter valid username")
    public void enter_valid_username() {

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("swathisirigiri294@gmail.com");
    }

    @And("enter valid password")
    public void enter_valid_password() {
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("swathi9969");

    }

    @When("click on login button")
    public void click_on_login_button() {

        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
    }





}
