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
    Random gen = new Random();
    
    public Player(){
        diceCount=5;
        active = true;
    }
    
    public void Roll(){      
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
    
    //Returns number of a given dice value in a player's cup
    public int getCountOfDiceValue(int n){
        int count=0;
        for (int i=0; i<diceCount; i++){
            if (diceValues[i] == n)
                count++;
        }
        return count;
    }
    
    //Check if you have four of one value
    public int yahtzee(){
        int commonValue=0;
        
        for(int i=2; i<=6; i++){
            if(getCountOfDiceValue(i) == 4)
                return i;
        }
        
        return commonValue;
    }
    
    //Returns the value that the player has the most of
    public int mostValue(){
        if(diceCount==1)
            return diceValues[0];
        
        int[] count=new int[]{0,0,0,0,0,0};
        for (int i=0; i<diceCount; i++){
            count[diceValues[i]-1]++;
        }
        
        int maxValue=1;
        int maxCount=diceValues[1];
        for (int i=2; i<6; i++){
            if(count[i] > maxCount){
                maxValue=i;
                maxCount=diceValues[i];
            }
        }
        
        return maxValue+1;
    }
    
    public int[] bet(int betCount, int betValue, gameState state){
        int[] bet = new int[2];
        int myValue=0;
        int myCount=0;
        int totalDice = state.totalDice;
        int commonValue = state.betHistory.getMostCommonValue();
        int zeroonetwo = gen.nextInt(3);
        
        //First call a lie if someones cocky
        if(betCount >= (totalDice/2)-zeroonetwo){
            return new int[]{-1,-1};
        }
        
        //Otherwise check to see if this is an early bet
        if (betCount<totalDice/4){
            myCount=(totalDice/4)+(zeroonetwo-1);
            if (zeroonetwo==0)
                myValue=mostValue();
            else
                myValue=gen.nextInt(5)+2;
            if(myCount<2)
                myCount=2;
            while(myCount<betCount || (myCount == betCount && myValue<betValue))
                myCount++;
            
            return new int[]{myCount,myValue};
        }
        
        //First priority is to fuck with people if you have four+ of a number
        if (yahtzee() != 0){
            if (yahtzee() > betValue)
                return new int[]{betCount, yahtzee()};
            else
                return new int[]{betCount+1, yahtzee()};
        }
        
        //Second priority is to bet with the crowd if you have 2+ of the same value
        if (getCountOfDiceValue(commonValue) + getCountOfDiceValue(1) >= 2 && state.betHistory.getLength() >= 3){
            return new int[]{betCount+1, commonValue};
        }
        
        //Else bet the minimum but sometimes bluff
        if (betValue>=6){
            myCount=betCount+1;
            myValue=2;
        }
        else{
            myCount=betCount;
            myValue=betValue+1;
        }
        
        if (gen.nextInt(3) == 0){
            myValue=mostValue();
            myCount=2;
            while(myCount<betCount || (myCount == betCount && myValue<betValue))
                myCount++;
        }
        
        bet[0]=myCount;
        bet[1]=myValue;
        return bet;
    }
}
