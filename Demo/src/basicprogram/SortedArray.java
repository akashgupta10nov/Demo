package basicprogram;

import java.util.Arrays;

public class SortedArray {
	
	
	public static char[] Sorted(String str)
	{
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return chars;
	}

	public static void main(String[] args) {
		char[] c = Sorted("7860");
		System.out.println(c);
		System.out.println(c);
	}

}
