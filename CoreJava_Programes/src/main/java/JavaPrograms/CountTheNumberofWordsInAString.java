package JavaPrograms;

import java.util.Scanner;

public class CountTheNumberofWordsInAString {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the sentence");
		
		String a = obj.nextLine();
		
		String rev ="";
		
		int Length_a = a.length();
		
		String[] split = a.split(" ");
		int Length_split = split.length;
		
		System.out.println(Length_split);
	}
}
