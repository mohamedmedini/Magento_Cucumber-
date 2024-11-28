package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProdPage {
	
	public WebDriver driver; 
	
	 public ProdPage(WebDriver driver){
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }

	
	 //elements identification
	 @FindBy(how=How.XPATH,using = "//span[normalize-space()='Men']")
	    public static WebElement men_bt ;
	 
	 @FindBy(how=How.XPATH,using = "//a[contains(text(),'Jackets')]")
	    public static WebElement jacket ;
	 
	 @FindBy(how=How.XPATH,using="//img[@alt='Jupiter All-Weather Trainer ']")
	   public static WebElement blue_jacket;
	 
	 @FindBy(how=How.XPATH,using="//div[@id='option-label-size-143-item-169']")
	   public static WebElement size_j;
	 
	 @FindBy(how=How.XPATH,using="//div[@id='option-label-color-93-item-50']")
	   public static WebElement color_j;
	 
	 @FindBy(how=How.XPATH,using="//button[@id='product-addtocart-button']")
	   public static WebElement add_j;
	 
	 @FindBy(how=How.XPATH,using="//a[contains(text(),'Pants')]")
	   public static WebElement pants;
	 
	 @FindBy(how=How.XPATH,using="//img[@alt='Kratos Gym Pant']")
	   public static WebElement gym_pant;
	 
	 @FindBy(how=How.XPATH,using="//div[@id='option-label-size-143-item-177']")
	   public static WebElement size_p;
	 
	 @FindBy(how=How.XPATH,using="//div[@id='option-label-color-93-item-49']")
	   public static WebElement color_p;
	 
	 @FindBy(how=How.XPATH,using="//button[@id='product-addtocart-button']")
	   public static WebElement add_p;
	 
	 @FindBy(how=How.XPATH,using="//a[@class='action showcart']")
	   public static WebElement cart_bt;
	 
	 @FindBy(how=How.XPATH,using="//span[normalize-space()='View and Edit Cart']")
	   public static WebElement cartview_bt;
	 
	 @FindBy(how=How.XPATH,using="//td[@class='col item']//a[normalize-space()='Jupiter All-Weather Trainer']")
	   public  WebElement product1 ;
	 
	 @FindBy(how=How.XPATH,using="//td[@class='col item']//a[normalize-space()='Kratos Gym Pant']")
	   public  WebElement product2 ;
	 
	 
	 //methodes creations 
	 
	 public void click_men() {
		 men_bt.click();
	 }
	 public void click_jacket() {
		 jacket.click();
	 }
	 public void blue_jacket() {
		 blue_jacket.click();
	 }
	 public void enter_sizej() {
		 size_j.click();
	 }
	 public void enter_colorj() {
		 color_j.click();
	 }
	 public void add_jacket() {
		 add_j.click();
	 }
	 public void click_pants() {
		 pants.click();
	 }
	 public void gym_pants() {
		 gym_pant.click();
	 }
	 public void enter_sizep() {
		 size_p.click();
	 }
	 public void enter_colorp() {
		 color_p.click();
	 }
	 public void add_pant() {
		 add_p.click();
	 }
	 public void click_cart() {
		 cart_bt.click();
	 }
	 public void click_view() {
		 cartview_bt.click();
	 }
	 
	 public  String prod1_added() {
		     String prod1_ob=product1.getText();
		     return prod1_ob;	
     }
      public String prod2_added() {
		     String prod2_ob=product2.getText();
		     return prod2_ob;	
     }

}
