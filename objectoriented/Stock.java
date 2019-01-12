package com.bridgelabz.objectoriented;

import java.io.File;
import java.io.IOException;

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
	

	
	
	public static Stockportfolio[] getInput(int n) {

	     	Stockportfolio allStocks[] = new Stockportfolio[n];
			Stockportfolio stock = new Stockportfolio();
			for(int i=0;i<n;i++) {
				System.out.println("enter the name");
				String name = Utility.getStringnext();
				stock.setName(name);
				System.out.println("enter no of shares");
				Integer shares= Utility.getInteger1();
				stock.setNumOfshares(shares);
				System.out.println("enter share value");
				Double sharevalue = Utility.getDouble();
				stock.setSharevalue(sharevalue);
				allStocks[i] = stock;

				
				writeJson(allStocks); 
				readJson();
			}
			
	      
	      return allStocks;
	}
	public static void writeJson(Stockportfolio[] st) {
		try {
		ObjectMapper mapper = new ObjectMapper();
		for(int i=0;i<st.length;i++) {
		mapper.writeValue(new File("myjson.json"),st[i]);
		}
		System.out.println("written");
		
		
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
//	      String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
	      //map json to student
		
		System.out.println("enter no of stocks");
		int n = Utility.getInteger();
		getInput(n);
		
		
	 
	}
}
