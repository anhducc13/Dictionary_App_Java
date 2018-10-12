/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01_basic;

import java.util.Scanner;

/**
 *
 * @author CACLV
 */


public class p07_find {
    public static void main(String[] args) {
        int number;
        int result = (int)(Math.random() * 101) ;
        System.out.println(result);
        Scanner sc;
        sc = new Scanner(System.in);
        do{
            System.out.println("your number (0-100): ");
            number = sc.nextInt();
            if(number > result){
                System.out.println("Greater than!");
            }
            else if(number < result){
                System.out.println("Less than!");
            }
            else System.out.println("Successfull!");
        }while(number != result);
        sc.close();
    }
}
