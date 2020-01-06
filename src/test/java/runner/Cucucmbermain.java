package runner;

import java.io.File;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.CucumberOptions;
	
	
@CucumberOptions(
		features ="Features",
		glue = {"Screens"}
		
		)
		public class Cucucmbermain extends AbstractTestNGCucumberTests {
			//public class Cucumber_Main {

				@BeforeClass()
				public void setup() throws Exception {


					
				}
				@AfterClass()
				public void teardown() throws UnirestException {
					

				}
		}
		
