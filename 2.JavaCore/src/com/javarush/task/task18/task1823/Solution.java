package com.javarush.task.task18.task1823;

import java.awt.desktop.SystemSleepEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        while (!(fileName = scanner.nextLine()).equals("exit")) {
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            HashMap<Integer, Integer> bytes = new HashMap<>();
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                while (fileInputStream.available() > 0) {
                    int read = fileInputStream.read();
                    if (!bytes.containsKey(read)) {
                        bytes.put(read, 1);
                    } else {
                        Integer integer = bytes.get(read);
                        integer += 1;
                        bytes.put(read, integer);
                    }
                }
            } catch (IOException ignore) {

            }
            Collection<Integer> values = bytes.values();
            Integer max = Collections.max(values);
            Set<Map.Entry<Integer, Integer>> entries = bytes.entrySet();
            for (Map.Entry<Integer, Integer> entry : entries) {
                if (entry.getValue().equals(max)){
                    resultMap.put(fileName, entry.getKey());
                }
            }

            // implement file reading here - реализуйте чтение из файла тут
        }

    }
}
