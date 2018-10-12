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
public class p06_caculator {
    public static void main(String[] args) {
        int numberFirst;
        int numberSecond;
        int result = 0;
        String caculate;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Number first: ");
            numberFirst = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Number second: ");
            numberSecond = sc.nextInt();
            sc.nextLine();
            
            System.out.println("Caculate: ");
            caculate = sc.nextLine();
        }
//        System.out.println(numberFirst);
//        System.out.println(numberSecond);
//        System.out.println(caculate);
        switch(caculate){
            case "+":
                result = numberFirst + numberSecond;
                break;
            case "-":
                result = numberFirst - numberSecond;
                break;
            case "x":
            case "*":
                result = numberFirst * numberSecond;
                break;
            case ":":    
            case "/":
                result = numberFirst / numberSecond;
                break;
            case "%":
                result = numberFirst % numberSecond;
                break;     
            default:
                break;
        }
        System.out.printf("%d %s %d = %d", numberFirst, caculate, numberSecond, result);
    }
}
