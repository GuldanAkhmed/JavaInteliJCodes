package com.syntax.class18;

public class Task2 {

      public static String reverseString(String input){
    return new StringBuilder(input).reverse().toString();

    }

    public static void main(String[] args) {
        String name="Emili";
        System.out.println(Task2.reverseString(name));
    }
      }
