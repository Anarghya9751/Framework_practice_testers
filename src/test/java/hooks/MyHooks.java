package hooks;

import Utils.ConfigReader;
import factory.DrivenFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.time.Duration;
import java.util.Properties;

public class MyHooks {

    WebDriver driver;

    @Before
    public void setup(){
        Properties prop= ConfigReader.initializeProperties();
         DrivenFactory.initializeBrowser(prop.getProperty("browser"));
       driver = DrivenFactory.getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(prop.getProperty("url"));
    }

  //  @After
   // public void tearDown(Scenario scenario){
//        String scenarioName = scenario.getName().replaceAll(" ","_");
//        if(scenario.isFailed()){
//            byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(outputscenario.attach(srcScreenshot,"image/png", scenarioName));
//
//        }
      //  driver.quit();
   // }

}
