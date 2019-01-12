package com.bridgelabz.datastructures;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class Prime2DArr {

	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<Integer>();
		ll =Utility.getPrimeNoUpto(1000);
		System.out.println(ll.size());

		Integer arr[] = ll.toArray(new Integer[ll.size()]);
		int m=10;
		int n=16;
		int  prime[][] = new int[m][n];
		int x=0;
		for(int i=0;i<prime.length;i++) {
			for(int j=0;j<prime[0].length;j++) {
					
				prime[i][j] = arr[x];
					x++;
			}
		}
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(prime[i][j]+" ");
			}
			System.out.println();
		}
//		for(int i =0;i<m;i++) {
//			for(int j=0;j<n;j++) {
//			System.out.print(prime[i][j]+" ");
//			if(j==20||j==45||j==61||j==77||j==94||j==108) {
//				System.out.println();
//			
//			}
//			}
//			System.out.println();
//		}
		
		
	}

}
