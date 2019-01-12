package com.bridgelabz.utility;


public class Stack {

	 public class Node { 
		  
	        char data; // integer data 
	        Node next; // reference variavle Node type 
	    } 
	    // create globle top reference variable 
	    Node top; 
	    // Constructor 
	    public Stack() 
	    { 
	        this.top = null; 
	    } 
	  
	    // Utility function to add an element x in the stack 
	    public void push(char x) // insert at the beginning 
	    { 
	        // create new node temp and allocate memory 
	        Node temp = new Node(); 
	  
	        // check if stack (heap) is full. Then inserting an 
	        //  element would lead to stack overflow 
	        if (temp == null) { 
	            System.out.print("\nHeap Overflow"); 
	            return; 
	        } 
	  
	        // initialize data into temp data field 
	        temp.data = x; 
	  
	        // put top reference into temp link 
	        temp.next = top; 
	  
	        // update top reference 
	        top = temp; 
	    } 
	  
	    // Utility function to check if the stack is empty or not 
	    public boolean isEmpty() 
	    { 
	        return top == null; 
	    } 
	  
	    // Utility function to return top element in a stack 
	    public char peek() 
	    { 
	        // check for empty stack 
	        if (!isEmpty()) { 
	            return top.data; 
	        } 
	        else { 
	            System.out.println("Stack is empty"); 
	            return 0;
	        } 
	    } 
	  
	    // Utility function to pop top element from the stack 
	    public void pop() // remove at the beginning 
	    { 
	        // check for stack underflow 
	        if (top == null) { 
	            System.out.print("\nStack Underflow"); 
	            return; 
	        } 
	  
	        // update the top pointer to point to the next node 
	        top = top.next; 
	    } 
	  
	    public void display() 
	    { 
	        // check for stack underflow 
	        if (top == null) { 
	            System.out.printf("\nStack Underflow"); 
	      
	        } 
	        else { 
	            Node temp = top; 
	            while (temp != null) { 
	  
	                // print node data 
	                System.out.print(temp.data+" ");
	  
	                // assign temp link to temp 
	                temp = temp.next; 
	            } 
	        } 
	    } 
	 	
	
	
	public static void main(String[] args) {
		Stack stack= new Stack();
		stack.push('c');
		stack.push('b');
		stack.push('e');
		stack.push('f');
		
		stack.display();
	}

}
