package com.javarush.task.task18.task1817;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        double counter1 = 0;
        double counter2 = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                char ch = (char) fileReader.read();
                counter1++;
                if (ch == ' '){
                    counter2++;
                }


            }
        }
        System.out.printf(Locale.US, "%.2f", counter2 * 100  / counter1);

    }
}
