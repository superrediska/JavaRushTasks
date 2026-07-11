package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;
        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String[] words = fileScanner.nextLine().split(" ");
            Calendar calendar = new GregorianCalendar(Integer.parseInt(words[5]), Integer.parseInt(words[4] ) - 1,Integer.parseInt(words[3]));
            Date date = calendar.getTime();
            Person person = new Person(words[1], words[2], words[0], date);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
