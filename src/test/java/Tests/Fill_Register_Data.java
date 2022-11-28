package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.My_Account_Page;
import Pages.RegisterPage;

public class Fill_Register_Data extends testBase {
	HomePage homePageobject;
	My_Account_Page myaccountobject;
	RegisterPage Registerobject;
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


	@Test(priority = 3)
	public void userRegister ()
	{
		Registerobject =new RegisterPage(driver);
		try {
			Registerobject.FillRegisterationForm("Omar","Fares","Omar123@gmail.com","asd123", "asd123");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String title = driver.getTitle();
		Assert.assertEquals(title,"My Account");
	}


}
