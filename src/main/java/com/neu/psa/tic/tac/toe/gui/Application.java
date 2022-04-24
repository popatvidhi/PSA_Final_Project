package com.neu.psa.tic.tac.toe.gui;

import com.neu.psa.tic.tac.toe.game.HumanStrategy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vidhi
 */
public class Application extends javax.swing.JFrame {

    /**
     * Creates new form Applications
     */
    public Application() {
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

        JPanel = new javax.swing.JPanel();
        splitPane = new javax.swing.JSplitPane();
        titlePanel = new javax.swing.JPanel();
        textField = new javax.swing.JTextField();
        gamePanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        btnEasy = new javax.swing.JButton();
        btnHard = new javax.swing.JButton();
        btnTrain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel.setBackground(new java.awt.Color(0, 0, 0));

        splitPane.setBackground(new java.awt.Color(0, 0, 0));
        splitPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        splitPane.setMinimumSize(new java.awt.Dimension(300, 300));

        titlePanel.setBackground(new java.awt.Color(0, 0, 0));
        titlePanel.setToolTipText("");

        textField.setEditable(false);
        textField.setBackground(new java.awt.Color(0, 0, 0));
        textField.setFont(new java.awt.Font("Helvetica Neue", 3, 120)); // NOI18N
        textField.setForeground(new java.awt.Color(102, 102, 255));
        textField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textField.setText("Tic Tac Toe");
        textField.setCaretColor(new java.awt.Color(0, 0, 204));
        textField.setDisabledTextColor(new java.awt.Color(255, 102, 255));
        textField.setEnabled(false);
        textField.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textField, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        splitPane.setTopComponent(titlePanel);

        gamePanel.setBackground(new java.awt.Color(0, 0, 0));
        gamePanel.setPreferredSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(gamePanel);

        buttonPanel.setBackground(new java.awt.Color(0, 0, 0));
        buttonPanel.setPreferredSize(new java.awt.Dimension(162, 68));
        buttonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEasy.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        btnEasy.setText("Easy");
        btnEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEasyActionPerformed(evt);
            }
        });
        buttonPanel.add(btnEasy, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 130, 50));

        btnHard.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        btnHard.setText("Hard");
        btnHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardActionPerformed(evt);
            }
        });
        buttonPanel.add(btnHard, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 150, 50));

        btnTrain.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        btnTrain.setText("Train");
        btnTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainActionPerformed(evt);
            }
        });
        buttonPanel.add(btnTrain, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 140, 50));

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEasyActionPerformed
        // TODO add your handling code here:
        NaiveBot naive = new NaiveBot();
        splitPane.setRightComponent(naive);
    }//GEN-LAST:event_btnEasyActionPerformed

    private void btnHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHardActionPerformed
        // TODO add your handling code here:
        TrainBot train = new TrainBot();
        splitPane.setRightComponent(train);
        
    }//GEN-LAST:event_btnHardActionPerformed

    private void btnTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainActionPerformed
        // TODO add your handling code here:
        HumanStrategy human = new HumanStrategy();
//        splitPane.setRightComponent(human);
    }//GEN-LAST:event_btnTrainActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton btnEasy;
    private javax.swing.JButton btnHard;
    private javax.swing.JButton btnTrain;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JSplitPane splitPane;
    public javax.swing.JTextField textField;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
