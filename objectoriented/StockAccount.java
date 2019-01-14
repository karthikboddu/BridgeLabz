package com.bridgelabz.objectoriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class StockAccount  {

	
	
	public static void getInput() throws FileNotFoundException, IOException, ParseException {
        StockData stockData=new StockData();
        System.out.println(" Enter your name:");
        String name=Utility.getString();
        System.out.println("Enter the file name");
        String filename=Utility.getString();
		StockData.createFile(filename);
		System.out.println("1 : But  2: sell ");
		int c = Utility.getInteger();
		switch (c) {
		case 1:
			System.out.println("enter the symbol to buy");
			String symbol = Utility.getString();
			System.out.println("enter the amount");
			int amount = Utility.getInteger();
			stockData.buy(amount,symbol);
			break;
		case 2:
			System.out.println("enter the symbol to sell");
			String symbolsell = Utility.getString();
			System.out.println("eenter the amount");
			int amountto = Utility.getInteger();
			stockData.sell(amountto, symbolsell);
			break;
		default:
			break;
		}
	}
	
	
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
	

	

	public void printReport()
	{
		
	}
	public static void main(String[] args) {
		
	}





}
