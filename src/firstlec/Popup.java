package firstlec;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browse1.openBrowser("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement a=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		a.click();
		Thread.sleep(3000);
		Alert sam = driver.switchTo().alert();
		sam.accept();
		WebElement saw = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		String abc=sam.getText();
		System.out.println(abc);
		
	}

}
