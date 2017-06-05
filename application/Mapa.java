/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import javax.swing.Icon;

/**
 *
 * @author Fer
 */
public class Mapa extends javax.swing.JFrame {
    int type; // se for 0 eh pq abriu pelo Mapa, se for 1 abriu pelo Construir
    
    /**
     * Creates new form Mapa
     */
    public Mapa(int check) {
        initComponents();
        type = 0;
       checking(check);
        
    }

    public void checking(int check){
        Enabling();
  
        if(check == 0){
        if(btn0x0.getText().equals("Sale")) btn0x0.setEnabled(false);
        if(btn0x1.getText().equals("Sale")) btn0x1.setEnabled(false);
        if(btn0x2.getText().equals("Sale")) btn0x2.setEnabled(false);
        if(btn0x4.getText().equals("Sale")) btn0x4.setEnabled(false);
        if(btn0x3.getText().equals("Sale")) btn0x3.setEnabled(false);
        if(btn1x0.getText().equals("Sale")) btn1x0.setEnabled(false);
        if(btn2x0.getText().equals("Sale")) btn2x0.setEnabled(false);
        if(btn3x0.getText().equals("Sale")) btn3x0.setEnabled(false);
        if(btn4x0.getText().equals("Sale")) btn4x0.setEnabled(false);
        if(btn5x0.getText().equals("Sale")) btn5x0.setEnabled(false); 
        if(btn1x1.getText().equals("Sale")) btn1x1.setEnabled(false);
        if(btn1x2.getText().equals("Sale")) btn1x2.setEnabled(false);
        if(btn1x4.getText().equals("Sale")) btn1x4.setEnabled(false);
        if(btn1x3.getText().equals("Sale")) btn1x3.setEnabled(false);
        if(btn2x1.getText().equals("Sale")) btn2x1.setEnabled(false);
        if(btn2x2.getText().equals("Sale")) btn2x2.setEnabled(false);
        if(btn2x3.getText().equals("Sale")) btn2x3.setEnabled(false);
        if(btn2x4.getText().equals("Sale")) btn2x4.setEnabled(false);
        if(btn3x4.getText().equals("Sale")) btn3x4.setEnabled(false);
        if(btn3x1.getText().equals("Sale")) btn3x1.setEnabled(false);
        if(btn3x2.getText().equals("Sale")) btn3x2.setEnabled(false);
        if(btn3x3.getText().equals("Sale")) btn3x3.setEnabled(false);
        if(btn4x1.getText().equals("Sale")) btn4x1.setEnabled(false);
        if(btn4x2.getText().equals("Sale")) btn4x2.setEnabled(false);
        if(btn4x3.getText().equals("Sale")) btn4x3.setEnabled(false);
        if(btn4x4.getText().equals("Sale")) btn4x4.setEnabled(false);
        if(btn5x1.getText().equals("Sale")) btn5x1.setEnabled(false);
        if(btn5x2.getText().equals("Sale")) btn5x2.setEnabled(false);
        if(btn5x3.getText().equals("Sale")) btn5x3.setEnabled(false);
        if(btn5x4.getText().equals("Sale")) btn5x4.setEnabled(false);  
        }else if( check == 1){
        if(!btn0x0.getText().equals("Sale")) btn0x0.setEnabled(false);
        if(!btn0x1.getText().equals("Sale")) btn0x1.setEnabled(false);
        if(!btn0x2.getText().equals("Sale")) btn0x2.setEnabled(false);
        if(!btn0x4.getText().equals("Sale")) btn0x4.setEnabled(false);
        if(!btn0x3.getText().equals("Sale")) btn0x3.setEnabled(false);
        if(!btn1x0.getText().equals("Sale")) btn1x0.setEnabled(false);
        if(!btn2x0.getText().equals("Sale")) btn2x0.setEnabled(false);
        if(!btn3x0.getText().equals("Sale")) btn3x0.setEnabled(false);
        if(!btn4x0.getText().equals("Sale")) btn4x0.setEnabled(false);
        if(!btn5x0.getText().equals("Sale")) btn5x0.setEnabled(false); 
        if(!btn1x1.getText().equals("Sale")) btn1x1.setEnabled(false);
        if(!btn1x2.getText().equals("Sale")) btn1x2.setEnabled(false);
        if(!btn1x4.getText().equals("Sale")) btn1x4.setEnabled(false);
        if(!btn1x3.getText().equals("Sale")) btn1x3.setEnabled(false);
        if(!btn2x1.getText().equals("Sale")) btn2x1.setEnabled(false);
        if(!btn2x2.getText().equals("Sale")) btn2x2.setEnabled(false);
        if(!btn2x3.getText().equals("Sale")) btn2x3.setEnabled(false);
        if(!btn2x4.getText().equals("Sale")) btn2x4.setEnabled(false);
        if(!btn3x4.getText().equals("Sale")) btn3x4.setEnabled(false);
        if(!btn3x1.getText().equals("Sale")) btn3x1.setEnabled(false);
        if(!btn3x2.getText().equals("Sale")) btn3x2.setEnabled(false);
        if(!btn3x3.getText().equals("Sale")) btn3x3.setEnabled(false);
        if(!btn4x1.getText().equals("Sale")) btn4x1.setEnabled(false);
        if(!btn4x2.getText().equals("Sale")) btn4x2.setEnabled(false);
        if(!btn4x3.getText().equals("Sale")) btn4x3.setEnabled(false);
        if(!btn4x4.getText().equals("Sale")) btn4x4.setEnabled(false);
        if(!btn5x1.getText().equals("Sale")) btn5x1.setEnabled(false);
        if(!btn5x2.getText().equals("Sale")) btn5x2.setEnabled(false);
        if(!btn5x3.getText().equals("Sale")) btn5x3.setEnabled(false);
        if(!btn5x4.getText().equals("Sale")) btn5x4.setEnabled(false);  
    
        }
        
    }
     
