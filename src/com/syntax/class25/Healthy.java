package com.syntax.class25;

public class Healthy {
    void Healthy() {

    }

}

interface Eatable{
    void eat();

 }



 class Orange extends Healthy implements Portable, Eatable{

     @Override
     public void canCarry() {
         System.out.println("Orange is healthy to eat");
     }

     @Override
     public void eat() {
         System.out.println("we can carry orange easily ");
     }
 }
 class Laptop implements Portable{

     @Override
     public void canCarry() {
         System.out.println("we can carry a laptop easily ");
     }
 }