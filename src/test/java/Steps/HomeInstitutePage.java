package Steps;

import Utils.ElementUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.InstituteLandPage;
import pages.LoginPage;

import static org.junit.Assert.assertEquals;

public class HomeInstitutePage {
    WebDriver driver;

    @Given("click on PostAJob  and enter all the fields")
    public void click_on_post_a_job_and_enter_all_the_fields(String passEmail, String passPassword) {
       InstituteLandPage landpage = new InstituteLandPage(driver);
        LoginPage loginpages = new LoginPage(driver);
        loginpages.enterEmail(passEmail);
        loginpages.passwordField(passPassword);
        loginpages.clickOnLogin();
       landpage.someElement();

    }
}
