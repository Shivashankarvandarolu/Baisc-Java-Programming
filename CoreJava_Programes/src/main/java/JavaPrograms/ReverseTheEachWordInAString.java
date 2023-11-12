package JavaPrograms;

import java.util.Scanner;

public class ReverseTheEachWordInAString {

	public static void main(String[] args) {

		// Scanner class helps to taking the input from the console
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Sentence");

		// Initilizing the string value inside a variable
		String a = obj.nextLine();

		// Split the each word with space
		String[] split = a.split(" ");

		// Store the rev string
		String rev="";

		// Iterate the loop
		for(int i=split.length-1 ; i>=0 ; i--)
		{
			rev = rev + split[i]+ " ";
		}

		// Print the result 
		System.out.println(rev);
	}
}
