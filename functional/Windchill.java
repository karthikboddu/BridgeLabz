package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Windchill {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		double t = Utility.getDouble();
	      double v = Utility.getDouble();
	      double w = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * Math.pow(v, 0.16);
	      System.out.println(w);
	}

}
