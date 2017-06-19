/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import core.GameManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Fer
 */
public class GameOver extends javax.swing.JFrame {
    GameManager gameData;
    /**
     * Creates new form GameOver
     */
    public GameOver(GameManager gameData) {
         this.setResizable(false);
        initComponents();
        this.gameData = gameData;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelUserName1 = new javax.swing.JLabel();
        labelUserName2 = new javax.swing.JLabel();
        labelUserName3 = new javax.swing.JLabel();
        labelHighScore1 = new javax.swing.JLabel();
        labelHighScore2 = new javax.swing.JLabel();
        labelHighScore3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 48)); // NOI18N
        jLabel1.setText("Error");

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 16)); // NOI18N
        jLabel2.setText("Deseja uma Segunda Chance?");

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel3.setText("Os dados de seu computador foram perdidos porque sua participação");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel5.setText("do SimulaTM Operações Dimensionais foi interrompida.");

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel6.setText("Usuários");

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 14)); // NOI18N
        jLabel7.setText("Dias Trabalhando");

        labelUserName1.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        labelUserName1.setText("Usuários");

        labelUserName2.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        labelUserName2.setText("Usuários");

        labelUserName3.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        labelUserName3.setText("Usuários");

        labelHighScore1.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        labelHighScore1.setText("High Score");

        labelHighScore2.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        labelHighScore2.setText("High Score");

        labelHighScore3.setFont(new java.awt.Font("Lucida Sans", 0, 13)); // NOI18N
        labelHighScore3.setText("High Score");

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 16)); // NOI18N
        jLabel4.setText("Mural de Melhores Empreedendores");

        jLabel14.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel14.setText("A SimulaTM Operações Dimensionais está sempre de portas abertas para a");

        jLabel15.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel15.setText("determinação de empreendedores que sonham em crescer na empresa.");

        jLabel16.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel16.setText("Envie seu curriculo hoje e ganhe uma nova chance de lucrar!");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/curriculo.png"))); // NOI18N

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(labelUserName1)
                            .addComponent(labelUserName2)
                            .addComponent(labelUserName3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelHighScore3)
                                    .addComponent(labelHighScore2)
                                    .addComponent(labelHighScore1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel8)
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserName1)
                    .addComponent(labelHighScore1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserName2)
                    .addComponent(labelHighScore2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUserName3)
                    .addComponent(labelHighScore3))
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Sua inscricao foi aceita.\n Bem vindo ao SimulaTM Operações Dimensionais\n", null, 0, new javax.swing.ImageIcon(getClass().getResource("/Imagens/happypc.png")));
                jButton1.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelHighScore1;
    private javax.swing.JLabel labelHighScore2;
    private javax.swing.JLabel labelHighScore3;
    private javax.swing.JLabel labelUserName1;
    private javax.swing.JLabel labelUserName2;
    private javax.swing.JLabel labelUserName3;
    // End of variables declaration//GEN-END:variables
}
