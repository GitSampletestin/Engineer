package firstlec;

public class EE {
	public void test() {
	 System.out.println("Hello");
	}
	
	public void test2() {
		System.out.println();
	}
public static void main(String[] args) throws InterruptedException {  // checked inspection
	EE obj = new EE ();
	obj.test();
	Thread.sleep(2000);
	obj.test2();
}
}
