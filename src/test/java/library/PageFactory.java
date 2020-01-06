//package library;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;
//
//public class PageFactory {
//	
//	WebDriver driver;
//	
//	public PageFactory(WebDriver driver) {
//		this.driver= driver;
//	}
//	
//	   @FindBy(xpath="//input[@id='pseudonym_session_unique_id']")
//	    public static WebElement Emailid_field;
//	    
//	    
//	    @FindBy(id="pseudonym_session_password")
//	    public static WebElement Password_field;
//	    
//	    
//	    @FindBy(xpath="//button[contains(text(),'Log In')]")
//	    public static WebElement Login_button;
//	    
//	    @FindBy(xpath="//span[@class='hidden-phone']")
//	    public static WebElement header;
//	    
//	    @Test
//	    public void loginAction(String email, String pwd) {
//	    	Emailid_field.sendKeys(email);
//	    	Password_field.sendKeys(pwd);
//	    }
//	    
//	    @Test
//	    public void loginBtnClick() {
//	    	Login_button.click();
//	    }
//}
//	    
////	    @FindBy(xpath = "//*[@title='Archana SANDBOX']")    
////	    static WebElement dashboard ;
////	    
////	    @FindBy(xpath ="//*[@id=\"section-tabs\"]/li[9]/a")
////	    static WebElement Loree;
////}
