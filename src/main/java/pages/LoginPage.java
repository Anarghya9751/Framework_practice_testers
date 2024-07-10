package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath="//input[@type='email']")
    private WebElement emailField;

    @FindBy(xpath="//input[@type='password']")
    private WebElement passField;

   @FindBy(xpath="//button[text()='Login']")
    private WebElement loginClick;

    public void enterEmail(String passEmail ){
        emailField.sendKeys(passEmail);
    }
    public void passwordField(String passPassword ){
        passField.sendKeys(passPassword);

    }
    public void clickOnLogin(){
        loginClick.click();
    }
    public void enterEmails(String passEmails ){
        emailField.sendKeys(passEmails);
    }
}
