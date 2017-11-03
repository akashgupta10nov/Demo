package basicprogram;

import java.util.ArrayList;
import java.util.Arrays;


public class Iterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,9));
		Itr(l);
		
		
	}
	
	
	public static void Itr(ArrayList<Integer> l)
	{
	    java.util.Iterator<Integer> itr = l.iterator();
	    
	   while(itr.hasNext())
	   {
		   
		   Integer i = itr.next();
		   
		   if(i%2 !=0)
		   {
			   itr.remove();
		   }
		   
		   
		   
	   }
	   System.out.println(l);
	}
	

}
