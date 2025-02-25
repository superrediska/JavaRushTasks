package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scan.hasNextInt()){
            int number = scan.nextInt();
            if (number < min){
                min = number;
            }
        }
        System.out.println(min);
    }
}