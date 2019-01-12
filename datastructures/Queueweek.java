package com.bridgelabz.datastructures;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;

public class Queueweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter month");
		int month  = Utility.getInteger();
		System.out.println("enter year");
		int yr = Utility.getInteger();
		int calender[][] = Utility.printCalender(month, yr);
		for(int i=0;i<calender.length;i++) {
			for(int j=0;j<calender[i].length;j++) {
				Queue.enqueue(calender[i][j]);
			}
		}
		
		Queue.printlistcalender();
	}


}
