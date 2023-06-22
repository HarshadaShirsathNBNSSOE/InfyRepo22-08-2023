package stringprograms;

public class ExtractAlphabets {
	
	public static void main(String[] args)
	{
		String s1 = "Harshada123Shirsath456";
		String s2 = "Harshada@56Shirsath";
		String s3 = "123Harshada345";
		String s4 = "@#$1245Harshada@!Shirsath";
		
		
		String S1new = s1.replaceAll("[0-9]", "");
		System.out.println(S1new);
		
		String S2new = s2.replaceAll("[^a-zA-Z]", "");
		System.out.println(S2new);
		
		String S3new = s3.replaceAll("[a-zA-Z]", "");
		System.out.println(S3new);
		
		/*
		char[] a = S3new.toCharArray();
		
		int sum = 0;
		
		for(int i=0; i<S3new.length(); i++)
		{
			sum=sum+S3new.charAt(i);
		}
		System.out.println(sum);
		*/
		
		String S4new = s4.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(S4new);
	}

}
