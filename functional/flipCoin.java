package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class flipCoin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter no of time flip");
		int noOfFlips = Utility.getInteger();
		getPercentage(noOfFlips);
	}
	
	public static void getPercentage(int noFlips) {
		float heads =0,tails=0;
		float headPercentage,tailsPercentage;		
		for(int i=1;i<=noFlips;i++) {
			double rand1 = Math.random();
			System.out.println(rand1);
			if(rand1<0.5) {
				tails++;
			}else {
				heads++;
			}
		}
		headPercentage = (heads /noFlips)*100;
		tailsPercentage = (tails/noFlips)*100;
		System.out.println(headPercentage);
		System.out.println(tailsPercentage);
		System.out.println(heads+" "+tails);
		
	}
	

}
