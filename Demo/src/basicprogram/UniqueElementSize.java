package basicprogram;

import java.util.HashSet;
import java.util.Set;

public class UniqueElementSize {
	
	int[] array = {1, 12, 13, 1, 12, 67,68,69};
	public Set<Integer> uniwue()
	{
		Set<Integer> s= new HashSet<Integer>();
		for(int i : array)
		{
			
			s.add(i);
		}
		
		return s;
	}
	
	
	public static void main(String[] args)
	{
		UniqueElementSize u = new UniqueElementSize();
		Set<Integer> array= u.uniwue();
		System.out.println(array);
		//System.out.println(array);
		System.out.println(array);
	}
}
