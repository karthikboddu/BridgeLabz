package com.bridgelabz.algorithm;

import java.util.ArrayList;

public class PrimeNumbersUpto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<Integer> aList = new ArrayList<Integer>();
//		int range = 1000;
//		int r =168;
//		int arr[] = new int[r];
//		for(int i=2;i<range;i++) {
//			boolean isPrime = true;
//			for(int j=2;j<=i/2;j++)
//			if(i%j==0) {
//				isPrime = false;
//				break;
//			}
//			if(isPrime == true) {
//				arr[] = 
//			}
//			
//		}
//		System.out.println("printed");
//		for(int array:arr) {
//			System.out.println(array);
//		}
		
		
		firstNPrimes(1000);
	}
	public static int[] firstNPrimes(int n){
	      int[] primes = new int[n];
	      int ncounter = 0;
	      int isPrime = 2;
	      while( ncounter < n){
	        boolean prime = true;
	        for (int j=2; j<isPrime; j++){
	          if (isPrime%j ==0){
	            prime = false;
	            break;
	          }
	        }
	        if (prime){
	          primes[ncounter] = isPrime;
	          ncounter++;
	        } 
	        isPrime++;
	       }
	      
	      for(int i=0;i<primes.length;i++) {
	    	  System.out.println(primes[i]);
	      }
	      System.out.println(ncounter);
	      return primes;
	    }

}
