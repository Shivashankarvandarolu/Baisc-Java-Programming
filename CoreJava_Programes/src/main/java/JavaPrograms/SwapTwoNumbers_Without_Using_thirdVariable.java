package JavaPrograms;

import java.util.Scanner;

public class SwapTwoNumbers_Without_Using_thirdVariable {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter value of a and b");
		
		int a = obj.nextInt();
		int b = obj.nextInt();
		
		b = a+b ;
		a = b-a ;
		b = b-a ;
		
		System.out.println("Value of a is = " + a);
		System.out.println("Value of b is = " + b);
	}

}
