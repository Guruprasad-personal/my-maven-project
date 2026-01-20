package tests.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import framework.driver.DriverFactory;

public class BaseTest {
	
	protected WebDriver driver; //declaring webdriver to use it in child classes
	
	@BeforeMethod
    public void setUp() {
       driver =  DriverFactory.initializeDriver();  // starts WebDriver before each test and assiging to driver as return type of the method is driver.
       											
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();        // quits WebDriver after each test
    }


}
