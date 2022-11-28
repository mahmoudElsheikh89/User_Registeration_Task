package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class My_Account_Page extends pageBase{

	public My_Account_Page(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	WebElement userRegisterLink;


	public void open_User_Register()
	{
		clickLink(userRegisterLink);

	}


	

}
