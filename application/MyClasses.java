package application;

import core.BuildingTools;
import core.GameManager;

/**
 * Tela de interface para gerenciar as Classes.
 * @author Fernanda Marana
 */
public class MyClasses extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	GameManager gameData;
    
    public MyClasses(GameManager gameData) {
        this.setResizable(false);
        this.gameData = gameData;
        initComponents();
        labelFarm.setText("");
        labelLab.setText("");
        labelTemple.setText("");
        labelMine.setText("");
        labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnUpdateFarm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDropFarm = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelFarm = new javax.swing.JLabel();
        labelLab = new javax.swing.JLabel();
        labelTemple = new javax.swing.JLabel();
        labelMine = new javax.swing.JLabel();
        btnDropLab = new javax.swing.JButton();
        btnDropTemple = new javax.swing.JButton();
        btnDropMine = new javax.swing.JButton();
        btnUpdateLab = new javax.swing.JButton();
        btnUpdateTemple = new javax.swing.JButton();
        btnUpdateMine = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        labelCriatividade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 24)); // NOI18N
        jLabel1.setText("Minhas Classes");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnUpdateFarm.setText("Melhorias");
        btnUpdateFarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFarmActionPerformed(evt);
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

        btnDropFarm.setText("Construir");
        btnDropFarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDropFarmActionPerformed(evt);
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

        btnUpdateLab.setText("Melhorias");
        btnUpdateLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateLabActionPerformed(evt);
            }
        });

        btnUpdateTemple.setText("Melhorias");
        btnUpdateTemple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTempleActionPerformed(evt);
            }
        });

        btnUpdateMine.setText("Melhorias");
        btnUpdateMine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMineActionPerformed(evt);
            }
        });

        jLabel14.setText("Criatividade:");

        labelCriatividade.setText("$500,00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(183, 183, 183)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelMine)
                                    .addComponent(labelLab)
                                    .addComponent(labelTemple)
                                    .addComponent(labelFarm)
                                    .addComponent(btnSair)))))
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
                                .addComponent(jLabel6)))))
                .addGap(6, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDropLab)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateLab))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDropTemple)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateTemple))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDropMine)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateMine))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDropFarm)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateFarm)))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel14))
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
                    .addComponent(btnUpdateFarm)
                    .addComponent(jLabel2)
                    .addComponent(btnDropFarm)
                    .addComponent(jLabel6)
                    .addComponent(labelFarm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(labelLab)
                    .addComponent(btnDropLab)
                    .addComponent(btnUpdateLab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(labelTemple)
                    .addComponent(btnDropTemple)
                    .addComponent(btnUpdateTemple))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(labelMine)
                    .addComponent(btnDropMine)
                    .addComponent(btnUpdateMine))
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new Main(gameData).setVisible(true);
    }

    private void btnDropFarmActionPerformed(java.awt.event.ActionEvent evt) {
       this.dispose();
       new MapForBuild(gameData, BuildingTools.FARM).setVisible(true); 
    }

    private void btnDropLabActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new MapForBuild(gameData, BuildingTools.LAB).setVisible(true);
    }

    private void btnDropTempleActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new MapForBuild(gameData, BuildingTools.TEMPLE).setVisible(true);
    }

    private void btnDropMineActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new MapForBuild(gameData, BuildingTools.MINE).setVisible(true);
    }

    private void btnUpdateFarmActionPerformed(java.awt.event.ActionEvent evt) {
         this.dispose();
        new FarmUpdate(gameData).setVisible(true);
    }

    private void btnUpdateLabActionPerformed(java.awt.event.ActionEvent evt) {
         this.dispose();
        new LabUpdate(gameData).setVisible(true);
    }

    private void btnUpdateTempleActionPerformed(java.awt.event.ActionEvent evt) {
         this.dispose();
         new TempleUpdate(gameData).setVisible(true);
    }

    private void btnUpdateMineActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new MineUpdate(gameData).setVisible(true);
    }
  
    private javax.swing.JButton btnDropFarm;
    private javax.swing.JButton btnDropLab;
    private javax.swing.JButton btnDropMine;
    private javax.swing.JButton btnDropTemple;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnUpdateFarm;
    private javax.swing.JButton btnUpdateLab;
    private javax.swing.JButton btnUpdateMine;
    private javax.swing.JButton btnUpdateTemple;
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
}
