package com.syntax.class12;

public class Greeting {

	void sayhello(String name) {
	System.out.println("Hello "+name); 	
	}
	void sayHelloManyTimes(String name) {
		for(int i=0;i<5; i++) {
			System.out.println("Hello "+name);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeting greeter =new Greeting();
		greeter.sayHelloManyTimes("Guldan");
		
	}

}
