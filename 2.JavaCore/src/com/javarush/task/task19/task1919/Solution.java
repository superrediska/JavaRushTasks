package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName;
        String str;
        TreeMap<String, Double> map = new TreeMap<>();
        try(BufferedReader br  = new BufferedReader(new FileReader(args[0]))){
            while ((str = br.readLine()) != null){
                String[] NamePrice = str.split(" ");
                if (map.containsKey(NamePrice[0])){
                    map.put(NamePrice[0], Double.parseDouble(NamePrice[1]) +  map.get(NamePrice[0]));
                }else {
                    map.put(NamePrice[0], Double.parseDouble(NamePrice[1]));
                }
            }
        }
        for(String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}
