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
public class SinkAShip {
    private final GameHelper helper = new GameHelper();
    private final ArrayList<Ship> shipList = new ArrayList<>();
    private int numOfGuesses = 0;
    
    private void setUpGame(){
        Ship firstShip = new Ship(), secondShip = new Ship(), thirdShip = new Ship();
        firstShip.setName("ship1");
        secondShip.setName("ship2");
        thirdShip.setName("ship3");
        shipList.add(firstShip);
        shipList.add(secondShip);
        shipList.add(thirdShip);
        
        System.out.println("Your goal is to sink three ships.");
        System.out.println("ship1, ship2, ship3");
        System.out.println("Try to sink them all in the fewest number of guesses");
        
        shipList.forEach((ship) -> {
            ArrayList< String> newLocation = helper.placeship(3);
            ship.setLocationCells(newLocation);
        });
    }
        
    private void startPlaying() {
        while(! shipList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";
        for(Ship shiptoTest : shipList){
            result = shiptoTest.check(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                shipList.remove(shiptoTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        System.out.println("All the ships are sunk!  You're now the king of the sea!");
        if(numOfGuesses <= 18){
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        }
        else {
            System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
            System.out.println("Fish are dancing with your options.");
        }
    }
//    public static void main001(String[] args) {
//        SinkAShip game = new SinkAShip();
//        game.setUpGame();
//        game.startPlaying();
//    }
}
