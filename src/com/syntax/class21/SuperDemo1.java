package com.syntax.class21;

public class SuperDemo1 {
    class AAA {
        AAA(){

        }
    }
    class BBB extends AAA{
       String name;

       BBB(){

       }
        //  this(); we can't use this() and super() inside the same constructor

        BBB(String name){

           super();
           this.name = name;
       }
    }


}
