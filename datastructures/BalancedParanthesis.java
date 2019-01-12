package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
		Stack st = new Stack();
		
		for(int i=0;i<exp.length();i++) {
			char ch = exp.charAt(i);
			if(ch=='(') {
				st.push(ch);
			}
			else if(ch==')') {
				st.pop();
			}
			
			
		}
		if(st.isEmpty()) {
			System.out.println(st.isEmpty());
		}else {
			System.out.println(st.isEmpty());
		}
		
		
	}

}
