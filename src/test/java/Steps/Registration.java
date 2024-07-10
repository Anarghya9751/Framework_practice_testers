package Steps;

import factory.DrivenFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class Registration {
    WebDriver driver;
    @Given("user navigates to register account page")
    public void user_navigates_to_register_account_page() {
    driver   = DrivenFactory.getDriver();

    }

    @When("User enters the below fields")
    public void user_enters_the_below_fields(DataTable dataTable) {
Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
driver.findElement(By.id("")).sendKeys(dataMap.get(""));
  driver.findElement(By.id("")).sendKeys(dataMap.get("lastName"));
   driver.findElement(By.id("")).sendKeys(dataMap.get(""));
    }

    @When("user selects privacy policy")
    public void user_selects_privacy_policy() {

    }

    @When("user clicks on continue button")
    public void user_clicks_on_continue_button() {

    }

    @Then("user account should get created successfully")
    public void user_account_should_get_created_successfully() {

    }

    @When("user selects yes for Newsletter")
    public void user_selects_yes_for_newsletter() {

    }

    @Then("user account should get proper error")
    public void user_account_should_get_proper_error() {

    }


}
