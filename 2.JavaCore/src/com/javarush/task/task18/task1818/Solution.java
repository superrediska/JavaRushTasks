package com.javarush.task.task18.task1818;

import java.io.*;
import java.util.Scanner;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String fileName1 = scan.nextLine();
        String fileName2 = scan.nextLine();
        String fileName3 = scan.nextLine();
        try (BufferedWriter bw1 = new BufferedWriter(new FileWriter(fileName1));
             BufferedReader br2 = new BufferedReader(new FileReader(fileName2));
             BufferedReader br3 = new BufferedReader(new FileReader(fileName3))) {
            while (br2.ready()) {
                String str = br2.readLine();
                bw1.write(str);
            }
            while (br3.ready()) {
                String str = br3.readLine();
                bw1.write(str);
            }
        }
    }
}
