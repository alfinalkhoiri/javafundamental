package com.juaracoding;


/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author alfin a.k.a. Alfin Al Khoiri
Java Developer
Created on 27/03/2025 20.10
@Last Modified 27/03/2025 20.10
Version 1.0
*/

import java.awt.*;

public class Variable {

    public static void main(String[] args){

        byte rating = 127;
        short stock = 1000;

        char a = 'A';

        boolean isLogin = true;
        boolean isStockAvailable = true;

        // Implwmwntasi Variable ke Account / Users
        String firstName = "Alfin";
        String lastName = "Al Khoiri";
        String address = "Bekasi";
        char level = 'A';
//        boolean isLogin = true;
        boolean isActive = true;

        //Casting Inplisit
        int price = 1000000000;
        long total = 4000000000L+price;
        System.out.println(total);

        //Casting explisit
        Object prices = 199.99;
        double productPrice = (double) price; // Explicit casting
        System.out.println("Product Price: " + productPrice);

        //Passing by value
        int umur = 81;
        int duplikatUmur = umur;
        duplikatUmur = 1308;

        System.out.println(umur);
        System.out.println(duplikatUmur);

        //Passing by Reference
        Rectangle kotak = new Rectangle(20, 30);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80, 90);

        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());


    }
}