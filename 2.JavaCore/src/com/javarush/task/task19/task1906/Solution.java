package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = br.readLine();
            fileName2 = br.readLine();

        }
        int sym;
        int count = 0;
        try (FileReader fr = new FileReader(fileName1);
        FileWriter fw = new FileWriter(fileName2)){
            while ((sym = fr.read()) != -1){
                count++;
                if (count % 2 == 0){
                    fw.write(sym);
                }
            }

        }

    }
}
