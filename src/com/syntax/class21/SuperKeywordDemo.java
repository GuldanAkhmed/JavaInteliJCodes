package com.syntax.class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();


    }
}
  class GranParent{
    String color="Blue";
    
  }
     class Parent{
    String color="Black";

     }
     class Child extends Parent1 {
         String color = "REd";

         void printColor() {
             String color="Green";
             //refers to local variable
             System.out.println(color);
             System.out.println(this.color);

         }
     }