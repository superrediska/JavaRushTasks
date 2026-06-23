package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int key = 3;
        try (FileInputStream fis = new FileInputStream(args[1]);
             FileOutputStream fos = new FileOutputStream(args[2])) {
            if (args[0].equals("-e")) {
                while(fis.available() > 0){
                    int read = fis.read();
                    fos.write(read + key);
                }
            } else if (args[0].equals("-d")) {
                while (fis.available() > 0){
                    int read = fis.read();
                    fos.write(read - key);
                }
            }
        }
    }

}
