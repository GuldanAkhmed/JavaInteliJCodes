package com.syntax.homework5;

import java.util.Scanner;

public class TimeOfTheDay {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter time");
         int time=scan.nextInt();
         if (time>0 && time<=11) {
        	 System.out.println("it is morning");
         }else if (time>11 && time<=15) {
        	 System.out.println("its afternoon");
         }else if (time>15 && time<=20) {
        	 System.out.println("It is evening");
         }else if (time>20 && time<=24) {
         }else {
        	 System.out.println("please enter valid time");
        	 
         }
		
		
		
		
		
		

	}

}
