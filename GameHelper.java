/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author CACLV
 */
public class GameHelper {
    private static final String alphabet = "abcdefg";
    private final int gridLength = 7;
    private final int gridSize = 49;
    private final int [] grid = new int[gridSize];
    private int shipCount = 0;
    
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + "     ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
            
        } catch (IOException e) {
            System.out.println("IOException" + e);
        }
        return inputLine.toLowerCase();
    }
    public ArrayList<String> placeship(int size){
        ArrayList<String> alphaCells = new ArrayList<>();
        String [] alphacoords = new String[size];
        String temp = null;
        int [] coords = new int[size];
        int attempts = 0;
        boolean success = false;
        int location = 0;
        shipCount++;
        int incr = 1;
        if((shipCount % 2) == 1)
            incr = gridLength;
        while(!success & attempts++ < 200){
            location = (int)(Math.random() * gridSize);
            //System.err.println(" try " + location);
            int x = 0;
            success = true;
            while(success && x < size){
                if(grid[location] == 0){
                    coords[x++] = location;
                    location += incr;
                    if(location >= gridSize){
                        success = false;
                    }
                    if(x > 0 && (location % gridLength == 0)){
                        success = false;
                    }
                }
                else {
                    //System.err.println(" used " + location);
                    success = false;
                }
            }
        }
        int x = 0;
        int row = 0;
        int column = 0;
        //System.out.println("\n");
        while(x <size){
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLength);
            column = coords[x] %gridLength;
            temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.print("  coord" + x + " = " + alphaCells.get(x - 1));
        }
        //System.out.println();
        return alphaCells;
    }
}
