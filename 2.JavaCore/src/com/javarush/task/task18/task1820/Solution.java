package com.javarush.task.task18.task1820;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String fileName1 = scan.nextLine();
        String fileName2 = scan.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName1));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2))) {
            String str;
            while ((str = br.readLine()) != null){
                String[] nums = str.split(" ");
                for (String num : nums){
                    bw.write(Math.round(Double.parseDouble(num)) + " ");
                }
            }
        }
    }
}
