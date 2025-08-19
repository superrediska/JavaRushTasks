package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(scan.nextLine())))) {
            bufferedReader.lines()
                    .map(Integer::parseInt)
                    .sorted(Integer::compareTo)
                    .filter(i -> i % 2 == 0)
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
