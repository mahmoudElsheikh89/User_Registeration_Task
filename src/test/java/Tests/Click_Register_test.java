package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.RegisterPage;
import Pages.HomePage;
import Pages.My_Account_Page;

public class Click_Register_test extends testBase {
	HomePage homePageobject;
	My_Account_Page myaccountobject;
	@Test(priority = 1)
	public void userclickMyAccount () throws InterruptedException {
		homePageobject =new HomePage(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 600)");
		homePageobject.open_My_Account();
	}


	@Test(priority = 2)
	public void userclickregister () throws InterruptedException {
		myaccountobject =new My_Account_Page(driver);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 600)");
		myaccountobject.open_User_Register();
	}
	

	}

