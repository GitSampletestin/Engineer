package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction2 {
	public static void main(String[]args) {
		WebDriver driver = Browse1.openBrowser("https://www.amazon.in/");
		WebElement signin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions action = new Actions (driver);
		action.moveToElement(signin);
		action.perform();
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		WebElement email =driver.findElement(By.xpath("//input[@name='email']"));
		
	}

}
   