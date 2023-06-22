package stringprograms;

public class ReverseString {
	
	public static void main(String[] args) {
	
	String s = "Harshada123 Shirsath";
	/*
    String rev = "";
	for(int i=s.length()-1; i>=0; i--)
	{
		rev= rev + s.charAt(i);	
	}
	System.out.println(rev); 
	*/
	
	char[] a = s.toCharArray();
	
	for(int i = a.length-1; i>=0; i--)
	{
		System.out.print(a[i]);
	}
	
	}
	
	

}
