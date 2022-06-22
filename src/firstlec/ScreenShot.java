package firstlec;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = Browse1.openBrowser("https://vctcpune.com/");
/*	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("S:\\selenium\\SS\\vct.png");
	FileHandler.copy(source, destination);*/
		
		Snap.ScreenShot("praj", driver);

	}

}
