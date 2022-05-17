package runner;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.membership;
import utility.baseclass;
import utility.screenshot;

public class TestExecution3 
	extends baseclass{

		@BeforeTest
		public void initialze() throws IOException {
			driver = initializeDriver();

		}

		@Test
		public void Basepagenavigation() throws IOException, InterruptedException {

			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			membership m = new membership(driver);
			
			m.getView().click();
		}

			@AfterMethod()
			public void tearDownMethod(ITestResult result) throws IOException {
				if (result.getStatus() == ITestResult.FAILURE) {
					screenshot.captureScreenshot(driver);
				}
			}}

