package com.syntax.homework5;

import java.util.Scanner;

public class NumberSize {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int number=scan.nextInt();
		if(number>0 && number<=10) {
			System.out.println("You entered small number");
		}else if (number>10 && number<=100) {
			System.out.println("You entered medium number");
		}else if (number>100 && number<=1000) {
			System.out.println("You entered large number");
		}else{
			System.out.println("please enter valid number");
			
			
			
		}
				
			
		
		
		
		
		
		
		
		
		
	}

}
