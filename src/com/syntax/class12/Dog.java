package com.syntax.class12;

import java.util.Scanner;

public class Dog {

	 
		// TODO Auto-generated method stub
   String name;
   String color;
   String breed;
   char gender;
   int age;
   double weight;
   void barks() {
	   System.out.println("Dog is barking...");
   }
	void eat() {
		System.out.println("Dog is eating");
	}
		void sleep() {
			System.out.println("Dog is sleeping");
		}
		
		
   public static void main(String[] args) {	
		
	   Dog scooby = new Dog();
	 // Scanner scan=new Scanner(System.in); 
	scooby.barks();
	 scooby.eat();
	 scooby.sleep();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
