package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class primeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number");
		int no = Utility.getInteger();
		checkPrime(no);
	}
	public static void checkPrime(int no) {
		System.out.println("prime factors are");
		for(int num =2;num<=no;num++) {
			boolean isPrime =true;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					isPrime = false ;
					break;
				}
			}
			
			if(isPrime==true) {
				while(no%num==0) {
					System.out.print(num+" ");
					no = no/num;
					
				}
			}
		}	
			
		
		
		
		
	}

}
