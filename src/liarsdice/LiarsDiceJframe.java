/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarsdice;
import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.util.*;
import java.util.Random;
import javax.swing.JRadioButton;
import java.util.Timer;
import javax.swing.JLabel;

/**
 *
 * @author Computer
 */
public class LiarsDiceJframe extends javax.swing.JFrame {

    gameState state;
    /**
     * Creates new form LiarsDiceJframe
     */
    public LiarsDiceJframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        testlabel = new javax.swing.JLabel();
        cpuContainer = new javax.swing.JPanel();
        cpuPanel1 = new javax.swing.JPanel();
        cpuCup1 = new javax.swing.JLabel();
        cpuBet1 = new javax.swing.JLabel();
        cpuDicePanel1 = new javax.swing.JPanel();
        cpuDie11 = new javax.swing.JLabel();
        cpuDie12 = new javax.swing.JLabel();
        cpuDie13 = new javax.swing.JLabel();
        cpuDie14 = new javax.swing.JLabel();
        cpuDie15 = new javax.swing.JLabel();
        cpuPanel2 = new javax.swing.JPanel();
        cpuCup2 = new javax.swing.JLabel();
        cpuBet2 = new javax.swing.JLabel();
        cpuDicePanel3 = new javax.swing.JPanel();
        cpuDie21 = new javax.swing.JLabel();
        cpuDie22 = new javax.swing.JLabel();
        cpuDie23 = new javax.swing.JLabel();
        cpuDie24 = new javax.swing.JLabel();
        cpuDie25 = new javax.swing.JLabel();
        cpuPanel3 = new javax.swing.JPanel();
        cpuDicePanel2 = new javax.swing.JPanel();
        cpuDie31 = new javax.swing.JLabel();
        cpuDie32 = new javax.swing.JLabel();
        cpuDie33 = new javax.swing.JLabel();
        cpuDie34 = new javax.swing.JLabel();
        cpuDie35 = new javax.swing.JLabel();
        cpuBet3 = new javax.swing.JLabel();
        cpuCup3 = new javax.swing.JLabel();
        playerDicePanel = new javax.swing.JPanel();
        playerBet = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        die1 = new javax.swing.JLabel();
        die2 = new javax.swing.JLabel();
        die3 = new javax.swing.JLabel();
        die4 = new javax.swing.JLabel();
        die5 = new javax.swing.JLabel();
        playerControlPanel = new javax.swing.JPanel();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();
        radio5 = new javax.swing.JRadioButton();
        radio6 = new javax.swing.JRadioButton();
        betSlider = new javax.swing.JSlider();
        lieButton = new javax.swing.JButton();
        betButton = new javax.swing.JButton();
        newRoundButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Liar's Dice");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        testlabel.setText("Liars Dice");
        getContentPane().add(testlabel);

        cpuContainer.setLayout(new java.awt.BorderLayout());

        cpuPanel1.setLayout(new javax.swing.BoxLayout(cpuPanel1, javax.swing.BoxLayout.X_AXIS));

        cpuCup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5cup.png"))); // NOI18N
        cpuPanel1.add(cpuCup1);

        cpuBet1.setText("No Bet");
        cpuBet1.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        cpuPanel1.add(cpuBet1);

        cpuDicePanel1.setLayout(new javax.swing.BoxLayout(cpuDicePanel1, javax.swing.BoxLayout.PAGE_AXIS));

        cpuDie11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel1.add(cpuDie11);

        cpuDie12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel1.add(cpuDie12);

        cpuDie13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel1.add(cpuDie13);

        cpuDie14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel1.add(cpuDie14);

        cpuDie15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel1.add(cpuDie15);

        cpuPanel1.add(cpuDicePanel1);

        cpuContainer.add(cpuPanel1, java.awt.BorderLayout.WEST);

        cpuPanel2.setLayout(new javax.swing.BoxLayout(cpuPanel2, javax.swing.BoxLayout.Y_AXIS));

