package com.dsaAlgoIncubation;

public class ArraySum {

	public static void main(String[] args) {
		int arr[] = { 12, 3, 4, 15 };
		System.out.println("Sum of array ::  "+ sum(arr));

	}
	 
    private static int sum(int arr[])
    {
        int sum = 0; 
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
 
        return sum;
    }
}
