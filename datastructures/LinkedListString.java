package com.bridgelabz.datastructures;


public class LinkedListString {

	Node head;
	static class Node{
		Node next;
		String data;
		Node(String d){
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
	public boolean isEmpty() {
		return head == null;
	}
	public void insert(String data) {
		Node new_node = new Node(data);
		new_node.next = null;
		if(head == null) {
			head = new_node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = new_node;
		}
	
	}
	public void insertFirst(String data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	public void insertAfter(int index,String data) {
		Node new_node = new Node(data);
		Node n = head;
		if(index==0) {
			insertFirst(data);
		}else {
		for(int i=0;i<index-1;i++) {
			n = n.next;
		}
		new_node.next = n.next;
		n.next = new_node;
		}
	}
	
	public boolean search(String s) {
		Node new_node = head;
		while(new_node!=null) {
			if(new_node.data.equals(s)) {
				return true;
			}
			new_node = new_node.next;
		}
		return false;
	}
	
	public  String pop() {
		String temp = head.data;
		head  = head.next;
		return temp;
	}
	
	public void remove(String item) {
//		Node n = head;
//		Node n1 =null;
//		int pos = 0;
//		while(n.next!=null) {
//			if((n.data)==item) {
//				
//				break;
//			}
//			pos++;
//			n=n.next;
//		}
//		System.out.println(pos);
//		if(pos==0) {
//			head = head.next;
//		}else {
//		for(int i=0;i<pos-1;i++) {
//			n = n.next;
//		}
//		n1 = n.next;
//		n.next = n1.next;
//		}
//		System.out.println(pos);
		
		Node current = head;
		Node temp = null;
		if(current!=null&&current.data==item) {
			head = current.next;
			return;
		}
		while(current!=null&&!(current.data.equals(item))){
			temp= current; 
			current = current.next;
		}
		if(current==null) {
			return;
		}
		temp.next = current.next;
	}

	public String getString() {
		String output="";
		Node n = head;
		while(n.next!=null) {
			output +=n.data+" ";
			n = n.next;
		}
		output+=n.data;
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListString ls = new LinkedListString();
		System.out.println("linked list");

		ls.insert("a");
		ls.insert("b");
		ls.insert("c");
		ls.printList();
		System.out.println();
		ls.insertFirst("d");
		ls.printList();
		System.out.println();
		ls.insertAfter(2, "e");
		
		ls.printList();
		System.out.println();
		ls.remove("c");
		ls.printList();
		System.out.println(ls.search("a"));
	}

}
