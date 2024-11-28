package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.CheckoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Checkout_StepDef {
	
	WebDriver driver= SetUp.driver;
	CheckoutPage check= new CheckoutPage(driver);
	
	
	@Given("i click checkout button")
	public void i_click_checkout_button() {
	  check.click_checkout(); 
	}

	@Given("i click new adress button")
	public void i_click_new_adress_button() {
	  check.click_newaddress(); 
	}

	@When("i enter my company {string}")
	public void i_enter_my_company(String string) {
	  check.enter_company_name(string);  
	}

	@When("i select my country {string} and my city {string}")
	public void i_select_my_country_and_my_city(String string, String string2) {
	   check.select_country(string);
	   check.enter_city(string2);
	}

	@When("i enter my Zip Adress {string} my street Adress {string} and my Phone number {string}")
	public void i_enter_my_zip_adress_my_street_adress_and_my_phone_number(String string, String string2, String string3) {
	   check.enter_zip(string);
	   check.enter_address(string2);
	   check.enter_phonenumber(string3);
	}

	@When("i click to Ship Here and click to next button")
	public void i_click_to_ship_here_and_click_to_next_button() {
	   check.click_shiphere();
	   check.click_next();
	}

	@Then("i click to palceorder button")
	public void i_click_to_palceorder_button() {
	    check.click_placeorder();
	}

	@SuppressWarnings("deprecation")
	@Then("i verify my order with the message {string}")
	public void i_verify_my_order_with_the_message(String string) {
		Assert.assertEquals(string, check.order_text());
	}
	

}
