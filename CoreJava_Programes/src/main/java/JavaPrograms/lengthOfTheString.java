package JavaPrograms;

import java.util.Scanner;

public class lengthOfTheString {
	
	public static void main(String[] args) {
		
		// Taking inputs from the console
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any name to find the length of String");
		
		String a = obj.nextLine();
		
		int length_a = a.length();
		
		System.out.println("Length of the String" + a + " = " + length_a);
		
	}

}
