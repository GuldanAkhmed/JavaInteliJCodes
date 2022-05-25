package com.syntax.class16;

public class Task2 {
    public static void main(String[] args) {
        String str="123456!#$#123455748393yhrbfbvAGDURYNDVCF";
        System.out.println(str.replaceAll("[0-9]","Gulden"));
        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[A-Z]",""));
        System.out.println(str.replaceAll("[!-#]",""));
        System.out.println(str.replaceAll("[A-za-z0-9]",""));



    }
}
