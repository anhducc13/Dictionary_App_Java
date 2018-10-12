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
public class p04_condition {
    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in); // tạo đói tượng inp thuộc lớp scanner
        System.out.print("Insert your number: ");
        number = inp.nextInt(); // nhập vào số int
        switch(number){
            case 2: 
                System.out.println("Thu hai");
                break;
            case 3: 
                System.out.println("Thu ba");
                break;
            case 4: 
                System.out.println("Thu bon");
                break;    
            case 5: 
                System.out.println("Thu nam");
                break;    
            case 6: 
                System.out.println("Thu sau");
                break;  
            case 7: 
                System.out.println("Thu bay");
                break;    
            default:
                System.out.println("Chu nhat");
                break;
        }
    }
    // 001 IF ELSE 
    public static void main001(String[] args) {
        int var = 6;
        if(var > 6){
            System.out.println("woaaaaaa");
        }
//        if(var <= 6){
//            System.out.println("qoaaaaaa");
//        }
        else System.out.println("qoaaaaaa");
    }
}
