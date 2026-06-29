package com.javarush.task.task18.task1819;

import java.io.*;
import java.util.Scanner;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream fis1 = new FileInputStream(fileName1);
             FileInputStream fis2 = new FileInputStream(fileName2);
             FileOutputStream fos1 = new FileOutputStream(fileName1)) {
            while (fis2.available() > 0) {
                byteArrayOutputStream.write(fis2.read());

            }
            while (fis1.available() > 0) {
                byteArrayOutputStream.write(fis1.read());
            }

            byteArrayOutputStream.writeTo(fos1);

        }
    }
}
