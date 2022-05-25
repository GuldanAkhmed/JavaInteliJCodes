package com.syntax.class20;

public class Lion extends Animal {

    void roar(){
        System.out.println(name+" is roaring");
    }

    public static void main(String[] args) {
        Lion Lion=new Lion();
        Lion.name="Alex";
        Lion.sleep();
        Lion.roar();
    }
}
