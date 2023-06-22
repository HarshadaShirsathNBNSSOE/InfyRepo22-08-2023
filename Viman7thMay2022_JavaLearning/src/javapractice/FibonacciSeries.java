package javapractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for (int i=0; i<n; i++)
		{
			if(i<=1)
			{
				c=i;
			}
			else
			{
			c=b+a;
			a=b;
			b=c;
			
			}
			System.out.print(c + " ");
		}
			
	}
}
