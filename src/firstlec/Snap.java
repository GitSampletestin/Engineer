package firstlec;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;  //  for IST screen shot
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Snap {
	public static void ScreenShot(String Filename,WebDriver driver) throws IOException {
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		time.toString().replace(":","").replace(" ","");
		
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d = new File ("C:\\Users\\swapn\\OneDrive\\Desktop\\sameer"+Filename+".jpg");
		FileHandler.copy(s, d);
		
		
	}
	
}
