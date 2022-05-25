package com.syntax.HW6;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("PLease enter your grade");
		String grade=scan.nextLine();
	
		switch (grade.toUpperCase()) {
		
		case "A":
		grade = "Excellent";
		break;
		case "B":
		grade ="Good";
		break;
		case "C":
		grade ="Average";
		break;
		case "D":
		grade = "Bad";
		break;
		default:
		grade = "Non Acceptable";}
		System.out.println("Your grade is "+grade);
		
		
		
		
		
		
		
		
	}

	}
