package com.syntax.practice;

import java.util.Scanner;

public class PracticeJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumbers.length; ++i) {
	      for(int j = 0; j < myNumbers[i].length; ++j) {
	        System.out.println(myNumbers[i][j]);
	      }
	}
	    
	    System.out.println("--------");
	    
	    
	    String[] country= {"USA","Russia", "Turkey"};
	    System.out.println(country[0] );
	   
	    System.out.println("--------------------");
	    
	    String[] cars= {"BMW", "Hyndai","Mercedes","Audi"};
	    cars[0]="Acura";
	    System.out.println(cars[0]);
	    
	   System.out.println("Please verify your phone number "); 
	   Scanner scan=new Scanner(System.in);
	 int phoneNumber=scan.nextInt();
	 System.out.println("Please verify your address");
	 String address=scan.nextLine();
	 System.out.println("You are checked in !");
	 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
