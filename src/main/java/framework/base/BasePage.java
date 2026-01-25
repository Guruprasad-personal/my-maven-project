package framework.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v143.indexeddb.model.Key;

import framework.utils.WaitUtils;

public class BasePage {

	protected WebDriver driver;
	protected WaitUtils wait;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WaitUtils(driver);
	} 
	
	public void sendKeysEnter(By locator, String value) {
		wait.waitForVisibility(locator);
		driver.findElement(locator).sendKeys(value + Keys.ENTER);
	}
	public void click(By locator) {
		wait.waitForVisibility(locator);
		driver.findElement(locator).click();
	}
	public String getTitle() {
	return driver.getTitle();
	}
}
