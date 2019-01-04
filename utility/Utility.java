package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
		
		public static List<Integer> getPrimeNoUpto(int range) {
			int counter=0;
			int prime=2;
			List<Integer> aList = new ArrayList<Integer>();
			while(prime<range) {
				boolean isPrime = true;
				for(int j=2;j<=prime/2;j++)
				if(prime%j==0) {
					isPrime = false;
					break;
				}
				if(isPrime) {
					aList.add(prime);
					counter++;
				}
				prime++;
			}
			return aList;
		}
		
		public static void printArray(int arrays[]) {
			for(int i=0;i<arrays.length;i++) {
				System.out.println(arrays[i]);
			}
		}
		
		public static boolean getPalindromeList(String s1,String s2) {

			if(s1.length()==s2.length()) {
				for(int i=0;i<s1.length();i++) {
					if(s1.charAt(i)!=s2.charAt(s2.length()-i-1)) 
						return false;
				}
					return true;
				
			}else {
				return false;
			}
				
		}
		
		public static Map<String,String> isPalindrome(List<Integer> lists) {
			Map<String,String> palindromeList= new LinkedHashMap<>();
			Integer listToArray[] = lists.toArray(new Integer[lists.size()]);
			
			for(int i=0;i<listToArray.length;i++) {
				for(int j=i+1;j<listToArray.length;j++) {
					if(getPalindromeList(listToArray[i]+"",listToArray[j]+"")) {
						palindromeList.put(listToArray[i]+"",listToArray[j]+"");
					}
				}
			}
			return palindromeList;
		}
		
		public static Map<String,String> getPrimeAnagramList(List<Integer> ls) {
			Map<String, String> anagram = new LinkedHashMap<String,String>();
			Integer listToArray[] = ls.toArray(new Integer[ls.size()]);
			
			for(int i=0;i<listToArray.length;i++) {
				for(int j=i+1;j<listToArray.length;j++) {
					if(isPrimeAnagram(listToArray[i]+"",listToArray[j]+"")) {
						anagram.put(listToArray[i]+"", listToArray[j]+"");
						}
				}
			}
			return anagram;
		}
		
		public static boolean isPrimeAnagram(String s1,String s2) {
			String s1Arr[] = s1.split(" ");
			String s2Arr[] = s2.split(" ");
			String temp1s1="";
			String temp1s2="";
			for(String str1:s1Arr) {
				temp1s1+=str1;
			}
			for(String str2:s2Arr) {
				temp1s2+=str2;
			}
			
			if(temp1s1.length() == temp1s2.length()) {
				char s1Char[] = temp1s1.toCharArray();
				char s2Char[] = temp1s2.toCharArray();
				
				Arrays.sort(s1Char);
				Arrays.sort(s2Char);
				
				String newss1 = new String(s1Char);
				String newss2 = new String(s2Char);
				
				return newss1.equals(newss2);
				
			}else {
				return false;
			}
		}
		
		public static String[] readStringFile(String path,String divide) {
			List<String> wordList = new ArrayList<String>();
			String line;
			String list[];
			try {
				InputStream iS = new FileInputStream(path); //reads in byte
				InputStreamReader iSR = new InputStreamReader(iS);//byte stream to character stream
				BufferedReader bs = new BufferedReader(iSR);//reads character stream
				while((line=bs.readLine())!=null) {
					String words[] = line.split(divide);
					for(String wordStr :words) {
					wordList.add(wordStr);
					}
				}
				bs.close();
				
				
		
			} catch (Exception e) {
				System.out.println(e);
			}
			list = wordList.toArray(new String[wordList.size()]);
			return list;
		}
		
		public static int binarySearchFile(String[] str,String key) {
				return search(str, 0, str.length-1, key);
		}		
		public static int search(String str[],int start,int end,String key) {
			if((start-end) == 0) {
				if(str[start].compareTo(key)==0) {
					return start;
				}
				return -1;
			}else {
				int mid = (start+end)/2;
				if(str[mid].compareTo(key)==0) {
					return mid;
				}else {
					if(key.compareTo(str[mid])>0) {
						return search(str, mid+1, end, key);
					}else {
						return search(str, start, mid, key);
					}
				}
			}
		}
		
		public static int findNumber(int arr[],int start,int end) {

				if((start - end) ==0) {
					return arr[start];
				}else {	
					int mid = (start +end)/2;
					if(arr[start]==mid) {
						System.out.println("Number is "+start);
					}else {
						System.out.println("number present between"+start+" and "+mid+"?");
					}
						char answer = Utility.getString().charAt(0);
						if(answer =='n'||answer=='N') {
							return findNumber(arr, mid+1, end);
						}
						else {
							return findNumber(arr, start, mid);
						}
				}
		}
		
		public static String[] sortLinear(String[] str) {
			for(int i=1;i<str.length;i++) {
					String key = str[i];
					int j= i-1;
					while(j>=0) {
					if((key.compareTo(str[j]))>0) {
						break;
					 }
					str[j+1] = str[j];
					j--;
					}
					str[j+1] = key;
				}
			return str;
		}
		
		public static int[] readIntFile(String path,String split) {
			String line;
			String words[];
			String wordIntList[];
			List<String> ls = new ArrayList<>();
			try {
				FileInputStream fis = new FileInputStream(path);
				InputStreamReader isr = new InputStreamReader(fis);
				@SuppressWarnings("resource")
				BufferedReader br = new BufferedReader(isr);
				while((line=br.readLine())!=null) {
					words = line.split(split);
					for(String wordInt:words) {
						ls.add(wordInt);
					}
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			
			wordIntList = ls.toArray(new String[ls.size()]);
			int wordIntArr[] = new int[wordIntList.length];
			
			for(int i=0;i<wordIntArr.length;i++) {
				wordIntArr[i] = Integer.parseInt(wordIntList[i]);
			}
			
			return wordIntArr;
		}
		
		public static int[] bubbleSortFile(int[] wordsInt) {
			
			
			for(int i=0;i<wordsInt.length;i++) {
				for(int j=i+1;j<wordsInt.length;j++) {
					if(wordsInt[i]>wordsInt[j]) {
						int temp = wordsInt[i];
						wordsInt[i] = wordsInt[j];
						wordsInt[j] = temp;
					}
				}
			}
			return wordsInt;
		}
		
		public static int calculateWeek(int d,int m,int y) {

			
			int y1 = y-(14-m)/12;
			int m1 = m+12*((14-m)/12)-2;
			int x =y1+(y1/4)-(y1/100)+(y1/400);
			int d1 = (d+x+31*m1/12)%7;
			
			return d1;
		}
		
		public static int paymentMonthly() {
			System.out.println("enter principle");
			double principle = Utility.getDouble();
			System.out.println("enter rate");
			double rate = Utility.getDouble();
			System.out.println("enter no of years");
			int year = Utility.getInteger();
			
			int n = year*12;
			double r = rate/(12*100);
			
			double payment = (principle*r)/(1-Math.pow(1+r, -n));
			
			return (int)payment;
		}
		
		public static void convertTemp(int value) {

			switch (value) {
			case 1:
				System.out.println("enter celcuis");
				double c = Utility.getDouble();
				double CtoF = (c*9)/5+32;
				System.out.println("celcuis to farenheit");
				System.out.println(CtoF);
				break;
			case 2:
				System.out.println("enter farenheit");
				double f = Utility.getDouble();
				double FtoC = ((f-32)*5)/9;
				System.out.println("farenheit to celcuis");
				System.out.println(FtoC);;
			default:
				System.out.println("enter valid option");
				break;
			} 
		}
		
		public static void decimalToBinary() {
			System.out.println("enter decimal");
			int dec =  Utility.getInteger();
			List<Integer> ls = new ArrayList<Integer>();
			while(dec>0) {				
				int rem = dec%2;	
				ls.add(rem);
				dec /=2;

			}
	
			System.out.println("binary");
	
			System.out.println("original");
			Integer arr[] = ls.toArray(new Integer[ls.size()]);
			for(Integer asdf:arr) {
				System.out.print(asdf+" ");
			}
			for(int i=arr.length-1;i>=0;i--) {
				System.out.println(arr[i]);
			}
			
//			int mid = (0+arr.length-1)/2;
			Integer arr2[] = Arrays.copyOf(arr, 4);
			System.out.println();
			Integer arr3[] = Arrays.copyOfRange(arr, 4, 8);
//			for(int i=arr.length-1,j=0;i>=0;i--) {
//				arr2[j] = arr[i];
//				j++;
			
//			}
			for(Integer arer:arr2) {
				System.out.print(arer+" ");
			}
			System.out.println();
			
			System.out.println();
			
			
			for(Integer arear:arr3) {
				System.out.println(arear+ " ");
			}
			
			
			int sum= 0;
			double res =0;
			int length = arr.length-1;
			for(int i=0;i<arr.length;i++) {
				 int arrvalue = arr[i];
				 res= arrvalue*Math.pow(2,i);
				 sum =sum+(int)res;
				
				 length--;
			}
			System.out.println(sum);
			
			
		}
		
		public static void vendorMachine(int amount,int remChange[],int notesArr[]) {
			int tempAmount = amount;
			boolean flag = false;
			for(int i=0;i<notesArr.length;i++) {
		
			if((tempAmount/notesArr[i])>0) {
				int notes =tempAmount/notesArr[i];
				tempAmount = tempAmount%notesArr[i];
				remChange[i] =remChange[i]+ notes;
				flag = true;
				break;	
			}
			}
			
			if(flag) {
			 vendorMachine(tempAmount, remChange, notesArr);
			}
			
		}
		
		public static void writeStringFile(String path,String append) {
			try {
				FileWriter fw = new FileWriter(path);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(append);
				bw.close();
				System.out.println("file updated");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		public static void writeIntFile(String path,String append) {
			
			try {
				FileWriter fw = new FileWriter(path);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(append);
				bw.close();
				System.out.println("File updated");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
		
		


}
