/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import core.BuildingTools;
import core.GameManager;
import javax.swing.Timer;

/**
 *
 * @author Fer
 */
public class LojaVirtual extends javax.swing.JFrame {
    GameManager gameData;
    GameManager gameDataTomorrow;
    
    /**
     * Creates new form LojaVirtual
     */
    public LojaVirtual(GameManager gameData, GameManager gameDataTomorrow) {
        this.setResizable(false);
        //this.setLocationRelativeTo(null);
        this.gameData = gameData;
        initComponents();
        this.gameDataTomorrow = gameDataTomorrow;
        labelFarm.setText("");
        labelLab.setText("");
        labelTemple.setText("");
        labelMine.setText("");
        labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
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
        btnSair = new javax.swing.JButton();
        btnFarmUpgrade = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnFarmBuy = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelFarm = new javax.swing.JLabel();
        labelLab = new javax.swing.JLabel();
        labelTemple = new javax.swing.JLabel();
        labelMine = new javax.swing.JLabel();
        btnLabBuy = new javax.swing.JButton();
        btnTempleBuy = new javax.swing.JButton();
        btnMineBuy = new javax.swing.JButton();
        btnLabUpgrade = new javax.swing.JButton();
        btnTempleUpgrade = new javax.swing.JButton();
        btnMineUpgrade = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        labelCriatividade = new javax.swing.JLabel();
        btnAboutLab = new javax.swing.JButton();
        btnAboutFarm = new javax.swing.JButton();
        btnAboutTemple = new javax.swing.JButton();
        btnAboutMine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        jLabel1.setText("Loja Virtual");

        btnSair.setText("Finalizar Compra");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnFarmUpgrade.setText("Melhorias");
        btnFarmUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmUpgradeActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); // NOI18N
        jLabel2.setText("Fazenda");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab2.png"))); // NOI18N
        jLabel3.setText("Laboratório");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); // NOI18N
        jLabel4.setText("Templo");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); // NOI18N
        jLabel5.setText("Mina");

        btnFarmBuy.setText("Construir");
        btnFarmBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFarmBuyActionPerformed(evt);
            }
        });

        jLabel6.setText("--------------");

        jLabel7.setText("--------------");

        jLabel8.setText("--------------");

        jLabel9.setText("--------------");

        labelFarm.setText("$400,00");

        labelLab.setText("$400,00");

        labelTemple.setText("$400,00");

        labelMine.setText("$400,00");

        btnLabBuy.setText("Construir");
        btnLabBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabBuyActionPerformed(evt);
            }
        });

        btnTempleBuy.setText("Construir");
        btnTempleBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempleBuyActionPerformed(evt);
            }
        });

        btnMineBuy.setText("Construir");
        btnMineBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMineBuyActionPerformed(evt);
            }
        });

        btnLabUpgrade.setText("Melhorias");
        btnLabUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabUpgradeActionPerformed(evt);
            }
        });

        btnTempleUpgrade.setText("Melhorias");
        btnTempleUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempleUpgradeActionPerformed(evt);
            }
        });

        btnMineUpgrade.setText("Melhorias");
        btnMineUpgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMineUpgradeActionPerformed(evt);
            }
        });

        jLabel14.setText("Criatividade:");

        labelCriatividade.setText("$500,00");

        btnAboutLab.setText("Info");
        btnAboutLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutLabActionPerformed(evt);
            }
        });

        btnAboutFarm.setText("Info");
        btnAboutFarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutFarmActionPerformed(evt);
            }
        });

        btnAboutTemple.setText("Info");
        btnAboutTemple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutTempleActionPerformed(evt);
            }
        });

        btnAboutMine.setText("Info");
        btnAboutMine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutMineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnAboutFarm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAboutTemple)
                                            .addComponent(btnAboutLab)
                                            .addComponent(btnAboutMine))
                                        .addGap(6, 6, 6))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelMine, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelLab, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTemple, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFarm, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCriatividade)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFarmBuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFarmUpgrade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLabBuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLabUpgrade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTempleBuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTempleUpgrade))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMineBuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMineUpgrade)))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(labelCriatividade))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFarmUpgrade)
                    .addComponent(jLabel2)
                    .addComponent(btnFarmBuy)
                    .addComponent(jLabel6)
                    .addComponent(labelFarm)
                    .addComponent(btnAboutFarm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(labelLab)
                    .addComponent(btnLabBuy)
                    .addComponent(btnLabUpgrade)
                    .addComponent(btnAboutLab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(labelTemple)
                    .addComponent(btnTempleBuy)
                    .addComponent(btnTempleUpgrade)
                    .addComponent(btnAboutTemple))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(labelMine)
                    .addComponent(btnMineBuy)
                    .addComponent(btnMineUpgrade)
                    .addComponent(btnAboutMine))
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Principal(gameData,gameDataTomorrow).setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAboutLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutLabActionPerformed
        // TODO add your handling code here:
        new InfoLab().setVisible(true);
    }//GEN-LAST:event_btnAboutLabActionPerformed

    private void btnAboutFarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutFarmActionPerformed
        // TODO add your handling code here:
        new InfoFarm().setVisible(true);
    }//GEN-LAST:event_btnAboutFarmActionPerformed

    private void btnAboutTempleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutTempleActionPerformed
        // TODO add your handling code here:
          new InfoTemple().setVisible(true);
    }//GEN-LAST:event_btnAboutTempleActionPerformed

    private void btnAboutMineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutMineActionPerformed
        // TODO add your handling code here:
          new InfoMine().setVisible(true);
    }//GEN-LAST:event_btnAboutMineActionPerformed

    private void btnFarmBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmBuyActionPerformed
        // TODO add your handling code here:
       this.dispose();
        new MapaParaConstruir(gameData,gameDataTomorrow, BuildingTools.FARM).setVisible(true);
        
        
    }//GEN-LAST:event_btnFarmBuyActionPerformed

    private void btnLabBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabBuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MapaParaConstruir(gameData,gameDataTomorrow, BuildingTools.LAB).setVisible(true);
    }//GEN-LAST:event_btnLabBuyActionPerformed

    private void btnTempleBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempleBuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MapaParaConstruir(gameData,gameDataTomorrow, BuildingTools.TEMPLE).setVisible(true);
    }//GEN-LAST:event_btnTempleBuyActionPerformed

    private void btnMineBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMineBuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MapaParaConstruir(gameData,gameDataTomorrow, BuildingTools.MINE).setVisible(true);
    }//GEN-LAST:event_btnMineBuyActionPerformed

    private void btnFarmUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFarmUpgradeActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new FarmMelhoria(gameData,gameDataTomorrow).setVisible(true);
    }//GEN-LAST:event_btnFarmUpgradeActionPerformed

    private void btnLabUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabUpgradeActionPerformed
        // TODO add your handling code here:
         this.dispose();
        new LabMelhoria(gameData,gameDataTomorrow).setVisible(true);
    }//GEN-LAST:event_btnLabUpgradeActionPerformed

    private void btnTempleUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempleUpgradeActionPerformed
        // TODO add your handling code here:
         this.dispose();
         new TempleMelhoria(gameData,gameDataTomorrow).setVisible(true);
    }//GEN-LAST:event_btnTempleUpgradeActionPerformed

    private void btnMineUpgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMineUpgradeActionPerformed
        // TODO add your handling code here:
        this.dispose();
         new MineMelhoria(gameData,gameDataTomorrow).setVisible(true);
    }//GEN-LAST:event_btnMineUpgradeActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAboutFarm;
    private javax.swing.JButton btnAboutLab;
    private javax.swing.JButton btnAboutMine;
    private javax.swing.JButton btnAboutTemple;
    private javax.swing.JButton btnFarmBuy;
    private javax.swing.JButton btnFarmUpgrade;
    private javax.swing.JButton btnLabBuy;
    private javax.swing.JButton btnLabUpgrade;
    private javax.swing.JButton btnMineBuy;
    private javax.swing.JButton btnMineUpgrade;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnTempleBuy;
    private javax.swing.JButton btnTempleUpgrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelCriatividade;
    private javax.swing.JLabel labelFarm;
    private javax.swing.JLabel labelLab;
    private javax.swing.JLabel labelMine;
    private javax.swing.JLabel labelTemple;
    // End of variables declaration//GEN-END:variables
}
