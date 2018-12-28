package com.bridgelabz.functional;

import java.util.ArrayList;
import java.util.Random;

import com.bridgelabz.utility.Utility;

public class CouponNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> coupons = new ArrayList<Integer>();
		 System.out.println("enter the coupons ");
		 int totalCoupons = Utility.getInteger();
		 int totalRandom =0;
		 for(int i=0;i<totalCoupons;i++) {
			 int couponNo = generateNo(totalCoupons);
			 System.out.println("generated coupon" +couponNo);
			 totalRandom++;
			 
			 if(!coupons.contains(couponNo)) {	
				 coupons.add(couponNo);
			 }else
				 i--;
		 }
		 
		 System.out.println("coupons");
		 for(Integer k:coupons)
			 System.out.println(k);
		 
		 System.out.println("toalrandoms  "+totalRandom);

	}
	
	public static int generateNo(int range) {
		Random random = new Random();
		int randNo = random.nextInt(range);
		
		return randNo;
	}

}
