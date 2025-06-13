package com.javarush.task.pro.task15.task1505;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Что-то не копируется...
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             var inputStream = Files.newInputStream(Path.of(scanner.nextLine()));
             var outputStream = Files.newOutputStream(Path.of(scanner.nextLine()))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            int read;
            while ((read = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
