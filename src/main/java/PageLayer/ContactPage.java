package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class ContactPage extends BaseClass{

	@FindBy(xpath="//a[@href='/contacts/new']")
	private WebElement createButton;
	
	@FindBy(name="first_name")
	private WebElement fname;
	
	@FindBy(name="last_name")
	private WebElement lname;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(name="middle_name")
	private WebElement mname;
	
	
	public ContactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createUser(String firstname,String lastname)
	{
		UtilsClass.click(createButton);
		UtilsClass.sendKeys(fname, firstname);
		UtilsClass.sendKeys(lname, lastname);
		UtilsClass.click(saveButton);
	}
	
	public void createUser(String firstname,String lastname,String middlename)
	{
		UtilsClass.click(createButton);
		UtilsClass.sendKeys(fname, firstname);
		UtilsClass.sendKeys(lname, lastname);
		UtilsClass.sendKeys(mname, middlename);
		UtilsClass.click(saveButton);
		
	}
	

	@FindBy(xpath="//button[text()='Public']")
	private WebElement publicaccessbutton;
	
	@FindBy(xpath="(//div[@role='listbox'])[3]")
	private WebElement listDropDown;
	
	@FindBy(xpath="//div[@class='visible menu transition']/div/span")
	private WebElement name;
	
	@FindBy(name="value")
	private WebElement email;
	
	public void createUser(String firstname,String lastname,String middlename,String Email)
	{
		UtilsClass.click(createButton);
		UtilsClass.sendKeys(fname, firstname);
		UtilsClass.sendKeys(lname, lastname);
		UtilsClass.sendKeys(mname, middlename);
		UtilsClass.click(publicaccessbutton);
		UtilsClass.click(listDropDown);
		UtilsClass.click(name);
		UtilsClass.sendKeys(email, Email);
		UtilsClass.click(saveButton);
		
	}
	
	
	
	
	
	
	
	
	

}
