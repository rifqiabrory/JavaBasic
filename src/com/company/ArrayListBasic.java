package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasic {

    public static void main(String[] args) {

        // ArrayList type : <String> or <Integer>
        ArrayList<String> cars = new ArrayList<>();
        // using .add("value") to add items
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("All items : "+cars);
        // using .get(index) to get value by it index
        String a = cars.get(2);
        System.out.println("Get item : "+a);
        // using .set(index, "value") to modify an item refer to the index
        cars.set(0, "Test");
        // Using .remove(index) to remove item refer to the index
        cars.remove(0);
        // Using .clear() to remove all items
        cars.clear();
        // using .size() to count all row items
        cars.size();
        // to sort items
        Collections.sort(cars);
        for (String i : cars) {
            System.out.println("Sort : "+i);
        }
    }
}
