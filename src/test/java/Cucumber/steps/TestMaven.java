package Cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class TestMaven {

    @Given("^Step one$")
    public void step_one() throws Throwable {
        System.out.println("TestMaven_OneStep");
    }

    @When("^Step two$")
    public void step_two() throws Throwable {
        System.out.println("TestMaven_TwoStep");
    }

    @Then("^Step three$")
    public void step_three() throws Throwable {
        System.out.println("TestMaven_ThreeStep");
    }

    @Then("^Step three2$")
    public void step_three2() throws Throwable {
        Assert.assertTrue(false);
    }

}
