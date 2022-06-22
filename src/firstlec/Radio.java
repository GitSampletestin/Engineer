package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Radio {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browse1.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement radio1 = driver.findElement(By.xpath("//input[@name='radio']"));
		radio1.click();
		boolean result = radio1.isSelected(); // it check if the element is selected and return boolean
		System.out.println(result);

		WebElement hide = driver.findElement(By.xpath("//input[@value='Hide']"));
	//	hide.click();
		
		WebElement text =driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean r1=text.isDisplayed();   // check if the element is displayed or not
		if (r1==true) {
			text.sendKeys("it is displayed");
		}
		else {
			System.out.println("the text is not displayed"+  r1);
		}
		
		Thread.sleep(2000);
		text.clear();   // clear the existing text from input field.
		
		WebElement title=driver.findElement(By.xpath("//a[@class='navbar-brand font-weight-bold text-white']"));
		String a=title.getText();
		System.out.println(a);
	}
}
