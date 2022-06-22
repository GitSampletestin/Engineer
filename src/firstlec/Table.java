package firstlec;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table {
	public static void main(String[] args) {
	WebDriver driver = Browse1.openBrowser("http://demo.guru99.com//test//web-table-element.php");
	List<WebElement> columns =driver.findElements(By.xpath("//table//thead//tr//th"));
	 int columnsize =columns.size();
	 System.out.println(columnsize);
	 
	 List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
	   int rowsize = rows.size();
	 
		 List<WebElement> currentprice = driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		 double max = 0;
		 double min = 0;

	  for(int i=0;i<currentprice.size();i++)
	  {    
		  WebElement price =currentprice.get(i);
		  String currentpricevalue =price.getText();
		 double value = Double.parseDouble(currentpricevalue);
	     System.out.println(currentpricevalue);
		  if(value>max) {
			  max=value;
			 min=value;
		  }
		  if(value<min) {
			  min=value;
		  }
	  }
	  System.out.println("max value"+max);
	  System.out.println("min value"+min);

	}
	

}
