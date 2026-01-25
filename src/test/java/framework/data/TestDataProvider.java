package framework.data;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider(name = "searchItem")
	public Object[][] getSearchData() {

		return new Object[][] { { "Mobile" }, { "Monitor" }, { "Camera" } };

	}
}
