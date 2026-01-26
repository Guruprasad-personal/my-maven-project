package tests.base;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;

import framework.config.ConfigReader;
import framework.driver.DriverFactory;
import framework.utils.ExtentReportManager;
import com.aventstack.extentreports.ExtentReports;
import framework.utils.ScreenshotUtils;
import java.lang.reflect.Method;

public class BaseTest {

	protected WebDriver driver; // declaring webdriver to use it in child classes
	protected ConfigReader config;
	protected ExtentReports extent;
	protected ExtentTest test;
	
	@BeforeSuite
	public void setupReport() {
		extent =ExtentReportManager.getInstance();
	}

	@BeforeMethod
	public void setUp(Method method) {
		test = extent.createTest(method.getName());
		config = new ConfigReader();
		driver = DriverFactory.initializeDriver(); // starts WebDriver before each test and assiging to driver as return
		driver.get(config.getUrl()); // type of the method is driver.
		

	}

	@AfterMethod
	public void tearDown(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			String path = ScreenshotUtils.captureScreenshot(driver);
			test.fail(result.getThrowable());
			test.addScreenCaptureFromPath(path);
		}else if (result.getStatus()==ITestResult.SUCCESS) {
			test.pass("Test Passed");
		}else if (result.getStatus()==ITestResult.SKIP) {
			test.skip("Test Skipped");
		}
		
		if(driver != null) {
		driver.quit();
		}// quits WebDriver after each test
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}

}
