package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {
	public static void main(String[] args) {
		WebDriver driver = Browse1.openBrowser("http://demo.automationtesting.in/Frames.html");
	
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		WebElement s =driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(s);
		WebElement sam =driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(sam);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sawant");
		
	/*	WebElement singleframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		singleframe.click();
		
		driver.switchTo().frame(singleframe);  // frame with webelement
		driver.switchTo().frame(0);              // frame with index
		driver.switchTo().frame("singleframe");      // frame with id
		WebElement textfield =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		 textfield.sendKeys("sameer");*/
		
		
		
		
		
	}

}
