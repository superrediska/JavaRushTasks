package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/* 
День недели рождения твоего
*/

public class Solution {

     static Calendar birthDate = new GregorianCalendar(109, 4, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        return List.of(
                "",
                "воскресенье",
                "понедельник",
                "вторник",
                "среда",
                "четверг",
                "пятница",
                "суббота"
        ).get(calendar.get(Calendar.DAY_OF_WEEK));

    }
}
