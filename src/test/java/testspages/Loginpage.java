package testspages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import tests.base.BasePage;

public class Loginpage extends BasePage {

	// locator for search text in goodle
	By searchBox = By.cssSelector("textarea[class='gLFyf']");

	// Constructor
	public Loginpage(WebDriver driver) {
		super(driver);
	}

	public void enterSearchText(String searchText) {
		// calling explicitwait method from WaitUtils class
		wait.waitForVisibility(searchBox).sendKeys(searchText + Keys.ENTER);
	}

	public void getTitle() {
		System.out.println(driver.getTitle());
	}

}
