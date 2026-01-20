package framework.base;

import org.openqa.selenium.WebDriver;

import framework.utils.WaitUtils;

public class BasePage {

	protected WebDriver driver;
	protected WaitUtils wait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtils(driver);
	}
}
