package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("java");
        arrayList.add("Love");
        arrayList.add("Lahore");
        arrayList.add("cake");

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toLowerCase().endsWith("e")) {
                iterator.remove();

            }

        }
        System.out.println(arrayList);
    }

}