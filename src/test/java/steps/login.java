package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
public static WebDriver driver;

    @Given("Open the Browser and enter the url")
    public void open_the_browser_and_enter_the_url() {

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @When("enter valid user name and password")
    public void enter_valid_user_name_and_password() {
driver.findElement(By.id("email")).sendKeys("vijay");
driver.findElement(By.id("pass")).sendKeys("qwer");

    }

    @Then("click on login button")
    public void click_on_login_button() {

        driver.findElement(By.id("loginbutton")).click();
    }

    @Given("Open chrome and enter url")
    public void open_chrome_and_enter_url() {

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
    }

    @Then("User give invalid user name and password")
    public void user_give_invalid_user_name_and_password() {

        driver.findElement(By.id("email")).sendKeys("vijay");
        driver.findElement(By.id("pass")).sendKeys("qwer");


    }

    @Then("Click on submit button")
    public void click_on_submit_button() {

        driver.findElement(By.id("loginbutton")).sendKeys();
    }


}
