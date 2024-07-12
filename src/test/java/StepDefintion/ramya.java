package StepDefintion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ramya {
    WebDriver driver;
    @Given("entering the url")
    public void entering_the_url() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");


    }

    @When("enter the data")
    public void enter_the_data() {
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("mobiles");

    }

    @Given("Enter the urll")
    public void enter_the_urll() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.meesho.com/");


    }

    @When("data")
    public void data() {
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("women dresses");
    }


}
