package com.syntax.class04;

public class Homework {

	public static void main(String[] args) {
	int num = 5;
	if (num <0) {
		System.out.println("The number" + num + " is Negative");
		
	} else if (num>0) {
		System.out.println("the number"  + num + " is Positive");
	} else {
		System.out.println("The number is "+num);
	    num= 10;
	    if (num % 6 ==0) {
	    System.out.println("The" + num + "is an even Number");	
	    } else {
	    	System.out.println("The " + num + "is a odd Number");
	    
	    }
	}
	}	    
}	
