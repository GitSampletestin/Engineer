package firstlec;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = Browse1.openBrowser("https://vctcpune.com/");
		
		WebElement address = d.findElement(By.xpath("//a[text()='Start Selenium Practice']"));
		 address.click();
		 
		Set<String> add = d.getWindowHandles();  // gives the address of all the pages that are open
		Iterator<String> i = add.iterator();
		
		while(i.hasNext()) // true
		{  
			String addr = i.next();
			d.switchTo().window(addr);
			String currentTitle=d.getTitle();
			 
			if(currentTitle.equals("Practice Page"))
			{
			WebElement radio1=d.findElement(By.xpath("//input[@value='Radio1']"));
			Thread.sleep(2000);
				radio1.click();
				
			}
		}
		
	}

}
