package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String string = reader.readLine();
                String[] split = string.split(" ");
                String name = "";
                int indexYear = split.length - 1;
                for (int i = 0; i < indexYear -2; i++) {
                    name = name + " " + split[i];

                }
                int year = Integer.parseInt(split[indexYear]);
                int month = Integer.parseInt(split[indexYear -1]) -1;
                int day = Integer.parseInt(split[indexYear - 2]);
                Calendar calendar = new GregorianCalendar(year, month, day);
                Person person = new Person(name.trim(), calendar.getTime());
                PEOPLE.add(person);
            }

        }
        System.out.println(PEOPLE);
    }
}
