package com.syntax.homework13;

public class Task2 {
	//Create a method that will take a number and prints
	//whether the number is even or odd.
	
	void checkEvenOdd (int number) {
		if (number%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}
	public static void main(String[] args) {
		Task2 object1=new Task2();
		   object1.checkEvenOdd(50);
		   object1.checkEvenOdd(13);	
		   
		

	}

}
