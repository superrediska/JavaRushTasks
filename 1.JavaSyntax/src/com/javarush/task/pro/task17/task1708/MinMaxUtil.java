package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int min(int a, int b) {
        return Integer.min(a, b);
    }

    public static int min(int a, int b, int c) {
        return Integer.min(min(a, b), c);
    }

    public static int min(int a, int b, int c, int d) {
        return Integer.min(min(a, b, c), d);
    }

    public static int min(int a, int b, int c, int d, int e) {
        return Integer.min(min(a, b, c, d), e);
    }

    public static int max(int a, int b) {
        return Integer.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return Integer.max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return Integer.max(max(a, b, c), d);
    }

    public static int max(int a, int b, int c, int d, int e) {
        return Integer.max(max(a, b, c, d), e);
    }
}