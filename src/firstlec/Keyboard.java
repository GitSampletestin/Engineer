package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
public static void main (String []args) {
	WebDriver driver=Browse1.openBrowser("https://demoqa.com/text-box");
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sameer");
	
	Actions action =new Actions(driver);
	
	action.sendKeys(Keys.TAB);
	action.sendKeys("sawantsb235@gmail.com");
	
	action.sendKeys(Keys.TAB);
	action.sendKeys("ap-karanje,tal-baramati,dist-pune");
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("a");
	action.sendKeys("c");
	action.keyUp(Keys.CONTROL);
	
	action.sendKeys(Keys.TAB);
	action.keyDown(Keys.CONTROL);
	action.sendKeys("v");
	action.keyUp(Keys.CONTROL);
	
    action.sendKeys(Keys.TAB);
    action.sendKeys(Keys.ENTER);
	action.perform();

	
}
}
