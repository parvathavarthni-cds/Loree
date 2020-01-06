package library;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loree_functionalities extends PageFactory {
	
public static WebDriver driver;

	public WebDriver LoginPage_verification(WebDriver driver,String url) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(url);
		//driver.manage().window().setSize(new Dimension(1920, 1080));
		driver.manage().window().maximize();
		return driver;
	}

	public WebDriver Login(WebDriver driver,String emailid,String Password) throws InterruptedException 
	{
		
		Emailid_field.sendKeys(emailid);
//		System.out.println("Email field is Located");
	    Password_field.sendKeys(Password);
//	    System.out.println("Password field is located");
	    Login_button.click();
	    return driver;  
	}
	public WebDriver Dashboard(WebDriver driver)
	{
		String expected="Dashboard";
		String actual=header.getText();
		Assert.assertEquals(actual, expected);
		return driver;
	}
}


