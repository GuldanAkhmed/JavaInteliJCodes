package com.syntax.hw07;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
			System.out.println("Please enter your first name last name and your age");
		String firstName=scan.next();
		String lastName=scan.next();
		int age=scan.nextInt();
		for (int i=0; i<5; i++) {
		System.out.println("Your name is "+firstName+" and your last name is "+lastName+" and you are "+age+" old!");
		
	}

}
}