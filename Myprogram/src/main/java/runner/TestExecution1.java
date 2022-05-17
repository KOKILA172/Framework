package runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pageobject.Searchclass;
import utility.Exceldata;

import utility.baseclass;
import utility.configure;
import utility.extent;
//import utility.extent;
import utility.logcls;
import utility.screenshot;

public class TestExecution1 extends baseclass {
	public static Logger log = LogManager.getLogger(baseclass.class.getName());

	@BeforeTest
	public void initialze() throws IOException {
		driver = initializeDriver();

	}

	@Test
	public void Basepagenavigation() throws IOException, InterruptedException {

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

		Searchclass s = new Searchclass(driver);
		Exceldata e = new Exceldata();
		screenshot s1 = new screenshot();
		configure c = new configure();
		logcls l = new logcls();

		s.getSearch().sendKeys(e.getStringData("first", 0, 0));
		s.getDestination().sendKeys(e.getStringData("first", 0, 1));
		Thread.sleep(3000);
		s.getDestination().sendKeys("The Taj Mahal Palace Mumbai");
		s.getDestination().sendKeys(Keys.ARROW_DOWN);
		s.getDestination().sendKeys(Keys.ENTER);
		
		
		log.info("login succes");
	}

	// for 2 data
	// s.getEmail().sendKeys(e.getStringData("login",0,0),e.getStringData("login",0,1));

	@AfterMethod()
	public void tearDownMethod(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			screenshot.captureScreenshot(driver);
		}

	}

	
	  @AfterTest public void teardown() 
	  { 
		  driver.close();
	  driver=null; }
	 

}
