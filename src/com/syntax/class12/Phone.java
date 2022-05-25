package com.syntax.class12;

public class Phone {
	
	String model;
	int memory;
	String color;
    String version;
	
	void Phone() {
		System.out.println("The model is "+model);
	}
	void memory() {
	System.out.println("The memory of OS "+memory);	
	}
	void color() {
		System.out.println("The color of the phone"+color);
	}
	void version() {
		System.out.println("The version of phone "+version);
	}
	
	void printCompleteInfo() {
		System.out.println("The model is "+model);
		System.out.println("The memory of OS "+memory);	
		System.out.println("The color of the phone"+color);
		System.out.println("The version of phone "+version);
	}
	public static void main(String[] args) {
	Phone Iphone =new Phone();
	Iphone.model="Apple";
	Iphone.memory=128;
	Iphone.color="Black";
	Iphone.version="XR";
	Iphone.printCompleteInfo();
		
	System.out.println("--------------------------------------------------");
	
	String make;
	String model;
	int noOfCams;
	String color;
	double screenSize;
	String os;
	String phoneNumber;
	
	void makeCall() {
	System.out.println("Making a call");	
	}
	
	void takePictures() {
		System.out.println("Taking pictures ");
	}
	
	void printCompleteInfo() {
		System.out.println("make "+make);
		System.out.println("model "+model);
		System.out.println("noOfCams "+noOfCams);
		System.out.println("color "+color);
		System.out.println("screenSize "+screenSize);
		System.out.println("os "+os);
		System.out.println("phoneNumber "+phoneNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="Iphone 13 pro max";
		iphone.noOfCams=3;
		iphone.color="blue";
		iphone.screenSize=6.8;
		iphone.os="IOS";
		iphone.phoneNumber="578966855";
		iphone.makeCall();
		iphone.takePictures();
		iphone.printCompleteInfo();
		
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="S22 ultra";
		samsung.noOfCams=4;
		samsung.color = "black";
		samsung.screenSize = 6.8;
		samsung.os = "Android 12";
		samsung.makeCall();
		samsung.takePictures();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	

	}

}
