package testspages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	
	//Constructor
	public Loginpage(WebDriver driver) {
		this.driver =driver;
	}
	
	//Locators
	
	By searchBox = By.cssSelector("textarea[class='gLFyf']");
	
	//Actions
	
	public void enterSearchText(String searchText) {
		
		driver.findElement(searchBox).sendKeys(searchText + Keys.ENTER);
		
	}
	
	public void getTitle() {
		System.out.println(driver.getTitle());
	}

}
