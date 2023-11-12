package JavaPrograms;

import java.util.Scanner;

public class SwapTwoNumber_using_thirdVariable {
	
	public static int c;
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter value of a and b");
		
		int a = obj.nextInt();
		int b = obj.nextInt();
	
	
		c = a ;
		a = b ;
		b = c ;
		
		System.out.println("Value of a is = " + a);
		System.out.println("Value of b is = " + b);

}
}