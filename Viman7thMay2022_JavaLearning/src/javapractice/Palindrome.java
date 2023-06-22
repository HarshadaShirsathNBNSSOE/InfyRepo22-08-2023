package javapractice;

public class Palindrome {
	public static void main(String[] args)
	{
		int num=482;
		int temp=num, pal=0, rem=0;
		while(temp>0)
		{
			rem = temp%10;
			pal = (pal*10)+rem;
			temp=temp/10;
		}
		if(pal==num)
			System.out.println(num + " is palindrome");
		else
			System.out.println(num + " is not palindrome");
	}

}
