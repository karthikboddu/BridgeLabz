package com.bridgelabz.utility;


public class Stack <T extends Comparable<T>> {

	 public class Node <T extends Comparable<T>>{ 
	        Comparable<T> data;  
	        private Node<T> next; 
	        public Node(Comparable data) {
	        	this.data = data;
	        }
	    } 
	    // create globle top reference variable 
	    public Node <T> top = null; 
	    // Constructor 
	    
	  
	    // Utility function to add an element x in the stack 
	    @SuppressWarnings("unused")
		public void push(T data) // insert at the beginning 
	    { 
	        // create new node temp and allocate memory 
	        @SuppressWarnings("rawtypes")
			Node temp = new Node(data); 
	  
	        // check if stack (heap) is full. Then inserting an 
	        //  element would lead to stack overflow 
	        if (temp == null) { 
	           top = temp; 
	        } 
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
	    public Comparable peek() 
	    { 
	        // check for empty stack 
	        if (!isEmpty()) { 
	            return top.data; 
	        } 
	        else { 
	            System.out.println("Stack is empty"); 
	            return null;
	        } 
	    } 
	  
	    // Utility function to pop top element from the stack 
	    public Node pop() // remove at the beginning 
	    { 
	        // check for stack underflow 
	        if (top == null) { 
	            System.out.print("\nStack Underflow"); 
	            return null; 
	        } 
	  
	        // update the top pointer to point to the next node 
	        Node temp = top;
	        temp.next =null;
	        top = top.next; 
	        
	        return temp;
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
