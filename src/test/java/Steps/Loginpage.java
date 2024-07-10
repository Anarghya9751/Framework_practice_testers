package Steps;

import Utils.ElementUtils;
import factory.DrivenFactory;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Loginpage {
WebDriver driver;
LoginPage loginpage;

@After
public void threadSleep() throws InterruptedException {
    Thread.sleep(2000);
}

@Given("user has navigated to login page")
public void user_has_navigated_to_login_page() throws InterruptedException {
       driver = DrivenFactory.getDriver();
    HomePage homepage = new HomePage(driver) ;
    homepage.clickOnMyAccount();


    }

    @When("user has entered valid {string} email")
    public void user_has_entered_valid_email(String passEmail) {
loginpage = new LoginPage(driver);

        loginpage.enterEmail(passEmail);
    }

    @When("user has entered valid  {string} password")
    public void user_has_entered_valid_password(String passPassword) {
    loginpage = new LoginPage(driver);
loginpage.passwordField(passPassword);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
  loginpage = new LoginPage(driver);
   loginpage.clickOnLogin();

    }

    @Then("user should get successfully logged in popup")
    public void user_should_get_successfully_logged_in_popup() {
      ElementUtils   utils = new ElementUtils(driver);
        utils.acceptAlert(10);


    }

    @When("user has entered Invalid  {string} email")
    public void user_has_entered_invalid_email(String passEmail) {
       loginpage = new LoginPage(driver);
        loginpage.enterEmail(passEmail);
    }



    @When("user has entered Invalid  {string} password")
    public void user_has_entered_invalid_password(String passPassword) {
       loginpage = new LoginPage(driver);
        loginpage.passwordField(passPassword);

    }
    @When("user has entered Invalid  {string} Iemail")
    public void user_has_entered_invalid_iemail(String passEmails) {
    loginpage = new LoginPage(driver);
   loginpage.enterEmails(passEmails);
    }
    @When("user has entered valid  {string} Ipassword")
    public void user_has_entered_valid_ipassword(String Ipassword) {
        loginpage = new LoginPage(driver);
        loginpage.passwordField(Ipassword);
    }




}
