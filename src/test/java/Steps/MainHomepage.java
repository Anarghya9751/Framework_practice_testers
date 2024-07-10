package Steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class MainHomepage {
WebDriver driver;
    @Given("Enter into homepage and click on login as Institute")
    public void enter_into_homepage_and_click_on_login_as_institute() {
        HomePage home = new HomePage(driver);
        home.clickOnMyAccount();
    }
}
