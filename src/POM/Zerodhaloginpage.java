package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodhaloginpage {

	@FindBy(xpath="//input[@id='userid']") private WebElement userid;
	@FindBy(xpath="//input[contains(@id,'pass')]") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement login;
	
	public Zerodhaloginpage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void Enteruserid(String user) {

		userid.sendKeys(user);
	}
	
	public void Enterpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void Clickonlogin() {
		login.click();
	} 
}
