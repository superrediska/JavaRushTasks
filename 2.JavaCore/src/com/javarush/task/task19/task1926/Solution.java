package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            fileName = br.readLine();
        }
        String  str;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while ((str = br.readLine()) != null){
                StringBuilder stringBuilder = new StringBuilder(str);
                stringBuilder.reverse();
                System.out.println(stringBuilder);
            }
        }

    }
}
