package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locxpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.xpath("//input[@name='email']")); // by attribute
		email.sendKeys("9762815429");

		WebElement pass = driver.findElement(By.xpath("//input[@data-testid='royal_pass']")); // by attribute
		pass.sendKeys("sameer@123");

	//	WebElement login = driver.findElement(By.xpath("//button[contains(@data-testid,'button')]")); // by contains
	//	login.click();

		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']")); // by text
		 forgot.click();

		// div[@class='_6lux'][1] //by index

		// WebElement email =
		// driver.findElement(By.xpath("//html//form//div//div//input")); // by relative
		// email.sendKeys("sawantsb235@gmail.com");

		// WebElement pass = driver.findElement(By.xpath("")); // by absolute
		// pass.sendKeys("sameer@123");

	}

}
