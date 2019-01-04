package com.bridgelabz.utility;


public class OrderedList {
	Node head;
	static class Node{
		Node next;
		int data;
		Node(int d){
			data =d;
			next = null;
		}
	}
	
	
	public void add(int data) {
		Node new_node = new Node(data);
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
	
	public void printList() {
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n= n.next;
		}
	}
	
	public void remove(int item) {
		Node current = head;
		Node temp = null;
		if(current.next!=null&&current.data==item) {
			head = current.next;
			return;
		}
		while(current.next!=null&&current.data!=item) {
			temp = current;
			current = current.next;
		}
		if(current==null) {
			return;
			}
		temp.next = current.next;
	}
	
	public boolean search(int item) {
		Node current = head;
		
		while(current.next!=null) {
			if(current.data==item) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public String getString() {
		String output="";
		Node current = head;
		while(current.next!=null) {
			output +=current.data+" ";
			current = current.next;
		}
		output+=current.data;
		
		return output;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
