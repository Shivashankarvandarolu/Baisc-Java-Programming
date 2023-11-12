package JavaPrograms;

public class Print_the_Array_values {
	
	public static void main(String[] args) {
		
		// Array initilization
		int[] a = new int[9];
	
			a[0] = 2 ; 
			a[1] = 5 ;
			a[2] = 4 ;
			a[3] = 0 ;
			a[4] = 6 ;
			a[5] = 9 ;
			a[6] = 12 ;
			a[7] = 32 ;
			a[8] = 7 ;

			// finding the length
			int size = a.length;
			System.out.println("Array size is = " + size);
			
			for(int i=0 ; i<size ; i++)
			{
				System.out.println("a[" + i + "]" + "=" + a[i]);
			}

}
}
