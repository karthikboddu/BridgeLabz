package com.bridgelabz.functional;


import com.bridgelabz.utility.Utility;

public class distinctTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no of elements");
		int no = Utility.getInteger();
		int arr[] = new int[no];
		for(int i=0;i<arr.length;i++) {
			arr[i] = Utility.getInteger();
		}
		findTriplet(arr);
	}
	public static void findTriplet(int a[]) {
		int noOfTripelts =0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					if((a[i]+a[j]+a[k]) == 0 ) {
						noOfTripelts++;
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
						System.out.println(noOfTripelts);
					}
				}
			}
		}
		
	
	}

}
