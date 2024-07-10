package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstituteLandPage {
    WebDriver driver;

    public InstituteLandPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Post A Job']")
    private WebElement element;



   public void someElement() {
       element.click();
    }
}
