package Cucumber.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class StepPageTitle {

    WebDriver driver = null;

    @Given("^I am on the OLX website$")
    public void i_am_on_the_OLX_website() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("http://olx.ua/");
    }

    @When("^I navigate to \"([^\"]*)\" \"([^\"]*)\"$")
    public void i_navigate_to(String link, String link2) throws Throwable {
        driver.findElement(By.xpath(link)).click();
        driver.findElement(By.xpath(link2)).click();
    }

    @Then("^I check page title is \"([^\"]*)\"$")
    public void i_check_page_title_is(String title) throws Throwable {
        Assert.assertTrue(driver.getTitle().contains(title));
    }

    @Then("^I close browser$")
    public void i_close_browser() throws Throwable {
        driver.close();
    }

  /*  @Given("^I am on the OLX website$")
    public void i_am_on_the_OLX_website() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("http://olx.ua/");
    }

    @When("^I navigate to cars$")
    public void i_navigate_to_cars_page() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='searchmain-container']/div/div/div[1]/div[3]/div/a/span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='bottom3']/ul/li[1]/a/span/span")).click();
    }

    @Then("^I check page title is cars$")
    public void i_check_page_title_is_cars() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Автобазар Украины"));
    }


    @When("^I navigate to job$")
    public void i_navigate_to_job_page() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='searchmain-container']/div/div/div[1]/div[4]/div/a/span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='bottom6']/ul/li[1]/a/span/span")).click();
    }

    @Then("^I check page title is job$")
    public void i_check_page_title_is_job() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Работа в торговле"));
    }

    @When("^I navigate to animals$")
    public void i_navigate_to_animals_page() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='searchmain-container']//div[6]/div[1]//span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='bottom35']/ul/li[1]/a/span/span")).click();
    }

    @Then("^I check page title is animals$")
    public void i_check_page_title_is_animals() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Собаки:"));
    }

    @And("^I close browser$")
    public void i_close_browser() throws Throwable {
        driver.close();
    }*/

}
