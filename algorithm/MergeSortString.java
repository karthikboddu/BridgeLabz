package com.bridgelabz.algorithm;

public class MergeSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] inpt = {"java","is","an","oopl"};
		MergeSortArr(inpt,new String[inpt.length],0,inpt.length-1);
		for(String dsf:inpt) {
			System.out.println(dsf);
		}
		
	}
	public static void MergeSortArr(String arr[],String temp[],int leftstart,int rightend) {
		if(leftstart>=rightend) {
			return;
		}else {
		
		int mid = (leftstart+rightend)/2;
		
		MergeSortArr(arr, temp, leftstart, mid);
		MergeSortArr(arr, temp, mid+1, rightend);
		Merge(arr,temp,leftstart,rightend);
		}
	}
	
	public static void Merge(String arr[],String temp[],int leftStart,int rightEnd) {
		int leftEnd = (leftStart+rightEnd)/2;
		int rightStart = (leftEnd+1);
		int size = (rightEnd - leftStart)+1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		
		while(left<=leftEnd && right<=rightEnd) {
			if(arr[left].compareTo(arr[right])<0) {
				temp[index] = arr[left];
				left++;
			}else {
				temp[index] = arr[right];
				right++;
			}
			index++;

		}
		
		System.arraycopy(arr, left, temp, index, leftEnd-left+1);
		System.arraycopy(arr, right, temp, index, rightEnd-right+1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
	}

}
