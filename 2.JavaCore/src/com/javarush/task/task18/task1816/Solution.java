package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        int count = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                char ch = (char) fileInputStream.read();
                char upperCase = Character.toUpperCase(ch);
                if (upperCase >= 'A' && upperCase <= 'Z'){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
