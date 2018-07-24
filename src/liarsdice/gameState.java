/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarsdice;
import java.io.*;
import java.util.*;
import java.util.Random;
/**
 *
 * @author Computer
 */
public class gameState {
    
    ArrayList<Player> players;    
    Integer[] currentCall;
    int nextPlayer;
    int totalDice;
    
    public gameState(){
        players = new ArrayList<>();
        for (int i=0; i<4; i++){
            players.add(new Player());
        }
        nextPlayer=0;
        totalDice=20;
    }
    
    public void playRound(){
        updateBoard();
        
    }
    
    public void updateBoard(){
        for (Player player : players){
            if (player.getDiceCount() == 0)
                player.kill();
            else{
                totalDice+=player.getDiceCount();
            }
        }
        
    }
    
    public int getDice(){
        return totalDice;
    }
}
