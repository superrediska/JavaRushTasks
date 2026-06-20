package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.Scanner;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        String fileName3 = scanner.nextLine();
        try (FileInputStream fileInputStream = new FileInputStream(fileName1);
             FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
             FileOutputStream fileOutputStream1 = new FileOutputStream(fileName3)) {
            int half = (fileInputStream.available() + 1) / 2;
            int index = 0;
            while (fileInputStream.available() > 0) {
                int read = fileInputStream.read();
                if (index < half) {
                    fileOutputStream.write(read);
                    index++;
                } else {
                    fileOutputStream1.write(read);
                }
            }
        }
    }
}
