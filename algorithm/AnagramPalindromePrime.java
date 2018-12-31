package com.bridgelabz.algorithm;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.bridgelabz.utility.Utility;

public class AnagramPalindromePrime {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		List<Integer> primeNoList = new ArrayList<Integer>();
		Map<String,String> palindromeList = new LinkedHashMap<>();
		primeNoList = Utility.getPrimeNoUpto(1000);
		palindromeList = Utility.isPalindrome(primeNoList);
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;i<a1.length;j++) {
//				if(a[i]==a1[j]) {
//					System.out.println(a[i]+" & "+a1[j]+ " are Anagram");
//				}
//			}
//		}
		
		System.out.println("palindrome List Upto 1000");
		
		for(Map.Entry<String, String> palidrome:palindromeList.entrySet()) {
			System.out.println(palidrome.getKey()+"  "+palidrome.getValue());
		}
		
		Map<String, String> anagramPrimeList = new LinkedHashMap<>();
		anagramPrimeList = Utility.getPrimeAnagramList(primeNoList);
		
		System.out.println();
		System.out.println("Anagram list upto 1000");
		for(Map.Entry<String, String> anagram :anagramPrimeList.entrySet()) {
			System.out.println(anagram.getKey()+ "   "+anagram.getValue());
		}
	}

}
