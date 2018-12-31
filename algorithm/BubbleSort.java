package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "wordInt.txt";
		String split =" ";
		int wordsInt[]=Utility.readIntFile(path, split);
		System.out.println("elements are");
		for(int words:wordsInt) {
			System.out.println(words);
		}
		System.out.println();
		int sortedIntList[] = Utility.bubbleSortFile(wordsInt);
		
		for(int sorted :sortedIntList) {
			System.out.println(sorted);
		}
		
	}

}
