package com.bridgelabz.algorithm;


import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1 ="mom";
//		String s2 = "omm";
//		char s1Arr[] = s1.toCharArray();
//		char s2Arr[] = s2.toCharArray();
//		Arrays.sort(s1Arr);
//		Arrays.sort(s2Arr);
//
//		String s1Str = s1Arr.toString();
//		String s2Str = s2Arr.toString();
//		System.out.println(s1Str);
//		System.out.println(s2Str);
//		if(s1Arr.equals(s2Arr)) {
//			System.out.println("Anagram");
//		}

//		String s2 = s1.toString();
//		System.out.println(s2);
		System.out.println("Enter First String");
		String s1 =Utility.getString();
		System.out.println("Enter second String");
		String s2 =Utility.getString();
		
		Utility.checkAnagram(s1,s2);
	
	}

	

}
