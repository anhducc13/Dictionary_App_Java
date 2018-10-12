/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01_basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CACLV
 */
public class p10_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList [] List = new ArrayList[n];
        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            List[i] = new ArrayList();
            for(int j = 0; j < x; j++){
                int val = scan.nextInt();
                List[i].add(val);
            }
        }
        int m = scan.nextInt();
        for(int k = 0; k < m; k++){
            int i = scan.nextInt(), j = scan.nextInt();
            
            try {
                System.out.println(List[i - 1].get(j - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
    //05 functions String
    public static void main05(String[] args) {
        String strThongtin = "legolas";
        String strThongTin1 = "frodo";
        int idx = strThongtin.compareTo(strThongTin1);
        System.out.println(idx);
        
        // thêm một thông tin
        strThongtin = strThongtin.concat(" la hero");
        System.out.println(strThongtin);
        
        // thay thế
        strThongtin = strThongtin.replace(' ', '+');
        System.out.println(strThongtin);
        
        // hàm chia chuỗi về dạng mảng theo 1 khuôn mẫu hay quy tắc nhất định
        strThongtin = "10 20 30 40";
        String[] arr = strThongtin.split(" ");
        
        System.out.println("danh sách các phần tử là: ");
        for(String ar : arr){
            System.out.println(ar);
        }
        double kt = 3.1;
        System.out.printf("%1.5f" , kt, Math.PI);
        System.out.printf("%1.5f" , Math.PI);
    }
    
    // 04 arraylist mảng động
    public static void main04(String[] args) {
       // khai báo 1 danh sách arraylist
        ArrayList arr;
        arr = new ArrayList();
        arr.add("le duy ky");
        arr.add(678);
        arr.add(new Date());
        //  in thông tin dánh sách
        arr.forEach((arr1) -> {
            System.out.println(arr1);
        }); /*
        hoặc là thế này
        arr.forEach((arr1) -> {
        System.out.println(arr1);
        });
         */
        
        // khai báo 1 danh sách list
        List <String> listKhoaHoc = new ArrayList<>();
        // thêm khóa học vào danh sách
        listKhoaHoc.add("oop");
        listKhoaHoc.add("java");
        listKhoaHoc.add("math");
        listKhoaHoc.add("physic");
        
        // xóa phần tử
        listKhoaHoc.remove("java");
        
        // thay thế  phần tử 
        listKhoaHoc.set(2, "php");
        
        // in thông tin ra màn hình
        listKhoaHoc.forEach(System.out::println);
        
    }

    
    // 03 mảng 2 chiều số nguyên
    public static void main03(String[] args) {
       // khai báo mảng hai chiều
       int a[][] = new int[2][2];
       a[0][0] = 1;
       a[0][1] = 2;
       a[1][0] = 3;
       a[1][1] = 5;
       
       // duyệt danh sách và in ra
       for(int i = 0; i < 2.; i++){
           for(int j = 0; j < 2.; j++){
               System.out.print(a[i][j] + "\t");
           }
           System.out.println();
       }
    }
    
    // 02 khai báo mảng one-way các số thực có độ dài n đc nhập vào từ bàn phím và in ra màn hình
    public static void main02(String[] args) {
       int n;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       double a[] = new double[n];
        System.out.println("Nhap mang gom " + n + " phan tu:");
       for(int i = 0; i < n; i++){
           System.out.print("a[" + i + "]: ");
           a[i] = sc.nextDouble();
       }
       // duyệt phần tủ và in ra màn hình
        System.out.println("danh sách mang: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    // 01 mảng một chiều gồm các số nguyên
    public static void main01(String[] args) {
       // khai báo 1 mảng số nguyên gồm ba phần tử r in ra màn hình
       int a[] = new int[3];
       a[0] = 1;
       a[1] = 3;
       a[2] = 7;
       // duyệt phần tủ và in ra màn hình
        System.out.println("java");
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

//    private static Object Date() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
