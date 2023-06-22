package arrayprograms;

import java.util.Arrays;

public class ArrayEqualOrNot {
	
	public static void main(String[] args)
	{
		int[] arr = {11,22,66};
		int[] arr1 = {44,55,11};
		int[] arr2 = {11,22,66};
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr, arr2));
	}
	

}
