/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01_basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CACLV
 */
public class byteStream {

    public static void main(String[] args) throws IOException {
        readFile();
        writeFile();
    }

    public static void writeFile() throws FileNotFoundException, IOException {
        try (FileOutputStream fileOutput = new FileOutputStream("E:\\FFOutput\\LamQuenVoiJaVa\\src\\chap01_basic\\demo1.txt")) {
            String str = "le duy ky uet vnu";
            for (int i = 0; i < str.length(); i++) {
                fileOutput.write(str.charAt(i));
            }
        }
        System.out.println("ghi file thanh cong");
    }

    public static void readFile() {
        String str = new String();
        try {
            FileInputStream fileInput = new FileInputStream("E:\\FFOutput\\LamQuenVoiJaVa\\src\\chap01_basic\\demo.txt");
            while (true) {
                int i = fileInput.read();
                if (i == -1) {
                    System.err.println("Het File");
                    break;
                }
                char c = (char) i;
                str += c;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(byteStream.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(byteStream.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.err.println("ket qua doc file: " + str);
        System.err.println("ket thuc chuong trinh");
    }
}
