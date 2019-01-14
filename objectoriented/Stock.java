package com.bridgelabz.objectoriented;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utility.Utility;

public class Stock {
	public static void readJson() {
	      File f = new File("myjson.json");
	      String s = "myjson.json";
//	      String data ="";
//	      List<String> lstr = new ArrayList<>();
		  ObjectMapper mapper = new ObjectMapper();
//	    	  TypeReference<List<Stockportfolio>> typeref = new TypeReference<List<Stockportfolio>>() {};
//	    	  List<Stockportfolio> sp = mapper.readValue(f, typeref); 
//	         for(Stockportfolio p:st) {
//	        	 data+=st;
//	         }
		try {
			Stockportfolio p = mapper.readValue(f,Stockportfolio.class);
			 System.out.println(p.getName()+"   "+p.getNumOfshares()+"    "+p.getSharevalue());	 
			 System.out.println("price  "+p.getNumOfshares()*p.getSharevalue());
			
//			lstr.add(d);
//			data="";
//			printReport(lstr);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	
//	         }
	}
	

	
	
	public static List<Stockportfolio> getInput(int n) {

	     	Stockportfolio allStocks[] = new Stockportfolio[n];
	     	 List<Stockportfolio> sa = new ArrayList<>(); 
			Stockportfolio stock = new Stockportfolio();
		
				System.out.println("enter the name");
				String name = Utility.getStringnext();
				stock.setName(name);
				System.out.println("enter no of shares");
				Integer shares= Utility.getInteger1();
				stock.setNumOfshares(shares);
				System.out.println("enter share value");
				Double sharevalue = Utility.getDouble();
				stock.setSharevalue(sharevalue);
		
				sa.add(stock);
				
				writeJson(sa); 
				
			
	
	      
	      return sa;
	}
	public static void writeJson(List<Stockportfolio> st) {
//		Stockportfolio stPort = getStock();
		
		try {
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writeValue(new File("myjson.json"),st);
		System.out.println("written");
		
		
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
//	public static Stockportfolio getStock() {
//		Stockportfolio st1 = new Stockportfolio();
//		st1.
//	}
//	
	
	
	
	public static void main(String[] args) {
		
//	      String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
	      //map json to student
		
		System.out.println("enter no of stocks");
		int n = Utility.getInteger();
		getInput(n);
		
		readJson();
	 
	}
}
