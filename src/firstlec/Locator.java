package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapn\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email")); // locator by id
		email.sendKeys("sawantsb235@gmail.com");

		WebElement pass = driver.findElement(By.name("pass")); // locator by name
		pass.sendKeys("sameer@123");

		// WebElement login = driver.findElement(By.tagName("button")); // locator by tagname
		// login.click();

	//	WebElement login = driver.findElement(By.tagName("u_0_d_jt")); // locator by tagname but this is dynamic tagname
    //   login.click();

		WebElement classname = driver.findElement(By.className("_6ltj"));  // locator by classname
		classname.click();

	}
}
