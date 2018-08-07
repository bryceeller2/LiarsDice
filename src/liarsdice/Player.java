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
public class Player {
    
    int diceCount;
    boolean active;
    ArrayList<Integer> diceValues;
    
    public Player(){
        diceCount=5;
        active = true;
    }
    
    public void Roll(){
        Random gen = new Random();
        
        for (int i=0; i<diceCount; i++){
            diceValues.set(i, gen.nextInt(6));
        }
    }
    
    public boolean getActive(){
        return active;
    }
    
    public ArrayList<Integer> getDiceValue(){
        return diceValues;
    }
    
    public int getDiceValue(int i){
        return diceValues.get(i);
    }
    
    public int getDiceCount(){
        return diceCount;
    }
    
    public void kill(){
        active=false;
    }
    
    public int[] bet(int betCount, int betValue){
        int[] bet = new int[2];
        int myValue=0;
        int myCount=0;
        
        if (betValue==6){
            myCount=betCount+1;
            myValue=2;
        }
        else{
            myCount=betCount;
            myValue=betValue+1;
        }
        bet[0]=myCount;
        bet[1]=myValue;
        return bet;
    }
}
