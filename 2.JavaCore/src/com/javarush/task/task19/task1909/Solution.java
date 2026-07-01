package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = bufferedReader.readLine();
            fileName2 = bufferedReader.readLine();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                bufferedWriter.write(str.replace(".", "!"));
            }

        }
    }
}
