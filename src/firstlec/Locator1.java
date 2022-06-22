package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapn\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/");

		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		email.sendKeys("sawantsb@235");

		WebElement pass = driver.findElement(By.cssSelector("input[data-testid='royal_pass']"));
		pass.sendKeys("sameer@123");
		
	//    WebElement forgot =	driver.findElement(By.linkText("Forgotten password?"));
	//	forgot.click();
		
		WebElement forgot = driver.findElement(By.partialLinkText("Forgot"));
		forgot.click();
	}
}
