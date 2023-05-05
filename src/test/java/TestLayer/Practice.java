package TestLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice {

	WebDriver driver = new ChromeDriver();

	@Test(priority = 1)
	public void A() {
		driver.close();
		System.out.println("A method");
	}

	@Test(priority = 0)
	public void B() {
		System.out.println("B method");

	}

	@Test(enabled = false)
	public void C() {
		System.out.println("C method");

	}

	@Test()
	public void D() {
		System.out.println("D method");

	}

	@Test(enabled = false)
	public void E() {
		System.out.println("E method");

	}

	@Test(priority = -2)
	public void F() {
		System.out.println("F method");

	}
}
