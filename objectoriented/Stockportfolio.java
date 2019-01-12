package com.bridgelabz.objectoriented;

public class Stockportfolio {


	  private String name;
	  private Integer numOfshares;
	  private Double sharevalue;
	  
	  
	  
	  
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumOfshares() {
		return numOfshares;
	}

	public void setNumOfshares(Integer numOfshares) {
		this.numOfshares = numOfshares;
	}

	public Double getSharevalue() {
		return sharevalue;
	}




	public void setSharevalue(double sharevalue) {
		this.sharevalue = sharevalue;
	}




	public String toString(){
	      return "stock  name: "+name+", num of share: "+ numOfshares+ " ,sharevalue:"+sharevalue+"";
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
