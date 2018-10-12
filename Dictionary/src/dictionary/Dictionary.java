/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author DUYKYPAUL
 */
public class Dictionary {
    public static ArrayList<Word> wordList = new ArrayList<>();
    public static ArrayList<Word> wordListHistory = new ArrayList<>();
    public static String fileName = "E:\\FFOutput\\OOP1\\dic\\dictionaries.txt";
    
    //load từ từ file vào ArrayList<Word> wordList
    public static void insertWordFromFile(){
        try (Stream <String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)){
            stream.forEach((String line) ->{
                wordList.add(new Word(line));
            });
            System.out.println("Đọc file thành công");
        } catch (Exception e) {
            System.out.println("Không thể đọc file");
        }
        
    }
    
    // thêm từ vào ArrayList<Word> wordList đúng vị trí sắp xếp
    public static void addIndex(Word ele) {
        int size = wordList.size();
        for (int i = 0; i < size; i++) {
            if(ele.getWord_target().compareTo(wordList.get(i).getWord_target()) < 0) {
                wordList.add(i, ele);
                break;
            }
        }
    }
    // xóa từ trong ArrayList<Word> wordList
    public static void delWord(String ele, ArrayList<Word> wordList) {
        int size = wordList.size();
        for (int i = 0; i < size; i++) {
            if(ele.equals(wordList.get(i).getWord_target())) {
                wordList.remove(i);
                break;
            }
        }
    }
    // update lại file (sau khi thêm sửa xóa)
    public static void wordListExportToFile() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"));
            for (Word ele : Dictionary.wordList) {
                bw.write(ele.getWord_target()+ "\t" + ele.getWord_explain());
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            System.out.println("Error " + ex);
        } catch (IOException ex) {
            System.out.println("Error " + ex);
        }
    }

}

