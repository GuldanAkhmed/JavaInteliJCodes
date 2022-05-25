package com.syntax.reviewclass6;

public class MorePatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for (int i=1; i<=4; i++)	{
		for (int j = 0; j <= 5; j++) {
		if (i==1 || i==4 || j==1 || j==5)	{
			System.out.print("* ");
		}else {
	
		System.out.print(" ");
	}	
	}	
	System.out.println();	
		
	for (int r = 1; r <= 5; r++) {
		for (int c = 1; c <= r; c++) {
			System.out.print(r + " ");
		}
		System.out.println();
	}
	
		System.out.println("----Triangle------");
		
		
		
	}	
	}

}
