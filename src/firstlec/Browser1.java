package firstlec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\swapn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting chromedriver class to webdriver	
		driver.get("https://www.facebook.com/");

		driver.navigate().to("https://www.facebook.com/"); // helps to open url
		Thread.sleep(3000); // execution stop for given time

		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

		driver.navigate().refresh();

		String a = driver.getTitle();
		System.out.println(a);

		String b=driver.getCurrentUrl();
		System.out.println(b);
		
		driver.manage().window().maximize(); // to maximize browser
	//	 Options option = driver.manage();
	//	 Window win=option.window();
	//	 win.maximize();
		
		driver.manage().window().minimize();
		
		
		
		
	}
}
