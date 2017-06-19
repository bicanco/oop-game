/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javax.swing.JOptionPane;

import core.GameManager;

/**
 *
 * @author Fer
 */
public class DailyChanges extends javax.swing.JFrame {
	GameManager gameData;
	
    /**
     * Creates new form TrocasDiarias
     */
    public DailyChanges(GameManager gameData) {
    	this.gameData = gameData;
         this.setResizable(false);
        initComponents();
        
        labelProduto1Escolha1.setText(gameData.daily.getOptions()[0].getTypesString(0));
        labelProduto2Escolha1.setText(gameData.daily.getOptions()[0].getTypesString(1));
        labelProduto3Escolha1.setText(gameData.daily.getOptions()[0].getTypesString(2));
        
        labelProduto1Escolha2.setText(gameData.daily.getOptions()[1].getTypesString(0));
        labelProduto2Escolha2.setText(gameData.daily.getOptions()[1].getTypesString(1));
        labelProduto3Escolha2.setText(gameData.daily.getOptions()[1].getTypesString(2));
        
        labelProduto1Escolha3.setText(gameData.daily.getOptions()[2].getTypesString(0));
        labelProduto2Escolha3.setText(gameData.daily.getOptions()[2].getTypesString(1));
        labelProduto3Escolha3.setText(gameData.daily.getOptions()[2].getTypesString(2));
        
        labelValorProduto1Escolha1.setText(Integer.toString(gameData.daily.getOptions()[0].getValues(0)));
        labelValorProduto2Escolha1.setText(Integer.toString(gameData.daily.getOptions()[0].getValues(1)));
        labelValorProduto3Escolha1.setText(Integer.toString(gameData.daily.getOptions()[0].getValues(2)));
        
        labelValorProduto1Escolha2.setText(Integer.toString(gameData.daily.getOptions()[1].getValues(0)));
        labelValorProduto2Escolha2.setText(Integer.toString(gameData.daily.getOptions()[1].getValues(1)));
        labelValorProduto3Escolha2.setText(Integer.toString(gameData.daily.getOptions()[1].getValues(2)));
        
        labelValorProduto1Escolha3.setText(Integer.toString(gameData.daily.getOptions()[2].getValues(0)));
        labelValorProduto2Escolha3.setText(Integer.toString(gameData.daily.getOptions()[2].getValues(1)));
        labelValorProduto3Escolha3.setText(Integer.toString(gameData.daily.getOptions()[2].getValues(2)));
   
        btnEscolha1.setEnabled(!gameData.daily.getOptions()[0].isPaid());
        btnEscolha2.setEnabled(!gameData.daily.getOptions()[1].isPaid());
        btnEscolha3.setEnabled(!gameData.daily.getOptions()[2].isPaid());
        
        btnEscolha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolha1ActionPerformed(evt);
            }
        });
        
        btnEscolha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolha2ActionPerformed(evt);
            }
        });
        
        btnEscolha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscolha3ActionPerformed(evt);
            }
        });
    }
    
    private void btnEscolha1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if (gameData.daily.getOptions()[0].checkPayment(gameData.resources)){
        	gameData.daily.getOptions()[0].pay(gameData.resources);
        	
        	JOptionPane.showMessageDialog(this, "Parab�ns! Voc� acaba de gastar o trabalho "
        			+ "de v�rios Oopyies em uma �nica gema brilhante.", "Capitalismo Selvagem",
					JOptionPane.INFORMATION_MESSAGE);
        	
        	btnEscolha1.setEnabled(false);
        } else {
        	JOptionPane.showMessageDialog(this, "Sem pechincha por aqui. Ou voc� tem o que ele quer, "
        			+ "ou vai ficar sem aquele Great Ruby.", "Capitalismo Selvagem",
					JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnEscolha2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if (gameData.daily.getOptions()[1].checkPayment(gameData.resources)){
        	gameData.daily.getOptions()[1].pay(gameData.resources);
        	
        	JOptionPane.showMessageDialog(this, "Parab�ns! Voc� acaba de gastar o trabalho "
        			+ "de v�rios Oopyies em uma �nica gema brilhante.", "Capitalismo Selvagem",
					JOptionPane.INFORMATION_MESSAGE);
        	
        	btnEscolha2.setEnabled(false);
        } else {
        	JOptionPane.showMessageDialog(this, "Sem pechincha por aqui. Ou voc� tem o que ele quer, "
        			+ "ou vai ficar sem aquele Great Ruby.", "Capitalismo Selvagem",
					JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnEscolha3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if (gameData.daily.getOptions()[2].checkPayment(gameData.resources)){
        	gameData.daily.getOptions()[2].pay(gameData.resources);
        	
        	JOptionPane.showMessageDialog(this, "Parab�ns! Voc� acaba de gastar o trabalho "
        			+ "de v�rios Oopyies em uma �nica gema brilhante.", "Capitalismo Selvagem",
					JOptionPane.INFORMATION_MESSAGE);
        	
        	btnEscolha3.setEnabled(false);
        } else {
        	JOptionPane.showMessageDialog(this, "Sem pechincha por aqui. Ou voc� tem o que ele quer, "
        			+ "ou vai ficar sem aquele Great Ruby.", "Capitalismo Selvagem",
					JOptionPane.ERROR_MESSAGE);
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelProduto1Escolha1 = new javax.swing.JLabel();
        labelProduto2Escolha1 = new javax.swing.JLabel();
        labelProduto3Escolha1 = new javax.swing.JLabel();
        labelValorProduto1Escolha1 = new javax.swing.JLabel();
        labelProduto1Escolha2 = new javax.swing.JLabel();
        labelValorProduto1Escolha2 = new javax.swing.JLabel();
        labelProduto1Escolha3 = new javax.swing.JLabel();
        labelValorProduto1Escolha3 = new javax.swing.JLabel();
        labelProduto2Escolha2 = new javax.swing.JLabel();
        labelValorProduto2Escolha2 = new javax.swing.JLabel();
        labelProduto2Escolha3 = new javax.swing.JLabel();
        labelValorProduto2Escolha3 = new javax.swing.JLabel();
        labelValorProduto2Escolha1 = new javax.swing.JLabel();
        labelValorProduto3Escolha1 = new javax.swing.JLabel();
        labelProduto3Escolha2 = new javax.swing.JLabel();
        labelValorProduto3Escolha2 = new javax.swing.JLabel();
        labelProduto3Escolha3 = new javax.swing.JLabel();
        labelValorProduto3Escolha3 = new javax.swing.JLabel();
        btnEscolha1 = new javax.swing.JButton();
        labelGreatRubies = new javax.swing.JLabel();
        btnEscolha2 = new javax.swing.JButton();
        btnEscolha3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24)); // NOI18N
        jLabel1.setText("Trocas Diárias");

        labelProduto1Escolha1.setText("Produto1");

        labelProduto2Escolha1.setText("Produto2");

        labelProduto3Escolha1.setText("Produto3");

        labelValorProduto1Escolha1.setText("Valor1");

        labelProduto1Escolha2.setText("Produto1");

        labelValorProduto1Escolha2.setText("Valor1");

        labelProduto1Escolha3.setText("Produto1");

        labelValorProduto1Escolha3.setText("Valor1");

        labelProduto2Escolha2.setText("Produto2");

        labelValorProduto2Escolha2.setText("Valor2");

        labelProduto2Escolha3.setText("Produto2");

        labelValorProduto2Escolha3.setText("Valor2");

        labelValorProduto2Escolha1.setText("Valor2");

        labelValorProduto3Escolha1.setText("Valor3");

        labelProduto3Escolha2.setText("Produto3");

        labelValorProduto3Escolha2.setText("Valor3");

        labelProduto3Escolha3.setText("Produto3");

        labelValorProduto3Escolha3.setText("Valor3");

        btnEscolha1.setText("Trocar");

        labelGreatRubies.setText("1 Great Ruby");

        btnEscolha2.setText("Trocar");

        btnEscolha3.setText("Trocar");

        jLabel2.setText("=");

        jLabel3.setText("=");

        jLabel4.setText("=");

        jLabel5.setText("=");

        jLabel6.setText("=");

        jLabel7.setText("=");

        jLabel8.setText("=");

        jLabel9.setText("=");

        jLabel10.setText("=");

        btnClose.setText("Sair");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelGreatRubies))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelProduto1Escolha3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelProduto1Escolha2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelProduto1Escolha1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelValorProduto1Escolha2)
                            .addComponent(labelValorProduto1Escolha1)
                            .addComponent(labelValorProduto1Escolha3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelProduto2Escolha1)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelProduto2Escolha3)
                                    .addComponent(labelProduto2Escolha2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelValorProduto2Escolha1)
                                .addComponent(labelValorProduto2Escolha2))
                            .addComponent(labelValorProduto2Escolha3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelProduto3Escolha2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelProduto3Escolha3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelProduto3Escolha1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelValorProduto3Escolha1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelValorProduto3Escolha2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelValorProduto3Escolha3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEscolha1)
                            .addComponent(btnEscolha2)
                            .addComponent(btnEscolha3))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(btnClose)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(labelGreatRubies)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProduto1Escolha1)
                    .addComponent(labelProduto2Escolha1)
                    .addComponent(labelProduto3Escolha1)
                    .addComponent(labelValorProduto1Escolha1)
                    .addComponent(labelValorProduto2Escolha1)
                    .addComponent(labelValorProduto3Escolha1)
                    .addComponent(btnEscolha1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProduto1Escolha2)
                    .addComponent(labelValorProduto1Escolha2)
                    .addComponent(labelProduto2Escolha2)
                    .addComponent(labelValorProduto2Escolha2)
                    .addComponent(labelProduto3Escolha2)
                    .addComponent(labelValorProduto3Escolha2)
                    .addComponent(btnEscolha2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProduto1Escolha3)
                    .addComponent(labelValorProduto1Escolha3)
                    .addComponent(labelProduto2Escolha3)
                    .addComponent(labelValorProduto2Escolha3)
                    .addComponent(labelProduto3Escolha3)
                    .addComponent(labelValorProduto3Escolha3)
                    .addComponent(btnEscolha3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(btnClose)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Main(gameData).setVisible(true);
        
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrocasDiarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrocasDiarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrocasDiarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrocasDiarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrocasDiarias().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnEscolha1;
    private javax.swing.JButton btnEscolha2;
    private javax.swing.JButton btnEscolha3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel labelGreatRubies;
    private javax.swing.JLabel labelProduto1Escolha1;
    private javax.swing.JLabel labelProduto1Escolha2;
    private javax.swing.JLabel labelProduto1Escolha3;
    private javax.swing.JLabel labelProduto2Escolha1;
    private javax.swing.JLabel labelProduto2Escolha2;
    private javax.swing.JLabel labelProduto2Escolha3;
    private javax.swing.JLabel labelProduto3Escolha1;
    private javax.swing.JLabel labelProduto3Escolha2;
    private javax.swing.JLabel labelProduto3Escolha3;
    private javax.swing.JLabel labelValorProduto1Escolha1;
    private javax.swing.JLabel labelValorProduto1Escolha2;
    private javax.swing.JLabel labelValorProduto1Escolha3;
    private javax.swing.JLabel labelValorProduto2Escolha1;
    private javax.swing.JLabel labelValorProduto2Escolha2;
    private javax.swing.JLabel labelValorProduto2Escolha3;
    private javax.swing.JLabel labelValorProduto3Escolha1;
    private javax.swing.JLabel labelValorProduto3Escolha2;
    private javax.swing.JLabel labelValorProduto3Escolha3;
    // End of variables declaration//GEN-END:variables
}
