package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Frame {	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = Bro.OpenBrowser("https://ui.vision/demo/webtest/frames/");
	
    WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frame1);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("frame1 done");
	driver.switchTo().parentFrame();
	try {
	WebElement Frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(Frame2);
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("frame2 done");
	driver.switchTo().parentFrame();
	
	}
	catch(Exception a){
		System.out.println(a);
	}
	
	WebElement frame3 = driver.findElement(By.xpath( "//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	WebElement text = driver.findElement(By.xpath("//input[@name='mytext3']"));
	text.sendKeys("sameer");
	
	
	WebElement iframe = driver.findElement(By.xpath("//iframe[contains(@src ,https)]"));
	driver.switchTo().frame(iframe);Thread.sleep(1000);
	WebElement tick = driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']"));
	tick.click();Thread.sleep(1000);
	WebElement tick1 = driver.findElement(By.xpath("//div[@class='uHMk6b fsHoPb']"));
	tick1.click();
	
	driver.findElement(By.xpath("(//div[@role='presentation'])[4]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='vRMGwf oJeWuf'])[5]")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("(//span[@class='NPEfkd RveJvd snByac'])[2]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@jsname='YPqjbf']")).sendKeys("iam");
	Actions a = new Actions(driver);
	Thread.sleep(2000);
	a.sendKeys(Keys.TAB);
	a.perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
