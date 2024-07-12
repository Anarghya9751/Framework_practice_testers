package StepDefintion;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class loginpagesteps {
    WebDriver driver ;

    @Given ("Navigate to login page")
    public void navigate_to_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
}
    @And("Enter the username")
    public void enter_the_username() {
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ramyarao");
    }
    @And("Enter the password")
    public void enter_the_password() {
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ramyarao@1214");

    }
    @When("Click on login button")
    public void click_on_login_button() {
driver.findElement(By.xpath("//button[@name='login']")).click();
    }
    @Then("user successfully navigate to homepage")
    public void user_successfully_navigate_to_homepage() {

    }

}
