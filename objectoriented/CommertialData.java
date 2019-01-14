package com.bridgelabz.objectoriented;

class CommertialData  {

	private String name;
	private double price;
	private int numberOfShares;
	private String dateTime;

	public String getSymbol() {
		return name;
	}
	public void setSymbol(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumberOfShares() {
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public double getValue() {
	    return numberOfShares * price;
}

	public String toString() {
		return " name "+name+" Numofshares "+numberOfShares+"";
	}
	
	public static void main(String[] args) {
		
	}
}
