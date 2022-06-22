package firstlec;

import java.util.Scanner;

public class EE1 {
	public static void test() {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter first number");
		int a = scan.nextInt();
		
		System.out.println("Enter second number");
		int b = scan.nextInt();
		
		try   // the code which can throw exception is written under try block
		{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception f )          // it will handle all the exception
		{
			System.out.println(f);
		}
		
		finally
		{
			System.out.println("Hello i am finally block");
		}
	}
        public void test1() {
        	System.out.println("Thank you for using calculator");  
        }
        
        public static void main(String[] args) {
			EE1 obj = new EE1();
			obj.test();
			obj.test1();
		}
}
