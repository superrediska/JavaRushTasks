package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        int index = url.lastIndexOf("?");
        String substring = url.substring(index+1);

        String[] arguments = substring.split("&");
        for (String argument : arguments) {

            if ( argument.contains("=")){
                String[] split = argument.split("=");
                System.out.print(split[0]+ " ");
            }
            else{
                System.out.print(argument + " ");
            }


        }

        System.out.println();
        for (String argument : arguments) {
            if (argument.contains("obj")) {
                String[] split = argument.split("=");
                try {
                    double parseDouble = Double.parseDouble(split[1]);
                    alert(parseDouble);
                } catch (NumberFormatException e){
                    alert(split[1]);
                }
            }

        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
