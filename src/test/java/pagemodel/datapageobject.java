package pagemodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class datapageobject {
    @FindBy(name="username")
    WebElement txt_username;

    @FindBy(name="email")
    WebElement txt_email;

    @FindBy(name="phno")
    WebElement txt_phno;

    @FindBy(name="pwd")
    WebElement txt_pwd;
    @FindBy(name="confirmpwd")
    WebElement txt_confirmpwd;

    WebDriver driver;
    public datapageobject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void usernametext(String username){
        driver.findElement((By) txt_username).sendKeys(username);
        //txt_username.sendKeys(username);
    }
    public  void emailtext(String email){
      //  driver.findElement((By) txt_password).sendKeys(password);
        txt_email.sendKeys(email);
    }
    public  void phnotext(String phno){
        //  driver.findElement((By) txt_password).sendKeys(password);
        txt_phno.sendKeys(phno);
    }

    public  void pwdtext(String pwd){
        //  driver.findElement((By) txt_password).sendKeys(password);
        txt_pwd.sendKeys(pwd);

    }






}

