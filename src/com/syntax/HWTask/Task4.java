package com.syntax.HWTask;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Do you have any credit card?");
	    String input =scan.next();
	    if (input.equalsIgnoreCase("yes"));{
	    	System.out.println("how much do you own" );
	    	double balance = scan.nextDouble();
	        if (balance>1000) {
	        	System.out.println("Pay off as soon as possible");
	        } else {
	        	System.out.println("Keep spend more ");
	        }
	 
	    
	    
	   
	    	System.out.println("would you like to apply for  a credit card ?");
	    } 	
	        	
	        }
	    

}


