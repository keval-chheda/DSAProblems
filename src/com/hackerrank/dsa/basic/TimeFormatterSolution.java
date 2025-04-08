package com.hackerrank.dsa.basic;

import java.util.*;
import java.text.*;

public class TimeFormatterSolution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        Locale usa = Locale.US;
        Locale chinalocale = Locale.CHINA;
        Locale francelocale = Locale.FRANCE;
        Locale indialocale = new Locale("en", "IN");
        
        String us = NumberFormat.getCurrencyInstance(usa).format(payment);
        String india = NumberFormat.getCurrencyInstance(indialocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(chinalocale).format(payment);
        String france = NumberFormat.getCurrencyInstance(francelocale).format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
