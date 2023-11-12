package JavaPrograms;

import java.util.Scanner;

public class ReverseTheEachWordInAString {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Sentence");
		
		String a = obj.nextLine();
		
		String[] split = a.split(" ");
		
		String rev="";
		
		for(int i=split.length-1 ; i>=0 ; i--)
		{
			rev = rev + split[i]+ " ";
		}
		System.out.println(rev);
	}
}
