package com.syntax.HWTask;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("How long you have been working");
     int input=scan.nextInt();
     if (input>=5) {
    		 System.out.println("what is you salary?");
    		 int input2 = scan.nextInt();
    		 if(input2>50000) {
    			 System.out.println("your bonus is 5000 dollars");
    		 }else {
    			 System.out.println("your bonus is 3000 dollars");
    		 }
     } else {
    	 System.out.println("Sorry you are not eligible for the bonus .");
    		 
    		 }
	}

}
