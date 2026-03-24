package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //напишите тут ваш код
    static {
        Scanner scan = new Scanner(System.in);
        firstFileName = scan.nextLine();
        secondFileName = scan.nextLine();
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
    public static class ReadFileThread  extends Thread implements ReadFileInterface{

        private String fullFileName;
        private StringBuilder stringBuilder = new StringBuilder();

        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }


        @Override
        public String getFileContent() {
            return stringBuilder.toString();
        }

        @Override
        public void run() {
            Scanner scan = new Scanner(fullFileName);

            while (scan.hasNext()){
                String str = scan.nextLine();

                stringBuilder.append(str).append(" ");
            }
        }
    }
    //напишите тут ваш код
}
