package com.javarush.task.pro.task16.task1620;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/* 
Еще один простой шаблон
*/

public class Solution {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern
                (String.valueOf(zonedDateTime.getDayOfWeek().getValue()) + " d.M.yy HH:mm:ss.n VV");
    }
}
