package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution  {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream myStream = new PrintStream(byteArrayOutputStream);
        System.setOut(myStream);

        testString.printSomething();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        System.setOut(defaultPrintStream);
        System.out.println(byteArrayOutputStream.toString());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

