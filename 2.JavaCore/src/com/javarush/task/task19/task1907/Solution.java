package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = br.readLine();
        }
        String str;
        short count = 0;
        try (BufferedReader br1 = new BufferedReader(new FileReader(fileName))) {
            while ((str = br1.readLine()) != null) {

                String[] words = str.split("[\\p{Punct}\\s]+");
                for (String s : words) {
                    if (s.equals("world")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
