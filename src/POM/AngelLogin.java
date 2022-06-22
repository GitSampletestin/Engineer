package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelLogin {
	@FindBy(xpath = "//input[@id='txtUserID']")
	private WebElement userid;
	@FindBy(xpath = "//input[@id='txtTradingPassword']")
	private WebElement pass;
	@FindBy(xpath = "//a[@id='loginBtn']")
	private WebElement login;

	public AngelLogin(WebDriver driver) { // constructor is always public
		PageFactory.initElements(driver, this); // @initElements find the element with the help of @FindBy annoation
	}

	public void enteruserid(String email) {
		userid.sendKeys(email);
	}

	public void enteruserpass(String password) {
		pass.sendKeys(password);
	}

	public void clickonlogin() {  //sign in
		login.click();
	}
}
