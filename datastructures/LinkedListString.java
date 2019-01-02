package com.bridgelabz.datastructures;

import java.util.Arrays;

import com.bridgelabz.utility.Utility;

public class LinkedListString {

	Node head;
	static class Node{
		Node next;
		int data;
		Node(int d){
		 data =d;
		 next = null;	
		}
	}
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListString ls = new LinkedListString();
		
		String path ="wordInt.txt";
		String divide = " ";
		String WordListFile[] = Utility.readStringFile(path, divide);
		
		Arrays.sort(WordListFile);
		
		
		ls.head =new Node(100);
		
		for(int i=0;i<WordListFile.length;i++) {
		Node second = new Node(i);
		}
		Node third = new Node(300);

		
		ls.printList();
		
	}

}
