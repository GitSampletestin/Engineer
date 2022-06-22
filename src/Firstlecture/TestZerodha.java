package Firstlecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Zerodhaloginpage;
import firstlec.Browse1;

public class TestZerodha {
	public void loginwithoutCredentials() {
		WebDriver driver = Browse1.openBrowser("https://kite.zerodha.com/");
		Zerodhaloginpage a = new Zerodhaloginpage(driver);
		a.Clickonlogin();
	}

	public void LoginwithValidCredentials() {
		WebDriver driver = Browse1.openBrowser("https://kite.zerodha.com/");
		Zerodhaloginpage a = new Zerodhaloginpage(driver);
		a.Enteruserid("s7894");
		a.Enterpassword("sameer");
		a.Clickonlogin();
	}
}
