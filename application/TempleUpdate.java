package application;

import javax.swing.JOptionPane;
import buildings.Temple;
import core.BuildingTools;
import core.GameManager;

/**
 * Tela de interface para gerenciar as melhorias do Templo.
 * @author Fernanda Marana
 */
public class TempleUpdate extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	GameManager gameData;

    public TempleUpdate(GameManager gameData) {
        this.setResizable(false);
        this.gameData = gameData;
        initComponents();
        labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
        
        if (BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.GEM_PRODUCTION)){
    		btnGemProduction.setText("Liberado");
    		btnGemProduction.setEnabled(false);
    	} else {
    		btnGemProduction.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.GEM_PRODUCTION));
            btnGemProduction.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnGemProductionActionPerformed(evt);
                }
            });
    	}
        
        if (BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PERL_RITUAL)){
    		btnPerlRitual.setText("Liberado");
    		btnPerlRitual.setEnabled(false);
    	} else {
    		btnPerlRitual.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.PERL_RITUAL));
            btnPerlRitual.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnPerlRActionPerformed(evt);
                }
            });
    	}
        
        if (BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.PYRAMID_RITUAL)){
    		btnPyramidRitual.setText("Liberado");
    		btnPyramidRitual.setEnabled(false);
    	} else {
    		btnPyramidRitual.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.PYRAMID_RITUAL));
            btnPyramidRitual.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnPyRActionPerformed(evt);
                }
            });
    	}
        
        if (BuildingTools.getUpgrade(BuildingTools.TEMPLE, Temple.GREAT_RITUAL)){
    		btnGreatRitual.setText("Liberado");
    		btnGreatRitual.setEnabled(false);
    	} else {
    		btnGreatRitual.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.GREAT_RITUAL));
            btnGreatRitual.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnGreatRitualActionPerformed(evt);
                }
            });
    	}
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        labelCreativity = new javax.swing.JLabel();
        btnGemProduction = new javax.swing.JButton();
        btnPerlRitual = new javax.swing.JButton();
        btnPyramidRitual = new javax.swing.JButton();
        btnGreatRitual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TempleBig.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24)); // NOI18N
        jLabel2.setText("TEMPLO");

        jLabel3.setText("Gem Production:");

        jLabel4.setText("Perl Ritual:");

        jLabel5.setText("Pyramid Ritual:");

        jLabel6.setText("Grande Ritual:");

        btnClose.setText("Sair");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel11.setText("Criatividade:");

        labelCreativity.setText("0");

        btnGemProduction.setText("Bloqueado: 30");

        btnPerlRitual.setText("Bloqueado: 30");

        btnPyramidRitual.setText("Bloqueado: 30");

        btnGreatRitual.setText("Bloqueado: 30");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(40, 40, 40)
                                .addComponent(labelCreativity))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnGreatRitual))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnPyramidRitual, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnPerlRitual, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnGemProduction, javax.swing.GroupLayout.Alignment.TRAILING)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelCreativity))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGemProduction)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnPerlRitual))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(btnPyramidRitual))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGreatRitual)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(27, 27, 27))
        );

        pack();
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
         this.dispose();
         new MyClasses(gameData).setVisible(true);
    }

    private void btnGemProductionActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.GEM_PRODUCTION)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.GEM_PRODUCTION));
    		BuildingTools.unlockUpgrade(BuildingTools.TEMPLE, Temple.GEM_PRODUCTION);
    		
    		btnGemProduction.setText("Liberado");
    		btnGemProduction.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void btnPerlRActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.PERL_RITUAL)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.PERL_RITUAL));
    		BuildingTools.unlockUpgrade(BuildingTools.TEMPLE, Temple.PERL_RITUAL);
    		
    		btnPerlRitual.setText("Liberado");
    		btnPerlRitual.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void btnPyRActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.PYRAMID_RITUAL)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.PYRAMID_RITUAL));
    		BuildingTools.unlockUpgrade(BuildingTools.TEMPLE, Temple.PYRAMID_RITUAL);
    		
    		btnPyramidRitual.setText("Liberado");
    		btnPyramidRitual.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void btnGreatRitualActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.GREAT_RITUAL)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.TEMPLE, Temple.GREAT_RITUAL));
    		BuildingTools.unlockUpgrade(BuildingTools.TEMPLE, Temple.GREAT_RITUAL);
    		
    		btnGreatRitual.setText("Liberado");
    		btnGreatRitual.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGemProduction;
    private javax.swing.JButton btnGreatRitual;
    private javax.swing.JButton btnPerlRitual;
    private javax.swing.JButton btnPyramidRitual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelCreativity;
}
