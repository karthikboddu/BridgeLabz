package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Gambler {
	public static void main(String[] args) {
	
	System.out.println("enter the stake");
	double stake = Utility.getDouble();
	System.out.println("enter the goal");
	double goal = Utility.getDouble();
	System.out.println("enter no of times");
	int noTimes = Utility.getInteger();
	
	placeBet(stake,goal,noTimes);
	
	}
	
	public static void placeBet(double st,double goal,int n) {
		
		float random;
		int winsCount =0;
		for(int i=0;i<n;i++) {
			double tempStake= st;
			while(tempStake!=goal&&tempStake>0) {
				random = (float)Math.random();
				if(random<0.5) {
					tempStake++;
				}else {
					tempStake--;
				}
			}
			if(tempStake==goal)
				winsCount++;
			
			
		}
		System.out.println("No of wins  "+ winsCount);
		float winPercentage = (winsCount/n)*100.0f;
		System.out.println(winPercentage);
		System.out.println(100-winPercentage);
	}
}
