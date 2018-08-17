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
    Integer[] diceValues=new Integer[5];
    javax.swing.JLabel[] diceImages = new javax.swing.JLabel[5];
    javax.swing.JLabel cupImage = new javax.swing.JLabel();
    
    public Player(){
        diceCount=5;
        active = true;
    }
    
    public void Roll(){
        Random gen = new Random();
        
        for (int i=0; i<diceCount; i++){
            diceValues[i] = gen.nextInt(6)+1;
        }
    }
    
    public boolean getActive(){
        return active;
    }
    
    public javax.swing.JLabel[] getDiceImages(){
        return diceImages;
    }
    
    public Integer[] getDiceValue(){
        return diceValues;
    }
    
    public int getDiceValue(int i){
        return diceValues[i];
    }
    
    public int getDiceCount(){
        return diceCount;
    }
    
    public void kill(){
        active=false;
    }
    
    public void setDiceImages(javax.swing.JLabel[] a){
        diceImages=a;
    }
    
    public void setCupImage(javax.swing.JLabel a){
        cupImage=a;
    }
    
    public void updateCupImage(javax.swing.ImageIcon a){
        cupImage.setIcon(a);
    }
    
    public boolean loseDie(){
        diceCount--;
        diceValues=new Integer[diceCount];
        if (diceCount>0)
            return true;
        else{
            active=false;
            return false;
        }
    }
    
    public int[] bet(int betCount, int betValue, gameState state){
        int[] bet = new int[2];
        int myValue=0;
        int myCount=0;
        int totalDice = state.totalDice;

        if(betCount >= totalDice/2){
            return new int[]{-1,-1};
        }
        
        if (betValue==6){
            myCount=betCount+1;
            myValue=2;
        }
        else{
            myCount=betCount;
            myValue=betValue+1;
        }
        if (myCount ==0)
            myCount++;
        bet[0]=myCount;
        bet[1]=myValue;
        return bet;
    }
}
