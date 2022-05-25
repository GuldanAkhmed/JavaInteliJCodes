package com.syntax.class06;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter you country");
		String country = scan.nextLine();
		String language;
		switch (country.toLowerCase()) {
		case "usa":
			language = "English";
			break;
		case "japan":
			language = "Japananise";
			break;
		case "russia":
			language = "russian";
			break;
		case "turkey":
			language ="turkish";
			break;
		default:
			language = "unknown";
		}
		System.out.println(language);
		
		
		
		
		
		
		
		

	}

}
