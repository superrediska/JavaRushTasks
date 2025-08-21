package com.javarush.task.pro.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor>{
    public int compare(JavaRushMentor mentor1, JavaRushMentor mentor2){
        if (mentor1.getName().length() < mentor2.getName().length()) {
            return -1;
        }
        if (mentor1.getName().length() > mentor2.getName().length()){
            return  1;
        }
        else {
            return 0;
        }
    }
}
