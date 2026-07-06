package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.ArrayList;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException{

        String str;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
             BufferedReader br = new BufferedReader(new FileReader(args[0]))){
            while ((str = br.readLine()) != null){
                String[] words = str.split(" ");
                for (String s : words){
                    if (s.matches(".*[0-9].*")){
                        bw.write(s + " ");
                    }
                }
            }
        }

    }
}
