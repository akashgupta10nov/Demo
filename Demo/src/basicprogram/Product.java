package basicprogram;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arrayA= {1, 2, 3, 4};
		int[] arrayB=new int[4];
		multiply(arrayA,arrayB );
	}

	
	
	public static void multiply(int[] arrayA, int[] arrayB)
	{
		for (int i = 0; i < arrayA.length; i++)
        {

              int prod = 1;
              
            for (int j = 0; j < arrayA.length; j++)
            {
                if (i != j)
                {
                	
                    prod = prod * arrayA[j];
                    
                }
           
            }
            
            arrayB[i] = prod;
      
        }
        for (int j = 0; j < arrayB.length; j++)
        {
            System.out.println(arrayB[j]);
        }
	}
}
