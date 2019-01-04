package com.bridgelabz.datastructures;


import com.bridgelabz.utility.Utility;

public class UnorderedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListString lls = new LinkedListString();
		String directory = "Wordtext.txt";
		String wordsFile[] = Utility.readStringFile("Wordtext.txt", " ");
		
		for(int i=0;i<wordsFile.length;i++) {
			lls.insert(wordsFile[i]);
		}
		System.out.println("Unordered List ");
		lls.printList();
		System.out.println();
		System.out.println("enter String to search");
		String strSearch = Utility.getString();
		if(lls.search(strSearch)==true) {
			lls.remove(strSearch);
		}
		else {
			lls.insert(strSearch);
			lls.printList();
		}

		lls.printList();
		String output = lls.getString();
		System.out.println();
		System.out.println(output);
		Utility.writeStringFile(directory, output);
		
	}

}
