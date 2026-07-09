package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();
        System.setOut(defaultPrintStream);
        String string = byteArrayOutputStream.toString();
        String[] sym = string.split(" ");
        int firstNum = Integer.parseInt(sym[0]);
        int secondNum = Integer.parseInt(sym[2]);
        int result = 0;
        switch (sym[1]) {
            case ("+"): result = firstNum + secondNum; break;
            case ("-"): result = firstNum - secondNum; break;
            case ("*"): result = firstNum * secondNum; break;
        }
        System.out.println(firstNum + " " + sym[1] + " " + secondNum + " " + "= " + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

