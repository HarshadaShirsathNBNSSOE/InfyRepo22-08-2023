package corejava;

import java.util.Arrays;

public class Child2 extends Parent{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	int[] arrr = new int[]{1,2,3,4};

public static void main(String[] args)
{
	int[] a = {5,8,4,9,1,3};
	int val = a[0];
	for(int i =1; i<a.length; i++)
	{
		if(val<a[i])
			val = a[i];
	}
	System.out.println(val);
	

}	
}
