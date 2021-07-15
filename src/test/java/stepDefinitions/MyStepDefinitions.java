package stepDefinitions;
//package my.package.name

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on the home landing page$")
    public void user_is_on_the_home_landing_page() throws Throwable {
       
        
        System.out.println("I am learning bdd framework");
    }

    @When("^User enters user name and password$") 
    public void user_enters_user_name_and_password() throws Throwable {
    	System.out.println("I am learning bdd framework");
    }

    @Then("^Home page getting displayed\\.$")
    public void home_page_getting_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      
    	System.out.println("I am learning bdd framework");
    }

}