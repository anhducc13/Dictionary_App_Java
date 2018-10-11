/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopBasic;

import java.util.ArrayList;

/**
 *
 * @author CACLV
 */
public class Ship {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String check(String userInput){
        String result = "Miss";
        int index = locationCells.indexOf(userInput);
        if(index >= 0){
            locationCells.remove(index);
            result = locationCells.isEmpty() ? "kill" : "hit";
        }
        return result;
    }
    
}
