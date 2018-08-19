/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarsdice;

import java.util.ArrayList;

/**
 *
 * @author Computer
 */
public class BetHistory {
    
    ArrayList<int[]> log = new ArrayList<int[]>();
    
    public BetHistory(){
    }
    
    public void logBet(int[] bet){
        log.add(bet);
    }
    
    public void clearLog(){
        log.clear();
    }
    
    public int[] getLastBet(){
        int size = log.size();
        if (size>0)
            return log.get(size-1);
        else
            return new int[]{0,0};
    }
    
    public int getLastValue(){
        int[] bet = this.getLastBet();
        return (bet[1]);
    }
    
    public int getMostCommonValue(){
        int[] values = new int[]{0,0,0,0,0};
        for(int i=0; i<log.size(); i++){
            int betValue = log.get(i)[1];
            values[betValue-2]++;
        }
        
        int maxValue = 2;
        int maxCount = values[0];

        for(int i=1; i<=4; i++){
            if (values[i]>maxCount){
                maxValue = i+2;
                maxCount = values[i];
            }
        }
        return maxValue;
    }
    
    public int getLength(){
        return log.size();
    }
    
    public int getValueCount(int value){
        int count=0;
        for(int i=0; i<log.size(); i++){
            int betValue = log.get(i)[1];
            if (betValue == value)
                count++;
        }
        return count;
    }
}
