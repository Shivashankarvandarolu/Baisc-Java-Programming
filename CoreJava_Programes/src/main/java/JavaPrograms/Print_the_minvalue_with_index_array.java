package JavaPrograms;

public class Print_the_minvalue_with_index_array {
	
	public static void main(String[] args) {
		
		// Initilizing array
	int[] a = new int[] {4,6,2,8,9,1,4,7,9,2,12,0,3,2};
	
	int min = a[0];
	int index = 0 ;
	
	for(int i=0 ; i < a.length ; i++)
	{
		if(min > a[i])
		{
			min=a[i];
			index = i;
		}
	}
	System.out.println("min =" + min);
	System.out.println("index =" + index);

}
}

