
package application;

import core.BuildingTools;
import core.GameManager;

import javax.swing.JComboBox;

import buildings.Farm;

/**
 * Tela de interface para o gerenciamento de uma Ro�a.
 * @author Fernanda Marana
 */
public class FarmManager extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	GameManager gameData;
    int row, col;
    
    public FarmManager(GameManager gameData, int row, int col) {
        this.setResizable(false);
        this.gameData = gameData;
        this.row = row;
        this.col = col;
        
        Farm farm = (Farm) gameData.grid.getBuilding(row, col);
        farm.reconfig(gameData.resources);
        
        initComponents();
        String[] messageStrings = {"Seeds", "Cocos"};
        JComboBox<String> ComboBoxFoodProduction = new JComboBox<String>(messageStrings);
        labelOopyiesEdit.setText(Integer.toString(gameData.resources.getOopyies()));
        
        ComboBoxFoodProduction.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.FOOD_PRODUCTION));
        SpinnerOopyies.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.FOOD_PRODUCTION));   
        CheckBoxCocoFertilizer.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.COCO_FERTILIZER));  
        SpinnerPyramids.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.COCO_FERTILIZER));  
        CheckBoxSeedFertilizer.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.SEED_FERTILIZER));  
        SpinnerMagicPerls.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.SEED_FERTILIZER));
        CheckBoxGreatProduction.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.GREAT_PRODUCTION));
        
        CheckBoxCocoFertilizer.setEnabled(false);
        SpinnerPyramids.setEnabled(false);
    }

    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SpinnerOopyies = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        labelOopyiesEdit = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnResources = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CheckBoxSeedFertilizer = new javax.swing.JCheckBox();
        CheckBoxCocoFertilizer = new javax.swing.JCheckBox();
        SpinnerMagicPerls = new javax.swing.JSpinner();
        SpinnerPyramids = new javax.swing.JSpinner();
        CheckBoxGreatProduction = new javax.swing.JCheckBox();
        ComboBoxFoodProduction = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24));
        jLabel1.setText("ROÇA");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FarmBig.png")));

        jLabel3.setText("Oopyies Alocados:");

        SpinnerOopyies.setModel(new javax.swing.SpinnerNumberModel(0, 0, 
        		gameData.resources.getOopyies(), 1));

        jLabel4.setText("Oopyies Disponíveis:");

        labelOopyiesEdit.setText("0");

        btnClose.setText("Sair");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnResources.setText("Recursos");
        btnResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResourcesActionPerformed(evt);
            }
        });

        jLabel5.setText("Alimento a ser Produzido:");

        jLabel6.setText("Fertilizador de Semente:");

        jLabel7.setText("Magic Perls Usadas:");

        jLabel8.setText("Fertilizador de Cocos");

        jLabel9.setText("Pyramids Usadas:");

        jLabel10.setText("Grande Produção:");

        CheckBoxSeedFertilizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxSeedFertilizerActionPerformed(evt);
            }
        });

        CheckBoxCocoFertilizer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxCocoFertilizerActionPerformed(evt);
            }
        });

        SpinnerMagicPerls.setModel(new javax.swing.SpinnerNumberModel(0, 0, 
        		gameData.resources.getMagicPerls(), 1));

        SpinnerPyramids.setModel(new javax.swing.SpinnerNumberModel(0, 0,
        		gameData.resources.getPyramids(), 1));

        CheckBoxGreatProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxGreatProductionActionPerformed(evt);
            }
        });

        ComboBoxFoodProduction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seeds", "Cocos" }));
        ComboBoxFoodProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFoodProductionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(79, 79, 79)
                                    .addComponent(labelOopyiesEdit))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(68, 68, 68)
                                            .addComponent(btnResources))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(81, 81, 81)
                                            .addComponent(jLabel1))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComboBoxFoodProduction, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CheckBoxCocoFertilizer))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SpinnerMagicPerls, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(135, 135, 135)
                                        .addComponent(SpinnerPyramids, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CheckBoxGreatProduction))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CheckBoxSeedFertilizer)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResources)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelOopyiesEdit))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboBoxFoodProduction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(CheckBoxSeedFertilizer))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(SpinnerMagicPerls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(CheckBoxCocoFertilizer))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(SpinnerPyramids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(CheckBoxGreatProduction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(31, 31, 31))
        );

        pack();
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
    	Farm farm = (Farm) gameData.grid.getBuilding(row, col);
    	
        if(CheckBoxGreatProduction.isSelected()){
        	// great production
        	farm.checkGreatProduction(true);
        	gameData.resources.updateGreatRubies(-1);
        } else {
        	// food type
        	if(ComboBoxFoodProduction.getSelectedItem().toString().equals("Seeds"))
        		farm.setFoodType(Farm.SEED);
        	else farm.setFoodType(Farm.COCO);
        	
        	// oopyies allocated
        	int oopyies = (Integer) SpinnerOopyies.getValue();
        	farm.allocateOopyies(oopyies);
        	gameData.resources.updateOopyies(-oopyies);
        	
        	// seed fertilizer
        	if (CheckBoxSeedFertilizer.isSelected()){
        		int perls = (Integer) SpinnerMagicPerls.getValue();
        		farm.setPerls(perls);
        		gameData.resources.updateMagicPerls(-perls);
        	}
        	
        	// seed fertilizer
        	if (CheckBoxCocoFertilizer.isSelected()){
        		int pyramids = (Integer) SpinnerPyramids.getValue();
        		farm.setPyramids(pyramids);
        		gameData.resources.updatePyramids(-pyramids);
        	}
        }
        
        this.dispose();
        new MapForUse(gameData).setVisible(true);
    }

    private void CheckBoxSeedFertilizerActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxCocoFertilizerActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxGreatProductionActionPerformed(java.awt.event.ActionEvent evt) {
    	if (CheckBoxGreatProduction.isSelected()){
            SpinnerOopyies.setEnabled(false);   
            CheckBoxCocoFertilizer.setEnabled(false);  
            SpinnerPyramids.setEnabled(false);  
            CheckBoxSeedFertilizer.setEnabled(false);  
            SpinnerMagicPerls.setEnabled(false);
    	} else {
            SpinnerOopyies.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.FOOD_PRODUCTION));   
            CheckBoxCocoFertilizer.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.COCO_FERTILIZER));  
            SpinnerPyramids.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.COCO_FERTILIZER));  
            CheckBoxSeedFertilizer.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.SEED_FERTILIZER));  
            SpinnerMagicPerls.setEnabled(BuildingTools.getUpgrade(BuildingTools.FARM, Farm.SEED_FERTILIZER));
            
            CheckBoxCocoFertilizer.setEnabled(false);
            SpinnerPyramids.setEnabled(false);
    	}
    }

    private void ComboBoxFoodProductionActionPerformed(java.awt.event.ActionEvent evt) {
        if(ComboBoxFoodProduction.getSelectedItem().toString().equals("Seeds")){
            CheckBoxCocoFertilizer.setEnabled(false);
            CheckBoxCocoFertilizer.setSelected(false);
            SpinnerPyramids.setEnabled(false);
            SpinnerPyramids.setValue(0);
            
            if (BuildingTools.getUpgrade(BuildingTools.FARM, Farm.SEED_FERTILIZER)){
            	CheckBoxSeedFertilizer.setEnabled(true);
                SpinnerMagicPerls.setEnabled(true);
            }
        } else if(ComboBoxFoodProduction.getSelectedItem().toString().equals("Cocos")){
            CheckBoxSeedFertilizer.setEnabled(false);
            CheckBoxSeedFertilizer.setSelected(false);
            SpinnerMagicPerls.setEnabled(false);
            SpinnerMagicPerls.setValue(0);
            
            if (BuildingTools.getUpgrade(BuildingTools.FARM, Farm.COCO_FERTILIZER)){
            	CheckBoxCocoFertilizer.setEnabled(true);
            	SpinnerPyramids.setEnabled(true);
            }
        }
        
    }

    private void btnResourcesActionPerformed(java.awt.event.ActionEvent evt) {
 
         new application.Resources(gameData, 1).setVisible(true); 
    }

    private javax.swing.JCheckBox CheckBoxCocoFertilizer;
    private javax.swing.JCheckBox CheckBoxGreatProduction;
    private javax.swing.JCheckBox CheckBoxSeedFertilizer;
    private javax.swing.JComboBox<String> ComboBoxFoodProduction;
    private javax.swing.JSpinner SpinnerMagicPerls;
    private javax.swing.JSpinner SpinnerOopyies;
    private javax.swing.JSpinner SpinnerPyramids;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnResources;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelOopyiesEdit;
}
