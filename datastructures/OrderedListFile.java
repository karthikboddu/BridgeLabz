package com.bridgelabz.datastructures;

import java.util.Arrays;

import com.bridgelabz.utility.OrderedList;
import com.bridgelabz.utility.Utility;

public class OrderedListFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String directory = "wordInt.txt";
		int wordsInt[] = Utility.readIntFile(directory, " ");
		Arrays.sort(wordsInt);
		OrderedList ol = new OrderedList();
//		for(int sd:wordsInt) {
//			System.out.println(sd);
//		}
		for(int i=0;i<wordsInt.length;i++) {
			ol.add(wordsInt[i]);
		}
		ol.printList();
		System.out.println();
		System.out.println("enter item to search");
		int key = Utility.getInteger();
		System.out.println(ol.search(key));
		if(ol.search(key)==true) {
			ol.remove(key);
		}else {
			ol.add(key);
		}
		System.out.println();
//		ol.printList();
		String output = ol.getString();
		
		System.out.println(output);
		
		Utility.writeIntFile(directory, output);
		System.out.println();
		ol.printList();
	}

}
