package com.syntax.review7;

public class Practice5 {
    String weekDay (String day) {
        switch (day) {
            case "monday":
                return "It is lazy day";
            case "tuesday":
                return "It is productive day";
            case "wednesday":
                return "It is gloomy day";
            case "thursday":
                return "It is exciting day";
            case "friday":
                return "no work day";
            default:
                return "NO correct option found ";
        }
    }

    public static void main(String[] args) {
        Practice5 p= new Practice5();
        p.weekDay("Friday");
        String output = p.weekDay("friday");
        System.out.println(output);

    }




}