        cpuCup2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5cup.png"))); // NOI18N
        cpuCup2.setAlignmentX(0.5F);
        cpuPanel2.add(cpuCup2);

        cpuBet2.setText("No Bet");
        cpuBet2.setAlignmentX(0.5F);
        cpuBet2.setAlignmentY(0.0F);
        cpuBet2.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        cpuPanel2.add(cpuBet2);

        cpuDicePanel3.setLayout(new javax.swing.BoxLayout(cpuDicePanel3, javax.swing.BoxLayout.LINE_AXIS));

        cpuDie21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel3.add(cpuDie21);

        cpuDie22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel3.add(cpuDie22);

        cpuDie23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel3.add(cpuDie23);

        cpuDie24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel3.add(cpuDie24);

        cpuDie25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel3.add(cpuDie25);

        cpuPanel2.add(cpuDicePanel3);

        cpuContainer.add(cpuPanel2, java.awt.BorderLayout.NORTH);

        cpuPanel3.setLayout(new javax.swing.BoxLayout(cpuPanel3, javax.swing.BoxLayout.X_AXIS));

        cpuDicePanel2.setLayout(new javax.swing.BoxLayout(cpuDicePanel2, javax.swing.BoxLayout.PAGE_AXIS));

        cpuDie31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie31.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel2.add(cpuDie31);

        cpuDie32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie32.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel2.add(cpuDie32);

        cpuDie33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie33.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel2.add(cpuDie33);

        cpuDie34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie34.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel2.add(cpuDie34);

        cpuDie35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        cpuDie35.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cpuDicePanel2.add(cpuDie35);

        cpuPanel3.add(cpuDicePanel2);

        cpuBet3.setText("No Bet");
        cpuBet3.setAlignmentX(0.5F);
        cpuBet3.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        cpuPanel3.add(cpuBet3);

        cpuCup3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5cup.png"))); // NOI18N
        cpuPanel3.add(cpuCup3);

        cpuContainer.add(cpuPanel3, java.awt.BorderLayout.EAST);

        getContentPane().add(cpuContainer);

        playerDicePanel.setLayout(new javax.swing.BoxLayout(playerDicePanel, javax.swing.BoxLayout.PAGE_AXIS));

        playerBet.setText("No Bet");
        playerBet.setAlignmentX(0.5F);
        playerBet.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        playerDicePanel.add(playerBet);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        die1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        die1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(die1);

        die2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        die2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(die2);

        die3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        die3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(die3);

        die4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        die4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(die4);

        die5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d2.png"))); // NOI18N
        die5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(die5);

        playerDicePanel.add(jPanel1);

        getContentPane().add(playerDicePanel);

        buttonGroup1.add(radio2);
        radio2.setText("Two's");

        buttonGroup1.add(radio3);
        radio3.setText("Three's");

        buttonGroup1.add(radio4);
        radio4.setText("Four's");

