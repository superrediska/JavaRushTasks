package com.javarush.task.pro.task11.task1122;

/* 
Затенение поля класса
*/

public class Solution {
    public static int salary;

    public static void add(int increase) {
        int salary1 = Solution.salary;
        salary1 += increase;
        salary = salary1;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}