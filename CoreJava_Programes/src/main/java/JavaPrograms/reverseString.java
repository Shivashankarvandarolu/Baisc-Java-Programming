package JavaPrograms;

import java.util.Scanner;

public class reverseString {
	
	public static void main(String[] args) {
		
		// with the help of Scanner Class we can give input from the console
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String value");
		
		String a = obj.nextLine();
		// stiring rev
		String rev = "";
		
		int len_a = a.length();
		
		for(int i=len_a-1 ; i>=0 ; i--)
		{
			rev = rev + a.charAt(i);
		}
		
		System.out.println(rev);
	}

}
