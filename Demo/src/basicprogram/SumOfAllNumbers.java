package basicprogram;

public class SumOfAllNumbers {
	
	public static void sumofInputnumber(int number)
	{

		int inputnumber = number;
		int sum=0;
		//int[] testArray = new int[String.valueOf(inputnumber).length()];
		//char[] testArray = String.valueOf(inputnumber).toCharArray();
		//for(int i=0; i<testArray.length; i++ )
		//{
			//sum = sum + testArray[i];
			
		//}
		
		//System.out.println(sum);
		while(inputnumber!=0)
		{
		 int lastdigit = inputnumber % 10;
		sum = sum + lastdigit;
		inputnumber= inputnumber/10;
	}
		System.out.println(sum);
	}
		
		
	
	public static void main(String[] args)
	{
		sumofInputnumber(45925);
		
		
	}

}


