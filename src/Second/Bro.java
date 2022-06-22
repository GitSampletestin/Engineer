package Second;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Bro {

	public static WebDriver OpenBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
		
	}
}
