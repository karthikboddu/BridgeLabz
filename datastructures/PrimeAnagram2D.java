package com.bridgelabz.datastructures;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Utility;

public class PrimeAnagram2D {

	public static void main(String[] args) {
		List<String> ll = new ArrayList<>();
		ll = Utility.getPrimeStringNoUpto(1000);
		List<String> ll1 = new ArrayList<>();
		List<String> notAnagram  = new ArrayList<>();
		ll1 = Utility.getPrimeAnagramLList(ll);

		notAnagram.addAll(ll);
		for(int i=0;i<ll1.size();i++) {
			if(notAnagram.contains(ll1)) {
				notAnagram.remove(i);
			}
		}
		
		
		String notarr[] = notAnagram.toArray(new String[notAnagram.size()]);
		String anagram[] = ll1.toArray(new String[ll1.size()]);
		System.out.println(notarr.length);
		System.out.println(anagram.length);
		int m = 2;
		int n = 158;
		String ana[][] = new String[m][n];
		System.out.println(ana.length);
		for(int i=0;i<ana.length;i++) {
			for(int j=0;j<ana[i].length;j++) {
				
			
				ana[i][j] = -1+"";
			}
			
		}
		for(int i=0;i<ana[0].length;i++) {
			ana[0][i]= anagram[i];
			if(i==0) {
				ana[0][i] ="anagram";
			}
		}
		for(int i=0;i<ana[0].length;i++) {
			if(i==0) {
				ana[1][i] = "not anagram ";
			}
			ana[1][i] = notarr[i];
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(ana[i][j]+" ");
			}
			System.out.println();
		}
		
}

}
