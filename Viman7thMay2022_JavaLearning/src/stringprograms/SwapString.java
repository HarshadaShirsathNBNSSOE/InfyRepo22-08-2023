package stringprograms;

public class SwapString {
	
	public static void main(String[] args)
	{
		String s1 = "Harshada";
		String s2 = "Shirsath";
		
		String s = s1+s2;
		System.out.println(s);
		
		s2 = s.substring(0, s2.length());
		s1 = s.substring(s2.length());
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
