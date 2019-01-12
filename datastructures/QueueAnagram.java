package com.bridgelabz.datastructures;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;

public class QueueAnagram {


	public static void main(String[] args) {
		List<String> ll = new ArrayList<>();
		ll = Utility.getPrimeStringNoUpto(1000);
		List<String> ll1 = new ArrayList<>();
		ll1 = Utility.getPrimeAnagramLList(ll);
		String arrStr[]= ll1.toArray(new String[ll1.size()]);
		int arr[] = new int[arrStr.length];
		for(int i=0;i<arrStr.length;i++) {
			arr[i] = Integer.parseInt(arrStr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			Queue.enqueue(arr[i]);
		}
		Queue.printlist();
	}


}
