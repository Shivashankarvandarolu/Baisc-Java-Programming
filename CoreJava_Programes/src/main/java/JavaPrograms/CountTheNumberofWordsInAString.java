package JavaPrograms;

import java.util.Scanner;

public class CountTheNumberofWordsInAString {

	public static void main(String[] args) {
		
		// Scanner class helps to taking inputs from the Console
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the sentence");
		
		// Stroing the string value into the a variable
		String a = obj.nextLine();
		
		// To storing the rev value we are initializing the empty
		String rev ="";
		
		//To fing the length
		int Length_a = a.length();
		
		// Split the word with space
		String[] split = a.split(" ");
		
		// After spacing finding the length
		int Length_split = split.length;
		
		// Print the result
		System.out.println(Length_split);
	}
}
