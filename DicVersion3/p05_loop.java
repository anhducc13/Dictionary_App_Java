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
public class p05_loop {
    // BREAK CONTINUE
    public static void main(String[] args) {
        for(int i = 1; i < 20; i++){
            if(i % 7 == 0){
                System.out.println("Ok: " + i);
                //break;
                continue;
            }
            System.out.println(i);
        }
    }
    // 003 multiplication table full
    public static void main003(String[] args) {
        for(int i = 2; i < 10; i++){
            System.out.println("multiplication table " + i);
            for(int j = 1; j < 11; j++){
                System.out.printf("%d x %d = %d %n", i, j, i * j);
            }
            System.out.println();
        }
    }
    // 002 multiplication table
    public static void main002(String[] args) {
        int number = 3;
        for(int i = 1; i < 11; i++){
            //System.out.println(number + " x " + i + " = " + (number * i));
            System.out.printf("%d x %d = %d %n", number, i, number * i);
        }
        
    }
    // 001 loop
    public static void main001(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Insert you number: ");
        number = inp.nextInt();
        for(int i = 0; i < number; i++){
            System.out.println("duykypaul");
        }
        int j = 0;
        while(j < number){
            j++;
            System.out.println("duyky");
        }
        j = 0;
        do{
            System.out.println("paul");
            j++;
        }while(j < number);
    }
}
