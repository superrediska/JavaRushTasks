package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(scan.nextLine()));

        String str;
        do {
            str = scan.nextLine();
            array.add(str);

        } while (!str.equals("exit"));

        for (String s : array){
            bufferedWriter.write(s + "\n");
        }
        scan.close();
        bufferedWriter.close();
    }
}
