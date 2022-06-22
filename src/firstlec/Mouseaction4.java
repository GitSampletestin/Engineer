package firstlec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction4 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browse1.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions action = new Actions(driver);
	
		WebElement Iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(Iframe);

		List<WebElement> images = driver.findElements(By.xpath("//li[@class=\"ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle\"]"));
		int numbers = images.size(); // 4// find elements returns a list of webelement.

		for (int i = 0; i < numbers; i++) // 0,1,2,3,4
		{
			WebElement image = images.get(i);
			WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
			action.dragAndDrop(image, trash);
			action.perform();
	    	Thread.sleep(3000);
		}
	    List<WebElement> trashh =driver.findElements(By.xpath("//a[text()='Recycle image']"));
	    int a= trashh.size();
		for (int c = 0; c < a; c++) // 0,1,2,3,4
		{ 
			WebElement jpg = trashh.get(c);
			jpg.click();
		/*	WebElement trash1 = driver.findElement(By.xpath("//ul[@class='gallery ui-helper-reset ui-helper-clearfix ui-droppable']"));
			action.dragAndDrop(jpg, trash1);
			action.perform();
	    	Thread.sleep(3000);*/
		}
	
	
	}

}
