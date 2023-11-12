package JavaPrograms;

public class Find_the_character_number_of_occurences_in_a_Given_String {
	
	public static void main(String[] args) {
		
		// Enter the String 
		String a = "Hey Universe am new to this";
		
		// To calculate the length of the String
		int len_a = a.length();
		
		// removing that character from string
		String replace = a.replace("e", "");
		
		// To calculate the string length after removing that character
		int len_replace = replace.length();
		
		
		// To finding the number occurences of a character
		int numberOf_Occurences_of_a_Character_e = len_a - len_replace ;
		
		// Print the result
		System.out.println(numberOf_Occurences_of_a_Character_e);
	
	
	}

}

