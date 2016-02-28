package Cucumber.pageObject;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class AbstractPage {

    protected WebDriver driver;

    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }

    public LandingPage navigateToWebApp(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://thetestroom.com/webapp/index.html");
        return new LandingPage(driver);
    }

    public void closeDrive(){
        driver.quit();
    }

}
