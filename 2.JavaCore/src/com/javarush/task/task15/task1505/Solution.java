package com.javarush.task.task15.task1505;

/* 
ООП - исправь ошибки в наследовании
*/

public class Solution {
    public interface HasWeight {
        int getWeight();
    }

    public interface HasHeight {
        int getHeight();
    }

    public static class Human implements HasWeight, HasHeight {
        public int getWeight(){

            return 1;
        }
        public int getHeight(){
            return 1;
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getWeight());
        System.out.println(human.getHeight());
    }
}