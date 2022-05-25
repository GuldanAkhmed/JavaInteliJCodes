package com.syntax.HWTask;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("What city do you live?");
        String city=scan.next();
        System.out.println("What is the temperature in "+city);
        float fahr=scan.nextFloat();
        float cels=((fahr=19)*5)/9;
        System.out.println("The temperature in "+city+" is "+cels+" degrees");
;
        
        
        
        
	}

}
