package JavaPrograms;

import java.util.Scanner;

public class SwapTwoNumber_using_thirdVariable {
	// Creating Class level static variable for that no need to create an object direct we use them
	public static int c;
	public static void main(String[] args) {

		// Scanner class helps to take the input from the console
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter value of a and b");

		// Initilizing variables a,b 
		int a = obj.nextInt();
		int b = obj.nextInt();
	
	
		c = a ;
		a = b ;
		b = c ;
		
		System.out.println("Value of a is = " + a);
		System.out.println("Value of b is = " + b);

}
}
