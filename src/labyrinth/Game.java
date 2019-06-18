/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labyrinth;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Thread.sleep;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author k256
 */
public class Game extends javax.swing.JFrame {
Tools tools;
Timer timerUp;
Timer timerDown;
ActionListener tLeft;

 public TipsMenu tipsMenu;
    public Win winFrame;
    public NoTime noTimeFrame;
    public MusicSet ms;
    int timeLeft,timePassed;

   ActionListener tPassed = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
               timePassed+=1;   
               timeLab.setText("TIME PASSED: "+((timePassed/60)>9?"":"0")+(timePassed/60)+":"+((timePassed%60)>9?"":"0")+(timePassed%60));
    }

           };

    /**
     * Creates new form Game
     */
    public Game(Tools t) {
        tools=t;
        initComponents();
         tipsMenu= new TipsMenu(tools);
         winFrame = new Win(tools);
       ms = new MusicSet(tools);
        noTimeFrame = new NoTime(tools);
        noTimeFrame.setVisible(false);
       tLeft = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               timeLeft-=1;
              tLeftLab.setText("TIME LEFT: "+((timeLeft/60)>9?"":"0")+(timeLeft/60)+":"+((timeLeft%60)>9?"":"0")+(timeLeft%60));
             if(timeLeft==0){ noTimeFrame.setVisible(true);
                 setEnabled(false);}
            }  
            };
      timerUp = new Timer(1000,tPassed);
      timerDown = new Timer(1000,tLeft);
      timerUp.setInitialDelay(0);
      timerDown.setInitialDelay(0);
      
      tipsMenu.setVisible(false);
      jPanel2.requestFocus();
      ((LabirinthPanel) jPanel2).height =Toolkit.getDefaultToolkit().getScreenSize().height-jPanel1.getHeight()-30;
        
    }
 public void newGame(){
     setEnabled(true);
       timePassed=0; 
        ((LabirinthPanel) jPanel2).regenerate();
        timePassed=0;
        timeLeft = tools.getTimeLeft();
       timerUp.start();
       if(tools.onTime) {
           timerDown.start();
           tLeftLab.setVisible(true);
       }
       else{ timerDown.stop();tLeftLab.setVisible(false);}
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tLeftLab = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        timeLab = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        settingsBut = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        coinsLab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new LabirinthPanel(tools);

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setPreferredSize(new java.awt.Dimension(500, 534));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 800));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 70));

        tLeftLab.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 18)); // NOI18N
        tLeftLab.setForeground(new java.awt.Color(255, 255, 255));
        tLeftLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/timer.png"))); // NOI18N
        tLeftLab.setText("TIME LEFT");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/lamp.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        timeLab.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 18)); // NOI18N
        timeLab.setForeground(new java.awt.Color(255, 255, 255));
        timeLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/watch.png"))); // NOI18N
        timeLab.setText("TIME");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/retreat.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        settingsBut.setBackground(new java.awt.Color(0, 0, 0));
        settingsBut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu.png"))); // NOI18N
        settingsBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        coinsLab.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 0, 18)); // NOI18N
        coinsLab.setForeground(new java.awt.Color(255, 255, 255));
        coinsLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/coin.png"))); // NOI18N
        coinsLab.setText("COINS: "+tools.coins);
        coinsLab.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tLeftLab, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLab, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coinsLab, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settingsBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tLeftLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coinsLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 534));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1122, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       newGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       tools.main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   ( (TipsMenu) tipsMenu).oneBlockBut.setEnabled(true);
     ( (TipsMenu) tipsMenu).correctLabBut.setEnabled(true);
        if(tools.coins<15){
        ( (TipsMenu) tipsMenu).correctLabBut.setEnabled(false);
        if(tools.coins<5)
            ( (TipsMenu) tipsMenu).oneBlockBut.setEnabled(false);
    }
        tipsMenu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void settingsButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButActionPerformed
     ms.setVisible(true);
    }//GEN-LAST:event_settingsButActionPerformed
    public void finishGame() throws InterruptedException{
        timerUp.stop();
        tools.addWinner();
            if(tools.onTime)timerDown.stop();
           int coins;
            if(tools.level==1)
            {
                tools.setCoins(tools.coins+=5);
                coins = 5;
            }
            else if(tools.level==2)
            {
                tools.setCoins(tools.coins+=7);
                coins = 7;
            }
            else 
            {
                tools.setCoins(tools.coins+=10);
                coins=10;
            }
             winFrame.setVisible(true);
            ( (Win) winFrame ).winLab.setText("You`ve won "+coins+" coins");
             coinsLab.setText("COINS: "+tools.coins);
             this.setEnabled(false);
                 
           
    }
    public void exit(){
    tipsMenu.dispose();
    winFrame.dispose();
    noTimeFrame.dispose();
    ms.dispose();
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel coinsLab;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton settingsBut;
    public javax.swing.JLabel tLeftLab;
    public javax.swing.JLabel timeLab;
    // End of variables declaration//GEN-END:variables
   

}
