package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new TreeMap<>();
        while (true){
            String str = scanner.nextLine();
            if (str.equals("end")){
                break;
            }
            int index = str.lastIndexOf("t");
            String substring = str.substring(index+1);
            int number = Integer.parseInt(substring);
            map.put(number, str);

        }
        Collection<String> values = map.values();
        for (String fileName : values){
            int index = fileName.lastIndexOf(".");
            String someName = fileName.substring(0, index);
            try(FileInputStream fileInputStream = new FileInputStream(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(someName, true)){
                while (fileInputStream.available() > 0){

                    fileOutputStream.write(fileInputStream.read());

                }
            }

        }

    }
}
