//package library;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//
//import PageAction.LoginAction;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Loree_functionalities{
//	
//public static WebDriver driver;
//
//	public void LoginPage_verification(String url) throws InterruptedException
//	{
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
//		firefoxOptions.addArguments("--headless");
//				driver = new FirefoxDriver(firefoxOptions);
//				driver.get(url);
//		//driver.manage().window().setSize(new Dimension(1920, 1080));
//		driver.manage().window().maximize();
//		return driver;
//	}
//
//	public void action(String emailid,String Password) {
//		LoginAction login = PageFactory.initElements(driver, LoginAction.class);
//		login.loginAction(emailid, Password);
//		
////		Emailid_field.sendKeys(emailid);
//////		System.out.println("Email field is Located");
////	    Password_field.sendKeys(Password);
//////	    System.out.println("Password field is located");
////	    Login_button.click();
////	    return driver;  
//	}
//	public void Dashboard(WebDriver driver)
//	{
//		
//		LoginAction login = PageFactory.initElements(driver, LoginAction.class);
//		login.loginBtnClick();
////		String expected="Dashboard";
////		String actual=header.getText();
////		Assert.assertEquals(actual, expected);
////		return driver;
//	}
//}
//
