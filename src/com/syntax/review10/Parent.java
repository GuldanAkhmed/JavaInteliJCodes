package com.syntax.review10;

 class GrandParent {
     String name;
    GrandParent(){
        System.out.println("Grand Parent");
    }
}
public class Parent extends GrandParent{
     Parent(){
         System.out.println(name);
         System.out.println("Parent");
     }
}
class Child extends Parent{
     Child(){
         System.out.println("Child");

     }
}
class Tester {
    public static void main(String[] args) {
        Child child=new Child();
    }
}