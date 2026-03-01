package com.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.*;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        Map<Integer, Integer> map = new HashMap<>();

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

            while (fileInputStream.available() > 0) {
                int read = fileInputStream.read();
                if (!map.containsKey(read)) {
                    map.put(read, 1);
                } else {
                    Integer value = map.get(read);
                    map.put(read, value + 1);
                }
            }
        }
        Collection<Integer> values = map.values();
        Integer min = Collections.min(values);
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue().equals(min)) {
                System.out.print(entry.getKey() + " ");
            }

        }
    }
}
