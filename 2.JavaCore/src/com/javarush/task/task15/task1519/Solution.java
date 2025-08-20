package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = reader.readLine();

            if ("exit".equals(str)) {
                break;
            }

            try {

                if (str.contains(".")) {
                    Double doubleValue = Double.parseDouble(str);
                    print(doubleValue);
                    continue;
                }


                int intValue = Integer.parseInt(str);


                if (intValue > 0 && intValue < 128) {
                    print((short) intValue);
                }

                else if (intValue <= 0 || intValue >= 128) {
                    print(intValue);
                }

            } catch (NumberFormatException e) {

                print(str);
            }
        }

        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}