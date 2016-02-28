package Cucumber.steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class StepAdopt {

    WebDriver driver = null;

    @Before("@web")
    public void setUpWeb(){
        System.out.println("BeforeWeb");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
    }

    @After("@web")
    public void tearDownWeb(){
        System.out.println("AfterWeb");
        driver.quit();
    }

    @Given("^I am on OLX website now$")
    public void i_am_on_OLX_website_now() throws Throwable {
        driver.get("http://olx.ua/");
    }

    @When("^I am navigate to contact$")
    public void i_am_navigate_to_contact() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='lastwrapper']/div/div[2]/div[1]/div[2]/ul/li[8]/a/span")).click();
    }

    @And("^I am choose message theme$")
    public void i_am_choose_message_theme() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='targetid-reason']/dt/a")).click();
        driver.findElement(By.xpath(".//*[@id='targetid-reason']/dd/ul/li[2]/a")).click();
    }

    @And("^populate this contact form$")
    public void populate_this_contact_form() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='id-message']")).sendKeys("Вопрос модерации объявления");
        driver.findElement(By.xpath(".//*[@id='id-adId']")).sendKeys("4566125");
        driver.findElement(By.xpath(".//*[@id='id-email']")).sendKeys("pararam@mail.ru");
        driver.findElement(By.xpath(".//*[@id='submit-contact']")).click();
    }

    @Then("^There should on contact confirmation page$")
    public void there_should_on_contact_confirmation_page() throws Throwable {
        Assert.assertTrue("Not on contact conformation page",
                driver.findElement(By.xpath(".//*[@id='body-container']/div/div/div/div[1]/p/strong")).getText().equals("Обратная связь"));
    }

}
