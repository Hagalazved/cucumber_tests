package Cucumber.steps;

import Cucumber.pageObject.ContactConfirmPage;
import Cucumber.pageObject.ContactPage;
import Cucumber.pageObject.LandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ZooTest {

    public WebDriver driver = new FirefoxDriver();
    LandingPage lendingpage;
    ContactPage contactpage;
    ContactConfirmPage contactConfirmPage;

    @Given("^I am on the zoo siteweb$")
    public void i_am_on_the_zoo_siteweb() throws Throwable {
     /*   driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://thetestroom.com/webapp/index.html");*/
        lendingpage = new LandingPage(driver);
        lendingpage.navigateToWebApp();
    }

    @When("^I am click on \"([^\"]*)\"$")
    public void i_am_click_on(String link) throws Throwable {
      //  driver.findElement(By.id(link.toLowerCase() + "_link")).click();
        contactpage = lendingpage.navigateToContactPage(link);
    }

    @And("^I enter \"([^\"]*)\" into the name field$")
    public void i_enter_into_the_name_field(String value) throws Throwable {
        //driver.findElement(By.name("name_field")).sendKeys(value);
        contactpage.setNameField(value);
    }

    @And("^I enter \"([^\"]*)\" into the address field$")
    public void i_enter_into_the_address_field(String value) throws Throwable {
        //driver.findElement(By.name("address_field")).sendKeys(value);
        contactpage.setAddressField(value);
    }

    @And("^I enter \"([^\"]*)\" into the postcode field$")
    public void i_enter_into_the_postcode_field(String value) throws Throwable {
        //driver.findElement(By.name("postcode_field")).sendKeys(value);
        contactpage.setPostcodeField(value);
    }

    @And("^I enter \"([^\"]*)\" into the email field$")
    public void i_enter_into_the_email_field(String value) throws Throwable {
        //driver.findElement(By.name("email_field")).sendKeys(value);
        contactpage.setEmailField(value);
    }

    @And("^I submit the contact form$")
    public void i_submit_the_contact_form() throws Throwable {
       // driver.findElement(By.id("submit_message")).click();
        contactConfirmPage = contactpage.clickSubmitButton();
    }

    @And("^I populate the entri form$")
    public void i_populate_the_entri_form() throws Throwable {
        contactpage
                .setNameField("name")
                .setAddressField("address")
                .setPostcodeField("postcode")
                .setEmailField("email");
    }

    @Then("^I am check I am on page configuretion$")
    public void i_am_check_I_am_on_page_configuretion() throws Throwable {
        //Assert.assertTrue(driver.findElement(By.cssSelector(".content h1")).getText().equals("We have your message"));
        Assert.assertTrue(contactConfirmPage.getPageTitle().contains("We have your message"));
    }

    @And("^Close browser$")
    public void close_browser() throws Throwable {
       // driver.close();
        contactConfirmPage.closeDrive();
    }

}
