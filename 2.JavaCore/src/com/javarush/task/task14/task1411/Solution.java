package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String> list = Arrays.asList("user", "loser", "coder", "proger");

        while (list.contains(key = reader.readLine())) {
            if (key.equals("user")) {
                person = new Person.User();
                doWork(person);
            } else if(key.equals("loser")) {
                doWork(person);
                person = new Person.Loser();
            } else if (key.equals("coder")) {
                doWork(person);
                person = new Person.Coder();
            } else if (key.equals("proger")) {
                doWork(person);
                person = new Person.Proger();
            }

        }

    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        }
        if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        }
        if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}

