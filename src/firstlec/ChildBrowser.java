package firstlec;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser {
	public static void main(String[] args) {
		WebDriver driver = Browse1.openBrowser("https://vctcpune.com/");
		WebElement seleniumPractice=driver.findElement(By.xpath("//a[text()='Start Selenium Practice']"));
		seleniumPractice.click();
		seleniumPractice.click();
     	seleniumPractice.click();
		
		String adress = driver.getWindowHandle();  //gives the address of main page
		System.out.println(adress);
		
		Set<String> addresses = driver.getWindowHandles();  // gives the address of all the pages that are open
		Iterator<String> i = addresses.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
	/* getWindowsHandles method of webdriver return all the address of chrome windows that are open in a form of set of string,set
	   does not maintain insertionorder of address and also does not accept duplicate value.
	   
	   inorder to get value from set ,we will use iterator method of set interface which returns complete iterator interface then by using 
	   "next" method of iterator interface  we can get the values from set.
	   
	    
	 */
		
		
	}
}
