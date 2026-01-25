package testspages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import framework.base.BasePage;

public class Loginpage extends BasePage {

	// locator for search text in goodle
	By searchBox = By.cssSelector("input[placeholder='Search Amazon']");

	// Constructor
	public Loginpage(WebDriver driver) {
		super(driver);
	}

	public void searchItem(String searchText) { 
		// calling explicitwait method from WaitUtils class
		sendKeysEnter(searchBox, searchText);
		click(searchBox);
	}



}
