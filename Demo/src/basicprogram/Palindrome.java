package basicprogram;

public class Palindrome {

	public static void main(String[] args) {
		
		Palindrome1("aba");
	}
		public static void Palindrome1(String str)
		{
			String rev= "";
			for(int i=str.length()-1; i>=0; i--)
			{
				rev=rev+str.charAt(i);
			}
			
			if(str.equalsIgnoreCase(rev))
			{
				System.out.println("String is palindrome");
			}
			
			else{
				System.out.println("Not palindrome");
			}
			
		}

	}
