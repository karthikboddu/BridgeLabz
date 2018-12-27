package com.bridgelabz.functional;


import com.bridgelabz.utility.Utility;

public class EuclideanDst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the value x");
		int x = Utility.getInteger();
		System.out.println("enter the value y");
		int y = Utility.getInteger();
		distance(x, y);
		
	}
	
	public static void distance(int x,int y) {
		double xX = Math.pow(x, 2);
		double yY = Math.pow(y, 2);
		double z = xX + yY;
		double dist = Math.sqrt(z);
		System.out.println("Eulidean distance is "+ dist);
	}

}
