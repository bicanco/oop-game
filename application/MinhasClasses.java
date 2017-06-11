/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import buildings.Building;
import core.BuildingTools;
import core.GameManager;

/**
 *
 * @author Fer
 */
public class MinhasClasses extends javax.swing.JFrame {
    GameManager gameDataTomorrow;
    GameManager gameData;
    /**
     * Creates new form MinhasClasses
     */
    public MinhasClasses(GameManager gameData, GameManager gameDataTomorrow) {
        initComponents();
       
        this.gameData = gameData;
        this.gameDataTomorrow = gameDataTomorrow;
    }
    private void SettingButtons(){
        btnDropFarm.setEnabled(true);
        btnDropLab.setEnabled(true);
        btnDropTemple.setEnabled(true);
        btnDropMine.setEnabled(true);
        if(labelFarm.getText().compareTo("0")==0){
            btnDropFarm.setEnabled(false);
        }
        if(labelLab.getText().compareTo("0")==0){
            btnDropLab.setEnabled(false);
        }
        if(labelTemple.getText().compareTo("0")==0){
            btnDropTemple.setEnabled(false);
        }
        if(labelMine.getText().compareTo("0")==0){
            btnDropMine.setEnabled(false);
        }
        
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnDropFarm = new javax.swing.JButton();
        btnDropLab = new javax.swing.JButton();
        btnDropTemple = new javax.swing.JButton();
        btnDropMine = new javax.swing.JButton();
        labelFarm = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        labelLab = new javax.swing.JLabel();
        labelTemple = new javax.swing.JLabel();
        labelMine = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Minhas Classes");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); // NOI18N
        jLabel2.setText("Fazenda");

        jLabel6.setText("--------------");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab2.png"))); // NOI18N
        jLabel3.setText("Laboratório");

        jLabel7.setText("--------------");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); // NOI18N
        jLabel4.setText("Templo");

        jLabel8.setText("--------------");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); // NOI18N
        jLabel5.setText("Mina");

        jLabel9.setText("--------------");

        btnDropFarm.setText("Construir");
        btnDropFarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropFarmActionPerformed(evt);
            }
        });

        btnDropLab.setText("Construir");
        btnDropLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropLabActionPerformed(evt);
            }
        });

        btnDropTemple.setText("Construir");
        btnDropTemple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropTempleActionPerformed(evt);
            }
        });

        btnDropMine.setText("Construir");
        btnDropMine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropMineActionPerformed(evt);
            }
        });

        labelFarm.setText("1");

        jLabel11.setText("BluePrints");

        jLabel12.setText("BluePrints");

        jLabel13.setText("BluePrints");

        jLabel14.setText("BluePrints");

        labelLab.setText("0");

        labelTemple.setText("0");

        labelMine.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(29, 29, 29)
                        .addComponent(labelFarm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(btnDropFarm))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMine)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(btnDropMine))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelLab)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(btnDropLab))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelTemple)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(btnDropTemple)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(210, 210, 210))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(201, 201, 201))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(btnDropFarm)
                        .addComponent(labelFarm)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(btnDropLab)
                    .addComponent(jLabel12)
                    .addComponent(labelLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(btnDropTemple)
                    .addComponent(jLabel13)
                    .addComponent(labelTemple))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(btnDropMine)
                    .addComponent(jLabel14)
                    .addComponent(labelMine))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDropFarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropFarmActionPerformed
        // TODO add your handling code here:
        new Mapa(gameData, BuildingTools.getBuildCost(BuildingTools.FARM)).setVisible(true);
    }//GEN-LAST:event_btnDropFarmActionPerformed

    private void btnDropLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropLabActionPerformed
        // TODO add your handling code here:
        new Mapa(gameData, BuildingTools.getBuildCost(BuildingTools.LAB)).setVisible(true);
    }//GEN-LAST:event_btnDropLabActionPerformed

    private void btnDropTempleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropTempleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnDropTempleActionPerformed

    private void btnDropMineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDropMineActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnDropMineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDropFarm;
    private javax.swing.JButton btnDropLab;
    private javax.swing.JButton btnDropMine;
    private javax.swing.JButton btnDropTemple;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelFarm;
    private javax.swing.JLabel labelLab;
    private javax.swing.JLabel labelMine;
    private javax.swing.JLabel labelTemple;
    // End of variables declaration//GEN-END:variables
}
