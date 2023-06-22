package stringprograms;

public class ReverseSequence {
	
	public static void main(String[] args)
	{
		String s = "I am Harshada Shirsath";
		
		String[] reverse = s.split("\\s");
		
		for(int i=reverse.length-1; i>=0; i--)
		{
			System.out.print(reverse[i]+ " ");
		}
	}

}
