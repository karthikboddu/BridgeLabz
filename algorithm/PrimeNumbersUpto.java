package com.bridgelabz.algorithm;

import java.util.List;
import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class PrimeNumbersUpto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al = new ArrayList<Integer>();
		al=Utility.getPrimeNoUpto(1000);
		for(int arys:al) {
			System.out.println(arys);
		}
	}
}
