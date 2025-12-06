package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new myThread1());
        threads.add(new myThread2());
        threads.add(new myThread3());
        threads.add(new myThread4());
        threads.add(new myThread5());
    }
    public static void main(String[] args) {

    }
    public static class myThread1 extends Thread{
        @Override
        public void run(){
            while (true){

            }
        }
    }
    public static class myThread2 extends Thread{
        @Override
        public void run(){
            try {
               throw new InterruptedException();
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }
    public static class myThread3 extends Thread{
        @Override
        public void run(){
            while (true){
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static class myThread4 extends Thread implements Message{
        @Override
        public void run(){
            while (!isInterrupted()){

            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }
    public static class myThread5 extends Thread{
        @Override
        public void run(){
            Scanner scan = new Scanner(System.in);
            int sum = 0;
            while (true){
                String str = scan.nextLine();
                if (str.equals("N")){
                    break;
                }
                int parseInt = Integer.parseInt(str);
                sum += parseInt;

            }
            System.out.println(sum);
        }
    }

}