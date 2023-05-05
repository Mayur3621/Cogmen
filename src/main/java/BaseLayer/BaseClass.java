package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
//	public static Properties prop;
//
//	public BaseClass() {
//		prop = new Properties();
//		try {
//			FileInputStream fis = new FileInputStream(
//					System.getProperty("user.dir") + "//src//main//java//ConfigLayer//config.properties");
//			prop.load(fis);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}

	public static void inilization() {
		
//		if(prop.getProperty("browser").equals("edge"))
//		{
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//		
//			
//		}
//		else if(prop.getProperty("browser").equals("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
//		else if(prop.getProperty("browser").equals("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
//		else if(prop.getProperty("browser").equals("ie"))
//		{
//			WebDriverManager.iedriver().setup();
//			driver=new InternetExplorerDriver();
//		}
//	
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get(prop.getProperty("url"));
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver =new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();
		driver.get("https://ui.cogmento.com/");
	}

}
