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
    BetHistory betHistory = new BetHistory();
    Integer[] currentCall = new Integer[2];
    boolean endState=false;
    int nextPlayer;
    int totalDice;
    
    public gameState(){
        players = new ArrayList<>();
        for (int i=0; i<4; i++){
            players.add(new Player());
        }
        nextPlayer=0;
        totalDice=20;
        currentCall[0]=0;
        currentCall[1]=0;

    }
    
    public void playRound(){
        updateBoard();
        
    }
    
    public void updateBoard(){
        for (Player player : players){
            if (player.getDiceCount() == 0)
                player.kill();
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
        if (currentCall[0] != null)
           return currentCall[0];
        else
            return 0;
    }
    
    public int getBetValue(){
        return currentCall[1];
    }
    
    public int getNextPlayer(){
        return nextPlayer;
    }
    
    public boolean isEndState(){
        return endState;
    }
    
    public int[] getPlayerBet(int playerNum){
        int[] bet = new int[2];
        
        Player activePlayer=players.get(playerNum);
        bet = activePlayer.bet(getBetCount(), getBetValue(), this);
        
        return bet; 
    }
    
    public ArrayList<Player> getPlayers(){
        return players;
    }
    
    //Checks who loses in the end state
    public boolean endStateCheck(int count){
        int realCount =0;
        for (Player p:players){
            int i=0;
            for (int diceVal:p.diceValues){
                if (i<p.getDiceCount())
                    realCount+=diceVal;
            }
        }
        
        if (realCount >= count)
            return true;
        else
            return false;
    }
    
    public boolean checkBet(int count, int value){
        int realCount=0;
        
        if (endState)
            return endStateCheck(count);
        
        for (Player p:players){
            int i=0;
            for (int diceVal:p.diceValues){
                if ((diceVal==1 || diceVal==value) && i<p.getDiceCount())
                    realCount++;
            }
        }
        
        if (realCount >= count)
            return true;
        else
            return false;
    }
    
    //Check if we are in the end state
    public boolean checkEndState(){
        for (Player p : players){
            if (p.diceCount==1){
                endState=true;
                return true;
            }
        }
        endState=false;
        return false;
    }
    
    public void endGame(){
        
    }
    
    public void reset(){
        currentCall[0] = 0;
        currentCall[1] = 0;
        totalDice--;
        betHistory.clearLog();
        checkEndState();

    }
    
    public void iteratePlayer(){
        
        nextPlayer++;
        
        if(nextPlayer>players.size()-1)
            nextPlayer=0;
        
        while(players.get(nextPlayer).getActive()== false){
            nextPlayer++;
            if(nextPlayer>players.size()-1)
                nextPlayer=0;
        }
    }
}
