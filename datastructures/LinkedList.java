package com.bridgelabz.datastructures;


public class LinkedList {
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
	
	public void insert(int data) {
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
	public void insertFirst(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	public void insertAfter(Node pos,int data) {
		Node new_node = new Node(data);
		new_node.next = pos.next;
		pos.next = new_node;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
