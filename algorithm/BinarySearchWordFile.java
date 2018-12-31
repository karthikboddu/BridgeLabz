package com.bridgelabz.algorithm;


import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class BinarySearchWordFile {

	public static void main(String[] args) {
//		try {
//			FileInputStream fis = new FileInputStream("Wordtext.txt");
//			int i=0;
//			while((i=fis.read())!=-1) {
//				System.out.print((char)i);
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}
	
		String path ="Wordtext.txt";
		String divide = " ";
		String WordListFile[] = Utility.readStringFile(path, divide);
		
		Arrays.sort(WordListFile);
		
		for(String wordStr:WordListFile) {
			System.out.print(wordStr+" ");
		}
		System.out.println();
		System.out.println("enter word to search");
		String key = Utility.getString();
		int pos = Utility.binarySearchFile(WordListFile, key.trim());
		
		if(pos == -1) {
			System.out.println("word not found");
		}else {
			System.out.println("word found "+(pos+1));
		}
		
	}

}
