package com.syntax.review9;

public class Hospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("John", "Smith", "Surgeon");
        doc.printInfo();;

        Doctor doc1=new Doctor("Jane", "Smith");
        doc1.printInfo();
        System.out.println("changing value of instance");

        doc1.speciality="Dermatologist";
        doc1.printInfo();

        doc.printInfo();
        System.out.println("Changing value of static variable");

        //static variable should access in static way --> by class name where variables is defined
        Doctor.hospital="Inova";
        doc.printInfo();
        doc1.printInfo();

        System.out.println("------------------------------------");
        doc.hospital="Best hospital";
        doc.printInfo();
        doc1.printInfo();
    }
}
