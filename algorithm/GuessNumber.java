package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter N value");
		int number = Utility.getInteger();
		int range = (int)Math.pow(2, number);
		
		System.out.println("think a number between 0 and "+(range-1)+"Enter yes or no if present");
		Utility.getString();
		Utility.getString();
		int arr[] = new int[range];
		for(int i=0;i<arr.length;i++) {
			arr[i] =i;
		}
		
		System.out.println("Number is"+ Utility.findNumber(arr,0,arr.length-1));
	}

}
