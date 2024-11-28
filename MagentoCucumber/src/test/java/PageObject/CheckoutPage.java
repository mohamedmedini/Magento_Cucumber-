package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
	
	public WebDriver driver;
	
	//constractors creations
	
	public CheckoutPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);			
	}
	
	
	
	//elements identifications 
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Proceed to Checkout']")
	public static WebElement checkout_bt; 
	
	@FindBy(how=How.XPATH,using="//button[@class='action action-show-popup']//span")
	public static WebElement newaddress_bt; 
	
	@FindBy(how=How.XPATH,using="//input[@name='company']")
	public static WebElement company_box; 
	
	@FindBy(how=How.XPATH,using="//select[contains(@name,'country_id')]")
	public static WebElement country_list; 
	
	@FindBy(how=How.XPATH,using="//input[@name='city']")
	public static WebElement city_box; 
	
	@FindBy(how=How.XPATH,using="//input[@name='postcode']")
	public static WebElement zipcode_box ; 
	
	@FindBy(how=How.XPATH,using="//input[contains(@name,'street")
	public static WebElement streetadd_box ; 
	
	@FindBy(how=How.XPATH,using="//input[@name='telephone']")
	public static WebElement phonenumber_box ; 
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Ship here']")
	public static WebElement shiphere_bt ; 
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Next']")
	public static WebElement next_bt ; 
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Place Order']")
	public static WebElement placeorder_bt ; 
	
	@FindBy(how=How.XPATH,using="//span[@class='base']")
	 WebElement purchase_msg ; 
	
	
	//metheodes creations
	
	public void  click_checkout() {
		checkout_bt.click();
	}
	public void click_newaddress() {
		 newaddress_bt.click();
	}
	public void enter_company_name(String company) {
		company_box.sendKeys(company);
	}
	public void select_country(String country) {
		Select list_country=new Select(country_list);
		list_country.selectByValue(country);
	}
	public void enter_city(String city) {
		city_box.sendKeys(city);
	}
	public void enter_zip(String zip) {
		zipcode_box.sendKeys(zip);
	}
	public void enter_address(String address) {
		streetadd_box.sendKeys(address);
	}
	public void enter_phonenumber(String phone) {
		phonenumber_box.sendKeys(phone);
	}
	public void click_shiphere() {
		shiphere_bt.click();
	}
	public void click_next() {
		next_bt.click();
	}
	public void click_placeorder() {
		placeorder_bt.click();
	}
	public String order_text() {
		   String order_msg= purchase_msg.getText() ;
	return order_msg;
	}
	
	
	
	
	
	
	
	
	
	

}
