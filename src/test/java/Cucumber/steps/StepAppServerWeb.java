package Cucumber.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepAppServerWeb {

    @Given("^I have open a \"([^\"]*)\" window$")
    public void i_have_open_a_window(String window) throws Throwable {
        System.out.println("Open a window for " + window);
    }

    @When("^I click on somelink$")
    public void i_click_on_somelink() throws Throwable {
        System.out.println("Click on some link");
    }

    @Then("^A new window opens$")
    public void a_new_window_opens() throws Throwable {
        System.out.println("Window should be open");
    }

}
