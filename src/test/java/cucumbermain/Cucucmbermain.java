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
	glue = {"library.Loree_functionalities.java"}
	
	)
	public class Cucucmbermain extends AbstractTestNGCucumberTests {
		//public class Cucumber_Main {

			@BeforeClass()
			public void setup() throws Exception {
				ExtentProperties extentProperties = ExtentProperties.INSTANCE;
				extentProperties.setReportPath("output/myreport.html");
				extentProperties.setProjectName("The Hive Automation");
			}
			@AfterClass()
			public void teardown() throws UnirestException {
				Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
				Reporter.setSystemInfo("user", System.getProperty("user.name"));
				Reporter.setSystemInfo("os", System.getProperty("os.name"));
				Reporter.setSystemInfo("Browser", "Google Chrome");
				Reporter.setTestRunnerOutput("Sample test runner output message");

			}
	}
