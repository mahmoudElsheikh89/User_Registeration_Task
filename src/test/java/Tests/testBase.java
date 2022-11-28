package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class testBase
{
	public static WebDriver driver ;
	@SuppressWarnings("deprecation")
	@BeforeSuite

	public void startDriver() 
	{
		String chromepath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromepath);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://magento-demo.lexiconn.com/");
	}

	@AfterSuite
	public void stopDriver()
	{
		driver.quit();

	}

}
