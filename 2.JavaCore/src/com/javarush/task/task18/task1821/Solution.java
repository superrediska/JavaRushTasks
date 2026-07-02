package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        int[] ascii = new int[128];
        try(FileReader fileReader = new FileReader(args[0])){
            while (fileReader.ready()) {
                ascii[fileReader.read()]++;
            }
        }
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] != 0){
                System.out.println( (char) i + " " + ascii[i]);
            }
        }
    }
}
