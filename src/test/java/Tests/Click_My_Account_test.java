package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.My_Account_Page;

public class Click_My_Account_test extends testBase {
	HomePage homePageobject;
	@Test
	public void userclickMyAccount () throws InterruptedException {
		homePageobject =new HomePage(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 600)");
		homePageobject.open_My_Account();
	


	}

}



