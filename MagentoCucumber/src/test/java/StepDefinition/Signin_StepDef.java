package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Signin_StepDef {
	
	WebDriver driver=SetUp.driver;
	LoginPage log=new LoginPage (driver);
	
	
	@Given("i enter the url {string} of the page")
	public void i_enter_the_url_of_the_page(String string) {
	   log.Get_URL(string); 
	}

	@When("i click to signin")
	public void i_click_to_signin() {
	    log.click_signin();
	}

	@When("i enter my email {string}")
	public void i_enter_my_email(String string) {
	   log.enter_email(string);
	}

	@When("i enter my password {string}")
	public void i_enter_my_password(String string) {
	   log.enter_password(string);
	}

	@When("i click to signin button")
	public void i_click_to_signin_button() {
	   log.click_signin_bt();
	}

	@Then("i verify that my account {string} its matched")
	public void i_verify_that_my_account_its_matched(String string) {
		Assert.assertEquals(string,log.account_matched());
		System.out.println("YOU ARE CONNECTED SUCCESSFULLY");
	    
	}
	
	
	
	
	
	
	

}
