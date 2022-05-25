package com.syntax.HWTask;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         System.out.println("What is your age?");
         int input=scan.nextInt();
         if(input>=18) {
        	 System.out.println("You will be able get a driver lisence");
         } else {
        	 System.out.println("Get the permit first");
         }
         
	}

}
