package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pageobject.Searchclass;

public class baseclass {
	public static WebDriver driver;
	public Properties prop;
	
	

	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Mindtree\\Myprogram\\congif.properties");

		prop.load(fis);
		String browserName = prop.getProperty("browser");

		System.out.println(browserName);
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Mindtree\\Myprogram\\target\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	


	
	
	

}
