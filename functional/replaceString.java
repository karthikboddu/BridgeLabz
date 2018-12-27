package com.bridgelabz.functional;
import java.util.Scanner;

public class replaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your name");
		
		
		String output= "Hello <<username>> , How are you";
		getString(output);
		
		
		
	}
	public static void getString(String st) {
		Scanner sc = new Scanner(System.in);
		String temp ="";
		String str=sc.next();
		if(str.length()<3) {
			System.out.println("enter minimum 3 characters");
		
		}
		else {
			temp = st.substring(0, 6);
			
			temp +=str;
			temp += st.substring(18,32);
			System.out.println(temp);
		}
	}

}
