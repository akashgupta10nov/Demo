package basicprogram;

public class Prod {

	public static void main(String[] args) {
		
		int[] arr = {5, 2, 3, 4};
		product(arr);

	}

	
	public static void product(int[] arr)
	{
		int product = 1;
		for(int i =0; i<arr.length; i++)
		{
			product = product * arr[i];
		}
		
		System.out.println(product);
  	}
}
