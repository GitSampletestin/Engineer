package Test;

import org.testng.annotations.Test;

public class Keywords {
  @Test(invocationCount=4)
  public void testa() {
	  System.out.println("test a is executed");
  }
  @Test(enabled=false)
  public void testb() {
	  System.out.println("test b is executed");
  }
  @Test(dependsOnMethods={"testd"})
  public void testc() {
	  System.out.println("test c is executed");
  }
	
  @Test(priority=-1,timeOut=1000)
  public void testd() throws InterruptedException {
	  Thread.sleep(1100);
	  System.out.println("test d is executed");
  }
  
  
  
  
	
}
