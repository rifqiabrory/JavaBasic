package com.company;

import java.util.HashMap;

public class HashMapBasic {

    public static void main(String[] args) {

        // HashMap type : <String , String> or <String, Integer>
        java.util.HashMap<String, String> countries = new java.util.HashMap<>();
        // using .put("key","value") to add items
        countries.put("key1", "Jepang");
        countries.put("key2","Indonesia");
        countries.put("key3", "Singapura");
        // show all items
        System.out.println("Values      : "+countries);
        // using .get("key") to get value by it key
        System.out.println("Value key   : "+countries.get("key1"));
        // using .size() to count all row items
        System.out.println("Rows        : "+countries.size());
        // using .remove("key") to remove item or .clear() to remove all items
        System.out.println("Remove item : "+countries.remove("key2"));


        // Loop with HashMap using for-each loop
        // Using .keySet() to show keys only
        for (String i : countries.keySet()) {
            System.out.println("Keys : "+i);
            System.out.println("Values with get() : "+countries.get(i));
        }
        // Using .values() to shoe values items
        for (String i : countries.values()) {
            System.out.println("Values : " + i);
        }
    }
}
