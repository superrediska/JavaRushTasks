package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection con = url.openConnection();
        con.setDoOutput(true);

        try (OutputStream output = con.getOutputStream();
             PrintStream sender = new PrintStream(output)) {
            sender.println("Привет");
        }

        try (InputStream input = con.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}

