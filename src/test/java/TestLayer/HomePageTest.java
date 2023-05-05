package TestLayer;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

@Test(groups = { "HomePage","Regression" }, dependsOnGroups = { "LoginPage" })
public class HomePageTest extends BaseClass {
	private static HomePage homepage;

	@Test(priority = 1)
	public void validateHomePageTitle() {
		homepage = new HomePage();
		AssertJUnit.assertEquals(homepage.getTitle(), "Cogmento CRM");
	}

	@Test(priority = 2)
	public void validateHomePageUrl() {
		AssertJUnit.assertEquals(homepage.getCurrentUrl().contains("cogmento"), true);
	}

	@Test(priority = 3)
	public void validateHomePageLogo() {
		AssertJUnit.assertEquals(homepage.checkLogoStatus(), true);
	}

	@Test(priority = 4)
	public void validateContactLink() {
		homepage.checkContactLink();
		AssertJUnit.assertEquals(driver.getCurrentUrl().contains("contacts"), true);
	}

	@Test(priority = 5)
	public void validateDealsLink() {
		homepage.checkDealsLink();
		AssertJUnit.assertEquals(driver.getCurrentUrl().contains("deals"), true);
	}

}
