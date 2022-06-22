package firstlec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\swapn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();      // upcasting chromedriver class to webdriver
		
		driver.navigate().to("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");  // helps to open url
		
		WebElement s =driver.findElement(By.xpath("//div[@class='exehdJ']"));
		s.click();

        Thread.sleep(3000);// execution stop for given time
		
		driver.navigate().back();  //navigate is a method of webdriver which returns a complete interface navigation
		
	    Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		String title=driver.getTitle();
		System.out.println(title);
		
	    String url=	driver.getCurrentUrl();
	    System.out.println(url);
		
		
	}

} 