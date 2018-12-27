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
		
		public static void checkAnagram(String s1,String s2) {
			boolean flag =false;
			char s1Arr[] = s1.toCharArray();
			char s2Arr[] = s2.toCharArray();
			
			for(int i=0;i<s1Arr.length;i++) {
				for(int j=i+1;j<s2Arr.length;j++) {
					if(s1Arr[i]==s2Arr[j]) {
					flag = true;
					}
				}
			}
			
			if(flag==true) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not a anagram");
			}
		}
		
		public static void BinarySearch(int[] a,int n,int k) {
			int beg =0;
			int last = a.length-1;
			int mid = (beg+last)/2;
			
			if(k==mid) {
				
			}
		}
		
}
