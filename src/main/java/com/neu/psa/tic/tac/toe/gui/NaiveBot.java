/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.psa.tic.tac.toe.gui;

import com.neu.psa.tic.tac.toe.game.EasyMenace;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.UIManager;

/**
 *
 * @author vidhi
 */
public class NaiveBot extends javax.swing.JPanel implements ActionListener {

    JButton[] buttons = new JButton[9];
    boolean player1_turn = true;

    /**
     * Creates new form NaiveBotPanel
     */
    public NaiveBot() {
        initComponents();
        createGridButtons();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamePanel = new java.awt.Panel();
        statusPanel = new javax.swing.JPanel();
        textField = new javax.swing.JTextField();

        gamePanel.setBackground(new java.awt.Color(0, 0, 0));
        gamePanel.setPreferredSize(new java.awt.Dimension(800, 600));
        gamePanel.setLayout(new java.awt.GridLayout(3, 3));

        textField.setEditable(false);
        textField.setBackground(new java.awt.Color(0, 0, 0));
        textField.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        textField.setForeground(new java.awt.Color(255, 102, 255));
        textField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField.setText("Game Status");
        textField.setDisabledTextColor(new java.awt.Color(255, 102, 255));
        textField.setOpaque(true);
        textField.setPreferredSize(new java.awt.Dimension(800, 800));
        textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanelLayout.createSequentialGroup()
                .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
            .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldActionPerformed

    private void createGridButtons() {
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            gamePanel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setBackground(Color.BLACK);
            buttons[i].setOpaque(true);
            buttons[i].setBorderPainted(false);
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        firstTurn();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Panel gamePanel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1_turn) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(255, 0, 0));             
                        buttons[i].setText("X");
                        buttons[i].setEnabled(false);
                        buttons[i].setBackground(Color.BLACK);
                        buttons[i].setContentAreaFilled(false);
                        buttons[i].setBorderPainted(false);
                        buttons[i].setOpaque(true);
                        player1_turn = false;
                        textField.setText("O turn");
                       
                        check();
                        checkfordraw();
                    }

                    if (!boardFull()) {
                        System.out.println(boardFull());
                        EasyMenace eM = new EasyMenace();
                        int index = eM.easyMove(buttons);
                        
                        check();
                        checkfordraw();
                        if (buttons[index].getText() == "") {
                            check();
                            checkfordraw();
                            buttons[index].setForeground(new Color(0, 0, 255));
                            buttons[index].setText("O");
                            buttons[index].setEnabled(false);                       
                            buttons[index].setBackground(Color.BLACK);
                            buttons[index].setContentAreaFilled(false);
                            buttons[index].setBorderPainted(false);
                            buttons[index].setOpaque(true);
                            player1_turn = true;
                            textField.setText("X turn");
                            System.out.println(index);
                            check();
                            checkfordraw();
                        }

                    }
                    check();
                    checkfordraw();

                }
            }
        }
    }

    public boolean check() {
        //check X win conditions
        if ((buttons[0].getText() == "X")
                && (buttons[1].getText() == "X")
                && (buttons[2].getText() == "X")) {
            xWins(0, 1, 2);
            return true;
        }
        if ((buttons[3].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[5].getText() == "X")) {
            xWins(3, 4, 5);
            return true;
        }
        if ((buttons[6].getText() == "X")
                && (buttons[7].getText() == "X")
                && (buttons[8].getText() == "X")) {
            xWins(6, 7, 8);
            return true;
        }
        if ((buttons[0].getText() == "X")
                && (buttons[3].getText() == "X")
                && (buttons[6].getText() == "X")) {
            xWins(0, 3, 6);
            return true;
        }
        if ((buttons[1].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[7].getText() == "X")) {
            xWins(1, 4, 7);
            return true;
        }
        if ((buttons[2].getText() == "X")
                && (buttons[5].getText() == "X")
                && (buttons[8].getText() == "X")) {
            xWins(2, 5, 8);
            return true;
        }
        if ((buttons[0].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[8].getText() == "X")) {
            xWins(0, 4, 8);
            return true;
        }
        if ((buttons[2].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[6].getText() == "X")) {
            xWins(2, 4, 6);
            return true;
        }
        //check O win conditions
        if ((buttons[0].getText() == "O")
                && (buttons[1].getText() == "O")
                && (buttons[2].getText() == "O")) {
            oWins(0, 1, 2);
            return true;
        }
        if ((buttons[3].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[5].getText() == "O")) {
            oWins(3, 4, 5);
            return true;
        }
        if ((buttons[6].getText() == "O")
                && (buttons[7].getText() == "O")
                && (buttons[8].getText() == "O")) {
            oWins(6, 7, 8);
            return true;
        }
        if ((buttons[0].getText() == "O")
                && (buttons[3].getText() == "O")
                && (buttons[6].getText() == "O")) {
            oWins(0, 3, 6);
            return true;
        }
        if ((buttons[1].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[7].getText() == "O")) {
            oWins(1, 4, 7);
            return true;
        }
        if ((buttons[2].getText() == "O")
                && (buttons[5].getText() == "O")
                && (buttons[8].getText() == "O")) {
            oWins(2, 5, 8);
            return true;
        }
        if ((buttons[0].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[8].getText() == "O")) {
            oWins(0, 4, 8);
            return true;
        }
        if ((buttons[2].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[6].getText() == "O")) {
            oWins(2, 4, 6);
            return true;
        } else {
            return false;
        }
    }

    public void checkfordraw() {
        if ((buttons[0].getText() != "")
                && (buttons[1].getText() != "")
                && (buttons[2].getText() != "")
                && (buttons[3].getText() != "")
                && (buttons[4].getText() != "")
                && (buttons[5].getText() != "")
                && (buttons[6].getText() != "")
                && (buttons[7].getText() != "")
                && (buttons[8].getText() != "")
                && (check() == false)) {

            itsdraw();
        }
    }

    public void xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }

        textField.setText("X wins");
    }

    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }

        textField.setText("O wins");
    }

    public void itsdraw() {
        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }

        textField.setText("Its a Draw");
    }

    public boolean boardFull() {
        int i;
        int a = 0;
        for (i = 0; i < 9; i++) {
            if (buttons[i].getText() != "") {
                a++;
  
            }
            
        }
        if (a == 9) {
            System.out.println(a);
            return true;
        }

        return false;
    }

    public void firstTurn() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
