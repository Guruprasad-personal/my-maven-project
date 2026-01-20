package tests.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import framework.config.ConfigReader;
import framework.driver.DriverFactory;

public class BaseTest {

	protected WebDriver driver; // declaring webdriver to use it in child classes
	protected ConfigReader config;

	@BeforeMethod
	public void setUp() {
		config = new ConfigReader();
		driver = DriverFactory.initializeDriver(); // starts WebDriver before each test and assiging to driver as return
		driver.get(config.getUrl()); // type of the method is driver.

	}

	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver(); // quits WebDriver after each test
	}

}
