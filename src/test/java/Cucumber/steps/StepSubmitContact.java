package Cucumber.steps;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepSubmitContact {

    WebDriver driver = null;

    @Given("^I am on the OLX site$")
    public void navigateToOLX() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("http://olx.ua/");
    }

    @When("^I navigate to contact$")
    public void navigateToContact() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='lastwrapper']/div/div[2]/div[1]/div[2]/ul/li[8]/a/span")).click();
    }

    @And("^I submit form with submit data$")
    public void submitContactForm(DataTable table) throws Throwable {

        List<List<String>> data = table.raw();

        driver.findElement(By.xpath(".//*[@id='targetid-reason']/dt/a")).click();
        driver.findElement(By.xpath(".//*[@id='targetid-reason']/dd/ul/li[2]/a")).click();
        driver.findElement(By.xpath(".//*[@id='id-message']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath(".//*[@id='id-adId']")).sendKeys(data.get(2).get(1));
        driver.findElement(By.xpath(".//*[@id='id-email']")).sendKeys(data.get(3).get(1));
        driver.findElement(By.xpath(".//*[@id='submit-contact']")).click();
    }

    @Then("^I check that the form has been submitted$")
    public void checkConfigurationPage() throws Throwable {
        Assert.assertTrue("Not on contact conformation page",
                driver.findElement(By.xpath(".//*[@id='body-container']/div/div/div/div[1]/p/strong")).getText().equals("Обратная связь"));
    }

}
