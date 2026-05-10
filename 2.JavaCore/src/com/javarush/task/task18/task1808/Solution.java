package com.javarush.task.task18.task1808;

import java.io.*;
import java.util.Arrays;
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
             FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2);
             FileOutputStream fileOutputStream3 = new FileOutputStream(fileName3)){
            int half = (fileInputStream.available() + 1) / 2;
            int count = 0;
            while (fileInputStream.available() > 0){
                int read = fileInputStream.read();
                if (count < half){
                    fileOutputStream2.write(read);
                    count++;
                } else{
                    fileOutputStream3.write(read);
                }
            }


            byte[] bytes = fileInputStream.readAllBytes();
            if (bytes.length % 2 != 0){
                byte[] bytes2 = Arrays.copyOfRange(bytes, 0, bytes.length / 2 + 1);
                fileOutputStream2.write(bytes2);
                byte[] bytes3 = Arrays.copyOfRange(bytes, bytes.length / 2 + 1, bytes.length);
                fileOutputStream3.write(bytes3);
            } else {
                byte[] bytes2 = Arrays.copyOfRange(bytes, 0, bytes.length / 2);
                fileOutputStream2.write(bytes2);
                byte[] bytes3 = Arrays.copyOfRange(bytes, bytes.length / 2, bytes.length);
                fileOutputStream3.write(bytes3);

            }
        }

    }
}
