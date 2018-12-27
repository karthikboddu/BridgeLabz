package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	static Scanner sc = new Scanner(System.in);
	
		// TODO Auto-generated method stub
		public static int getInteger() {
			int inte = sc.nextInt();
			return inte;
		}
		public static float getFloat() {
			float flt = sc.nextFloat();
			return flt;
		}
		public static double getDouble() {
			double dble = sc.nextDouble();
			return dble;
		}
		public static String getString() {
			String str = sc.nextLine();
			return str;
		}
		public static byte getBytes() {
			byte byt = sc.nextByte();
			return byt;
		}
		public static void checkLeapYr(int yr) {
			boolean isLeapyr = false;
			
			if(yr%400 == 0&&yr>999&&yr<10000) {
				isLeapyr = true;
			}else if(yr%100 == 0) {
				isLeapyr = false;
			}else if(yr%4 == 0) {
				isLeapyr = true;
			}else {
				isLeapyr = false;
			}
			
			if(isLeapyr == true) {
				System.out.println("Leap Year");
			}else {
				System.out.println("Not a Leap Year or not valid year");
			}
		}
		
}
