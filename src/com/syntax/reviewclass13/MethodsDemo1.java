package com.syntax.reviewclass13;

public class MethodsDemo1 {
	
	void checkEvenOdd (int number) {
		if (number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	
	void CkeckWeather (boolean isRaining) {
		if (isRaining) {
			System.out.println("I am staying home");
			
		}else {
			System.out.println("Lets go for a walk");
		}
	}
	
	void CheckName (String name) {
		if (name.equals("Teyfur")) {
			System.out.println("Will send memes");
		}else if(name.equals("Maha")) {
			
			System.out.println("I am a doctor");
			
		}else {
			System.out.println("I dont know you");
	}
	}

	public static void main(String[] args) {
	
		MethodsDemo1 object1=new MethodsDemo1();
   object1.checkEvenOdd(120);
   object1.checkEvenOdd(3);	
   object1.checkEvenOdd(7);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	}

}
