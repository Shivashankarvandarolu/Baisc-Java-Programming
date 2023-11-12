package JavaPrograms;

import java.util.Scanner;

public class reverseString {
	
	public static void main(String[] args) {
		
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the String value");
		
		String a = obj.nextLine();
		
		String rev = "";
		
		int len_a = a.length();
		
		for(int i=len_a-1 ; i>=0 ; i--)
		{
			rev = rev + a.charAt(i);
		}
		
		System.out.println(rev);
	}

}
