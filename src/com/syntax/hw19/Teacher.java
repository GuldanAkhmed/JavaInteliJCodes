package com.syntax.hw19;

public class Teacher {
    String name;
    int age;
    double weight;
    char gender;
    double height;


    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("I am constructor one");
    }

    private Teacher(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("I am constructor two");
    }

    protected Teacher(String name, int age, double weight, char gender) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        System.out.println("I am constructor three");
    }

    Teacher(String name, int age, double weight, char gender, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
        this.height = height;
        System.out.println("I am constructor four");
    }


}