package JavaPrograms;

import java.util.Scanner;

public class IntPalindrome {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value");
		
		int a = obj.nextInt();
		
		int rev = 0 ;
		
		while(a!=0)
		{
			rev = rev*10 + a%10;
			a = a/10;
		}
		
		System.out.println(rev);
		System.out.println(a);
		
		
		
		if(rev != a)
		{
			System.out.println("Given int is Palindrome");
		}
		else
		{
			System.out.println("Given int is not a palindrome");
		}

}
}
