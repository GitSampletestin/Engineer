package firstlec;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser3 {
public static void main(String[] args) {
	WebDriver driver=Browse1.openBrowser("https://vctcpune.com/");
	WebElement seleniumPractice=driver.findElement(By.xpath("//a[text()='Start Selenium Practice']"));
	seleniumPractice.click();
	
	ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
	int value =list.size();
	for(int i=0;i<value;i++)
	{
		driver.switchTo().window(list.get(i));
		String a=driver.getTitle();
	if(	a.equals("Practice Page"))
	{
		WebElement radio1=driver.findElement(By.xpath("//input[@value='Radio1']"));
		radio1.click();

	}
	}
	
	
}
}