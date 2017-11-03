package basicprogram;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={6, 7, 3, 9, 4, 1, 8, 10};
		  int[] result = Selection_Sort(array);
		  
		  for(int i : result )
		 {
			  System.out.println(i);
		 }
		  
		  System.out.println("Second highest number is " +result[result.length-2]);
		
	}
	
	
	
	
	public static int[] Selection_Sort(int[] array)
	{
		int temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<=array.length-1; j++)
			{
				if(array[j]<array[i])
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		//for(int i=0; i<array.length; i++)
		//{
			//System.out.println(array[i]);
		//}
		return array;
	}

}
