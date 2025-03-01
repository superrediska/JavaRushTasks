package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/*
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            strings[i] = console.nextLine();
        }
        for (int i = 0; i < 6; i++) {
            String buf = strings[i];
            for (int j = i; j < 6; j++) {
                if (buf != null) {
                    if ((buf.equals(strings[j])) && (i != j)) {
                        strings[j] = null;
                        if (strings[i] != null) strings[i] = null;
                    }
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}