        buttonGroup1.add(radio5);
        radio5.setText("Five's");
        radio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio6);
        radio6.setText("Six's");

        betSlider.setMajorTickSpacing(5);
        betSlider.setMaximum(20);
        betSlider.setMinorTickSpacing(1);
        betSlider.setPaintLabels(true);
        betSlider.setPaintTicks(true);
        betSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                betSliderStateChanged(evt);
            }
        });

        lieButton.setText("Call Lie");
        lieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lieButtonActionPerformed(evt);
            }
        });

        betButton.setText("Make Bet");
        betButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betButtonActionPerformed(evt);
            }
        });

        newRoundButton.setText("Next Round");
        newRoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRoundButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout playerControlPanelLayout = new javax.swing.GroupLayout(playerControlPanel);
        playerControlPanel.setLayout(playerControlPanelLayout);
        playerControlPanelLayout.setHorizontalGroup(
            playerControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerControlPanelLayout.createSequentialGroup()
                        .addComponent(radio2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio3, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio4, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radio6, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                    .addComponent(betSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(betButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(playerControlPanelLayout.createSequentialGroup()
                        .addComponent(newRoundButton, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lieButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        playerControlPanelLayout.setVerticalGroup(
            playerControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerControlPanelLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(playerControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerControlPanelLayout.createSequentialGroup()
                        .addGroup(playerControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio2)
                            .addComponent(radio3)
                            .addComponent(radio4)
                            .addComponent(radio5)
                            .addComponent(radio6))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerControlPanelLayout.createSequentialGroup()
                        .addGroup(playerControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lieButton)
                            .addComponent(newRoundButton))
                        .addGap(7, 7, 7)))
                .addGroup(playerControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(betSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(betButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(playerControlPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void startGame(gameState a){
        state = a;
        state.getPlayers().get(0).setDiceImages(new javax.swing.JLabel[]{die1,die2,die3,die4,die5});
        state.getPlayers().get(1).setDiceImages(new javax.swing.JLabel[]{cpuDie11,cpuDie12,cpuDie13,cpuDie14,cpuDie15});
        state.getPlayers().get(2).setDiceImages(new javax.swing.JLabel[]{cpuDie21,cpuDie22,cpuDie23,cpuDie24,cpuDie25});
        state.getPlayers().get(3).setDiceImages(new javax.swing.JLabel[]{cpuDie31,cpuDie32,cpuDie21,cpuDie34,cpuDie35});

        newRoundButton.setVisible(false);

        rollDice();
    }
    
    public void updateBetLimits(int count, int value){
        betSlider.setMinimum(count);
    }
        
    public void rollDice(){
        ArrayList<javax.swing.JLabel> dice = new ArrayList<>(
            Arrays.asList(die1, die2, die3, die4, die5));
        javax.swing.ImageIcon dieX = new javax.swing.ImageIcon(getClass().getResource("/d0.png")); javax.swing.ImageIcon a = new javax.swing.ImageIcon(getClass().getResource("/d1.png"));javax.swing.ImageIcon b = new javax.swing.ImageIcon(getClass().getResource("/d2.png"));javax.swing.ImageIcon c = new javax.swing.ImageIcon(getClass().getResource("/d3.png"));javax.swing.ImageIcon d = new javax.swing.ImageIcon(getClass().getResource("/d4.png"));javax.swing.ImageIcon e = new javax.swing.ImageIcon(getClass().getResource("/d5.png"));javax.swing.ImageIcon f = new javax.swing.ImageIcon(getClass().getResource("/d6.png"));
        javax.swing.ImageIcon[] images = new javax.swing.ImageIcon[]{dieX,a,b,c,d,e,f};
        cpuDicePanel1.setVisible(false);
        cpuDicePanel2.setVisible(false);
        cpuDicePanel3.setVisible(false);
                
        for (Player p:state.getPlayers()){
            p.Roll();
            int i=0;
            for(javax.swing.JLabel die : p.getDiceImages()){
                if (i<p.getDiceCount())
                    die.setIcon(images[p.getDiceValue(i)]);
                else
                    die.setIcon(dieX);
                i++;
            }
        }
    }
    
    private void scheduleBet(int player){
        int[] bet = state.getPlayerBet(player);
        
        System.out.println("player " +player +" bets " +bet[0] + " " +bet[1] +"s");
        makeBet(player, bet[0],bet[1]);
    }
    
    private void waitForBets(){
        betButton.setEnabled(false);
        lieButton.setEnabled(false);
    }
    
    private void stopWaiting(){
        betButton.setEnabled(true);
        lieButton.setEnabled(true);
    }
    
    private void resetBetText(){
        javax.swing.JLabel[] betLabels = new javax.swing.JLabel[]{playerBet, cpuBet1, cpuBet2, cpuBet3};
        for (int i=0; i<4; i++){
            betLabels[i].setText("No Bet");
        }
    }
    
    private void updateBetText(int player, int betCount, int betValue){
        javax.swing.JLabel[] betLabels = new javax.swing.JLabel[]{playerBet, cpuBet1, cpuBet2, cpuBet3};
        betLabels[player].setText("Player bets " +betCount +" " +betValue +"'s");
    }
    
    private void makeBet(int player, int betCount, int betValue){
        updateBetText(state.nextPlayer, betCount,betValue);
                    
        if (betCount<0 && betValue<0){
            callLie();
        }
        else{
            state.updateBet(betCount, betValue);
            updateBetLimits(betCount, betValue);
            if (player==0){
                waitForBets();
            }
            state.iteratePlayer();


            if (state.getNextPlayer() == 0)
                stopWaiting();
            else{
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    scheduleBet(state.getNextPlayer());
                }
              }, 1*1000);
            }
        }
    }
    
    private void betButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betButtonActionPerformed
        ArrayList<javax.swing.JRadioButton> radioButtons = new ArrayList<>(
            Arrays.asList(radio2,radio3,radio4,radio5,radio6));
        
        Font clickmeFont=new Font("Tahoma",Font.BOLD,radio2.getFont().getSize());
        Font defaultFont=new Font("Tahoma",Font.PLAIN,11);
                
        int betValue = dataConverter.getCountFromButton(buttonGroup1);
        
        if (betValue == 0){
            for(JRadioButton b : radioButtons){
                b.setFont(clickmeFont);
                b.setForeground(Color.red);
            }
        }
        
        else{
            int betCount = betSlider.getValue();
            
            System.out.println("total dice: " +state.getDice());
            System.out.println("betCount: " +betCount);
            System.out.println("betValue: " +betValue);

            makeBet(0, betCount, betValue);
            
            for(JRadioButton b : radioButtons){
                b.setFont(defaultFont);
                b.setForeground(Color.black);
            }
        }
        
        
    }//GEN-LAST:event_betButtonActionPerformed

    private void radio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio5ActionPerformed

    private void betSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_betSliderStateChanged
        
        int value = betSlider.getValue();
        ArrayList<javax.swing.JRadioButton> radioButtons = new ArrayList<>(
        Arrays.asList(radio2,radio3,radio4,radio5,radio6));
        if (state.getBetCount() == value){
            
            int i=2;
            for (javax.swing.JRadioButton button : radioButtons){
                if (i <= state.getBetValue()){
                    button.getModel().setEnabled(false);
                    buttonGroup1.clearSelection();
                }
                else{
                    button.getModel().setEnabled(true);
                }
                i++;
            }
        }
        else{
            for (javax.swing.JRadioButton button : radioButtons){
                 button.getModel().setEnabled(true);
            }
        }
    }//GEN-LAST:event_betSliderStateChanged

    private void showDice(){
        cpuDicePanel1.setVisible(true);
        cpuDicePanel2.setVisible(true);
        cpuDicePanel3.setVisible(true);
    }
    
    private void hideDice(){
        cpuDicePanel1.setVisible(false);
        cpuDicePanel2.setVisible(false);
        cpuDicePanel3.setVisible(false);
    }
    
    private void highlightDice(){
        javax.swing.ImageIcon dieX = new javax.swing.ImageIcon(getClass().getResource("/d0.png")); javax.swing.ImageIcon a = new javax.swing.ImageIcon(getClass().getResource("/d1h.png"));javax.swing.ImageIcon b = new javax.swing.ImageIcon(getClass().getResource("/d2h.png"));javax.swing.ImageIcon c = new javax.swing.ImageIcon(getClass().getResource("/d3h.png"));javax.swing.ImageIcon d = new javax.swing.ImageIcon(getClass().getResource("/d4h.png"));javax.swing.ImageIcon e = new javax.swing.ImageIcon(getClass().getResource("/d5h.png"));javax.swing.ImageIcon f = new javax.swing.ImageIcon(getClass().getResource("/d6h.png"));
        javax.swing.ImageIcon[] highlightedImages = new javax.swing.ImageIcon[]{dieX,a,b,c,d,e,f};
                
        for (Player p:state.getPlayers()){
            int i=0;
            for(javax.swing.JLabel die : p.getDiceImages()){
                if (i<p.getDiceCount() && (p.getDiceValue(i) == state.getBetValue() || p.getDiceValue(i) == 1))
                    die.setIcon(highlightedImages[p.getDiceValue(i)]);
                i++;
            }
        }
    }
    
    private void endRound(){
        betButton.setVisible(false);
        lieButton.setVisible(false);
        newRoundButton.setVisible(true);
        int betCount = state.getBetCount();
        int betValue = state.getBetValue();
        Player caller = state.getPlayers().get(state.getNextPlayer());
        int x;
        if (state.getNextPlayer() == 0)
            x = state.getPlayers().size()-1;
        else
            x = state.getNextPlayer()-1;
        Player callie = state.getPlayers().get(x);
        
        highlightDice();
        
        boolean enoughDice = state.checkBet(betCount, betValue);
        if (enoughDice)
            caller.loseDie();
        else
            callie.loseDie();
    }
    
    private void lieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lieButtonActionPerformed
        callLie();
    }//GEN-LAST:event_lieButtonActionPerformed

    private void callLie(){
        showDice();
        endRound();
    }
    
    private void newRoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRoundButtonActionPerformed
        betButton.setVisible(true);
        lieButton.setVisible(true);
        newRoundButton.setVisible(false);
        hideDice();
        resetBetText();
        state.reset();
        updateBetLimits(0,0);
        rollDice();
        scheduleBet(state.getNextPlayer());
    }//GEN-LAST:event_newRoundButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton betButton;
    private javax.swing.JSlider betSlider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cpuBet1;
    private javax.swing.JLabel cpuBet2;
    private javax.swing.JLabel cpuBet3;
    private javax.swing.JPanel cpuContainer;
    private javax.swing.JLabel cpuCup1;
    private javax.swing.JLabel cpuCup2;
    private javax.swing.JLabel cpuCup3;
    private javax.swing.JPanel cpuDicePanel1;
    private javax.swing.JPanel cpuDicePanel2;
    private javax.swing.JPanel cpuDicePanel3;
    private javax.swing.JLabel cpuDie11;
    private javax.swing.JLabel cpuDie12;
    private javax.swing.JLabel cpuDie13;
    private javax.swing.JLabel cpuDie14;
    private javax.swing.JLabel cpuDie15;
    private javax.swing.JLabel cpuDie21;
    private javax.swing.JLabel cpuDie22;
    private javax.swing.JLabel cpuDie23;
    private javax.swing.JLabel cpuDie24;
    private javax.swing.JLabel cpuDie25;
    private javax.swing.JLabel cpuDie31;
    private javax.swing.JLabel cpuDie32;
    private javax.swing.JLabel cpuDie33;
    private javax.swing.JLabel cpuDie34;
    private javax.swing.JLabel cpuDie35;
    private javax.swing.JPanel cpuPanel1;
    private javax.swing.JPanel cpuPanel2;
    private javax.swing.JPanel cpuPanel3;
    private javax.swing.JLabel die1;
    private javax.swing.JLabel die2;
    private javax.swing.JLabel die3;
    private javax.swing.JLabel die4;
    private javax.swing.JLabel die5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lieButton;
    private javax.swing.JButton newRoundButton;
    private javax.swing.JLabel playerBet;
    private javax.swing.JPanel playerControlPanel;
    private javax.swing.JPanel playerDicePanel;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JRadioButton radio5;
    private javax.swing.JRadioButton radio6;
    private javax.swing.JLabel testlabel;
    // End of variables declaration//GEN-END:variables
}
