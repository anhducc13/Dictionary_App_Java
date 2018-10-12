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
public class p09_function {
    public static void main(String[] args) {
        int n;
        Scanner sc;
        sc = new Scanner(System.in);
        n = sc.nextInt();
        prime(n);
    }
    public static void prime(int n) {
        switch (n) {
            case 1:
                System.out.println("n is not prime");
                break;
            case 2:
                System.out.println("n is prime");
                break;
            default:
                int count = 0;
                for(int i = 2; i < n / 2 + 1; i++){
                    if(n % i == 0){
                        count++;
                    }
                }
                if(count == 0){
                    System.out.println("n is prime");
                } else {
                    System.out.println("n is not prime");
                }
                break;
        }
    }
}
