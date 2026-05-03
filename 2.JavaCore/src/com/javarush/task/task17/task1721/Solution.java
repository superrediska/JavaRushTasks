package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        Scanner scanner  = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName1))){
            while (bufferedReader.ready()) {
                allLines.add(bufferedReader.readLine());
            }
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName2))){
            while (bufferedReader.ready()){
                forRemoveLines.add(bufferedReader.readLine());
            }
        }
        Solution solution = new Solution();
        solution.joinData();

    }

    public void joinData() throws CorruptedDataException {
        if (new HashSet<>(allLines).containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
