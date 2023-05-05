package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//div[@class='header item']")
	private WebElement logo;

	@FindBy(xpath = "//div[@id='top-header-menu']/b")
	private WebElement companyName;

	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactLink;

	@FindBy(xpath = "//a[@href='/deals']")
	private WebElement dealsLink;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean checkLogoStatus() {
		return logo.isDisplayed();
	}

	public String capturecompanyName() {
		return companyName.getText();
	}

	public void checkContactLink() {
		UtilsClass.click(contactLink);
	}

	public void checkDealsLink() {
		UtilsClass.click(dealsLink);
	}

	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	
	
	
	
	
	
	
	
	
	
}
