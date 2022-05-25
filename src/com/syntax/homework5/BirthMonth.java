package com.syntax.homework5;

import java.util.Scanner;

public class BirthMonth {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
	    System.out.println("Which month you were born?");			
		String month=in.next();
		if(month.equals("December") || month.equals("January")||month.equals("February")) {
			System.out.println("You were born in winter");
		}else if(month.equals("March")|| month.equals("April)") ||month.equals("May")){
			System.out.println("You were born in Spring");
		}else if (month.equals("June") || month.equals("July") ||month.equals("August")){
			System.out.println("You were born in Summer");
		}else if (month.equals("September")||month.equals("October") ||month.equals("November")) {
			System.out.println("You were born in Fall");
		}else {
			System.out.println("wrong info input");
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


