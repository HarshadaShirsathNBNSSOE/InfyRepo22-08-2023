package javapractice;

public class FactorialNum {
	
	public static void main(String[] args)
	{
		int num=1,fact=5;
		
		for(int i=fact; i>=1; i--)
		{
			num=num*i;
		}
		System.out.println(num);
	}

}
