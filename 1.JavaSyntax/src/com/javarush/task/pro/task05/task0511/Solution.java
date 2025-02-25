package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       int number = scan.nextInt();
       multiArray = new int[number][];
       for ( int i = 0; i < multiArray.length; i++){
           int number1 = scan.nextInt();
           multiArray[i] = new int[number1];

       }
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j] + " " );
            }
            System.out.println();
        }
    }
}
