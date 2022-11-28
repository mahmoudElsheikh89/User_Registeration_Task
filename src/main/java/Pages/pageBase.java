package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class pageBase {

	protected static  WebDriver driver;
	

	//Create Constructor

	public pageBase (WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	//-----------click link-----------------
	protected static void clickLink(WebElement link) 
	{

		link.click();
	}  
	//-----------click Button-----------------
	protected static void clickLButton(WebElement button) 
	{

		button.click();
	}  
	
	//------------send text Box values-----------------------------
	protected static void settxtforwebelementtxtbox(WebElement textbox , String value)
	{

		textbox.sendKeys(value);
	}


}


