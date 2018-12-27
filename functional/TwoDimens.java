package com.bridgelabz.functional;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class TwoDimens {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of Rows");
		int rows = Utility.getInteger();
		System.out.println("Enter no of Columns");
		int cols = Utility.getInteger();
		printArray(rows,cols);
	}
	
	public static void printArray(int M,int N) {
		
		
		int twoDArr[][] = new int[M][N];
		System.out.println("enter the elements into array");
		for(int i=0;i<twoDArr.length;i++) {
			for(int j=0;j<twoDArr.length;j++) {
			twoDArr[i][j] = Utility.getInteger();
			}
		}
		System.out.println("Generated array");
		for(int i=0;i<twoDArr.length;i++) {
			for(int k=0;k<twoDArr.length;k++) {
			System.out.print(twoDArr[i][k]+" ");
			}
			System.out.println();
		}
	}
	public static int getVal(int a) {
		int integer = sc.nextInt();
		return integer;		
	}
	public static double getVal(double b) {
		double doble = sc.nextDouble();
		return doble;
	}
	

}
