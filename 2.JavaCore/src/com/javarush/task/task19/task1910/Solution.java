package com.javarush.task.task19.task1910;

import java.io.*;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))){
            String str;
            while ((str = bufferedReader1.readLine()) != null) {
                str = str.replaceAll("\\p{Punct}", "");
                bufferedWriter.write(str);
            }

        }
        bufferedReader.close();
    }
}
