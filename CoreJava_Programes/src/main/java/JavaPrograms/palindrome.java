package JavaPrograms;

import java.util.Scanner;

// Find the given string is Palindrome or not
public class palindrome {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any String to find the palindrome or not");
		
		// Palindrome ex: radar,mom,xoox
		
		String a = obj.nextLine();
		
		int len_a = a.length();
		
		String rev="";
		
		for(int i=len_a-1 ; i>=0 ; i--)
		{
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
		
		if(a.equals(rev))
		{
			System.out.println("Given String is palindrome");
		}
		else
		{
			System.out.println("Given String is not a palindrome");
		}
		
	}

}
