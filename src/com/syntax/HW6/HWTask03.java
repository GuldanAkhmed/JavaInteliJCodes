package com.syntax.HW6;

import java.util.Scanner;

public class HWTask03 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Is there any sale");	
	String answer=scan.next();
	switch(answer) {
	case "no":
		System.out.println("Sorry i am not shopping");
	case "yes":
		System.out.println("What is the price for this item?");
	double price=scan.nextDouble();
	double percent;
	if(price<20) {
		percent=0.10;
	}else if (price>=20 && price<=99) {
		percent =0.25;
	}else if (price>100 && price<500) {
		percent =0.35;
	}else {
		percent =0.50;
	}
	double discount=price*percent;
	double afterDiscount=price - discount;
	System.out.println("After discount of $" +discount+ " the price item was reduced from $" +price+" to $" +afterDiscount);
		break;
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
