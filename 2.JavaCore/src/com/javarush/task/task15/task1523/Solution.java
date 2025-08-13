package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {
    SubSolution subSolution = new SubSolution();
    }
    public Solution() {
        System.out.println("1");
    }
    private Solution(int a){

    }
    Solution(char a){

    }
    protected Solution(short a){

    }
}

