package com.dicV2;

import java.util.ArrayList;

public class DictionaryManagement {
    FileProcessing FP = new FileProcessing();
    SQLProcessing SP = new SQLProcessing();
    Dictionary dic = new Dictionary();
    ListWordSaved wordSaved = new ListWordSaved();
    ListWordHistory wordHistory = new ListWordHistory();

    public boolean initData() {
        FP.updateListSaved(); 
        FP.updateListHistory();
        FP.updateListDic();
        return true;
    }
    
    public void updateDataBeforeClosing() {
        FP.updateFileSaved();
        FP.updateFileHistory();
        FP.updateFileDic();
    }
    
    public boolean addWordToDictionary(Word w) {
//            SP.insertToSQL(w);
        
        return dic.insertToList(w);
    }
    
    public boolean editWordInDictionary(Word oldWord, Word newWord) {
        return dic.editWordInList(oldWord, newWord);//            SP.editWordInSQL(oldWord, newWord);
    }
    
    public void deleteWordInDictionary(Word w) {
        dic.deleteInList(w);
//        SP.deleteInSQL(w);
    }
    
    public void deleteWordInSaved(Word w) {
        wordSaved.delWord(w);
    }
    
    public boolean saveWord(Word w) {
        return dic.addWordToSavedWord(w);
    }
    
    public void addToHistory(Word w) {
        dic.addToHistory(w);
    }
    
    public ArrayList<Word> createListSearched(ArrayList<Word> listWord, String search_str) {
        ArrayList<Word> listTaget = BinarySearch.searchSmart(listWord, search_str);
        return listTaget;
    }
}
