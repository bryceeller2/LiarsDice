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
    Integer[] currentCall = new Integer[2];
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
    
    public void updateBet(int count, int value){
        currentCall[0]=count;
        currentCall[1]=value;
    }
    
    public int getDice(){
        return totalDice;
    }
    
    public int getBetCount(){
        return currentCall[0];
    }
    
    public int getBetValue(){
        return currentCall[1];
    }
}
