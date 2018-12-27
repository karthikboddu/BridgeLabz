package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class SearchSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the size of array");
		int size = Utility.getInteger();
		System.out.println("Enter the elements");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Utility.getInteger();
		}
		System.out.println("enter the element to search");
		Utility.BinarySearch(arr, arr.length);
	}

}
