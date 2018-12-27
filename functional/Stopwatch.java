package com.bridgelabz.functional;


import com.bridgelabz.utility.Utility;

public class Stopwatch {

	 private long startTime;
	 private long endTime;
	
	 public  void start() {
		startTime = System.currentTimeMillis();	
		}
	 public void stop() {
		 endTime = System.currentTimeMillis();
	 }

	 public String getTimeInMinute() {
		 	long elapsed = endTime - startTime;
		 	int milliSec = (int)elapsed;
		 	int sec = (int)elapsed/1000;
		 	int min = sec/60;
		 	
		 	return "Time : "+min+" Min : "+sec+" : seconds "+milliSec+" : Milliseconds";
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	System.out.println("enter to start / stop ");
	Utility.getString();
	System.out.println("Started");
	Stopwatch stopwatch = new Stopwatch();
	stopwatch.start();
	System.out.println("enter to stop");
	Utility.getString();
	System.out.println("stopped");
	stopwatch.stop();

	System.out.println(stopwatch.getTimeInMinute());
	}
	
	

}
