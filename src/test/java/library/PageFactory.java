package library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory {
	   @FindBy(xpath="//input[@id='pseudonym_session_unique_id']")
	    public static WebElement Emailid_field;
	    
	    
	    @FindBy(id="pseudonym_session_password")
	    public static WebElement Password_field;
	    
	    
	    @FindBy(xpath="//button[contains(text(),'Log In')]")
	    
	    public static WebElement Login_button;
	    
	    @FindBy(xpath="//span[@class='hidden-phone']")
	    public static WebElement header;
}
	    
//	    @FindBy(xpath = "//*[@title='Archana SANDBOX']")    
//	    static WebElement dashboard ;
//	    
//	    @FindBy(xpath ="//*[@id=\"section-tabs\"]/li[9]/a")
//	    static WebElement Loree;
//}
