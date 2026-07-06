package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException{
        String fileName;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
             fileName = br.readLine();
        }
        String str;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            while ((str = br.readLine()) != null){
                int cn = 0;
                String[] sym = str.split(" ");
                for (String s : sym){
                    if (words.contains(s)){
                        cn++;
                    }
                }
                if (cn == 2){
                    System.out.println(str);
                }
            }
        }
    }
}
