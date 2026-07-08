package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        String fileName;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            while (!(fileName = bufferedReader.readLine()).equals("exit")) {
                new ReadThread(fileName).start();
            }
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        byte[] bytes = new byte[256];

        @Override
        public void run() {
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                while (fileInputStream.available() > 0) {
                    int read = fileInputStream.read();
                    bytes[read]++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            int maxCount = 0;
            int maxCountByte = 0;
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] > maxCount){
                    maxCount = bytes[i];
                    maxCountByte = i;

                }
            }
            resultMap.put(fileName, maxCountByte);
        }

    }
}
