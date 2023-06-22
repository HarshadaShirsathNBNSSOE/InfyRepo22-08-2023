package stringprograms;

public class RemoveDuplicate {
	
	public static void main(String[] args)
	{
	/*	
		String str = "I am Harshada Shirsath";
		
		char[] arr = str.toCharArray();
		
		int l = str.length(), cnt=0;
		
		for(int i=1; i<l; i++)
		{
			for(int j=i+1; j<l; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				    cnt++;
				    break;
				}
			}
		}
		
	}

}*/

String str = "w3schools";
int cnt = 0;
char[] inp = str.toCharArray();
System.out.println("Duplicate Characters are:");
for (int i = 0; i < inp.length; i++) {
 for (int j = i + 1; j < inp.length; j++) {
  if (inp[i] == inp[j]) {
   System.out.println(inp[j]);
   cnt++;
   break;
  }
 }
}
}
}
