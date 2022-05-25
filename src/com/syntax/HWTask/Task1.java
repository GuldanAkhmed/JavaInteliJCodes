package com.syntax.HWTask;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		   Scanner input=new Scanner(System.in);
		   System.out.println("What is the amount of loan that you need ?");
		   int imput=input.nextInt();
		   if(imput<=200000) {
			   System.out.println("You will be able to get credit .");
		   } else {
			   System.out.println("You can not have the credit.");
		   }
	}

}
