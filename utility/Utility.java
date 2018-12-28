package com.bridgelabz.utility;

import java.util.Arrays;
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

		public static void binarySearch() {
//			 System.out.println("enter the size");
//	         int size = Utility.getInteger();
//	         System.out.println("enter the elements");
//	         int inputArr[] = new int[size];
//	         for(int i=0;i<inputArr.length;i++) {
//	        	 inputArr[i] = Utility.getInteger();
//	         }
//	         System.out.println("enter the element to search");
			int inputArr[] = {1,2,55,66,88};
			int key = 55; 
	        int start = 0;
	        int end = inputArr.length - 1;
	        long startTIme = System.currentTimeMillis();
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (key == inputArr[mid]) {
	                System.out.println("keys position"+mid);
	                break;
	            }
	            if (key < inputArr[mid]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	            mid = (start+end)/2;
	        }
	       if(start>end) {
	    	   System.out.println("not present");
	       }
	       long endTime = System.currentTimeMillis();
	       long elapsed = endTime - startTIme;
	       int sec = (int)elapsed;
	       System.out.println("Seconds  "+elapsed);
	    }
		public static void BinarySearchString() {
//			System.out.println("enter the size");
//			int size = Utility.getInteger();
			String s1[] = {"I","LOVE","INDIAN"};
			Arrays.sort(s1);
			System.out.println(Arrays.toString(s1));
//			System.out.println("enter the string");
//			for(int i=0;i<=s1.length-1;i++) {
//				 s1[i] = Utility.getString();
//			}
			
			System.out.println("enter String to search with {a,ab,ee} ");
			String s2 = Utility.getString();
			String s3 = s2.toUpperCase();
			int start =0;
			int end = s1.length - 1;
			while(start <=end) {
				int mid = (start + end)/2;
				if(s1[mid].compareTo(s3)<0) {
					start = mid+1;
				}else if(s1[mid].compareTo(s3)>0) {
					end = mid-1;
				}else {
					System.out.println("found at position  "+mid);
					break;
				}
			}
			if(start>end) {
				System.out.println("not present");
			}
		}
		
		public static void LinearSort() {
			int arr[] = {10,23,9,7,33,17};
			for(int i=1;i<arr.length;i++) {
				int key = arr[i];
				int j=i-1;
				while(j>=0&&arr[j]>key) {
					arr[j+1] = arr[j];
					j=j-1; 
				}                              
				arr[j+1] = key;
				

			}
			
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[j]);
			}
		}
		
		public static void LinearSortString() {
			String s1[] = {"a","g","d","z","f","e"};
			System.out.println(Arrays.toString(s1));
			System.out.println("elements");
			for(int i=1;i<s1.length;i++) {
				String key = s1[i];
				int j = i-1;
				while(j>=0) {
					if(key.compareTo(s1[j])>0) {
						break;
					}
					s1[j+1] = s1[j];
					j--;
				}
				s1[j+1] =key;
				System.out.println(Arrays.toString(s1));
			}
			System.out.println(Arrays.toString(s1));
			
		}
		
		public static void BubbleSort() {
			int arr[] = {1,9,6,3,8,2};
			int j;
			for(int i=0;i<arr.length;i++) {
				for(j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				}
			}
			
			for(int k=0;k<arr.length;k++) {
				System.out.println(arr[k]);
			}
			
		}
		
		public static void BubbleSortString() {
			String s1[] = {"EDDD","FD","SD","GG","LS"};
			for(int i=0;i<s1.length;i++) {
				for(int j=0;j<s1.length;j++) {
					if(s1[i].compareTo(s1[j])<0) {
						String temp = s1[i];
						s1[i] = s1[j];
						s1[j] = temp;
					}
				}
			}
			for(int k=0;k<s1.length;k++) {
				System.out.println(s1[k]);
			}
		}
		


}
