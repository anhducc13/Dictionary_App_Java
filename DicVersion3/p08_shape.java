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
public class p08_shape {
    public static void main(String[] args) {
        /*
             1
            212
           32123
          4321234
         543212345
        */
        int j = 1;
        while (j <= 5){
            for(int i = 0; i < 5 - j; i++) System.out.print(" ");
            for(int i = j; i > 0; i--) System.out.print(i);
            for(int i = 2; i < j + 1; i++) System.out.print(i);
            System.out.println();
            j++;
        }
    }
    // 004 shape 04
     public static void main004(String[] args) {
        /*
        1 
        1 2 
        1 2 3 
        1 2 3 4 
        1 2 3 4 5   
        */
        int j = 1;
        while(j <= 5){
            for(int i = 0; i < j ; i++) System.out.print((i + 1) + " ");   
            System.out.println();
            j++;
        }
    }
    // 003 shape 03
     public static void main003(String[] args) {
        /*
          * * * * * 
            * * * * 
              * * * 
                * * 
                  * 
        */
        int j = 1;
        while(j <= 5){
            for(int i = j - 1 ; i >= 0; i--) System.out.print("  ");    
            for(int i = 0; i < 5 - j + 1 ; i++) System.out.print("* ");   
            System.out.println();
            j++;
        }
    }
    // 002 shape 02
    public static void main002(String[] args) {
        /*
                  * 
                * * 
              * * * 
            * * * * 
          * * * * * 
        */
        int j = 1;
        while(j <= 5){
            for(int i = 5 - j; i >= 0; i--) System.out.print("  ");    
            for(int i = 0; i < j; i++) System.out.print("* ");   
            System.out.println();
            j++;
        }
    }
    // 001 shape 01
    public static void main001(String[] args) {
        /*
        * 
        * * 
        * * * 
        * * * * 
        * * * * *
        */
        int j = 1;
        while(j <= 5){
            for(int i = 0; i < j; i++){
                System.out.print("* ");    
            }
            System.out.println();
            j++;
        }
    }
}
