package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenDivision {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browse1.openBrowser("https://www.facebook.com/");
		WebElement sign = driver.findElement(By.xpath("//a[@rel='async']"));
		sign.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("sameer");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("sawant");

		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("9762815429");
	}

}
