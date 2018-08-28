/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liarsdice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.*;
import java.util.*;
import java.util.Random;
import javax.swing.JRadioButton;
import java.util.Timer;
import javax.swing.JLabel;
import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

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
        JFXPanel fxPanel = new JFXPanel();
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
        jPanel12 = new javax.swing.JPanel();
        cpuContainer = new javax.swing.JPanel();
        cpuPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cpuBet1 = new javax.swing.JLabel();
        cpuCup1 = new javax.swing.JLabel();
        cpuDicePanel1 = new javax.swing.JPanel();
        cpuDie11 = new javax.swing.JLabel();
        cpuDie12 = new javax.swing.JLabel();
        cpuDie13 = new javax.swing.JLabel();
        cpuDie14 = new javax.swing.JLabel();
        cpuDie15 = new javax.swing.JLabel();
        cpuPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        cpuBet2 = new javax.swing.JLabel();
        cpuCup2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cpuBet3 = new javax.swing.JLabel();
        cpuCup3 = new javax.swing.JLabel();
        parrotPanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        parrotTalk = new javax.swing.JLabel();
        bubble = new javax.swing.JLabel();
        parrot = new javax.swing.JLabel();
        playerDicePanel = new javax.swing.JPanel();
        playerBet = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        die1 = new javax.swing.JLabel();
        die2 = new javax.swing.JLabel();
        die3 = new javax.swing.JLabel();
        die4 = new javax.swing.JLabel();
        die5 = new javax.swing.JLabel();
        playerControlPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        betSpinner = new javax.swing.JSpinner();
        jPanel9 = new javax.swing.JPanel();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();
        radio5 = new javax.swing.JRadioButton();
        radio6 = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        lieButton = new javax.swing.JButton();
        newRoundButton = new javax.swing.JButton();
        betButton = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Liar's Dice");
        setMinimumSize(new java.awt.Dimension(1280, 1000));
        setPreferredSize(new java.awt.Dimension(1280, 1000));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.Y_AXIS));

        cpuContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        cpuContainer.setOpaque(false);
        cpuContainer.setLayout(new java.awt.BorderLayout());

        cpuPanel1.setOpaque(false);
        cpuPanel1.setLayout(new javax.swing.BoxLayout(cpuPanel1, javax.swing.BoxLayout.X_AXIS));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/angler.png"))); // NOI18N
        jLabel2.setAlignmentX(0.5F);
        jPanel4.add(jLabel2);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        cpuBet1.setText("No Bet");
        cpuBet1.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        jPanel5.add(cpuBet1);

        cpuCup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5cup.png"))); // NOI18N
        jPanel5.add(cpuCup1);

        jPanel4.add(jPanel5);

        cpuPanel1.add(jPanel4);

        cpuDicePanel1.setOpaque(false);
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

        cpuPanel2.setOpaque(false);
        cpuPanel2.setLayout(new javax.swing.BoxLayout(cpuPanel2, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.PAGE_AXIS));

        cpuBet2.setText("No Bet");
        cpuBet2.setAlignmentX(0.5F);
        cpuBet2.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        jPanel7.add(cpuBet2);

        cpuCup2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5cup.png"))); // NOI18N
        cpuCup2.setAlignmentX(0.5F);
        jPanel7.add(cpuCup2);

        jPanel6.add(jPanel7);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jones.png"))); // NOI18N
        jLabel3.setAlignmentX(0.5F);
        jPanel6.add(jLabel3);

        cpuPanel2.add(jPanel6);

        cpuDicePanel3.setOpaque(false);
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

        cpuPanel3.setOpaque(false);
        cpuPanel3.setLayout(new javax.swing.BoxLayout(cpuPanel3, javax.swing.BoxLayout.X_AXIS));

        cpuDicePanel2.setOpaque(false);
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

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maccus.png"))); // NOI18N
        jLabel1.setAlignmentX(0.5F);
        jPanel2.add(jLabel1);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        cpuBet3.setText("No Bet");
        cpuBet3.setAlignmentX(0.5F);
        cpuBet3.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        jPanel3.add(cpuBet3);

        cpuCup3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5cup.png"))); // NOI18N
        jPanel3.add(cpuCup3);

        jPanel2.add(jPanel3);

        cpuPanel3.add(jPanel2);

        cpuContainer.add(cpuPanel3, java.awt.BorderLayout.EAST);

        parrotPanel.setOpaque(false);
        parrotPanel.setLayout(new java.awt.GridLayout(1, 2));

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new javax.swing.OverlayLayout(jPanel11));

        parrotTalk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parrotTalk.setText("<html><body>SQUAK!<br>Welcome to Liars Dice!<br>Your turn to place a bet!<br>SQUAWK!</body></html>");
        parrotTalk.setAlignmentX(0.5F);
        parrotTalk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel11.add(parrotTalk);

        bubble.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bubble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/speechbubbletr.png"))); // NOI18N
        bubble.setAlignmentX(0.5F);
        jPanel11.add(bubble);

        parrotPanel.add(jPanel11);

        parrot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parrot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/parrot.png"))); // NOI18N
        parrot.setAlignmentX(0.5F);
        parrot.setAlignmentY(1.0F);
        parrotPanel.add(parrot);

        cpuContainer.add(parrotPanel, java.awt.BorderLayout.CENTER);

        jPanel12.add(cpuContainer);

        playerDicePanel.setOpaque(false);
        playerDicePanel.setLayout(new javax.swing.BoxLayout(playerDicePanel, javax.swing.BoxLayout.PAGE_AXIS));

        playerBet.setText("No Bet");
        playerBet.setAlignmentX(0.5F);
        playerBet.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        playerDicePanel.add(playerBet);

        jPanel1.setOpaque(false);
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

        jPanel12.add(playerDicePanel);

        playerControlPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(6, 6, 6, 6));
        playerControlPanel.setOpaque(false);
        playerControlPanel.setLayout(new javax.swing.BoxLayout(playerControlPanel, javax.swing.BoxLayout.LINE_AXIS));

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        betSpinner.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        betSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        betSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        betSpinner.setMinimumSize(new java.awt.Dimension(60, 40));
        betSpinner.setPreferredSize(new java.awt.Dimension(60, 40));
        betSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                betSpinnerStateChanged(evt);
            }
        });
        jPanel8.add(betSpinner);

        jPanel9.setOpaque(false);

        buttonGroup1.add(radio2);
        radio2.setText("Two's");
        jPanel9.add(radio2);

        buttonGroup1.add(radio3);
        radio3.setText("Three's");
        jPanel9.add(radio3);

        buttonGroup1.add(radio4);
        radio4.setText("Four's");
        jPanel9.add(radio4);

        buttonGroup1.add(radio5);
        radio5.setText("Five's");
        jPanel9.add(radio5);

        buttonGroup1.add(radio6);
        radio6.setText("Six's");
        radio6.setPreferredSize(new java.awt.Dimension(47, 50));
        jPanel9.add(radio6);

        jPanel8.add(jPanel9);

        playerControlPanel.add(jPanel8);

        jPanel10.setOpaque(false);

        lieButton.setText("Call Lie");
        lieButton.setPreferredSize(new java.awt.Dimension(100, 50));
        lieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lieButtonActionPerformed(evt);
            }
        });
        jPanel10.add(lieButton);

        newRoundButton.setText("Next Round");
        newRoundButton.setMaximumSize(new java.awt.Dimension(300, 23));
        newRoundButton.setPreferredSize(new java.awt.Dimension(100, 50));
        newRoundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRoundButtonActionPerformed(evt);
            }
        });
        jPanel10.add(newRoundButton);

        betButton.setText("Make Bet");
        betButton.setPreferredSize(new java.awt.Dimension(200, 50));
        betButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betButtonActionPerformed(evt);
            }
        });
        jPanel10.add(betButton);

        playerControlPanel.add(jPanel10);

        jPanel12.add(playerControlPanel);

        getContentPane().add(jPanel12);

        jPanel13.setLayout(null);
        getContentPane().add(jPanel13);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void startGame(gameState a){
        state = a;
        state.getPlayers().get(0).setDiceImages(new javax.swing.JLabel[]{die1,die2,die3,die4,die5});
        state.getPlayers().get(1).setDiceImages(new javax.swing.JLabel[]{cpuDie11,cpuDie12,cpuDie13,cpuDie14,cpuDie15});
        state.getPlayers().get(2).setDiceImages(new javax.swing.JLabel[]{cpuDie21,cpuDie22,cpuDie23,cpuDie24,cpuDie25});
        state.getPlayers().get(3).setDiceImages(new javax.swing.JLabel[]{cpuDie31,cpuDie32,cpuDie33,cpuDie34,cpuDie35});

        state.getPlayers().get(1).setCupImage(cpuCup1);
        state.getPlayers().get(2).setCupImage(cpuCup2);
        state.getPlayers().get(3).setCupImage(cpuCup3);
        newRoundButton.setVisible(false);
        
        betSpinner.getComponent(0).setPreferredSize(new Dimension(40,40));
        betSpinner.getComponent(1).setPreferredSize(new Dimension(40,40)); 
        
        

        rollDice();
    }
    
    public void updateBetLimits(int count, int value){
        if(value == 6 || state.isEndState())
            count++;
        if (state.isEndState()){
            if (count>state.totalDice*6)
                count=state.totalDice*6;
            betSpinner.setModel(new javax.swing.SpinnerNumberModel(count, count, state.totalDice*6, 1));
        }
        else{
            if (count>state.totalDice)
                count=state.totalDice;
            betSpinner.setModel(new javax.swing.SpinnerNumberModel(count, count, state.totalDice, 1));
        }
        disableRadioButtons();
    }
    
    private void playSound(String bip){
        String sound = getClass().getResource(bip).toString();
        
        try{
            Media hit = new Media(sound);
            MediaPlayer mediaPlayer = new MediaPlayer(hit);
            mediaPlayer.play();
        }
        catch(Exception e){
            System.out.print("Sound not played: ");
            System.out.println(e.getMessage());
        }        
    }
            
    public void rollDice(){
        playSound("/diceroll.mp3");
        
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
        if (betValue<0)
            betLabels[player].setText("Player calls Lie!");
        else if (betValue==0)
            betLabels[player].setText("Player bets at least " +betCount +" dots.");
        else
            betLabels[player].setText("Player bets " +betCount +" " +betValue +"'s");
    }
    
    private void makeBet(int player, int betCount, int betValue){
        updateBetText(state.nextPlayer, betCount,betValue);
                    
        if (betCount<0 && betValue<0){
            callLie();
        }
        else{
            state.betHistory.logBet(new int[]{betCount, betValue});
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
        
        if (betValue == 0 && !state.isEndState()){
            for(JRadioButton b : radioButtons){
                b.setFont(clickmeFont);
                b.setForeground(Color.red);
            }
        }
        
        else{
            int betCount = (int)betSpinner.getValue();
            
            makeBet(0, betCount, betValue);
            
            for(JRadioButton b : radioButtons){
                b.setFont(defaultFont);
                b.setForeground(Color.black);
            }
        } 
    }//GEN-LAST:event_betButtonActionPerformed

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
    
    private void highlightDice(boolean enough){
        
        if (state.isEndState())
            return;
        
        javax.swing.ImageIcon dieX, a, b, c, d, e, f;
        if (enough){
            dieX = new javax.swing.ImageIcon(getClass().getResource("/d0.png")); a = new javax.swing.ImageIcon(getClass().getResource("/d1g.png")); b = new javax.swing.ImageIcon(getClass().getResource("/d2g.png")); c = new javax.swing.ImageIcon(getClass().getResource("/d3g.png")); d = new javax.swing.ImageIcon(getClass().getResource("/d4g.png")); e = new javax.swing.ImageIcon(getClass().getResource("/d5g.png")); f = new javax.swing.ImageIcon(getClass().getResource("/d6g.png"));
        }
        else{
            dieX = new javax.swing.ImageIcon(getClass().getResource("/d0.png")); a = new javax.swing.ImageIcon(getClass().getResource("/d1h.png")); b = new javax.swing.ImageIcon(getClass().getResource("/d2h.png")); c = new javax.swing.ImageIcon(getClass().getResource("/d3h.png")); d = new javax.swing.ImageIcon(getClass().getResource("/d4h.png")); e = new javax.swing.ImageIcon(getClass().getResource("/d5h.png")); f = new javax.swing.ImageIcon(getClass().getResource("/d6h.png"));
        }
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
    
    private void showRoundResults(boolean endState, boolean enough, int[] count, int callie, int caller){
        int realCount = count[0];
        int realValue = count[1];
        
        String callerName="";
        String callieName="";
        String output="<html><body>";

        output += "SQUAWK!<br>";
        
        if (callie>0)
            output += "Player " +Integer.toString(callie) +" is ";
        else
            output += "You are ";
        
        if(enough)
            output += "NOT";
        
        output += " a liar!<br>";
        output += "There are ";
        
        if(!enough)
            output+="only ";
        
        if (endState)
            output+=(count[0] +" dots! <br>");
        else
            output+=(count[0] +" " +count[1] +"'s<br>");
        
        output += "SQUAWK!<br>";
        
        output += "</body></html>";
        
        parrotTalk.setText(output);
    }
    
    private void endRound(){
        betButton.setVisible(false);
        lieButton.setVisible(false);
        newRoundButton.setVisible(true);
        int betCount = state.getBetCount();
        int betValue = state.getBetValue();
        
        Player caller = state.getPlayers().get(state.getNextPlayer());
        int x;
        if (state.getNextPlayer() == 0){
            x = state.getPlayers().size()-1;
            while(state.getPlayers().get(x).active==false){
                x--;
            }
        }
        else{
            x = state.getNextPlayer()-1;
            while(state.getPlayers().get(x).active==false){
                x--;
            }
        }
        Player callie = state.getPlayers().get(x);
        
        boolean enoughDice = state.checkBet(betCount, betValue);
        highlightDice(enoughDice);
        showRoundResults(state.isEndState(), enoughDice, state.getRealCount(betValue), x, state.getNextPlayer());
        
        for(Player p : state.getPlayers()){
            int[] values = p.getDiceValues();
            System.out.print("Player: ");
            for(int i=0; i<values.length; i++)
                System.out.print(values[i]);
            System.out.println("");
        }
        
        if (enoughDice){
            caller.loseDie();
            System.out.println("Caller loses");
        }
        else{
            callie.loseDie(); 
            System.out.println("Callie loses");
        }
        
        System.out.println("The caller is player " +state.getNextPlayer());
        System.out.println("The person being called on is player " +x);
        
        if(state.checkPlayerWin()){
            WinScreen screen = new WinScreen();
            screen.setVisible(true);
            this.dispose();
        }
        else if (state.checkPlayerLose()){
            LoseScreen screen = new LoseScreen();
            screen.setVisible(true);
            this.dispose();
        }
    }
    
    private void updateCupImages(){
        javax.swing.ImageIcon a = new javax.swing.ImageIcon(getClass().getResource("/0cup.png")); javax.swing.ImageIcon b = new javax.swing.ImageIcon(getClass().getResource("/1cup.png")); javax.swing.ImageIcon c = new javax.swing.ImageIcon(getClass().getResource("/2cup.png"));javax.swing.ImageIcon d = new javax.swing.ImageIcon(getClass().getResource("/3cup.png"));javax.swing.ImageIcon e = new javax.swing.ImageIcon(getClass().getResource("/4cup.png"));javax.swing.ImageIcon f = new javax.swing.ImageIcon(getClass().getResource("/5cup.png"));
        javax.swing.ImageIcon[] cupImages = new javax.swing.ImageIcon[]{a,b,c,d,e,f};
               
        for (Player p : state.getPlayers()){
            int diceCount = p.getDiceCount();
            javax.swing.ImageIcon cup = cupImages[diceCount];
            p.updateCupImage(cup);
        }
    }
    
    private void lieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lieButtonActionPerformed
        callLie();
    }//GEN-LAST:event_lieButtonActionPerformed

    private void callLie(){
        showDice();
        endRound();
    }
    
    private void setParrotText(String text){
        String output="<html><body>SQUAWK!<br>";

        output+=text;
        if(state.isEndState())
            output+="<br>Someone has only one die!";
        output+="<br>SQUAWK!";
        
        output += "</body></html>";
        
        parrotTalk.setText(output);
    }
    
    private void newRoundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRoundButtonActionPerformed
        betButton.setVisible(true);
        lieButton.setVisible(true);
        newRoundButton.setVisible(false);
        hideDice();
        resetBetText();
        state.iteratePlayer();
        state.reset();
        updateBetLimits(0,0);
        updateCupImages();
        setParrotText("There are " +state.getDice() +" dice left!");
        rollDice();
        if (state.getNextPlayer()>0){
            waitForBets();
            scheduleBet(state.getNextPlayer());
        }
        else   
            stopWaiting();
            
    }//GEN-LAST:event_newRoundButtonActionPerformed

    private void disableRadioButtons(){
        int value = (int)betSpinner.getValue();
        ArrayList<javax.swing.JRadioButton> radioButtons = new ArrayList<>(
            Arrays.asList(radio2,radio3,radio4,radio5,radio6));
        
        if(state.isEndState()){
            for (javax.swing.JRadioButton button : radioButtons){
                button.getModel().setEnabled(false);
                buttonGroup1.clearSelection();
            }
            return;
        }
        
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
    }
    
    private void betSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_betSpinnerStateChanged
        disableRadioButtons();
    }//GEN-LAST:event_betSpinnerStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton betButton;
    private javax.swing.JSpinner betSpinner;
    private javax.swing.JLabel bubble;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton lieButton;
    private javax.swing.JButton newRoundButton;
    private javax.swing.JLabel parrot;
    private javax.swing.JPanel parrotPanel;
    private javax.swing.JLabel parrotTalk;
    private javax.swing.JLabel playerBet;
    private javax.swing.JPanel playerControlPanel;
    private javax.swing.JPanel playerDicePanel;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JRadioButton radio5;
    private javax.swing.JRadioButton radio6;
    // End of variables declaration//GEN-END:variables
}
