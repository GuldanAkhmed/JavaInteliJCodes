package com.syntax.class08;

public class ForLoopPractice {

	public static void main(String[] args) {
		
		for (int i=10; i<=13; i++) {
			System.out.println("Hello "+i);
		}
		System.out.println("  Multiplication Table   ");
	/* 3 x 1= 3
	 * 3 x 2 = 6
	 * 3 x 3 = 9
	 *
		*3 x 10 = 30
		*/
	 int num=7;
	 int result;
	 for (int i=1; i<=10; i++) {
		
		result= num*i;
		System.out.println(num+" X "+i+" = "+result);
	 }
	 System.out.println("What is The output");
		for (int i=0; i<=10; i+=3) {
			System.out.print(i+" ");
		}
		 System.out.println("What is The output");
		int sum=0;
		for (int i=1; i<=5; i++) {
			sum+=i;
			
		}
		
		System.out.println(sum);
		
		 System.out.println("What is The output");
		int value=1;
		for(int i=1; i<4; i++) {
			value*=i;
			System.out.println(value);
		}
		int sumEven=0;
		int sumOdd=0;
		for (int i=1; i<=50; i++) {
			
			if (i%2==0) {
				sumEven=sumEven+i;
				
		}else {
			 sumOdd = sumOdd+i;
		}
		}
		System.out.println("The sum of all even number = "+sumEven+
				" and the sum of all odd numbers = "+sumOdd);;
		
		
		
		
		
		
		
		
		
	 
	}

}
