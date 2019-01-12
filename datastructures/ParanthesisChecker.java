package com.bridgelabz.datastructures;

import com.bridgelabz.utility.DoubleLinkedList;
import com.bridgelabz.utility.Utility;

public class ParanthesisChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList dll = new DoubleLinkedList();
		System.out.println("enter string");
		String input = Utility.getString();
		for(int i=0;i<input.length();i++) {
			char exp = input.charAt(i);
			dll.insertLast(exp);
		}
		dll.printForward();
		System.out.println("string after adding to deque");
		String output = dll.getstring();
		System.out.println(output);
		
		if(input.equalsIgnoreCase(output)) {
			System.out.println("True");
		}else {
			System.out.println(input.equalsIgnoreCase(output));
		}
	}

}
