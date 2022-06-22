package Firstlecture;

import org.openqa.selenium.WebDriver;

import POM.AngelLogin;
import firstlec.Browse1;

public class TestAngel {
	public void loginwithoutid() {
		WebDriver driver = Browse1.openBrowser("https://trade.angelbroking.com/Login");
		AngelLogin a = new AngelLogin(driver);
		a.enteruserpass("Sameer123");
		a.clickonlogin();
	}
    public void loginwithoutpassword() {
    	WebDriver driver = Browse1.openBrowser("https://trade.angelbroking.com/Login");
    	AngelLogin a = new AngelLogin(driver);
    	a.enteruserid("S78038");
    	a.clickonlogin();
    }
   
     public void liginwithvalidcredentials() {
    	WebDriver driver = Browse1.openBrowser("https://trade.angelbroking.com/Login");
    	AngelLogin a = new AngelLogin(driver);
    	a.enteruserid("S78038");
    	a.enteruserpass("sameer123");
    	a.clickonlogin();
    }
     
     public static void main(String[] args) {
    	 TestAngel obj = new TestAngel();
    	 obj.liginwithvalidcredentials();
    	 obj.loginwithoutid();
    	 obj.loginwithoutpassword();
	}
}
