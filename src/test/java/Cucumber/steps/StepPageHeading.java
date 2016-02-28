package Cucumber.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class StepPageHeading {

    WebDriver driver = null;

    @Given("^I am on OLX website$")
    public void i_am_on_OLX_website() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("http://olx.ua/");
    }

  /*  @When("^I click on Cars$")
    public void i_click_on_Cars() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='searchmain-container']/div/div/div[1]/div[3]/div/a/span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='bottom3']/ul/li[1]/a/span/span")).click();
    }

    @When("^I click on Job$")
    public void i_click_on_Job() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='searchmain-container']/div/div/div[1]/div[4]/div/a/span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='bottom6']/ul/li[1]/a/span/span")).click();
    }

    @When("^I click on Animals$")
    public void i_click_on_Animals() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='searchmain-container']//div[6]/div[1]//span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='bottom35']/ul/li[1]/a/span/span")).click();
    }

    @Then("^I check I am on Cars$")
    public void i_check_I_am_on_Cars() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Автобазар Украины"));
    }

    @Then("^I check I am on Job$")
    public void i_check_I_am_on_Job() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Работа в торговле"));
    }

    @Then("^I check I am on Animals$")
    public void i_check_I_am_on_Animals() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Собаки:"));
    }*/

    @When("^I click on ([^\"]*) ([^\"]*)$")
    public void i_click_on_Animals(String link, String link2) throws Throwable {
        driver.findElement(By.xpath(link)).click();
        driver.findElement(By.xpath(link2)).click();
    }

    @Then("^I check I am on ([^\"]*)$")
    public void i_check_I_am_on_Cars(String title) throws Throwable {
        Assert.assertTrue(driver.getTitle().contains(title));
    }

    @And("^I close the browser$")
    public void i_close_the_browser() throws Throwable {
        driver.close();
    }

}
