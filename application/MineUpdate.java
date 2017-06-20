package application;

import javax.swing.JOptionPane;
import buildings.Mine;
import core.BuildingTools;
import core.GameManager;

/**
 * Tela de interface para melhorias da Mina.
 * @author Fernanda Marana
 */
public class MineUpdate extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	GameManager gameData;

    public MineUpdate(GameManager gameData) {
        this.setResizable(false);
        this.gameData = gameData;
        initComponents();
        
        labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
        
        if (BuildingTools.getUpgrade(BuildingTools.MINE, Mine.STONE_PRODUCTION)){
    		btnStoneProduction.setText("Liberado");
    		btnStoneProduction.setEnabled(false);
    	} else {
    		btnStoneProduction.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.MINE, Mine.STONE_PRODUCTION));
            btnStoneProduction.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnStoneProductionActionPerformed(evt);
                }
            });
    	}

        if (BuildingTools.getUpgrade(BuildingTools.MINE, Mine.USE_PICKAXE)){
    		btnPickAxe.setText("Liberado");
    		btnPickAxe.setEnabled(false);
    	} else {
    		btnPickAxe.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.MINE, Mine.USE_PICKAXE));
            btnPickAxe.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnPickAxeActionPerformed(evt);
                }
            });
    	}

        if (BuildingTools.getUpgrade(BuildingTools.MINE, Mine.GREAT_ESCAVATION)){
    		btnGreatEscavation.setText("Liberado");
    		btnGreatEscavation.setEnabled(false);
    	} else {
    		btnGreatEscavation.setText("Bloqueado: " + BuildingTools.getUpgradeCost(BuildingTools.MINE, Mine.GREAT_ESCAVATION));
            btnGreatEscavation.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnGreatEscavationActionPerformed(evt);
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
        labelCreativity = new javax.swing.JLabel();
        btnStoneProduction = new javax.swing.JButton();
        btnPickAxe = new javax.swing.JButton();
        btnGreatEscavation = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MineBig.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24)); // NOI18N
        jLabel2.setText("MINA");

        jLabel3.setText("Escavacao de Pedras:");

        jLabel4.setText("Usar Picaretas:");

        jLabel5.setText("Explosao Rubra:");

        jLabel6.setText("Criatividade:");

        labelCreativity.setText("0");

        btnStoneProduction.setText("Bloqueado: 30");

        btnPickAxe.setText("Bloqueado: 30");

        btnGreatEscavation.setText("Bloqueado: 30");

        btnClose.setText("Sair");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(labelCreativity)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2)
                                .addContainerGap(97, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPickAxe)
                                    .addComponent(btnStoneProduction)
                                    .addComponent(btnGreatEscavation))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnClose)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelCreativity))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnStoneProduction))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnPickAxe))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnGreatEscavation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(33, 33, 33))
        );

        pack();
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {                                        
        this.dispose();
        new MyClasses(gameData).setVisible(true);
    }
    
    private void btnStoneProductionActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.MINE, Mine.STONE_PRODUCTION)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.MINE, Mine.STONE_PRODUCTION));
    		BuildingTools.unlockUpgrade(BuildingTools.MINE, Mine.STONE_PRODUCTION);
    		
    		btnStoneProduction.setText("Liberado");
    		btnStoneProduction.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void btnPickAxeActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.MINE, Mine.USE_PICKAXE)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.MINE, Mine.USE_PICKAXE));
    		BuildingTools.unlockUpgrade(BuildingTools.MINE, Mine.USE_PICKAXE);
    		
    		btnPickAxe.setText("Liberado");
    		btnPickAxe.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void btnGreatEscavationActionPerformed(java.awt.event.ActionEvent evt) {
    	if (gameData.resources.getCreativity() >= BuildingTools.getUpgradeCost(BuildingTools.MINE, Mine.GREAT_ESCAVATION)){
    		gameData.resources.updateCreativity(-BuildingTools.getUpgradeCost(BuildingTools.MINE, Mine.GREAT_ESCAVATION));
    		BuildingTools.unlockUpgrade(BuildingTools.MINE, Mine.GREAT_ESCAVATION);
    		
    		btnGreatEscavation.setText("Liberado");
    		btnGreatEscavation.setEnabled(false);
    		
    		labelCreativity.setText(Integer.toString(gameData.resources.getCreativity()));
    	} else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGreatEscavation;
    private javax.swing.JButton btnPickAxe;
    private javax.swing.JButton btnStoneProduction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelCreativity;
}
