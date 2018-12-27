package com.bridgelabz.functional;



import com.bridgelabz.utility.Utility;

public class TwoDimens {
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
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
			twoDArr[i][j] = Utility.getInteger();
			}
		}
		System.out.println("Generated array");
		for(int i=0;i<M;i++) {
			for(int k=0;k<N;k++) {
			System.out.print(twoDArr[i][k]+" ");
			}
			System.out.println();
		}
	}
////	public static int getVal(int a) {
////		int integer = sc.nextInt();
////		return integer;		
////	}
////	public static double getVal(double b) {
////		double doble = sc.nextDouble();
////		return doble;
//	}
	

}
