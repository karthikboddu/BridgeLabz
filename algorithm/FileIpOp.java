package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class FileIpOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{
//		FileOutputStream fos = new FileOutputStream("\\Wordtext.txt");
//		String fileString = "HELLO";
//		byte b[] = fileString.getBytes();
//		fos.write(b);
//		fos.close();		
//		System.out.println("success");
//	}catch (Exception e) {
//		System.out.println(e);
//	}
	
//	try {
//		FileInputStream fis = new FileInputStream("Wordtext.txt");
//		int i = 0;
//		while((i=fis.read())!=-1) {
//		System.out.print((char)i);
//		}
//		fis.close();
//	}
//	catch (Exception e) {
//		System.out.println(e);
//	}

//		try {
//			FileOutputStream fos = new FileOutputStream("Wordtext.txt");
//			BufferedOutputStream bos = new BufferedOutputStream(fos);
//			String bosStr="HELLO WORLD";
//			byte b[] = bosStr.getBytes();
//			bos.write(b);
//			System.out.println("success");
//			bos.flush();
//			bos.close();
//			fos.close();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
//		try {
//			FileInputStream fos = new FileInputStream("Wordtext.txt");
//			BufferedInputStream bis = new BufferedInputStream(fos);
//			int i=0; 
//			while((i=bis.read())!=-1) {
//				System.out.print((char)i);
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
//		try {
//			FileOutputStream fos = new FileOutputStream("Wordtext.txt");
//			PrintStream pW = new PrintStream(fos);
//			
//			pW.println("Hello");
//			pW.println("flash");
//			
//			pW.close();
//			fos.close();
//			System.out.println("success");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
		
//		String s1= "how";
//		String s2 = "hi";
//		System.out.println(s1.compareTo(s2));
		
		
		
		List<String> wordList = new ArrayList<String>();
		String line;
		String list[];
		try {
			InputStream iS = new FileInputStream("Wordtext.txt"); //reads in byte
			InputStreamReader iSR = new InputStreamReader(iS);//byte stream to character stream
			BufferedReader bs = new BufferedReader(iSR);//reads character stream
			while((line=bs.readLine())!=null) {
				String words[] = line.split(" ");
				for(String wordStr :words) {
				wordList.add(wordStr);
				System.out.println("String  "+line);
				System.out.println("lists  "+wordList);
				}
			}
			bs.close();
			
			
	
		} catch (Exception e) {
			System.out.println(e);
		}
		

	
	}

}
