package com.syntax.class15;

import java.util.Scanner;

public class ClassTask1 {

	public static void main(String[] args) {
		 String momName="Mary";
		  String dadName="Daniel";
		   
		  String gender="boy";
		  if(gender.equals("boy")) {
		  	System.out.println("suggested baby name: "+dadName.substring(0, 3) + momName.substring(2,4));
		  } else if(gender.equals("girl")) {
		  	System.out.println("suggested baby name: "+momName.substring(0, 2) + dadName.substring(3,6));

		  }else {
		  	System.out.println("unknown gender");
		  }
				
	}

}
