package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage extends pageBase{

	public RegisterPage(WebDriver driver) {
		super(driver);

	}
	//-----First Name Element---------- 
	@FindBy(id = "firstname")
	WebElement FirstName;

	//-----Last Name Element---------- 
	 @FindBy(id = "lastname")
	WebElement LastName;

	//-----Email Address Element---------- 
	@FindBy(id = "email_address" )
	WebElement EmailAddress;

	//-----Password Element----------
	@FindBy(id = "password")
	WebElement Password;

	//-----Confirmation Password Element----------
	@FindBy(id =  "confirmation")
	WebElement ConfirmationPassword;

	//-----Sign up for newsletter Element----------
	@FindBy(id =  "is_subscribed")
	WebElement SignUpForNewsletter;

	//-----Register Button Element----------

	@FindBy(xpath = "//body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")
	WebElement RegisterBtn;
	

	public void FillRegisterationForm( String firstname ,String lastname ,String email ,String password,String confirmpassword) throws InterruptedException 
	{
		settxtforwebelementtxtbox(FirstName, firstname);
		settxtforwebelementtxtbox(LastName, lastname);
		settxtforwebelementtxtbox(EmailAddress, email);
		settxtforwebelementtxtbox(Password, password);
		settxtforwebelementtxtbox(ConfirmationPassword, confirmpassword);
		clickLButton(RegisterBtn);

	}
}







