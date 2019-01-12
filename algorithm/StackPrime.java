package com.bridgelabz.algorithm;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.StackInteger;
import com.bridgelabz.utility.Utility;

public class StackPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList<String>();
		List<String> anagramst = new ArrayList<String>();
		StackInteger si = new StackInteger();
		
		ll =Utility.getPrimeStringNoUpto(1000);
		anagramst=Utility.getPrimeAnagramLList(ll);
		String arr1[] = anagramst.toArray(new String[anagramst.size()]);
		int arr3[] = new int[arr1.length];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=Integer.parseInt(arr1[i]);
		}
		for(int i=0;i<arr3.length;i++) {
			si.push(arr3[i]);
		}
		
		si.display();
		System.out.println("--------------------------------");
		System.out.println("Reverse");
		for(int i=0;i<arr3.length;i++) {
		System.out.println(si.popvalue());
		}
	}

}
