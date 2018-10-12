/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap01_basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CACLV
 */
public class characterStream {
    public static void main(String[] args)  {
        try {
            String kq = readFile("E:\\FFOutput\\LamQuenVoiJaVa\\src\\chap01_basic\\character.bin");
            System.out.println(kq);
        } catch (IOException ex) {
            Logger.getLogger(characterStream.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String readFile(String filePath) throws  IOException{
        String outPut = "";
        FileReader fileInPut = new FileReader("E:\\FFOutput\\LamQuenVoiJaVa\\src\\chap01_basic\\character.bin");
        int i;
        while((i = fileInPut.read()) != -1){
            outPut += (char)i;
        }
        return outPut;
    }
}
