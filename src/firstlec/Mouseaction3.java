package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction3 {
	public static void main(String[] args) {
		WebDriver driver = Browse1.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement Iframe =driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[1]"));
		driver.switchTo().frame(Iframe);
		Actions action = new Actions(driver);
		
		WebElement image = driver.findElement(By.xpath("//li[contains(@class,'ui-widget-content')]"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
	
		action.dragAndDrop(image, trash);
		action.perform();
	}

}
