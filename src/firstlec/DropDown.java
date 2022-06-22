package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver = Browse1.openBrowser("https://vctcpune.com/selenium/practice.html#serviceid");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        
		Select select = new Select( dropdown);
		//select.selectByIndex(1);
		//select.selectByValue("option3");
		select.selectByVisibleText("Option1");
	}

}
