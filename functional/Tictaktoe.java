package com.bridgelabz.functional;

import java.util.Arrays;
import java.util.Random;

import com.bridgelabz.utility.Utility;

public class Tictaktoe {

	public static void main(String[] args) {
		boolean player1 = false;
		boolean player2 = false;
		int moves = 0;
		boolean switchTurn = false;
		char a[][] = new char[3][3];
		for(char[] k: a)
			Arrays.fill(k,'_');
		int place = Utility.getInteger();
		while(moves>9&&!player1&&!player2) {
			if(switchTurn) {
			boolean isempty = true;
			Random random = new Random();
								
			
			while(isempty) {
				int pick = random.nextInt(9);
				switch (pick) {
							case 0:
							if(a[0][0]=='_') {
								isempty = false;
								a[0][0] ='0';
							}
							break;
							case 1:
							if(a[0][1]=='_') {
								isempty = false;
								a[0][1]='0';
							}
							break;
							case 2:
								if(a[0][2]=='_') {
									isempty = false;
									a[0][2]='0';
								}	
								break;
							case 3:
								if(a[1][0]=='_') {
									isempty = false;
									a[1][0]='0';
								}
								break;	
							case 4:
								if(a[1][1]=='_') {
									isempty = false;
									a[1][1]='0';
								}
								break;
							case 5:
								if(a[1][2]=='_') {
									isempty = false;
									a[1][2]='0';
								}
								break;
							case 6:
								if(a[2][0]=='_') {
									isempty = false;
									a[2][0]='0';
								}
								break;
							case 7:
								if(a[2][1]=='_') {
									isempty = false;
									a[2][1]='0';
								}
								break;
							case 8:
								if(a[2][2]=='_') {
									isempty = false;
									a[2][2]='0';
								}
								break;

								
						default:
							System.out.println("invalid");
							break;
						}
			}
			switchTurn = false;
			}else {
				System.out.println("enter your input X");
				
			}
	}
	}
	
	public static void ticTakToe(int r,int c) {
			
	}

}
