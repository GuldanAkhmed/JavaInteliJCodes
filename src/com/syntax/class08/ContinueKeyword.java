package com.syntax.class08;

import java.util.Scanner;

public class ContinueKeyword {

	public static void main(String[] args) {
	
		for (int i=1; i<=5; i++) {

			if (i==3) {
				continue;
			}
			System.out.println("Hello  "+i);
			System.out.println("We are Batch 12 ");
		}
		
		//i want to print all numbers from 1 to 10 expect 4
		
		for (int i=1; i<=10; i++) {
			
			if (i==4 || i==7) {
			continue;
			}	
			System.out.println(i+" ");
		}
		
	          //Task1
		for (int i=1; i<=50; i++) {
			if (i%3==0) 
				continue;
			System.out.print(i +" ");			
		}	System.out.println("          ");
		       //Task2
		Scanner scan=new Scanner(System.in);
		String apply;
		do { 
			System.out.println("Do you have credit card?");
			apply=scan.next();
		} while (!apply.equalsIgnoreCase("yes"));
		System.out.println("Congrats! Here your card ");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	

