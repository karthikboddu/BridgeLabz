package com.bridgelabz.functional;


public class Stopwatch {

	 private long startTime;
	 private long endTime;
	 private long elapsed; 
	
	 public  void start() {
		startTime = System.currentTimeMillis();	
		System.out.println(startTime);
		}
	 public void stop() {
		 endTime = System.currentTimeMillis();
		 System.out.println(endTime);
	 }
	 public long getElapsedTime() {
		 return elapsed;
	 }
	 public String getTimeInMinute() {
		 	elapsed = startTime - endTime;
		 	int milliSec = (int)elapsed
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Stopwatch stopwatch = new Stopwatch();
	stopwatch.start();
	stopwatch.stop();

	}
	
	

}
