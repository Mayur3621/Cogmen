package TestLayer;

import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import PageLayer.HomePage;
import UtilsLayer.ExcelReader;

@Test(groups = { "ContactPage", "Regression" }, dependsOnGroups = { "HomePage" })
public class ContactPageTest extends BaseClass {
	private static HomePage homepage;
	private static ContactPage contactpage;

	@Test(priority = 1)
	public void validateUserOnContactPage() {
		homepage = new HomePage();
		homepage.checkContactLink();
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("contact"));
	}

	@Test(priority = 2,dataProvider="contactData")
	public void validateCreatedUser(String fname,String lname,String mname,String email) {
		contactpage = new ContactPage();
		homepage.checkContactLink();
		contactpage.createUser(fname, lname, mname, email);
	}
	
	
	@DataProvider(name="contactData")
	public Object [][] getData()
	{
		ExcelReader excelreader =new ExcelReader(System.getProperty("user.dir")+
				"\\src\\main\\java\\testData\\ContactPageTestData.xlsx");
		
		int rows = excelreader.getRowCount(0);
		int cells = excelreader.getColumnCount(0);
		
		Object [][] data =new Object[rows][cells];
		
		for(int i=0;i<rows;i++)
		{
			for (int j=0;j<cells;j++)
			{
				data[i][j]=excelreader.getData(0, i, j);
			}
		}
		
		return data;
		

		
	}
	
	
	
	
	
	
	
}
