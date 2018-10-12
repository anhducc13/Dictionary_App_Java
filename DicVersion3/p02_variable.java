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
public class p02_variable {
    // data type
    public static void main(String[] args) {
        int var1 = 12;
        byte var2 = 10;
        boolean var3 = true;
        double var4 = 123.456;
        String var5 = "john Mike";
        
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println("name: " + var5);
        
    }
    // 002 constant 
    public static void main002(String[] args) {
//        khai bao const
        final int YOUR_BIRTHDAY = 1999;
        System.out.println("your birthday: " + YOUR_BIRTHDAY);
    }
    
    // 001 variable
    public static void main001(String[] args) {
        /*khai bao bien*/
        int age = 20, year = 2018;
        char name, city;
        // first name
//        char firstname;  // normal
//        char first_name; //underscores
//        char first-name; // hyphen (deny in java)
        
        char firstName = 'n';  // camelCase
        System.out.println("age: " + age);
        System.out.println( year);
        System.out.println("first name : " + firstName);  
    }
    
}
