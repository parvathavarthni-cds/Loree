package cucumbermain;

import java.io.File;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
	@RunWith(Cucumber.class)
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
	

