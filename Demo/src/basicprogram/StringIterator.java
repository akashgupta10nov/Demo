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
	    for(String s : l )
	    {
		   
	    	if(s.length()>5)
	    	{
	    		l.remove(s);
	    		
	    	}
		 
	    }
	    System.out.println(l);
	}
	   
	  
	}

