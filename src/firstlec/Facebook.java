package firstlec;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver =Browse1.openBrowser("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		String username =Parametrization.getData("swap", 0, 1);
		email.sendKeys(username);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	String password = Parametrization.getData("swap", 1, 1);
		pass.sendKeys(password);
		
	}

}
