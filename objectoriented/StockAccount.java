package com.bridgelabz.objectoriented;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utility.Utility;

public class StockAccount implements CommertialData{

	private String stockSymbol;
	private Integer noOfShares;
	
	
	public StockAccount(String filename){
		String data =Utility.createAcc(filename);
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(new File(filename),data);
			System.out.println("created");
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
//	public double valueOf() {
//		
//	}
	
	public void buy(int amount,String symbol) {
		
	}
	
	public void sell(int amount,String symbol) {
		
	}
	
	public void save(String filename) {
		
	}

	
	public String getStockSymbol() {
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	public Integer getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(Integer noOfShares) {
		this.noOfShares = noOfShares;
	}
	public String toString() {
		return " name "+stockSymbol+" Numofshares "+noOfShares+"";
	}
	
	public void printReport()
	{
		
	}
	public static void main(String[] args) {
		
	}





}
