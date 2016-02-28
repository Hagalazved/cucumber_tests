package Cucumber.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class StepZoo extends AbstractStep{


   WebDriver driver = getDriver();

    @Given("^I am on the zoo site$")
    public void i_am_on_the_zoo_site() throws Throwable {
      //  driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://thetestroom.com/webapp/index.html");
    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String link) throws Throwable {
        driver.findElement(By.id(link.toLowerCase() + "_link")).click();
    }

    @Then("^I set the start date to \"([^\"]*)\"$")
    public void i_set_the_start_date_to(String dropItem) throws Throwable {
        Select dropDown = new Select(driver.findElement(By.id("start_select")));
        dropDown.selectByVisibleText(dropItem);

    }

    @Then("^I populate contact form$")
    public void i_populate_contact_form() throws Throwable {
        driver.findElement(By.name("name_field")).sendKeys("name test");
        driver.findElement(By.id("rdona")).click();
        driver.findElement(By.id("cadop")).click();
    }

    @And("^I close browsers$")
    public void i_close_browser() throws Throwable {
        driver.close();
    }


}
