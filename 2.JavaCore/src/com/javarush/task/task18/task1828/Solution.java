package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static class Product {
        int id;
        String productName;
        String price;
        String quantity;

        Product(int id, String productName, String price, String quantity) {
            this.id = id;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, productName, price, quantity);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        List<Product> productList = new ArrayList<>();
        try (BufferedReader brf = new BufferedReader(new FileReader(fileName))) {
            String str;
            while ((str = brf.readLine()) != null) {
                Product product = getProduct(str);
                productList.add(product);
            }
        }
        if (args[0].equals("-u")) {
            int id = Integer.parseInt(args[1]);
            for (Product product : productList) {
                if (product.id == id) {
                    product.productName = args[2];
                    product.price = args[3];
                    product.quantity = args[4];
                    break;
                }
            }
        }
        if (args[0].equals("-d")){
            int id = Integer.parseInt(args[1]);
            productList.removeIf(product -> product.id == id);
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            for (Product product : productList){
                bw.write(product.toString());
                bw.newLine();
            }
        }

    }

    public static Product getProduct(String product) {
        int id = Integer.parseInt(product.substring(0, 8).trim());
        String productName = product.substring(8, 38).trim();
        String price = product.substring(38, 46).trim();
        String quantity = product.substring(46, 50).trim();
        return new Product(id, productName, price, quantity);
    }

}


