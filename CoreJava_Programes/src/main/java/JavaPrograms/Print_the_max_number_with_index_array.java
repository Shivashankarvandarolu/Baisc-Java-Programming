package JavaPrograms;

public class Print_the_max_number_with_index_array {
	
	public static void main(String[] args) {

		// initilizing the array index with a
	int[] a = new int[] {4,6,2,8,9,1,4,7,9,2,12,0,2};

		// To store the max value  with index
	int max = a[0];
	int index = 0 ;
	// Applyinf for loop for itertaing the loop
	for(int i=0 ; i < a.length ; i++)
	{
		if(max < a[i])
		{
			max=a[i];
			index = i;
		}
	}
		// print the result
	System.out.println("max =" + max);
	System.out.println("index =" + index);

}
}
