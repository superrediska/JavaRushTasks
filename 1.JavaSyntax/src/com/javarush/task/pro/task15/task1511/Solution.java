package com.javarush.task.pro.task15.task1511;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Пишем символы в файл
*/

public class Solution {
    public static void main(String[] args) {
        char[] chars = args[0].toCharArray();
        try (Scanner scan = new Scanner(System.in);
             BufferedWriter writer = Files.newBufferedWriter(Path.of(scan.nextLine()))) {

            for (char c : chars) {
                writer.write(c);
            }

        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

