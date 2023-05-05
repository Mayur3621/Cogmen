package UtilsLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {

	public static void sendKeys(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}

	public static void click(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.click();
		}
	}

	public static void clickOnRadioButton(List<WebElement> ls, String name) {
		for (WebElement abc : ls) {
			if (abc.getAttribute("id").equals(name)) {
				if (!abc.isSelected()) {
					abc.click();
				}

			}
		}
	}

	public static void clickonCheckbox(List<WebElement> ls) {
		for (WebElement abc : ls) {
			abc.click();
		}
	}

	public static WebElement explicitWait(By by, Long seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static void HandleDynamicTable( String monthYear, String date) throws InterruptedException {

		while (true) {
			WebElement wb = driver.findElement(By.xpath("//td[@class='monthTitle']"));
			String a = wb.getText();
			if (a.equals(monthYear)) {
				break;
			} 
			else {
				WebElement next = driver.findElement(By.xpath("//td[@class='next']/button"));
				next.click();
				Thread.sleep(2000);
			}
		}
		driver.findElement(By.xpath("//*[text()='" + date + "']")).click();
	}

}
