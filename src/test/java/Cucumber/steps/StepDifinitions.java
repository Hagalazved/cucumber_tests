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

public class StepDifinitions {

    WebDriver driver = null;

    @Given("^I am on OLX wesite$")
    public void shouldNavigatedToOlxSite() throws Throwable {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
        driver.get("http://olx.ua/");
    }

    @When("^I am click on contact link$")
    public void shouldClickOnContactLink() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='lastwrapper']/div/div[2]/div[1]/div[2]/ul/li[8]/a/span")).click();
    }

    @And("^populate the contact form$")
    public void shouldPopulateContactForm() throws Throwable {
        driver.findElement(By.xpath(".//*[@id='targetid-reason']/dt/a")).click();
        driver.findElement(By.xpath(".//*[@id='targetid-reason']/dd/ul/li[2]/a")).click();
        driver.findElement(By.xpath(".//*[@id='id-message']")).sendKeys("Вопрос модерации объявления");
        driver.findElement(By.xpath(".//*[@id='id-adId']")).sendKeys("4566125");
        driver.findElement(By.xpath(".//*[@id='id-email']")).sendKeys("pararam@mail.ru");
        driver.findElement(By.xpath(".//*[@id='submit-contact']")).click();
    }

    @Then("^I should on contact confirmation page$")
    public void checkOnContactConformationPage() throws Throwable {
        Assert.assertTrue("Not on contact conformation page",
                driver.findElement(By.xpath(".//*[@id='body-container']/div/div/div/div[1]/p/strong")).getText().equals("Обратная связь"));
    }

}
