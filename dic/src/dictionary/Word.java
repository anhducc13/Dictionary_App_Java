/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author DUYKYPAUL
 */
public class Word {
    private String word_target;
    private String word_explain;
    public Word(){
        this.word_target = "hello";
        this.word_explain = "xin chao";         
    }

    public String getWord_target() {
        return word_target;
    }

    public Word(String word_target, String word_explain) {
        this.word_target = word_target;
        this.word_explain = word_explain;
    }
    
    public void setWord(Word ele) {
        this.word_target = ele.word_target;
        this.word_explain = ele.word_explain;
    }

    public void setWord_target(String word_target) {
        this.word_target = word_target;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }
    
    public Word(String line) {
        this.word_target = line.substring(0, line.indexOf("\t"));
        this.word_explain = line.substring(line.indexOf("\t") + 1);
    }
}
