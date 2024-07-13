package stepdeffiles;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Orangestep {
WebDriver driver;
    @Given("Open the browser")
    public void open_the_browser() {

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @And("^valid user as (.) And pass as (.)$")
    public void valid_user_as_username_and_pass_as_password(String username,String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);


    }
    @When("hit the button")
    public void hit_the_button() {
            driver.close();
    }


}
