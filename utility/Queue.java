package com.bridgelabz.utility;

public class Queue<T extends Comparable<T>> {
	static Node front;
	static Node rear;
	static int length=0;
	public static class Node<T extends Comparable<T>>{
		private T data;
		private Node<T> next;
		public Node(T data) {
			this.data = data;
			this.next = null;
}
	}
	
	public Queue() {
		front = rear = null;
	}
	public static boolean isEmpty() {
		return front == null;
	}
	public static void enqueue(Comparable data) {
		Node temp = new Node(data);
		if(isEmpty()) {
			front = temp;
		}else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	public static void dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}
		front = front.next;
		if(front==null) {
			rear =null;
		}
	}
	public static void printlist() {
		Node n = front;
		while(n!=null) {
			
			System.out.println(n.data+" ");
			n= n.next;
		}
	}
	public static void printlistcalender() {
		Node n = front;
		while(n!=null) {
			System.out.print(n.data+"  ");
			n= n.next;
		}
	}
//	public static int totalAmount() {
//		Node node = front;
//		Comparable total =0;
//		while(node.next!=null) {
//			total+=node.data;
//			node = node.next;
//		}
//		total+=node.data;
//		return (int) total;
//	}
	public static void main(String[] args) {
		Queue.enqueue(4);
		Queue.enqueue(9);
		Queue.enqueue(19);
		Queue.enqueue(29);
		Queue.printlist();
		Queue.dequeue();
		System.out.println();
		Queue.printlist();
//		int amount =Queue.totalAmount();
		System.out.println();
//		System.out.println(amount);
	}

}
