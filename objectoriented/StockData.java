package com.bridgelabz.objectoriented;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Stack;
import com.bridgelabz.utility.Utility;

public class StockData {
	final ObjectMapper mapper = new ObjectMapper();
	private String stockSymbol;
	private Integer noOfShares;
	Stack stack = new Stack();
	Queue queue = new Queue();
	
	
	public static void createFile(String name) {
		File f = new File(name);
		try {
			if(f.createNewFile()) {
				System.out.println("created");
			}else {
				System.out.println("file exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public  void buy(int amount,String symbol) throws FileNotFoundException, IOException, ParseException {
		String path ="stockdata.json";
		String newpPath = "stockNew.json";
		JSONArray array = readJson(path);	
		System.out.println(array);
		System.out.println("enter the shars to buy");
		int buyShares = Utility.getInteger();
		for(int i=0;i<array.size();i++) {
			JSONObject jObj = new JSONObject();
			System.out.println(jObj);
			if(symbol.equals(jObj.get("symbol"))) {
				long remShare = (long)jObj.get("numOfShares")-buyShares;
				jObj.put("numOfShares", remShare);
				array.remove(i);
				array.add(i, jObj);
				amount = (int)(amount - (buyShares*(long)jObj.get("price")));
				
				writeJson(array, path);
				updateAcc(newpPath, symbol, buyShares, amount);
				stack.push((String) jObj.get("symbol"));
				System.out.println("\n  Symbol pushed to the Stack");
				stack.display();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				String date = dateFormat.format(new Date(remShare));
				queue.enqueue(date);
				System.out.println("\n DateTime added to queue!!");
				queue.printlist();
				break;
 			}		
		}
		
		
	}
	
		@SuppressWarnings("unchecked")
		public JSONObject toJsonObject(CommertialData companyShares) 
		{
			JSONObject obj = new JSONObject();

			obj.put("symbol", companyShares.getSymbol());
			obj.put("numberOfShares", companyShares.getNumberOfShares());
			obj.put("price", companyShares.getPrice());
			obj.put("Value", companyShares.getValue());
			obj.put("dateTime", companyShares.getDateTime());
			return obj;
	}

	@SuppressWarnings("unchecked")
	public void sell(String filePath, String newAccountPath)
			throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException 
	{
		printEntries(filePath);
		CommertialData companyShares = makeCompanySharesObject();
		JSONObject jsonObject = toJsonObject(companyShares);
		stack.push((String) jsonObject.get("symbol"));
		JSONArray jsonArray = readJson(filePath);
		System.out.println(jsonArray);
		jsonArray.add("array-->" + jsonObject);
		writeJson(jsonArray, filePath);
		writeJson(jsonArray, newAccountPath);
		System.out.println("\n Your shares added to  account successfully");
		System.out.println("\n Symbol added to  stack..");
		stack.display();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		String date = dateFormat.format(new Date(0));
		queue.enqueue(date);
		System.out.println("\n DateTime added to queue!!");
		queue.printlist();

	}

	
	private Stocks makeCompanySharesObject() {
		// TODO Auto-generated method stub
		return null;
	}
	private void printEntries(String filePath) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		JSONArray jarr  = readJson(filePath);
		for(int i=0;i<jarr.size();i++) {
			System.out.println(jarr.get(i));
		}
	}
	public void sell(int amount,String symbol) {
		
	}
	
	public void save(String filename) {
		
	}
	
	public JSONArray readJson(String filename) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		JSONArray jsonarr = (JSONArray)parser.parse(new FileReader(filename));
		return jsonarr;
	}
	public void writeJson(JSONArray amount,String path) throws JsonGenerationException, JsonMappingException, IOException {
		 mapper.writeValue(new File(path), amount);
	}
	
	public void updateAcc(String path,String symbol,int buyshare,int amount) {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
