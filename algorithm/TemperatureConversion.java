package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. celcuis to farenheit 2 . farenheit to celcuis");
		System.out.println("enter value");
		int v = Utility.getInteger();
		Utility.convertTemp(v);
	}

}
