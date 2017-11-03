package basicprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class StringIterator {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>(Arrays.asList("akash", "vaibhav", "rohit"));
		Itr(l);
	}

	
	public static void Itr(ArrayList<String> l )
	{
	    Iterator<String> itr = l.iterator();
	    
	    while(itr.hasNext())
	    {
		    String i = itr.next();
		   
	    	if(i.length()>5)
	    	{
	    		itr.remove();
	    		
	    	}
		 
	    }
	   System.out.println(l);
	  
	}
}
