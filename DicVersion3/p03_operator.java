/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01_basic;

/**
 *
 * @author CACLV
 */
public class p03_operator {
    // Random number generator
    public static void main(String[] args) {
        int max = 19;
        int min = 14;
        int range = max - min + 1;
        int randoomNumber = 0;
        randoomNumber = (int)(Math.random() * range) + min ;
        System.out.println("randoom: " + randoomNumber);
    }
    // 007 MAX MIN
    public static void main007(String[] args ){
        int numberOne = 10;
        int numberTwo = 5;
        int numberThree = 15;
        System.out.println("MAX: " + Math.max(Math.max(numberThree, numberOne), numberTwo));
        System.out.println("MIN: " + Math.min(Math.min(numberThree, numberOne), numberTwo));
        
    }
    // 006 Common math functions
    public static void main006(String[] args) {
        int numberOne = 10;
        int numberTwo = 5;
        double numberThree = 123.725;
        
        int result = Math.max(numberTwo, numberTwo);
        System.out.println("max: " + result);
        
        result = Math.min(numberTwo, numberTwo);
        System.out.println("min: " + result);
        
        System.out.println("ceil: " + Math.ceil(numberThree));
        System.out.println("floor: " + Math.floor(numberThree));
        System.out.println("round: " + Math.round(numberThree));
        
        double randoomNumber = Math.random();
        System.out.println("randoomNumber: " + randoomNumber);
    }
    // 005 operator && || !
    public static void main005(String[] args) {
        int numberOne = 10;
        int numberTwo = 5;
        boolean result = false;
        
        result = (numberOne > numberTwo) && (numberOne >= numberTwo);
        System.out.println("(numberOne > numberTwo) && (numberOne >= numberTwo) is " + result);
        
        result = (numberOne < numberTwo) || (numberOne <= numberTwo);
        System.out.println("(numberOne < numberTwo) && (numberOne <= numberTwo) is " + result);
        
        result = !(numberOne > numberTwo) && (numberOne >= numberTwo);
        System.out.println("!(numberOne > numberTwo) && (numberOne >= numberTwo) is " + result);
    }
    //  004 operator > < == != >= <=
    public static void main004(String[] args) {
        int numberOne = 10;
        int numberTwo = 5;
        boolean result = false;
        
        result = numberOne > numberTwo;
        System.out.println(numberOne + " > " + numberTwo  + " is " + result);
        
        result = numberOne < numberTwo;
        System.out.println(numberOne + " < " + numberTwo  + " is " + result);
        
        result = numberOne >= numberTwo;
        System.out.println(numberOne + " >= " + numberTwo  + " is " + result);
        
        result = numberOne <= numberTwo;
        System.out.println(numberOne + " <= " + numberTwo  + " is " + result);
        
        result = numberOne != numberTwo;
        System.out.println(numberOne + " != " + numberTwo  + " is " + result);
        
        result = numberOne == numberTwo;
        System.out.println(numberOne + " == " + numberTwo  + " is " + result);
    }
    // 003 operator ++ --
    public static void main003(String[] args) {
        int numberStart = 20;
        int numberEnd = 0;
        numberEnd = numberStart++;
        System.out.println("numberStart: " + numberStart );
        System.out.println("numberEnd: " + numberEnd );
        
        numberEnd = --numberStart;
        System.out.println("numberStart: " + numberStart );
        System.out.println("numberEnd: " + numberEnd );
    }
    // 002 operator += -= *= /= %=
    public static void main002(String[] args) {
        int number = 20;
        System.out.println("start: " + number);
        number += 10;
        number -= 5;
        number *= 4;
        number /= 2;
        number %= 4;
        System.out.println("end: " + number);
        
    }
    // 001 operator + - * / %
    public static void main001(String[] args) {
        int numberOne = 20;
        int numberTwo = 3;
        int result;
        
        // +
        result = numberOne + numberTwo;
        System.out.println(numberOne + " + " + numberTwo + " = " + result);
        
        // -
        result = numberOne - numberTwo;
        System.out.println(numberOne + " - " + numberTwo + " = " + result);
        
        // *
        result = numberOne * numberTwo;
        System.out.println(numberOne + " * " + numberTwo + " = " + result);
        
        // /
        result = numberOne / numberTwo;
        System.out.println(numberOne + " / " + numberTwo + " = " + result);
        
        // %
        result = numberOne % numberTwo;
        System.out.println(numberOne + " % " + numberTwo + " = " + result);
    }
}
