package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Step {
public WebDriver driver;
    @Given("open the uirl")
    public void open_the_uirl() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @And("enter the username")
    public void enter_the_username() {
        driver.findElement(By.id("email")).sendKeys("ajay@gmail.com");
       }
    @And("enter the password")
    public void enter_the_password() {
        driver.findElement(By.id("pass")).sendKeys("12345");

    }
    @Then("click the button")
    public void click_the_button() {
        driver.findElement(By.name("login")).click();
         }
    @When("navigate to the home page")
    public void navigate_to_the_home_page() {
        driver.close();;
        }


}
