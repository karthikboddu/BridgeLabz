package com.bridgelabz.utility;

public class DoubleLinkedListInt {


	Node head;
	Node tail;
	static class Node{
		int data;
		Node prev;
		Node next;
		
	}
	public DoubleLinkedListInt() {
		head = tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printForward() {
		if(head == null) {
			return;
		}else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	public void printBackward() {
		if(tail == null) {
			return;
		}else {
			Node temp = tail;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	
	

	
	public void deleteFirst() {
		Node temp = head;
		if(isEmpty()) {
			System.out.println("underflow");
		}
		if(head == tail) {
			tail = null;
		}else {
			head.next.prev = null;
			
		}
		head = head.next;
		temp.next = null;
	}
	
	public void deleteLast() {
		Node temp = tail;
		if(head == tail) {
			head = null;
		}
		else {
			tail.prev.next = null;
		}
		tail = tail.prev;
		temp.prev = null;
	}
	
	public void insertFirst(int item) {
		Node new_node = new Node();
		new_node.data = item;
		if(isEmpty()) {
			tail = new_node;
		}else {
			head.prev = new_node;
			
		}
		new_node.next= head;
		head = new_node;
	}
	
	public void insertLast(int item) {
		Node new_node = new Node();
		new_node.data = item;
		if(isEmpty()) {
			head = new_node;
		}else {
			tail.next = new_node;
			
	   }
		new_node.prev = tail;
		tail = new_node;
	}
	
	public static void main(String[] args) {
		DoubleLinkedListInt dlli = new DoubleLinkedListInt();
		dlli.insertFirst(10);
		dlli.printForward();
		System.out.println();
		dlli.insertFirst(20);
		System.out.println();
		dlli.printForward();
		System.out.println();
		dlli.insertLast(30);
		System.out.println();
		dlli.printForward();
		System.out.println();
		dlli.deleteFirst();
		dlli.printForward();
		System.out.println();
		dlli.deleteLast();
		dlli.printForward();
		dlli.deleteFirst();
		dlli.printForward();
	}

}
