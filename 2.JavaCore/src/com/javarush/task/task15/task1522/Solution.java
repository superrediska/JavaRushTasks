package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static{
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.equals(Planet.SUN)){
            thePlanet = Sun.getInstance();
        } if (str.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } if (str.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        }
        else{
            thePlanet = null;
        }
    }
}
