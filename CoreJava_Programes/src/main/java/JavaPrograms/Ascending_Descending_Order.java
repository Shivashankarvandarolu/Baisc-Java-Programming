package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class Ascending_Descending_Order {
	
	public static void main(String[] args) {
		
		// To store multiple values inside an collection we are using ArrayList
		// Creating ArrayList 
		ArrayList num = new ArrayList();
		
		// To add multiple values inside an List
		// List can store duplicate values
		num.add(5);
		num.add(3);
		num.add(2);
		num.add(10);
		num.add(12);
		num.add(22);
		num.add(31);
		num.add(0);
		
		// Ascending Order
		Collections.sort(num);
		System.out.println(num);
		
		// Descending Order
		Collections.sort(num, Collections.reverseOrder());
		System.out.println(num);
		
		
			
	}

}
	