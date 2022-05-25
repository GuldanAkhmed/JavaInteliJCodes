package com.syntax.class04;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		
     Scanner  scan=new Scanner(System.in);
     
     System.out.println("Please enter your coutry where you are from");
     String country=scan.next();
     System.out.println("You are from "+country);
     if(country.equals("USA")) {
    	 System.out.println("You speak english");
     } else if (country.equals("Turkey")) {
    	 System.out.println("You speak turkish");
     }
     
     
	}

}
