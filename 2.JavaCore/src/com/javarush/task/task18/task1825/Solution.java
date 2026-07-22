package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        Map<Integer, String> files = new TreeMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(fileName = bufferedReader.readLine()).equals("end")) {
                int index = fileName.lastIndexOf("t");
                String key = fileName.substring(index + 1);
                files.put(Integer.parseInt(key), fileName);
            }
        }
        for (String fullFileName : files.values()) {
            String shortFileName = fullFileName.substring(0, fullFileName.lastIndexOf("."));
            try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(fullFileName));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(shortFileName))){
                while (input.available() > 0){
                    output.write(input.read());
                }

        }
    }

}
}
