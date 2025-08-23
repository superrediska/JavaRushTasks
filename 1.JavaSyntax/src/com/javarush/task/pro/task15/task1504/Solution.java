package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try (InputStream input = Files.newInputStream(Paths.get(scan.nextLine()));
             OutputStream output = Files.newOutputStream(Paths.get(scan.nextLine()))) {
            byte[] buffer = input.readAllBytes();
            byte[] Buffer1 = new byte[buffer.length];
            for (int i = 0; i < buffer.length; i += 2) {
                if (buffer.length - 1 == i && i % 2 == 0) {
                    Buffer1[i] = buffer[i];
                } else {
                    Buffer1[i] = buffer[i + 1];
                    Buffer1[i + 1] = buffer[i];
                }
            }
            output.write(Buffer1);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

