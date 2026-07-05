package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String str;
        boolean first = true;
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]));
             BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]))) {
            while ((str = br.readLine()) != null) {
                String[] words = str.split(" ");
                for (String word : words) {
                    if (word.length() > 6){
                        if (!first){
                            bw.write(",");
                        }
                        bw.write(word);
                        first = false;
                    }
                }
            }
        }
    }
}

