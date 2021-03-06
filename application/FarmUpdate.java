
package application;

import core.BuildingTools;
import core.GameManager;
import javax.swing.JOptionPane;

import buildings.Farm;

/**
 * Tela de interface para melhorias da Ro�a.
 * @author Fernanda Marana
 */
public class FarmUpdate extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	GameManager gameData;

    public FarmUpdate(GameManager gameData) {
        this.setResizable(false);
        this.gameData = gameData;
        initComponents();
        
        labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
        
        if (BuildingTools.getUpgrade(BuildingTools.FARM, Farm.FOOD_PRODUCTION)){
    		btnFoodProduction.setText("Liberado");
    		btnFoodProduction.setEnabled(false);
    	} else {
    		btnFoodProduction.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.FOOD_PRODUCTION));
            btnFoodProduction.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnFoodProductionActionPerformed(evt);
                }
            });
    	}
    	
    	if (BuildingTools.getUpgrade(BuildingTools.FARM, Farm.SEED_FERTILIZER)){
    		btnSeedFertilizer.setText("Liberado");
    		btnSeedFertilizer.setEnabled(false);
    	} else {
        	btnSeedFertilizer.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.SEED_FERTILIZER));
        	btnSeedFertilizer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSeedFertilizerActionPerformed(evt);
                }
            });
    	}
    	
    	if (BuildingTools.getUpgrade(BuildingTools.FARM, Farm.COCO_FERTILIZER)){
    		btnCocoFertilizer.setText("Liberado");
    		btnCocoFertilizer.setEnabled(false);
    	} else {
    		btnCocoFertilizer.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.COCO_FERTILIZER));
    		btnCocoFertilizer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnCocoFertilizerActionPerformed(evt);
                }
            });
    	}
    	
    	if (BuildingTools.getUpgrade(BuildingTools.FARM, Farm.GREAT_PRODUCTION)){
    		btnGreatProduction.setText("Liberado");
    		btnGreatProduction.setEnabled(false);
    	} else {
    		btnGreatProduction.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.GREAT_PRODUCTION));
    		btnGreatProduction.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnGreatProductionActionPerformed(evt);
                }
            });
    	}
        
    }

    private void initComponents() {

        labelImage = new javax.swing.JLabel();
        labelFARM = new javax.swing.JLabel();
        labelFP = new javax.swing.JLabel();
        labelSF = new javax.swing.JLabel();
        labelCF = new javax.swing.JLabel();
        labelGP = new javax.swing.JLabel();
        btnFoodProduction = new javax.swing.JButton();
        btnSeedFertilizer = new javax.swing.JButton();
        btnCocoFertilizer = new javax.swing.JButton();
        btnGreatProduction = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        labelCreativityDONTEDIT = new javax.swing.JLabel();
        labelCreativity = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FarmBig.png")));

        labelFARM.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24));
        labelFARM.setText("RO�A");

        labelFP.setText("Producao de Comida:");

        labelSF.setText("Fertilizador de Semente:");

        labelCF.setText("Fertilizador de Coco:");

        labelGP.setText("Producao Exorbitante:");

        btnFoodProduction.setText("Bloqueado: 30");
        btnFoodProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFoodProductionActionPerformed(evt);
            }
        });

        btnSeedFertilizer.setText("Bloquedo: 30");

        btnCocoFertilizer.setText("Bloqueado: 30");

        btnGreatProduction.setText("Bloqueado: 60");

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        labelCreativityDONTEDIT.setText("Criatividade:");

        labelCreativity.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(labelCreativityDONTEDIT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSF)
                            .addComponent(labelFP)
                            .addComponent(labelCF)
                            .addComponent(labelGP)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(labelImage)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(labelFARM))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(labelCreativity)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnFoodProduction)
                            .addComponent(btnCocoFertilizer)
                            .addComponent(btnSeedFertilizer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGreatProduction))
                        .addGap(42, 42, 42))))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnClose)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImage)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(labelFARM)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCreativityDONTEDIT)
                    .addComponent(labelCreativity))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFP)
                    .addComponent(btnFoodProduction))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSF)
                    .addComponent(btnSeedFertilizer))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCF)
                    .addComponent(btnCocoFertilizer))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGP)
                    .addComponent(btnGreatProduction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(19, 19, 19))
        );

        pack();
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new MyClasses(gameData).setVisible(true);
    }

    private void btnFoodProductionActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.FOOD_PRODUCTION)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.FOOD_PRODUCTION));
    		BuildingTools.unlockUpgrade(BuildingTools.FARM, Farm.FOOD_PRODUCTION);
    		
    		btnFoodProduction.setText("Liberado");
    		btnFoodProduction.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void btnSeedFertilizerActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.SEED_FERTILIZER)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.SEED_FERTILIZER));
    		BuildingTools.unlockUpgrade(BuildingTools.FARM, Farm.SEED_FERTILIZER);
    		
    		btnSeedFertilizer.setText("Liberado");
    		btnSeedFertilizer.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void btnCocoFertilizerActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.COCO_FERTILIZER)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.COCO_FERTILIZER));
    		BuildingTools.unlockUpgrade(BuildingTools.FARM, Farm.COCO_FERTILIZER);
    		
    		btnCocoFertilizer.setText("Liberado");
    		btnCocoFertilizer.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void btnGreatProductionActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.GREAT_PRODUCTION)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.FARM, Farm.GREAT_PRODUCTION));
    		BuildingTools.unlockUpgrade(BuildingTools.FARM, Farm.GREAT_PRODUCTION);
    		
    		btnGreatProduction.setText("Liberado");
    		btnGreatProduction.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCocoFertilizer;
    private javax.swing.JButton btnFoodProduction;
    private javax.swing.JButton btnGreatProduction;
    private javax.swing.JButton btnSeedFertilizer;
    private javax.swing.JLabel labelCF;
    private javax.swing.JLabel labelCreativity;
    private javax.swing.JLabel labelCreativityDONTEDIT;
    private javax.swing.JLabel labelFARM;
    private javax.swing.JLabel labelFP;
    private javax.swing.JLabel labelGP;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelSF;
}