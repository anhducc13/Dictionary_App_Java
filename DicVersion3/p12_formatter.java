/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01_basic;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author CACLV
 */
public class p12_formatter {
    public static void main(String[] args) {
        
        double payment;
        try (Scanner scanner = new Scanner(System.in)) {
            payment = scanner.nextDouble();
        }
        
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US); 
        NumberFormat vietnamFormat = NumberFormat.getCurrencyInstance(new Locale("en", "VN")); 
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE); 
        
        String us = usFormat.format(payment);
        String india = vietnamFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
