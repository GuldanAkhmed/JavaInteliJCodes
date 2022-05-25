package com.syntax.class31;

import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {
        LinkedHashSet<String> drinks = new LinkedHashSet<>();
        drinks.add("Coke(Diet)");
        drinks.add("Water(Good)");
        drinks.add("Pepsi(Sugar)");
        drinks.add("Milk(Vitamin D)");

        StringBuilder allDrinks = new StringBuilder();
        for (String drink:drinks) {
            allDrinks.append(drink);
        }
        System.out.println(allDrinks);
    }
}
