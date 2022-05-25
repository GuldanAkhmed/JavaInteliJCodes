package com.syntax.review9;

public class Doctor{

    String firstName, lastName, speciality;
    static String hospital="Jorge Washington";

    //static methods can access only static variables
    static void work(){
        System.out.println("All doctors work at "+hospital);
    }
    //static method cannot access non static members
    void printInfo(){
        System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality);
    }
    //non- static methods can access static members
    void work1(){
        System.out.println("All doctors work at "+hospital);
    }

    //Constructor- initializing instance variables
    Doctor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //we can have multiple constructor by overloading them
    public Doctor(String firstName, String lastName, String speciality) {
        this(firstName, lastName);
        this.speciality = speciality;
    }

}


