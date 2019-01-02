package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class DayOfweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String week[] = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		System.out.println("enter date");
		int d = Utility.getInteger();
		System.out.println("enter month");
		int m = Utility.getInteger();
		System.out.println("enter year");
		int y = Utility.getInteger();
		
		d =Utility.calculateWeek(d,m,y);
		System.out.println(week[d]);
	}

}
