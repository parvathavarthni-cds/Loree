package Screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import library.Loree_functionalities;

public class Login{
	public static WebDriver driver;
	public static String url="https://crystaldelta.instructure.com/login/canvas";
	public static String emailid ="archana.manoj@crystaldelta.com";
    public static String Password="logout@123";

@Given("^as a user I am on the canvas login page$")
public void as_a_user_I_am_on_the_canvas_login_page() throws Throwable {
    Loree_functionalities LoginPage_verificationobj=PageFactory.initElements(driver,Loree_functionalities.class);
   driver= LoginPage_verificationobj.LoginPage_verification(driver,url);
}
	
@When("^user enters vaild email id and password$")
public void user_enters_valid_email_id_and_password() throws Throwable {

    Loree_functionalities Loginobj=PageFactory.initElements(driver,Loree_functionalities.class);
	driver=Loginobj.Login(driver,emailid, Password); 
}

@Then("^user navigate to Loree$")
public void user_navigate_to_Loree() throws Throwable {
    
    Loree_functionalities dashboardobj=PageFactory.initElements(driver,Loree_functionalities.class);
    driver=dashboardobj.Dashboard(driver);

}
}
