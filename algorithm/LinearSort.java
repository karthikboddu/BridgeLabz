package com.bridgelabz.algorithm;


import com.bridgelabz.utility.Utility;

public class LinearSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "Wordtext.txt";
		String divide =" ";
		System.out.println("sorted words");
		
		String wordsList[] = Utility.readStringFile(path, divide);
		
		String sortedString[] =Utility.sortLinear(wordsList);
		
		for(String str:sortedString) {
			System.out.println(str);
		}
	}

}
