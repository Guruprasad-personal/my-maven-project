package tests.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import framework.data.TestDataProvider;
import tests.base.BaseTest;
import testspages.Loginpage;

public class SampleTest extends BaseTest {

	@Test (dataProvider = "searchItem",dataProviderClass = TestDataProvider.class)
	public void verifyAmazonSearch(String searchItem) {
		
		
		Loginpage page = new Loginpage(driver);
		page.searchItem(searchItem);
		Assert.assertTrue(page.getTitle().contains(searchItem));
	

	}

}
