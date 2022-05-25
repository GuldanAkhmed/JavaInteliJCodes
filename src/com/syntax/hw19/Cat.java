package com.syntax.hw19;

public class Cat {
    static int normalNumberOfLegs = 4;
    private String name = "Murka";
    int age;
    double weight;
    String breed;
    char gender;

    void printName() {
        System.out.println(name);
    }

    public Cat() {
        System.out.println(normalNumberOfLegs);
    }
}