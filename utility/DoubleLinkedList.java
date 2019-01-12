package com.bridgelabz.utility;

public class DoubleLinkedList {

	Node head;
	Node tail;
	static class Node{
		char data;
		Node prev;
		Node next;
		
	}
	public DoubleLinkedList() {
		head = tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printForward() {
		if(head == null) {
			return;
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public void printBackward() {
		if(tail == null) {
			return;
		}
		Node temp = tail;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.prev;
		}
		
	}
	
	public void insertFront(char item) {
		Node new_node = new Node();
		new_node.data = item;
		if(isEmpty()) {
			 tail= new_node;
		}
		else {
			head.prev = new_node;
			 
		}
		new_node.next=head;
		head = new_node;
	}
	
	public void insertLast(char item) {
		Node new_node = new Node();
		new_node.data = item;
		if(isEmpty()) {
			head = new_node;
		}else {
			tail.next = new_node;
			
		}
		new_node.prev = tail;
		tail=new_node;
	}
	
	public void deleteFirst() {
		Node temp = head;
		if(isEmpty()) {
			System.out.println("underflow");
		}
		if(head==tail) {
			tail = null;
		}
		else {
			head.next.prev = null;
			
		}
		head = head.next;
		temp.next = null;
		
	}
	
	public void deleteLast() {
		Node temp = tail;
		if(isEmpty()) {
			System.out.println("underflow");
			tail = tail.prev;
		}
		if(head==tail) {
			head = null;
		}
		else {
			tail.prev.next = null;
			
		}
		tail = tail.prev;
		temp.prev = null;
	}
	
	public String getstring() {
		String output ="";
		Node temp = tail;
		while(temp!=null) {
			System.out.println(output+=temp.data);
			temp = temp.prev;
		}
		return output;
	}
	
	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		dll.insertFront('a');
		dll.insertFront('b');
		dll.insertFront('c');
		dll.insertLast('d');
		dll.printForward();
		System.out.println();
		dll.printBackward();
		System.out.println();
		System.out.println("delete first");
		dll.deleteFirst();
		dll.printForward();
		System.out.println();
		System.out.println("delete last");
		dll.deleteLast();
		dll.printForward();

	}

}
