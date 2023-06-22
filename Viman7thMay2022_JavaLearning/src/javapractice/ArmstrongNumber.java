package javapractice;

public class ArmstrongNumber {
	public static void main(String[] args)
	{
		int arm=153;
		
		int temp=arm,rem=0, num=0;
		
		while(temp!=0)
		{
			rem = temp%10;
			num = num+(rem*rem*rem);
			temp = temp/10;
		}
		if(arm==num)
			System.out.println(arm + " is armstrong number");
		else
			System.out.println(arm + " is not a armstrong number");
			
			
			
	}

}
