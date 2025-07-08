package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        Map<String,String> map = new HashMap<>();
        map.put("Cat","Кошка");
        map.put("Dog","Собака");
        map.put("Bird","Птица");
        map.put("Lamp","Лампа");
        String temp = String.valueOf(o.getClass());
        String result = temp.substring(temp.lastIndexOf('$')+1, temp.length());
        System.out.println(map.get(result));
    }

    public static class Cat {

    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
