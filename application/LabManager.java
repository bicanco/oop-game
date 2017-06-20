
package application;

import buildings.Lab;
import core.BuildingTools;
import core.GameManager;

/**
 * Tela de interface para o gerenciamento de um Lab.
 * @author Fernanda Marana
 */
public class LabManager extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	GameManager gameData;
    int row, col;

    public LabManager(GameManager gameData, int row, int col) {
        this.setResizable(false);
        this.gameData = gameData;
        this.row = row;
        this.col = col;
        
        Lab lab = (Lab) gameData.grid.getBuilding(row, col);
        lab.reconfig(gameData.resources);
        
        initComponents();
        labelOopyiesEdit.setText(Integer.toString(gameData.resources.getOopyies()));
        
        CheckBoxCreativityProduction.setEnabled(BuildingTools.getUpgrade(BuildingTools.LAB, Lab.CREATIVITY_PRODUCTION));
        SpinnerOopyies.setEnabled(BuildingTools.getUpgrade(BuildingTools.LAB, Lab.CREATIVITY_PRODUCTION));
        CheckBoxBasicResearch.setEnabled(BuildingTools.getUpgrade(BuildingTools.LAB, Lab.BASIC_RESEARCH));
        SpinnerCocos.setEnabled(BuildingTools.getUpgrade(BuildingTools.LAB, Lab.BASIC_RESEARCH));
        CheckBoxGreatResearch.setEnabled(BuildingTools.getUpgrade(BuildingTools.LAB, Lab.GREAT_RESEARCH));
    }

    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelOopyiesEdit = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnResources = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SpinnerOopyies = new javax.swing.JSpinner();
        SpinnerCocos = new javax.swing.JSpinner();
        CheckBoxCreativityProduction = new javax.swing.JCheckBox();
        CheckBoxBasicResearch = new javax.swing.JCheckBox();
        CheckBoxGreatResearch = new javax.swing.JCheckBox();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LabBig.png"))); 

        jLabel2.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24)); 
        jLabel2.setText("LAB");

        jLabel3.setText("Oopyies Disponíveis:");

        labelOopyiesEdit.setText("0");

        jLabel5.setText("Produção de Criatividade:");

        jLabel6.setText("Pesquisa Básica:");

        btnResources.setText("Recursos");
        btnResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResourcesActionPerformed(evt);
            }
        });

        btnClose.setText("Sair");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel7.setText("Cocos Usados:");

        jLabel8.setText("Oopyies Alocados:");

        jLabel9.setText("Grande Pesquisa:");

        SpinnerOopyies.setModel(new javax.swing.SpinnerNumberModel(0, 0, 
        		gameData.resources.getOopyies(), 1));

        SpinnerCocos.setModel(new javax.swing.SpinnerNumberModel(0, 0,
        		gameData.resources.getSharpCocos(), 1));

        CheckBoxCreativityProduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxCreativityProductionActionPerformed(evt);
            }
        });

        CheckBoxBasicResearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxBasicResearchActionPerformed(evt);
            }
        });

        CheckBoxGreatResearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxGreatResearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(153, 153, 153))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(CheckBoxGreatResearch))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(SpinnerCocos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CheckBoxBasicResearch)))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CheckBoxCreativityProduction))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnResources)
                                    .addComponent(labelOopyiesEdit))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResources)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelOopyiesEdit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBoxCreativityProduction)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SpinnerOopyies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(SpinnerCocos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel9))
                            .addComponent(CheckBoxGreatResearch, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(CheckBoxBasicResearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnClose)
                .addGap(22, 22, 22))
        );

        pack();
    }

    private void CheckBoxCreativityProductionActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxBasicResearchActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void CheckBoxGreatResearchActionPerformed(java.awt.event.ActionEvent evt) {
    	if (CheckBoxGreatResearch.isSelected()){
    		CheckBoxCreativityProduction.setEnabled(false);
            SpinnerOopyies.setEnabled(false);
            CheckBoxBasicResearch.setEnabled(false);
            SpinnerCocos.setEnabled(false);
    	} else {
    		CheckBoxCreativityProduction.setEnabled(BuildingTools.getUpgrade(BuildingTools.LAB, Lab.CREATIVITY_PRODUCTION));
            SpinnerOopyies.setEnabled(BuildingTools.getUpgrade(BuildingTools.LAB, Lab.CREATIVITY_PRODUCTION));
            CheckBoxBasicResearch.setEnabled(BuildingTools.getUpgrade(BuildingTools.LAB, Lab.BASIC_RESEARCH));
            SpinnerCocos.setEnabled(BuildingTools.getUpgrade(BuildingTools.LAB, Lab.BASIC_RESEARCH));
    	}
    }

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {
    	Lab lab = (Lab) gameData.grid.getBuilding(row, col);
    	
        if(CheckBoxGreatResearch.isSelected()){
        	// great production
        	lab.checkGreatResearch(true);
        	gameData.resources.updateGreatRubies(-1);
        } else {
        	       	
        	// oopyies allocated
        	int oopyies = (Integer) SpinnerOopyies.getValue();
        	lab.allocateOopyies(oopyies);
        	gameData.resources.updateOopyies(-oopyies);
        	
        	// basic research
        	if (CheckBoxBasicResearch.isSelected()){
        		int cocos = (Integer) SpinnerCocos.getValue();
        		lab.updateCocosUsed(cocos);
        		gameData.resources.updateSharpCocos(-cocos);
        	}
        }
        
        this.dispose();
        new MapForUse(gameData).setVisible(true);
    }

    private void btnResourcesActionPerformed(java.awt.event.ActionEvent evt) {
        
        new Resources(gameData, 1).setVisible(true);
    }



    private javax.swing.JCheckBox CheckBoxBasicResearch;
    private javax.swing.JCheckBox CheckBoxCreativityProduction;
    private javax.swing.JCheckBox CheckBoxGreatResearch;
    private javax.swing.JSpinner SpinnerCocos;
    private javax.swing.JSpinner SpinnerOopyies;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnResources;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel labelOopyiesEdit;
}
