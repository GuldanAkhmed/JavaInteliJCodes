package com.syntax.class04;

public class Mortgage {

	public static void main(String[] args) {
		double mortgageRate=4.5;
		System.out.println("User will buy a house");
		
		if (mortgageRate > 4.5) {
			System.out.println("I am considering buying a house");
			
			double mortgagePrice=50000;

			if (mortgagePrice > 50000) {
				System.out.println("I will get a loan");
			} else {
				System.out.println("I will pay cash");
			}

		} else {
			System.out.println("The rate is too high, i won`t buy a house");
		}
		
	}

}
