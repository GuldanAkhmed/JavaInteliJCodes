package com.syntax.class23;

public class DogTester {
    public static void main(String[] args) {


        Dog dog = new Dog();
        System.out.println(dog);
        Dog dog2=new Dog("Tommy","Green","RedBUll",12,25.5);
        System.out.println(dog2);
        dog2.changeInfo("Rocky", "Black","Bulldog");
        System.out.println(dog2);
    }

}