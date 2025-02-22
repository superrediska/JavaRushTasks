package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] array = new int[number];
        for( int i = 0; i < number; i++){
            array[i] = scan.nextInt();
        }
        if (number %2 != 0){
            for (int i = 0; i < number; i++){
                System.out.println(array[i]);
            }
        }
        else{
            for (int i = number-1; i >= 0; i--){
                System.out.println(array[i]);
            }
        }
    }
}
