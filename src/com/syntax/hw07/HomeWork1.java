package com.syntax.hw07;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		 
		
		int Coffee=3;
		Scanner scan=new Scanner(System.in);
		int priceCoffee;
		do {
			System.out.println("PLease pay for your coffee");
			priceCoffee=scan.nextInt();
			
		} while (priceCoffee!=Coffee);
		System.out.println("PLease enjoy your coffee");
		
		double price = 2.99;
		System.out.println("Please pay for your coffee");
				

		Scanner in = new Scanner(System.in);
		double pay;

		do {
		pay = in.nextDouble();
		if (pay > price) {
		System.out.println("Please give less");

		} else if (pay < price) {
		System.out.println("Please give more money");
		}

		} while (pay != price);

		System.out.println("Please enjoy your coffee");
		
		
		
		
		
		
		
	}

}
