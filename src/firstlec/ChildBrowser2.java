package firstlec;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser2 {
	public static void main(String[] args) {
		WebDriver driver = Browse1.openBrowser("https://www.onlinesbi.com/");
		WebElement sam = driver.findElement(By.xpath("(//a[@class='has-submenu'])[2]"));
		sam.click();
		WebElement abc = driver.findElement(By.xpath("//a[text()='Yono LITE']"));
		abc.click();
		Set<String> address = driver.getWindowHandles();
		Iterator<String> i = address.iterator();
		while (i.hasNext()) {
			String add = i.next();
			driver.switchTo().window(add);
			String currentTitle = driver.getTitle();
        if(currentTitle.equals("YONO LITE SBI"))
			{
				WebElement feature = driver.findElement(By.xpath("//a[text()='Features']"));
				feature.click();
			}
		}
	}
}
