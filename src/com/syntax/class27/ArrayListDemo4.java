package com.syntax.class27;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo4 {
    public static void main(String[] args) {

                ArrayList<String> fruits = new ArrayList<>();
                fruits.add("Apple");
                fruits.add("Orange");
                fruits.add("Banana");

                ArrayList<String> veggies = new ArrayList<>();
                veggies.add("patoto");
                veggies.add("Onion");
                veggies.add("Carrot");

                ArrayList<String> groceries = new ArrayList<>();
                groceries.addAll(fruits);
                groceries.addAll(veggies);
                System.out.println(groceries);

                ArrayList<String> itemsToRemove = new ArrayList<>();
                itemsToRemove.add("Apple");
                itemsToRemove.add("Onion");
                groceries.removeAll(itemsToRemove);
                System.out.println(groceries);


            }
        }

