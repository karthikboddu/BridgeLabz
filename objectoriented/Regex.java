package com.bridgelabz.objectoriented;

import com.bridgelabz.utility.Utility;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Hello <<name>>, We have your full \n" + 
				"name as <<full name>> in our system. your contact number is 91-­xxxxxxxxxx. \n" + 
				"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016";
		String[] patterns ={ "<{2}\\w+>{2}", "<{2}\\w+\\s\\w+>{2}", "x{10}", "\\d+[/]\\d+[/]\\d+" };
		
		System.out.println("enter name");
		String name1= Utility.getString();
		System.out.println("enter full name");
		String fname1 = Utility.getString();
		System.out.println("enter phone no");
		String ph = Utility.getString();
		System.out.println("enter date");
		String date1= Utility.getString();
	
		
		
		
		String opname = name.replaceAll(patterns[0],name1);
		
		String opfname = opname.replaceAll(patterns[1],fname1);
		
		
		
		String opphno = opfname.replaceAll(patterns[2],ph);
		
		String opdate = opphno.replaceAll(patterns[3],date1);
		
		System.out.println(opdate);
		
		
//		Pattern pname = Pattern.compile("name");
//		Matcher m= pname.matcher(name);
//		name = m.replaceAll(name1);
//		System.out.println(name);
//		
//		Pattern pfname = Pattern.compile("full name");
//		Matcher m1= pfname.matcher(fname);
//		fname = m1.replaceAll(fname1);
//		System.out.println(fname);
//
//		Pattern pdate = Pattern.compile("xx");
//		Matcher m2= pdate.matcher(date);
//		date = m2.replaceAll(date1);
//		System.out.println(date);
//
//		Pattern p = Pattern.compile("xxxxxxxxxx");
//		Matcher matcher =p.matcher(phno);
//		phno = matcher.replaceAll(ph);	
//		System.out.println(phno);
		
	}

}
