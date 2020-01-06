package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;

import PageAction.LoginAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login{
	public static WebDriver driver;
	public static String url="https://crystaldelta.instructure.com/login/canvas";
//	public static String emailid ="archana.manoj@crystaldelta.com";
//    public static String Password="logout@123";

@Given("^as a user I am on the canvas login page$")
public void as_a_user_I_am_on_the_canvas_login_page() throws Throwable {
	WebDriverManager.firefoxdriver().setup();
	FirefoxOptions firefoxOptions = new FirefoxOptions();
	firefoxOptions.addArguments("--headless");
			driver = new FirefoxDriver(firefoxOptions);
			driver.get(url);
	//driver.manage().window().setSize(new Dimension(1920, 1080));
	driver.manage().window().maximize();
}

@When("^user enters vaild \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_vaild_and(String emailid, String password) throws Throwable {
	LoginAction login = PageFactory.initElements(driver, LoginAction.class);
	login.loginAction(emailid, password);
}

@Then("^user navigate to Loree$")
public void user_navigate_to_Loree() throws Throwable {
    
	LoginAction login = PageFactory.initElements(driver, LoginAction.class);
	login.loginBtnClick();

}
}
