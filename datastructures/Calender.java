package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		
		System.out.println("enter month");
		int month = Utility.getInteger();
		System.out.println("enter year");
		int yr= Utility.getInteger();
		
		Utility.printCalender(month, yr);
//		public  boolean isLeapyr(int yr) {
//			if(yr%4==0&&yr%100!=0)
//				return true;
//			else if(yr%400==0)
//				return true;
//			
//			return false;
//		}
		
//		public static String toString(String s) {
//			String op ="";
	//	
//				
//				op+=s;
//			
//			return op;
//		}

		}

}
