package Cucumber.steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractStep {

    protected static WebDriver driver;

    protected WebDriver getDriver(){
        if (driver == null){
            driver = new FirefoxDriver();
        }
        return driver;
    }

}
