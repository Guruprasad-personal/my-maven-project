package tests.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.config.ConfigReader;
import tests.base.BaseTest;
import testspages.Loginpage;

public class SampleTest extends BaseTest {

	@Test
	public void googleSearchTest() {

		// object creation of login page and calling enterSearchText method
		Loginpage loginpage = new Loginpage(driver);
		loginpage.enterSearchText("Amazon");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Amazon"));
		System.out.println("test completed and amazon search is performed");

	}

}
