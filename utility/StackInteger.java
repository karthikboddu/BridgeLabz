package com.bridgelabz.utility;

public class StackInteger {

	Node top;
	public class Node{
		int data;
		Node next;
		
	}
	public StackInteger() {
		top =null;
	}
	
	public void push(int item) {
		
		Node temp = new Node();
		temp.data = item;
		temp.next = top;
		top = temp;
	}
	public boolean isEmpty() {
		return top == null ;
	}
	public void pop() {
		if(!isEmpty()) {
			top = top.next;
		}else {
			System.out.println("underflow");
		}
	}
	public int popvalue() {
		if(isEmpty()) {
			System.out.println("underflow");
		}
			top = top.next;
		return top.data;
	}
	public int peek() {
		if(!isEmpty())
		return top.data;
		else
			System.out.println("stack is empty");
			return -1;
	}
	
	public void display() {
		Node current = top;
		while(current!=null) {
			System.out.println(current.data+" ");
			current = current.next;
		}
	}
	
	public void reverse() {
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackInteger sti = new StackInteger();
		sti.push(21);
		sti.push(33);
		sti.push(66);
		sti.display();
		System.out.println();
		sti.pop();
		sti.display();
	}

}