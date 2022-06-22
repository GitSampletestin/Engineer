package Firstlecture;

import org.openqa.selenium.WebDriver;

import POM.Loginpage;
import firstlec.Browse1;

public class Test {
	
	public void loginWithoutCredentials() {
		WebDriver driver = Browse1.openBrowser("https://www.facebook.com/");
		Loginpage obj = new Loginpage(driver);
		obj.clickonlogin();
	}
	
	
	public void LoginWithvalidCredentials() {
		WebDriver driver = Browse1.openBrowser("https://www.facebook.com/");
		Loginpage obj = new Loginpage(driver);
		obj.enterEmail("velocity");
		obj.enterpassword("katraj");
		obj.clickonlogin();
		obj.clickonforgotpassword();
	}
	
    public void LoginWithoutPassword() {
		WebDriver driver = Browse1.openBrowser("https://www.facebook.com/");
		Loginpage obj = new Loginpage(driver);
		obj.enterEmail("velocity");
		obj.clickonlogin();
	}
  
	   public static void main(String[] args) {
		Test obj = new Test();
		obj.loginWithoutCredentials();
		obj.LoginWithoutPassword();
		obj.LoginWithvalidCredentials();
	}
}
