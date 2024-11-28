package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	 public WebDriver driver;

	    public LoginPage(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }
	    
	  //elements identification
	    @FindBy(how=How.XPATH,using = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	    public static WebElement signin;

	    @FindBy (how=How.ID,using="email")
	    public static WebElement email_box;

	    @FindBy (how=How.ID,using="pass")
	    public static WebElement password_box;

	    @FindBy(how=How.XPATH,using = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")
	    public static WebElement signin_bt;

	    @FindBy(how=How.XPATH,using="//div[@class='panel header']//span[@class='logged-in'][normalize-space()='Welcome, Mohamed Medini!']")
	    WebElement myaccount;

	    //methodes creation

	    public void Get_URL(String url){
	        driver.get(url);
	    }

	    public void click_signin (){
	        signin.click();
	    }
	    public void enter_email (String email){
	        email_box.sendKeys(email);
	    }
	    public void enter_password (String password){
	        password_box.sendKeys(password);
	    }
	    public void click_signin_bt(){
	        signin_bt.click();
	    }
	    public String account_matched() {
	           String account_ob=myaccount.getText();
	           return account_ob;
	    }

}
