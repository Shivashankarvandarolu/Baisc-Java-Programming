package JavaPrograms;

public class Print_the_array_values_in_reverse_Order {
	
	public static void main(String[] args) {
		
	int[] a = new int[] {3,6,8,9,1,0,4,2,1};
	
	int size = a.length;
	
	
	for(int i=size-1 ; i< size ; i--)
	{
		System.out.println("a[" + i + "]" + "=" + a[i]);
	}

}
}