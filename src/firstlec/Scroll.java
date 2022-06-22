package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
 
	public static void main (String[]args) {
		WebDriver driver = Browse1.openBrowser("https://vctcpune.com/");
		WebElement testing = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",testing);
		
	//	((JavascriptExecutor)driver).executeScript("window.scrollBy(500,700)" );
	}
}
