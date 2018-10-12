/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author DUYKYPAUL
 */
public class SqlProcessing {
    private Statement statement;
    private final String tableName = "ListWord";
    private final String user = "root";
    private final String pass = "";
    private final String url = "jdbc:mysql://localhost:3306/dictionary1?user=" + user
            + "&password=" + pass + "&userUnicode=true&characterEncoding=utf8";
    private final String className = "com.mysql.jdbc.Driver";
    private Connection connection;
    
    // kết nối sql
    public SqlProcessing () {
        try {
            connection = DriverManager.getConnection(url);

            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(SqlProcessing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // gameover. dừng kết nối
    private void disConnectSQL() {
        try {
            connection.close();
            System.out.println("Đã ngắt kết nối");
        } catch (SQLException ex) {
            System.out.println("ko thể Ngắt kết nối");
        }
    }
    
    // thêm 1 từ vào sql
    public void insertElementToSQL(Word word) {
        try {   
         // INSERT INTO `wordlist`(`target`, `explain`) VALUES ([value-1],[value-2])            
            statement.executeUpdate("INSERT INTO `ListWord` VALUES ('" + word.getWord_target() + "','" 
                    + word.getWord_explain() + "')");
            System.out.println("Thêm thành công.");
        } catch (SQLException ex) {
            System.out.println("Từ chưa được thêm");
        }
    }   
    
    // xóa 1 từ  trên sql 
    public void deleteElementInSQL(String word_target) {
        try {
            String query = "DELETE FROM `ListWord` WHERE `target` = '" + word_target + "'";
            System.out.println(query);
            statement.executeUpdate(query);
            System.out.println(statement);
            disConnectSQL();
            System.out.println("Xóa từ thành công");
        } catch (SQLException ex) {
            System.out.println("Xóa từ không thành công");
        }
    }
   
    public void updateElementInSQL(String word_target_current, String word_target_New, String word_explain_New) {
        try {
            String query = "UPDATE `ListWord` SET `target` = '" + word_target_New + "', `explain` = '" + word_explain_New + "' WHERE `target` = '" + word_target_current + "'";
            System.out.println(query);
            statement.executeUpdate(query);
            System.out.println(statement);
            disConnectSQL();
            System.out.println("Sửa từ thành công");
        } catch (SQLException ex) {
            System.out.println("Sửa từ không thành công");
        }
    }
    public void readFile() {
        String fileName = "E:\\FFOutput\\OOP1\\dic\\dictionaries.txt";
        try (Stream <String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)){
            stream.forEach((String line) ->{
                insertElementToSQL(new Word(line));
            });
            System.out.println("Đọc file thành công");
        } catch (Exception e) {
            System.out.println("Không thể đọc file");
        }
    }
         
    // kéo dữ liệu từ sql về danh sách List
    public void dictionaryImportFromSQL() {
        try {
            ResultSet resultSet;
            String sql = "SELECT * FROM " + tableName;
            //Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                Dictionary.wordList.add(new Word(resultSet.getString(1), resultSet.getString(2)));
            }
            disConnectSQL();
            System.out.println("Đã Lấy dữ liệu xong");
        } catch (SQLException ex) {
            System.out.println("Lấy dữ liệu không thành công");
        }
    }
    
    public static void main(String[] args) {
        SqlProcessing sqlPro = new SqlProcessing();
        sqlPro.readFile();
        //sqlPro.deleteElementInSQL("abandon");
        //sqlPro.updateElementInSQL("a bet", "a bit", "một chút, một tí");
//        sqlPro.dictionaryImportFromSQL();
//        for (int i = 0; i < Dictionary.wordList.size(); i++) {
//            System.out.printf("%-20s%-20s\n",Dictionary.wordList.get(i).getWord_target(), Dictionary.wordList.get(i).getWord_explain());
//        }
        
    }
}
