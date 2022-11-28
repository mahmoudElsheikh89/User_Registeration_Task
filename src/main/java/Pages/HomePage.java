package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends pageBase {

	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath = "//header/div[1]/div[5]/div[1]/ul[1]/li[1]/a[1]")
	WebElement myAccountLink;


	public void open_My_Account()
	{
		clickLink(myAccountLink);

	}


}
