package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        String file1;
        String file2;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = br.readLine();
            file2 = br.readLine();
        }
        String str;
        ArrayList<String> stringsFile1 = new ArrayList<>();
        ArrayList<String> stringsFile2 = new ArrayList<>();
        try (BufferedReader br1 = new BufferedReader(new FileReader(file1));
             BufferedReader br2 = new BufferedReader(new FileReader(file2))) {
            while ((str = br1.readLine()) != null) {
                stringsFile1.add(str);
            }
            while ((str = br2.readLine()) != null) {
                stringsFile2.add(str);
            }
            int i = 0;
            int j = 0;
            while (i < stringsFile1.size() && j < stringsFile2.size()) {
                if (stringsFile1.get(i).equals(stringsFile2.get(j))) {
                    lines.add(new LineItem(Type.SAME, stringsFile1.get(i)));
                    i++;
                    j++;
                } else {
                    if (i + 1 < stringsFile1.size() && stringsFile1.get(i + 1).equals(stringsFile2.get(j))) {
                        lines.add(new LineItem(Type.REMOVED, stringsFile1.get(i)));
                        i++;

                    } else if (j + 1 < stringsFile2.size() && stringsFile2.get(j + 1).equals(stringsFile1.get(i))) {
                        lines.add(new LineItem(Type.ADDED, stringsFile2.get(j)));
                        j++;
                    }
                }

            }
            while (i < stringsFile1.size()) {
                lines.add(new LineItem(Type.REMOVED, stringsFile1.get(i)));
                i++;
            }

            while (j < stringsFile2.size()) {
                lines.add(new LineItem(Type.ADDED, stringsFile2.get(j)));
                j++;
            }
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