    private void Enabling(){
        btn0x0.setEnabled(true);
        btn0x1.setEnabled(true);
        btn0x2.setEnabled(true);
        btn0x4.setEnabled(true);
        btn0x3.setEnabled(true);
        btn1x0.setEnabled(true);
        btn2x0.setEnabled(true);
        btn3x0.setEnabled(true);
        btn4x0.setEnabled(true);
        btn5x0.setEnabled(true);
        btn1x1.setEnabled(true);
        btn1x2.setEnabled(true);
        btn1x4.setEnabled(true);
        btn1x3.setEnabled(true);
        btn2x1.setEnabled(true);
        btn2x2.setEnabled(true);
        btn2x3.setEnabled(true);
        btn2x4.setEnabled(true);
        btn3x4.setEnabled(true);
        btn3x1.setEnabled(true);
        btn3x2.setEnabled(true);
        btn3x3.setEnabled(true);
        btn4x1.setEnabled(true);
        btn4x2.setEnabled(true);
        btn4x3.setEnabled(true);
        btn4x4.setEnabled(true);
        btn5x1.setEnabled(true);
        btn5x2.setEnabled(true);
        btn5x3.setEnabled(true);
        btn5x4.setEnabled(true);
    }
    public void changeType(int t){
        type  = t;
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
        btn0x0 = new javax.swing.JButton();
        btn0x1 = new javax.swing.JButton();
        btn0x2 = new javax.swing.JButton();
        btn0x4 = new javax.swing.JButton();
        btn0x3 = new javax.swing.JButton();
        btn1x0 = new javax.swing.JButton();
        btn2x0 = new javax.swing.JButton();
        btn3x0 = new javax.swing.JButton();
        btn4x0 = new javax.swing.JButton();
        btn5x0 = new javax.swing.JButton();
        btn1x1 = new javax.swing.JButton();
        btn1x2 = new javax.swing.JButton();
        btn1x4 = new javax.swing.JButton();
        btn1x3 = new javax.swing.JButton();
        btn2x1 = new javax.swing.JButton();
        btn2x2 = new javax.swing.JButton();
        btn2x3 = new javax.swing.JButton();
        btn2x4 = new javax.swing.JButton();
        btn3x4 = new javax.swing.JButton();
        btn3x1 = new javax.swing.JButton();
        btn3x2 = new javax.swing.JButton();
        btn3x3 = new javax.swing.JButton();
        btn4x1 = new javax.swing.JButton();
        btn4x2 = new javax.swing.JButton();
        btn4x3 = new javax.swing.JButton();
        btn4x4 = new javax.swing.JButton();
        btn5x1 = new javax.swing.JButton();
        btn5x2 = new javax.swing.JButton();
        btn5x3 = new javax.swing.JButton();
        btn5x4 = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn0x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn0x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn0x0.setText("Sale");
        btn0x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0x0ActionPerformed(evt);
            }
        });

        btn0x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn0x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn0x1.setText("Sale");
        btn0x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0x1ActionPerformed(evt);
            }
        });

        btn0x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn0x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn0x2.setText("Sale");
        btn0x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0x2ActionPerformed(evt);
            }
        });

        btn0x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn0x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn0x4.setText("Sale");
        btn0x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0x4ActionPerformed(evt);
            }
        });

        btn0x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn0x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn0x3.setText("Sale");
        btn0x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0x3ActionPerformed(evt);
            }
        });

        btn1x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn1x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn1x0.setText("Sale");
        btn1x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1x0ActionPerformed(evt);
            }
        });

        btn2x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn2x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn2x0.setText("Sale");
        btn2x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2x0ActionPerformed(evt);
            }
        });

        btn3x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn3x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn3x0.setText("Sale");
        btn3x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3x0ActionPerformed(evt);
            }
        });

        btn4x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn4x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn4x0.setText("Sale");
        btn4x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4x0ActionPerformed(evt);
            }
        });

        btn5x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn5x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn5x0.setText("Sale");
        btn5x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5x0ActionPerformed(evt);
            }
        });

        btn1x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn1x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn1x1.setText("Sale");
        btn1x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1x1ActionPerformed(evt);
            }
        });

        btn1x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn1x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn1x2.setText("Sale");
        btn1x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1x2ActionPerformed(evt);
            }
        });

        btn1x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn1x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn1x4.setText("Sale");
        btn1x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1x4ActionPerformed(evt);
            }
        });

        btn1x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn1x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn1x3.setText("Sale");
        btn1x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1x3ActionPerformed(evt);
            }
        });

        btn2x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn2x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn2x1.setText("Sale");
        btn2x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2x1ActionPerformed(evt);
            }
        });

        btn2x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn2x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn2x2.setText("Sale");
        btn2x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2x2ActionPerformed(evt);
            }
        });

        btn2x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn2x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn2x3.setText("Sale");
        btn2x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2x3ActionPerformed(evt);
            }
        });

        btn2x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn2x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn2x4.setText("Sale");
        btn2x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2x4ActionPerformed(evt);
            }
        });

        btn3x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn3x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn3x4.setText("Sale");
        btn3x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3x4ActionPerformed(evt);
            }
        });

        btn3x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn3x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn3x1.setText("Sale");
        btn3x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3x1ActionPerformed(evt);
            }
        });

        btn3x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn3x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn3x2.setText("Sale");
        btn3x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3x2ActionPerformed(evt);
            }
        });

        btn3x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn3x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn3x3.setText("Sale");
        btn3x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3x3ActionPerformed(evt);
            }
        });

        btn4x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn4x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn4x1.setText("Sale");
        btn4x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4x1ActionPerformed(evt);
            }
        });

        btn4x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn4x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn4x2.setText("Sale");
        btn4x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4x2ActionPerformed(evt);
            }
        });

        btn4x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn4x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn4x3.setText("Sale");
        btn4x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4x3ActionPerformed(evt);
            }
        });

        btn4x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn4x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn4x4.setText("Sale");
        btn4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4x4ActionPerformed(evt);
            }
        });

        btn5x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn5x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn5x1.setText("Sale");
        btn5x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5x1ActionPerformed(evt);
            }
        });

        btn5x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn5x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn5x2.setText("Sale");
        btn5x2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5x2ActionPerformed(evt);
            }
        });

        btn5x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn5x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn5x3.setText("Sale");
        btn5x3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5x3ActionPerformed(evt);
            }
        });

        btn5x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); // NOI18N
        btn5x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); // NOI18N
        btn5x4.setText("Sale");
        btn5x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5x4ActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(sair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4x0, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4x2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4x3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn3x0, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn2x0, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn0x0, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn1x0, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn0x1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn0x2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn0x3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn0x4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn1x3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn1x4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn2x2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn2x4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn5x0, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5x3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5x4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn0x0, btn0x1, btn0x2, btn0x3, btn0x4, btn1x0, btn1x1, btn1x2, btn1x3, btn1x4, btn2x0, btn2x1, btn2x2, btn2x3, btn2x4, btn3x0, btn3x1, btn3x2, btn3x3, btn3x4, btn4x0, btn4x1, btn4x2, btn4x3, btn4x4, btn5x0, btn5x1, btn5x2, btn5x3, btn5x4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn0x0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn1x0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn0x1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn1x1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn0x2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn1x2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn0x4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn0x3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn1x4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn1x3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn2x0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn2x2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn2x3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2x4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn2x1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3x0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3x4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3x1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3x2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3x3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn4x0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn4x2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn4x3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn4x4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btn4x1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn5x0, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5x1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5x2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5x3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5x4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_sairActionPerformed

    private void btn0x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0x0ActionPerformed
        // TODO add your handling code here:
        if(type == 1 && btn0x0.getText().equals("Sale")){
            btn0x0.setText("Farm");
            btn0x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn0x0.setEnabled(false);
        }else if(type == 2 && btn0x0.getText().equals("Sale")){
            btn0x0.setText("Lab");
            btn0x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn0x0.setEnabled(false);
        }else if(type == 3 && btn0x0.getText().equals("Sale")){
            btn0x0.setText("Temple");
            btn0x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn0x0.setEnabled(false);
        }else if(type == 4 && btn0x0.getText().equals("Sale")){
            btn0x0.setText("Mine");
            btn0x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn0x0.setEnabled(false);
        
            
        }
    }//GEN-LAST:event_btn0x0ActionPerformed

    private void btn0x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0x2ActionPerformed
         if(type == 1 && btn0x2.getText().equals("Sale")){
            btn0x2.setText("Farm");
            btn0x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn0x2.setEnabled(false);
        }else if(type == 2 && btn0x2.getText().equals("Sale")){
            btn0x2.setText("Lab");
            btn0x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn0x2.setEnabled(false);
        }else if(type == 3 && btn0x2.getText().equals("Sale")){
            btn0x2.setText("Temple");
            btn0x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn0x2.setEnabled(false);
        }else if(type == 4 && btn0x2.getText().equals("Sale")){
            btn0x2.setText("Mine");
            btn0x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn0x2.setEnabled(false);
        
            
        }
    }//GEN-LAST:event_btn0x2ActionPerformed

    private void btn0x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0x1ActionPerformed
        // TODO add your handling code here:
         if(type == 1 && btn0x1.getText().equals("Sale")){
            btn0x1.setText("Farm");
          
            btn0x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn0x1.setEnabled(false);
        }else if(type == 2 && btn0x1.getText().equals("Sale")){
            btn0x1.setText("Lab");

            btn0x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn0x1.setEnabled(false);
        }else if(type == 3 && btn0x1.getText().equals("Sale")){
            btn0x1.setText("Temple");

            btn0x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn0x1.setEnabled(false);
        }else if(type == 4 && btn0x1.getText().equals("Sale")){
            btn0x1.setText("Mine");
   
            btn0x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn0x1.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_btn0x1ActionPerformed

    private void btn0x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0x3ActionPerformed
        // TODO add your handling code here:
         if(type == 1 && btn0x3.getText().equals("Sale")){
            btn0x3.setText("Farm");
            btn0x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn0x3.setEnabled(false);
        }else if(type == 2 && btn0x3.getText().equals("Sale")){
            btn0x3.setText("Lab");
            btn0x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn0x3.setEnabled(false);
        }else if(type == 3 && btn0x3.getText().equals("Sale")){
            btn0x3.setText("Temple");
            btn0x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn0x3.setEnabled(false);
        }else if(type == 4 && btn0x3.getText().equals("Sale")){
            btn0x3.setText("Mine");
            btn0x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn0x3.setEnabled(false);
          
        }
    }//GEN-LAST:event_btn0x3ActionPerformed

    private void btn0x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0x4ActionPerformed
        // TODO add your handling code here:
         if(type == 1 && btn0x4.getText().equals("Sale")){
            btn0x4.setText("Farm");
            btn0x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn0x4.setEnabled(false);
        }else if(type == 2 && btn0x4.getText().equals("Sale")){
            btn0x4.setText("Lab");
            btn0x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn0x4.setEnabled(false);
        }else if(type == 3 && btn0x4.getText().equals("Sale")){
            btn0x4.setText("Temple");
            btn0x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn0x4.setEnabled(false);
        }else if(type == 4 && btn0x4.getText().equals("Sale")){
            btn0x4.setText("Mine");
            btn0x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn0x4.setEnabled(false);
        
            
        }
    }//GEN-LAST:event_btn0x4ActionPerformed

    private void btn1x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1x0ActionPerformed
        // TODO add your handling code here:
         if(type == 1 && btn1x0.getText().equals("Sale")){
            btn1x0.setText("Farm");
            btn1x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn1x0.setEnabled(false);
        }else if(type == 2 && btn1x0.getText().equals("Sale")){
            btn1x0.setText("Lab");
            btn1x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn1x0.setEnabled(false);
        }else if(type == 3 && btn1x0.getText().equals("Sale")){
            btn1x0.setText("Temple");
            btn1x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn1x0.setEnabled(false);
        }else if(type == 4 && btn1x0.getText().equals("Sale")){
            btn1x0.setText("Mine");
            btn1x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn1x0.setEnabled(false);   
        }
    }//GEN-LAST:event_btn1x0ActionPerformed

    private void btn1x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1x1ActionPerformed
        // TODO add your handling code here:
         if(type == 1 && btn1x1.getText().equals("Sale")){
            btn1x1.setText("Farm");
            btn1x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn1x1.setEnabled(false);
        }else if(type == 2 && btn1x1.getText().equals("Sale")){
            btn1x1.setText("Lab");
            btn1x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn1x1.setEnabled(false);
        }else if(type == 3 && btn1x1.getText().equals("Sale")){
            btn1x1.setText("Temple");
            btn1x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn1x1.setEnabled(false);
        }else if(type == 4 && btn1x1.getText().equals("Sale")){
            btn1x1.setText("Mine");
            btn1x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn1x1.setEnabled(false);   
        }
    }//GEN-LAST:event_btn1x1ActionPerformed

    private void btn1x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1x2ActionPerformed
        // TODO add your handling code here:
           if(type == 1 && btn1x2.getText().equals("Sale")){
            btn1x2.setText("Farm");
            btn1x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn1x2.setEnabled(false);
        }else if(type == 2 && btn1x2.getText().equals("Sale")){
            btn1x2.setText("Lab");
            btn1x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn1x2.setEnabled(false);
        }else if(type == 3 && btn1x2.getText().equals("Sale")){
            btn1x2.setText("Temple");
            btn1x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn1x2.setEnabled(false);
        }else if(type == 4 && btn1x2.getText().equals("Sale")){
            btn1x2.setText("Mine");
            btn1x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn1x2.setEnabled(false);   
        }
    }//GEN-LAST:event_btn1x2ActionPerformed

    private void btn1x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1x3ActionPerformed
        // TODO add your handling code here:
           if(type == 1 && btn1x3.getText().equals("Sale")){
            btn1x3.setText("Farm");
            btn1x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn1x3.setEnabled(false);
        }else if(type == 2 && btn1x3.getText().equals("Sale")){
            btn1x3.setText("Lab");
            btn1x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn1x3.setEnabled(false);
        }else if(type == 3 && btn1x3.getText().equals("Sale")){
            btn1x3.setText("Temple");
            btn1x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn1x3.setEnabled(false);
        }else if(type == 4 && btn1x3.getText().equals("Sale")){
            btn1x3.setText("Mine");
            btn1x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn1x3.setEnabled(false);   
        }
    }//GEN-LAST:event_btn1x3ActionPerformed

    private void btn1x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1x4ActionPerformed
        // TODO add your handling code here:
           if(type == 1 && btn1x4.getText().equals("Sale")){
            btn1x4.setText("Farm");
            btn1x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn1x4.setEnabled(false);
        }else if(type == 2 && btn1x4.getText().equals("Sale")){
            btn1x4.setText("Lab");
            btn1x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn1x4.setEnabled(false);
        }else if(type == 3 && btn1x4.getText().equals("Sale")){
            btn1x4.setText("Temple");
            btn1x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn1x4.setEnabled(false);
        }else if(type == 4 && btn1x4.getText().equals("Sale")){
            btn1x4.setText("Mine");
            btn1x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn1x4.setEnabled(false);   
        }
    }//GEN-LAST:event_btn1x4ActionPerformed

    private void btn2x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2x0ActionPerformed
        // TODO add your handling code here:
        if(type == 1 && btn2x0.getText().equals("Sale")){
            btn2x0.setText("Farm");
            btn2x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn2x0.setEnabled(false);
        }else if(type == 2 && btn2x0.getText().equals("Sale")){
            btn2x0.setText("Lab");
            btn2x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn2x0.setEnabled(false);
        }else if(type == 3 && btn2x0.getText().equals("Sale")){
            btn2x0.setText("Temple");
            btn2x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn2x0.setEnabled(false);
        }else if(type == 4 && btn2x0.getText().equals("Sale")){
            btn2x0.setText("Mine");
            btn2x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn2x0.setEnabled(false);   
        }
    }//GEN-LAST:event_btn2x0ActionPerformed

    private void btn2x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2x1ActionPerformed
        // TODO add your handling code here:
        if(type == 1 && btn2x1.getText().equals("Sale")){
            btn2x1.setText("Farm");
            btn2x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn2x1.setEnabled(false);
        }else if(type == 2 && btn2x1.getText().equals("Sale")){
            btn2x1.setText("Lab");
            btn2x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn2x1.setEnabled(false);
        }else if(type == 3 && btn2x1.getText().equals("Sale")){
            btn2x1.setText("Temple");
            btn2x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn2x1.setEnabled(false);
        }else if(type == 4 && btn2x1.getText().equals("Sale")){
            btn2x1.setText("Mine");
            btn2x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn2x1.setEnabled(false);   
        }
    }//GEN-LAST:event_btn2x1ActionPerformed

    private void btn2x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2x2ActionPerformed
        // TODO add your handling code here:
        if(type == 1 && btn2x2.getText().equals("Sale")){
            btn2x2.setText("Farm");
            btn2x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn2x2.setEnabled(false);
        }else if(type == 2 && btn2x2.getText().equals("Sale")){
            btn2x2.setText("Lab");
            btn2x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn2x2.setEnabled(false);
        }else if(type == 3 && btn2x2.getText().equals("Sale")){
            btn2x2.setText("Temple");
            btn2x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn2x2.setEnabled(false);
        }else if(type == 4 && btn2x2.getText().equals("Sale")){
            btn2x2.setText("Mine");
            btn2x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn2x2.setEnabled(false);   
        }
    }//GEN-LAST:event_btn2x2ActionPerformed

    private void btn2x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2x3ActionPerformed
        // TODO add your handling code here:
        if(type == 1 && btn2x3.getText().equals("Sale")){
            btn2x3.setText("Farm");
            btn2x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn2x3.setEnabled(false);
        }else if(type == 2 && btn2x3.getText().equals("Sale")){
            btn2x3.setText("Lab");
            btn2x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn2x3.setEnabled(false);
        }else if(type == 3 && btn2x3.getText().equals("Sale")){
            btn2x3.setText("Temple");
            btn2x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn2x3.setEnabled(false);
        }else if(type == 4 && btn2x3.getText().equals("Sale")){
            btn2x3.setText("Mine");
            btn2x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn2x3.setEnabled(false);   
        }
    }//GEN-LAST:event_btn2x3ActionPerformed

    private void btn2x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2x4ActionPerformed
        // TODO add your handling code here:
        if(type == 1 && btn2x4.getText().equals("Sale")){
            btn2x4.setText("Farm");
            btn2x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn2x4.setEnabled(false);
        }else if(type == 2 && btn2x4.getText().equals("Sale")){
            btn2x4.setText("Lab");
            btn2x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn2x4.setEnabled(false);
        }else if(type == 3 && btn2x4.getText().equals("Sale")){
            btn2x4.setText("Temple");
            btn2x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn2x4.setEnabled(false);
        }else if(type == 4 && btn2x4.getText().equals("Sale")){
            btn2x4.setText("Mine");
            btn2x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn2x4.setEnabled(false);   
        }
    }//GEN-LAST:event_btn2x4ActionPerformed

    private void btn3x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3x0ActionPerformed
        if(type == 1 && btn3x0.getText().equals("Sale")){
            btn3x0.setText("Farm");
            btn3x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn3x0.setEnabled(false);
        }else if(type == 2 && btn3x0.getText().equals("Sale")){
            btn3x0.setText("Lab");
            btn3x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn3x0.setEnabled(false);
        }else if(type == 3 && btn3x0.getText().equals("Sale")){
            btn3x0.setText("Temple");
            btn3x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn3x0.setEnabled(false);
        }else if(type == 4 && btn3x0.getText().equals("Sale")){
            btn3x0.setText("Mine");
            btn3x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn3x0.setEnabled(false);   
        }
    }//GEN-LAST:event_btn3x0ActionPerformed

    private void btn3x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3x1ActionPerformed
        if(type == 1 && btn3x1.getText().equals("Sale")){
            btn3x1.setText("Farm");
            btn3x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn3x1.setEnabled(false);
        }else if(type == 2 && btn3x1.getText().equals("Sale")){
            btn3x1.setText("Lab");
            btn3x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn3x1.setEnabled(false);
        }else if(type == 3 && btn3x1.getText().equals("Sale")){
            btn3x1.setText("Temple");
            btn3x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn3x1.setEnabled(false);
        }else if(type == 4 && btn3x1.getText().equals("Sale")){
            btn3x1.setText("Mine");
            btn3x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn3x1.setEnabled(false);   
        }
    }//GEN-LAST:event_btn3x1ActionPerformed

    private void btn3x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3x2ActionPerformed
        // TODO add your handling code here:
        if(type == 1 && btn3x2.getText().equals("Sale")){
            btn3x2.setText("Farm");
            btn3x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn3x2.setEnabled(false);
        }else if(type == 2 && btn3x2.getText().equals("Sale")){
            btn3x2.setText("Lab");
            btn3x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn3x2.setEnabled(false);
        }else if(type == 3 && btn3x2.getText().equals("Sale")){
            btn3x2.setText("Temple");
            btn3x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn3x2.setEnabled(false);
        }else if(type == 4 && btn3x2.getText().equals("Sale")){
            btn3x2.setText("Mine");
            btn3x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn3x2.setEnabled(false);   
        }
    }//GEN-LAST:event_btn3x2ActionPerformed

    private void btn3x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3x3ActionPerformed
        if(type == 1 && btn3x3.getText().equals("Sale")){
            btn3x3.setText("Farm");
            btn3x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn3x3.setEnabled(false);
        }else if(type == 2 && btn3x3.getText().equals("Sale")){
            btn3x3.setText("Lab");
            btn3x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn3x3.setEnabled(false);
        }else if(type == 3 && btn3x3.getText().equals("Sale")){
            btn3x3.setText("Temple");
            btn3x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn3x3.setEnabled(false);
        }else if(type == 4 && btn3x3.getText().equals("Sale")){
            btn3x3.setText("Mine");
            btn3x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn3x3.setEnabled(false);   
        }
    }//GEN-LAST:event_btn3x3ActionPerformed

    private void btn3x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3x4ActionPerformed
        if(type == 1 && btn3x4.getText().equals("Sale")){
            btn3x4.setText("Farm");
            btn3x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn3x4.setEnabled(false);
        }else if(type == 2 && btn3x4.getText().equals("Sale")){
            btn3x4.setText("Lab");
            btn3x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn3x4.setEnabled(false);
        }else if(type == 3 && btn3x4.getText().equals("Sale")){
            btn3x4.setText("Temple");
            btn3x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn3x4.setEnabled(false);
        }else if(type == 4 && btn3x4.getText().equals("Sale")){
            btn3x4.setText("Mine");
            btn3x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn3x4.setEnabled(false);   
        }
    }//GEN-LAST:event_btn3x4ActionPerformed

    private void btn4x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4x0ActionPerformed
        if(type == 1 && btn4x0.getText().equals("Sale")){
            btn4x0.setText("Farm");
            btn4x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn4x0.setEnabled(false);
        }else if(type == 2 && btn4x0.getText().equals("Sale")){
            btn4x0.setText("Lab");
            btn4x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn4x0.setEnabled(false);
        }else if(type == 3 && btn4x0.getText().equals("Sale")){
            btn4x0.setText("Temple");
            btn4x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn4x0.setEnabled(false);
        }else if(type == 4 && btn4x0.getText().equals("Sale")){
            btn4x0.setText("Mine");
            btn4x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn4x0.setEnabled(false);   
        }
    }//GEN-LAST:event_btn4x0ActionPerformed

    private void btn4x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4x1ActionPerformed
        if(type == 1 && btn4x1.getText().equals("Sale")){
            btn4x1.setText("Farm");
            btn4x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn4x1.setEnabled(false);
        }else if(type == 2 && btn4x1.getText().equals("Sale")){
            btn4x1.setText("Lab");
            btn4x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn4x1.setEnabled(false);
        }else if(type == 3 && btn4x1.getText().equals("Sale")){
            btn4x1.setText("Temple");
            btn4x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn4x1.setEnabled(false);
        }else if(type == 4 && btn4x1.getText().equals("Sale")){
            btn4x1.setText("Mine");
            btn4x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn4x1.setEnabled(false);   
        }
    }//GEN-LAST:event_btn4x1ActionPerformed

    private void btn4x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4x2ActionPerformed
        if(type == 1 && btn4x2.getText().equals("Sale")){
            btn4x2.setText("Farm");
            btn4x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn4x2.setEnabled(false);
        }else if(type == 2 && btn4x2.getText().equals("Sale")){
            btn4x2.setText("Lab");
            btn4x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn4x2.setEnabled(false);
        }else if(type == 3 && btn4x2.getText().equals("Sale")){
            btn4x2.setText("Temple");
            btn4x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn4x2.setEnabled(false);
        }else if(type == 4 && btn4x2.getText().equals("Sale")){
            btn4x2.setText("Mine");
            btn4x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn4x2.setEnabled(false);   
        }   
    }//GEN-LAST:event_btn4x2ActionPerformed

    private void btn4x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4x3ActionPerformed
        if(type == 1 && btn4x3.getText().equals("Sale")){
            btn4x3.setText("Farm");
            btn4x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn4x3.setEnabled(false);
        }else if(type == 2 && btn4x3.getText().equals("Sale")){
            btn4x3.setText("Lab");
            btn4x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn4x3.setEnabled(false);
        }else if(type == 3 && btn4x3.getText().equals("Sale")){
            btn4x3.setText("Temple");
            btn4x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn4x3.setEnabled(false);
        }else if(type == 4 && btn4x3.getText().equals("Sale")){
            btn4x3.setText("Mine");
            btn4x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn4x3.setEnabled(false);   
        }
    }//GEN-LAST:event_btn4x3ActionPerformed

    private void btn4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4x4ActionPerformed
        if(type == 1 && btn4x4.getText().equals("Sale")){
            btn4x4.setText("Farm");
            btn4x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn4x4.setEnabled(false);
        }else if(type == 2 && btn4x4.getText().equals("Sale")){
            btn4x4.setText("Lab");
            btn4x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn4x4.setEnabled(false);
        }else if(type == 3 && btn4x4.getText().equals("Sale")){
            btn4x4.setText("Temple");
            btn4x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn4x4.setEnabled(false);
        }else if(type == 4 && btn4x4.getText().equals("Sale")){
            btn4x4.setText("Mine");
            btn4x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn4x4.setEnabled(false);   
        }
    }//GEN-LAST:event_btn4x4ActionPerformed

    private void btn5x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5x0ActionPerformed
        if(type == 1 && btn5x0.getText().equals("Sale")){
            btn5x0.setText("Farm");
            btn5x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn5x0.setEnabled(false);
        }else if(type == 2 && btn5x0.getText().equals("Sale")){
            btn5x0.setText("Lab");
            btn5x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn5x0.setEnabled(false);
        }else if(type == 3 && btn5x0.getText().equals("Sale")){
            btn5x0.setText("Temple");
            btn5x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn5x0.setEnabled(false);
        }else if(type == 4 && btn5x0.getText().equals("Sale")){
            btn5x0.setText("Mine");
            btn5x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn5x0.setEnabled(false);   
        }
    }//GEN-LAST:event_btn5x0ActionPerformed

    private void btn5x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5x1ActionPerformed
        if(type == 1 && btn5x1.getText().equals("Sale")){
            btn5x1.setText("Farm");
            btn5x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn5x1.setEnabled(false);
        }else if(type == 2 && btn5x1.getText().equals("Sale")){
            btn5x1.setText("Lab");
            btn5x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn5x1.setEnabled(false);
        }else if(type == 3 && btn5x1.getText().equals("Sale")){
            btn5x1.setText("Temple");
            btn5x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn5x1.setEnabled(false);
        }else if(type == 4 && btn5x1.getText().equals("Sale")){
            btn5x1.setText("Mine");
            btn5x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn5x1.setEnabled(false);   
        }
    }//GEN-LAST:event_btn5x1ActionPerformed

    private void btn5x2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5x2ActionPerformed
        if(type == 1 && btn5x2.getText().equals("Sale")){
            btn5x2.setText("Farm");
            btn5x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn5x2.setEnabled(false);
        }else if(type == 2 && btn5x2.getText().equals("Sale")){
            btn5x2.setText("Lab");
            btn5x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn5x2.setEnabled(false);
        }else if(type == 3 && btn5x2.getText().equals("Sale")){
            btn5x2.setText("Temple");
            btn5x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn5x2.setEnabled(false);
        }else if(type == 4 && btn5x2.getText().equals("Sale")){
            btn5x2.setText("Mine");
            btn5x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn5x2.setEnabled(false);   
        }
    }//GEN-LAST:event_btn5x2ActionPerformed

    private void btn5x3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5x3ActionPerformed
        if(type == 1 && btn5x3.getText().equals("Sale")){
            btn5x3.setText("Farm");
            btn5x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn5x3.setEnabled(false);
        }else if(type == 2 && btn5x3.getText().equals("Sale")){
            btn5x3.setText("Lab");
            btn5x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn5x3.setEnabled(false);
        }else if(type == 3 && btn5x3.getText().equals("Sale")){
            btn5x3.setText("Temple");
            btn5x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn5x3.setEnabled(false);
        }else if(type == 4 && btn5x3.getText().equals("Sale")){
            btn5x3.setText("Mine");
            btn5x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn5x3.setEnabled(false);   
        }
    }//GEN-LAST:event_btn5x3ActionPerformed

    private void btn5x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5x4ActionPerformed
        if(type == 1 && btn5x4.getText().equals("Sale")){
            btn5x4.setText("Farm");
            btn5x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Farm.png"))); 
            btn5x4.setEnabled(false);
        }else if(type == 2 && btn5x4.getText().equals("Sale")){
            btn5x4.setText("Lab");
            btn5x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Lab.png"))); 
            btn5x4.setEnabled(false);
        }else if(type == 3 && btn5x4.getText().equals("Sale")){
            btn5x4.setText("Temple");
            btn5x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Temple.png"))); 
            btn5x4.setEnabled(false);
        }else if(type == 4 && btn5x4.getText().equals("Sale")){
            btn5x4.setText("Mine");
            btn5x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Mine.png"))); 
            btn5x4.setEnabled(false);   
        }
    }//GEN-LAST:event_btn5x4ActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Mapa().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0x0;
    private javax.swing.JButton btn0x1;
    private javax.swing.JButton btn0x2;
    private javax.swing.JButton btn0x3;
    private javax.swing.JButton btn0x4;
    private javax.swing.JButton btn1x0;
    private javax.swing.JButton btn1x1;
    private javax.swing.JButton btn1x2;
    private javax.swing.JButton btn1x3;
    private javax.swing.JButton btn1x4;
    private javax.swing.JButton btn2x0;
    private javax.swing.JButton btn2x1;
    private javax.swing.JButton btn2x2;
    private javax.swing.JButton btn2x3;
    private javax.swing.JButton btn2x4;
    private javax.swing.JButton btn3x0;
    private javax.swing.JButton btn3x1;
    private javax.swing.JButton btn3x2;
    private javax.swing.JButton btn3x3;
    private javax.swing.JButton btn3x4;
    private javax.swing.JButton btn4x0;
    private javax.swing.JButton btn4x1;
    private javax.swing.JButton btn4x2;
    private javax.swing.JButton btn4x3;
    private javax.swing.JButton btn4x4;
    private javax.swing.JButton btn5x0;
    private javax.swing.JButton btn5x1;
    private javax.swing.JButton btn5x2;
    private javax.swing.JButton btn5x3;
    private javax.swing.JButton btn5x4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
