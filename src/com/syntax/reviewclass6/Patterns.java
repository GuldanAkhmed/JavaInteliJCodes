package com.syntax.reviewclass6;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    for (int i=1; i<=5; i++) {
    	System.out.print("*");
    }
		System.out.println();
	System.out.println("---Better way----");	
		
	for (int r=1; r<=4; r++) {
		for (int col=1; col<=5; col++) {
			System.out.print(" * ");
		}	
		System.out.println("-----------------");	
		System.out.println();
	}
	for (int i=1 ; i<=10; i++) {
		
		for (int j=1 ; j<=10; j++) {
			System.out.print(" * ");
		}
		System.out.println();
	}
	System.out.println("----------------------------");	
	for (int r=1; r<=4; r++) {
		for (int c=1; c<=5; c++) {
			System.out.print(r+" ");
		}	
			System.out.println();
		
	}
	
	for (int r=5;r>=1	; r--) {
		for(int c=5; c>=2; c--) {
			System.out.print(r+" ");
		}
		System.out.println();
	}
	
	
for (int i=0 ; i<=4; i++) {
		System.out.println();
		System.out.println();
		for (int j=1 ; j<=5; j++) {
			System.out.print(" * ");
		}
		System.out.println();
	System.out.println("------------------------------------------");
		for(int c=0; c<4; c++) {
			 for(int j=0; j<5; j++) {
				 if(i==0||i==3||j==0||j==4) {
					 System.out.print("* ");
				 }else {
					 System.out.print("  ");
				 }
			
			
			 }
			 System.out.println();
		 }
	
	
	
	
	
}
	
	}

}
