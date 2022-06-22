package firstlec;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = Browse1.openBrowser("http://demo.guru99.com/test/simple_context_menu.html");
	Actions action = new Actions(driver);
	WebElement doubleclick = driver.findElement(By.xpath("//button[contains(@ondblclick,'()')]"));
	action.doubleClick(doubleclick);  // helps to double click on webelement.
	action.perform();  // it execute the above action
	
	
	
	Alert b=driver.switchTo().alert();
	Thread.sleep(3500);
	b.dismiss();
}
}
