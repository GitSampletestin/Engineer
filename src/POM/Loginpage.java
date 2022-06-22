package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(xpath="//input[@id='email']") private WebElement email; //all the data members are private
	@FindBy(xpath="//input[@id='pass']") private WebElement password; 
	@FindBy(xpath="//button[@name='login']") private WebElement login;
	@FindBy(xpath="//a[text()='Forgotten password?']") private WebElement forgottpasswod ;
	public Loginpage (WebDriver driver) {  // constructor is always public
		PageFactory.initElements(driver, this);  // @ initelments find by the element with the help of @FindBy annotation
			
		}
	
	public void enterEmail(String emailaddress) {  // all the member functions are public
		email.sendKeys( emailaddress);
	}
	
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
		
	public void clickonlogin() {
		login.click();
	}
	
	public void clickonforgotpassword() {
		 forgottpasswod.click();
	}
	
	
	}
	
	

