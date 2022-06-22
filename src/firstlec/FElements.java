package firstlec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FElements {
	public static void main(String[]args) {
		WebDriver driver = Browse1.openBrowser("http://demo.guru99.com/test/simple_context_menu.html");
		
		List<WebElement> s =driver.findElements(By.xpath("//li[@class='dropdown']"));
		System.out.println(s.size());
		
		s.get(5).click();
		
		
	}

}
