package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs1 {
    @Given("^I have open the browser$")
    public void iHaveOpenTheBrowser() throws Throwable {
        System.out.println("Step# 1");
    }

    @When("^I open Facebook website$")
    public void iOpenFacebookWebsite() throws Throwable {
        System.out.println("Step# 2");
    }

    @Then("^Login button should exits$")
    public void loginButtonShouldExits() throws Throwable {
        System.out.println("Step# 3");
    }
}
