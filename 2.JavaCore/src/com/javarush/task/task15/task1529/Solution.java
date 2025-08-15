package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        if (str.equals("helicopter")){
            result = new Helicopter();
        } else if (str.equals("plane")) {
            int passengers = Integer.parseInt(bufferedReader.readLine());
            result = new Plane(passengers);
        }
        bufferedReader.close();
    }
}
