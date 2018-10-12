/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt01;

/**
 *
 * @author CACLV
 */
public class bt01 {
    // tính ước số chung lớn nhất của hai số nguyên
    public void USCLN(int a, int b){
        b = Math.abs(b);
        a = Math.abs(a);
        if(b == 0) System.out.println(a);
        else USCLN(b, a % b);
    }
    
    
    // cộng hai số kiểu String trả về tổng
    public static String add(String a, String b) {
        
        // cân bằng chiều dài hai số
        int subsize = a.length() - b.length();
        if (subsize > 0) {
            for (int i = 0; i < subsize; i++) {
                b = "0" + b;
            }
        } else if (subsize < 0) {
            for (int i = 0; i < subsize; i++) {
                a = "0" + a;
            }
        }
        
        // bắt đầu tính tổng
        String s = "";
        int temp, extra = 0, size = a.length();
        for (int i = size - 1; i >= 0; i--) {
            temp = a.codePointAt(i) + b.codePointAt(i) + extra - 96;
            s += temp % 10;
            extra = temp / 10;
        }
        if(extra == 1){
            s += extra;
        }
        String s1 = "";
        for (int i = extra + size - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        return s1;
    }
    
    // hàm tính số fibonaci thứ n
    public static void fibonaci(int n){
        String [] ar = new String[n];
        ar[0] = "1";
        ar[1] = "1";
        for(int i = 2; i < n; i++){
            ar[i] = add(ar[i - 1], ar[i - 2]);
        }
        System.out.println(ar[n - 1]);
    }
    public static void main(String[] args) {
        int a = 0, b = 0;
        int n = 1000;
        new bt01().USCLN(a, b);
        fibonaci(n);
    }
}
