package utility;

import java.io.File;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extent {
	public ExtentReports extent;
	public ExtentTest logger;

	@BeforeSuite
	public void TestExecution1() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Report/mine+"+screenshot.getCurrentDateTime()+".html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		logger=extent.createTest("TestExecution1");
		logger=extent.createTest("TestExecution2");
		logger=extent.createTest("TestExecution3");

		logger.info("Starting Application");
		logger.pass("success");
		extent.flush();
	}

	
}