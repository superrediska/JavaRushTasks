package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String str;
        TreeMap<String, Double> price = new TreeMap<String, Double>();
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            while ((str = br.readLine()) != null) {
                String[] namePrice = str.split(" ");
                if (price.containsKey(namePrice[0])) {
                    price.put(namePrice[0], Double.parseDouble(namePrice[1]) + price.get(namePrice[0]));
                } else {
                    price.put(namePrice[0], Double.parseDouble(namePrice[1]));
                }
            }
        }
        double mx = Double.MIN_VALUE;
        for (double value : price.values()){
            if (value > mx){
                mx = value;
            }
        }
        for (String name : price.keySet()){
            if (price.get(name) == mx){
                System.out.println(name);
            }
        }
    }
}
