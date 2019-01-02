package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class VendorMachine {

	public static void main(String[] args) {

		System.out.println("enter amount ");
		int amount = Utility.getInteger();
	      int[] changeCounts = new int[8];
	      int[] changeArray = { 1000, 500, 100, 50, 10, 5, 2, 1 };
	      int countTotalNotes = 0;

	      // calculates the change
	      Utility.vendorMachine(amount, changeCounts, changeArray);

	      for (int i = 0; i < changeArray.length; i++) {
	         countTotalNotes += changeCounts[i];
	         System.out.println(" " + changeArray[i] + " : " + changeCounts[i]);
	      }

	      // total notes
	      System.out.println("Total Notes : " + countTotalNotes);
	}

}
