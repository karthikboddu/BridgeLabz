package com.bridgelabz.functional;
import java.util.Scanner;

public class harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		getHarmonic(a);
		sc.close();
	}
	public static void getHarmonic(int no) {
		
		float sum=0;
		for(int i=1;i<=no;i++) {
			
			sum += (float)1/i;
		}
		System.out.println(sum);
	}

}
