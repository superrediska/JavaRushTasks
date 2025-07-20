package com.javarush.task.pro.task15.task1515;

import java.nio.file.Path;
import java.util.Scanner;

/* 
Абсолютный путь
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pathFile = scanner.nextLine();
        boolean abs = Path.of(pathFile).isAbsolute();
        if (abs) {
            System.out.println(pathFile);
        } else {
            Path path = Path.of(pathFile).toAbsolutePath();
            System.out.println(path);
        }
    }
}

