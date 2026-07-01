package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = br.readLine();
            fileName2 = br.readLine();

        }
        try (BufferedReader br = new BufferedReader(new FileReader(fileName1));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2))) {
            String str;
            while ((str = br.readLine()) != null){
                String[] sym = str.split(" ");
                for (String s : sym){
                    if (s.matches("[0-9]+")){
                        bw.write(s + " ");
                    }
                }
            }
        }
    }
}
