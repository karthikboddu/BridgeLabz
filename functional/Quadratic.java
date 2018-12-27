package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter value of a");
		int a = Utility.getInteger();
		int b = Utility.getInteger();
		int c = Utility.getInteger();
		find(a, b, c);
	}
	public static void find(int a,int b,int c) {
		double b2 = Math.pow(b, 2);
		double delta = (b2) -4*a*c;
		double sqrtDelta = Math.sqrt(delta); 
		double root1 = (-b+sqrtDelta)/2*a;
		double root2 = (-b-sqrtDelta)/2*a;
		System.out.println(delta);
		System.out.println(root1);
		System.out.println(root2);
	}

}
