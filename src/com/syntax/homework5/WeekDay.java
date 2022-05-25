package com.syntax.homework5;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("PLease enter today day");
		int day=input.nextInt();
		if (day==1 ||day==2 || day==3|| day==4 ||day==5) {
			System.out.println("Its a weekday");
		}else if(day==6 || day==7) {
			System.out.println("it's a weekend");
		}else {
			System.out.println("invalid day");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
