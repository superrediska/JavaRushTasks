package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int minNumber = Math.min(num1,num2);
        int nod = 0;
        for( int i = 1; i <= minNumber; i++ ) {
            if ( num1%i == 0 && num2%i == 0) {
                nod = i;
            }
        }
        System.out.println(nod);
    }
}
