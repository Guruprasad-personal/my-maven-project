package framework.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;

	public static WebDriver initializeDriver() {

		// launch chrome driver and maximize the window.

		WebDriverManager.chromedriver().setup(); // this is usd to internally manage chrome version, no need to add explicitly
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
		}

	}

}
