package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.ProdPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AddToCard_StepDef {
	
	WebDriver driver =SetUp.driver;
	ProdPage cart= new ProdPage (driver);
	
	
	@Given("i add the first product")
	public void i_add_the_first_product() {
	 cart.click_men();
	 cart.click_jacket();
	 cart.blue_jacket();
	 cart.enter_sizej();
	 cart.enter_colorj();
	 cart.add_jacket();
	}

	@When("i add the second product")
	public void i_add_the_second_product() {
		cart.click_men();
		cart.click_pants();
		cart.gym_pants();
		cart.enter_sizep();
		cart.enter_colorp();
		cart.add_pant();
	}

	@When("i click to card button")
	public void i_click_to_card_button() {
		cart.click_cart();
		cart.click_view();
	   
	}

	@SuppressWarnings("deprecation")
	@Then("i check that the two product are added successfully to my card {string} and {string}")
	public void i_check_that_the_two_product_are_added_successfully_to_my_card_and(String string, String string2) {
		Assert.assertEquals(string,cart.prod1_added());
		Assert.assertEquals(string2,cart.prod2_added());
		System.out.println("THE TWO PRODUCTS ARE ADDED SUCCESSFULLY TO CART");
	  
	}


}
