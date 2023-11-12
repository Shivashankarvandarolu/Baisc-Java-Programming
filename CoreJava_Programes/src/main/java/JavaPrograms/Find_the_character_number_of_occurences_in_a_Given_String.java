package JavaPrograms;

public class Find_the_character_number_of_occurences_in_a_Given_String {
	
	public static void main(String[] args) {
		
		String a = "Hey Universe am new to this";
		int len_a = a.length();
		
		String replace = a.replace("e", "");
		int len_replace = replace.length();
		
		int numberOf_Occurences_of_a_Character_e = len_a - len_replace ;
		System.out.println(numberOf_Occurences_of_a_Character_e);
	
	
	}

}

