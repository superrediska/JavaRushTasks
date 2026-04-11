package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Прайсы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String fileName = scan.nextLine();
        int max = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))
        ) {
            while (reader.ready()){
                String str = reader.readLine();
                String substring = str.substring(0, 8).trim();
                int number = Integer.parseInt(substring);
                if (number > max){
                    max = number;
                }
            }
            if (args[0].equals("-c")){
//                String id = checkLength(String.valueOf(++max), 8);
//                String productName = checkLength(args[1], 30);
//                String price = checkLength(args[2], 8);
//                String quantity = checkLength(args[3], 4);
//                writer.newLine();
//                writer.write(id + productName + price + quantity);

                String format = String.format("%n%-8.8s%-30.30s%-8.8s%-4.4s", ++max, args[1], args[2], args[3]);
                writer.write(format);
            }

        }
    }
    private static String checkLength(String string, int limit){
        if (string.length() < limit){
            StringBuilder builder = new StringBuilder(string);
            while (builder.length() != limit){
                builder.append(" ");
            }
            return builder.toString();
        } else{
            return string.substring(0, limit);

        }
    }
}
