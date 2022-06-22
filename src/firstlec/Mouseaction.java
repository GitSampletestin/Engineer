
package firstlec;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browse1.openBrowser("http://demo.guru99.com/test/simple_context_menu.html");
		Actions action = new Actions(driver);
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rightclick);  // helps in right clicking the webelement
		action.perform();
		Thread.sleep(3000);
		WebElement edit =driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
		edit.click();
		Alert edi = driver.switchTo().alert();
		edi.accept();
		
		
	}

}
