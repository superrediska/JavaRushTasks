package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] result = new byte[4];
        for (int i = 0; i < 4; i++) {
            result[i] =  (byte) (ip[i] & mask[i]);
        }
        return result;
    }

    public static void print(byte[] bytes) {
        String bin = new BigInteger(1, bytes).toString(2);
        System.out.println(bin.substring(0, 8) + " " + bin.substring(8, 16) + " " + bin.substring(16, 24) + " " + bin.substring(24, 32));

    }
}
