package application;

import core.GameManager;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fer
 */
public class Test02 extends javax.swing.JFrame {
   
  
    GameManager gameData;
   
    /**
     * Creates new form Test02
     */
    public Test02(int image, String str, GameManager gameData) {
        this.getContentPane().setBackground(Color.white);
        initComponents();
        setImage(image);
        
        this.gameData = gameData;
        jLabelName.setText(str);
        labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
        qtddOopyies.setText(Integer.toString(gameData.resources.getOopyies()));
    }
   
    private void setImage(int image){
        if(image == 0){
            labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CatBig.png")));
        }else if(image == 1){
            labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ManBig.png")));
        
        }else if(image == 2){
            labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MaskBig.png")));
        
        }
        
    }
    
   // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        labelImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        qtddOopyies = new javax.swing.JLabel();
        btnRecursos = new javax.swing.JButton();
        btnLoja = new javax.swing.JButton();
        btnIniciarDia = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelCriatividade = new javax.swing.JLabel();

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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        labelImage.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Captura de Tela 2017-05-30 às 10.34.11.png"))); // NOI18N

        jLabel2.setText("Usuário:");

        jLabelName.setText("NomedoUsuario");

        jLabel4.setText("Oopyies:");

        qtddOopyies.setText("QuatidadeDeOopyies");

        btnRecursos.setText("Recursos");
        btnRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecursosActionPerformed(evt);
            }
        });

        btnLoja.setText("Loja Virtual");
        btnLoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLojaActionPerformed(evt);
            }
        });

        btnIniciarDia.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnIniciarDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nascerdosol.png"))); // NOI18N
        btnIniciarDia.setText("Iniciar Dia");
        btnIniciarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarDiaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Mapa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Trocas Diárias");

        jLabel3.setText("Criatividade:");

        labelCriatividade.setText("QttdCriatividade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRecursos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelImage)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelName))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelCriatividade))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(qtddOopyies)))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnLoja))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnIniciarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(qtddOopyies))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labelCriatividade))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRecursos)
                    .addComponent(btnLoja))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnIniciarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

    private void btnRecursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecursosActionPerformed
            // TODO add your handling code here:
              new Resources(gameData).setVisible(true); 
            
    }//GEN-LAST:event_btnRecursosActionPerformed
 
    private void btnLojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLojaActionPerformed
        // TODO add your handling code here:
         new MyClasses(gameData).setVisible(true);
    }//GEN-LAST:event_btnLojaActionPerformed

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMapaActionPerformed
        // TODO add your handling code here:
        new Mapa(gameData, 0).setVisible(true);
    }//GEN-LAST:event_btnMapaActionPerformed

    private void btnIniciarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarDiaActionPerformed
        // TODO add your handling code here:
        new NextTurn().setVisible(true);
    }//GEN-LAST:event_btnIniciarDiaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarDia;
    private javax.swing.JButton btnLoja;
    private javax.swing.JButton btnRecursos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel labelCriatividade;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel qtddOopyies;
    // End of variables declaration//GEN-END:variables
}
