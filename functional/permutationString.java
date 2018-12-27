package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class permutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method st11111111111111111111111111111111111111111ub
		System.out.println("enter the String");
		String aString = Utility.getString();
		permutation(aString);
	}
	public static void permutation(String input){
		System.out.println("permutation words");
		permutation("", input); 
		
		}
	private static void permutation(String perm, String word) { 
		
		if (word.isEmpty()) {	
			
			System.out.println(perm + word); 
			
			}
		
		else{ 
				for (int i = 0; i< word.length(); i++)
				{
				permutation(perm + word.charAt(i), word.substring(0, i) 
						+ word.substring(i + 1, word.length())); 
				}
			}
		
	}
	
	
	  
}
