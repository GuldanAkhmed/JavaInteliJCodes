package com.syntax.class16;

public class Task4 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Sunday is great");
        System.out.println(stringBuilder.reverse());

        String s = "Sunday";
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        s = str.toString();
        System.out.println(s);





      }
}
