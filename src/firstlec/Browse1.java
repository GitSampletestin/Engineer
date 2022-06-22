package firstlec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browse1 {
	
	public static WebDriver openBrowser(String url) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\swapn\\Downloads\\chromedriver_win32\\chromedriver.exe");

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\new update chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get(url);  // method of web interface
		driver.manage().window().maximize();
		return driver;
		
	}

}