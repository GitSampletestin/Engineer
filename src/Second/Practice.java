package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import firstlec.Browse1;

public class Practice {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Firefox Installer(1).exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
}
}
