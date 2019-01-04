package com.bridgelabz.datastructures;

import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<exp.length();i++) {
			char ch = exp.charAt(i);
			if(ch=='('||ch==')') {
				stack.push(ch);
			}
			
			
		}
		
		System.out.println(stack);
	}

}
