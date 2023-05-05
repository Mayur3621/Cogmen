package TestLayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

@Test(groups= {"LoginPage","Regression"})
public class LoginPageTest extends BaseClass{

	
	@BeforeTest
	public void setUp()
	{
		BaseClass.inilization();
	}
	
	@Test
	public void validateLoginFunctionality()
	{
		LoginPage loginpage =new LoginPage();
		loginpage.loginFunctionality("dnyaneshkadam0702@gmail.com", "7798913075");
		//loginpage.loginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
}
