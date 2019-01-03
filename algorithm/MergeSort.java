package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {10,2,1,6,9,22,55,33};
		MergeSortArr(arr,new int[arr.length],0,arr.length-1);
		Utility.printArray(arr);
	}
	public static void MergeSortArr(int arr[],int temp[],int leftStart,int rightEnd) {
		if(leftStart>=rightEnd) {
			return;
		}else {
			int mid = (leftStart + rightEnd)/2;
			MergeSortArr(arr, temp, leftStart, mid);
			MergeSortArr(arr, temp, mid+1, rightEnd);
			Merge(arr,temp,leftStart,rightEnd);
		}
	}
	
	public static void Merge(int arr[],int temp[],int leftStart,int rightEnd) {
		int leftEnd = (leftStart+rightEnd)/2;
		int rightStart = (leftEnd+1);
		int size = (rightEnd - leftStart)+1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left<=leftEnd && right<=rightEnd) {
			if(arr[left] <= arr[right]) {
				temp[index] = arr[left];
				left++;
			}else {
				temp[index] = arr[right];
				right++;
			}
			index++;
			for(int arsdf:temp) {
				System.out.print(arsdf+" flows ");
			}
			System.out.println();
		}
		
		System.arraycopy(arr, left, temp, index, leftEnd-left+1);
		System.arraycopy(arr, right, temp, index, rightEnd-right+1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
	}

}
