package basicprogram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		int[] ar = new int[]{1, 3, 4, 1, 6, 7, 8, 8};
		
		FindDuplicates(ar);
		
		}
	
	
	public static void FindDuplicates(int[] array)
	{
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		for(int i : array)
		{
			if(!unique.add(i))
			{
				duplicate.add(i);
			}
		}
		
		System.out.println("Unique elements are " +unique);
		System.out.println("Duplicate elements are  " +duplicate);
		
		
	}

}
