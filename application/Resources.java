package application;

import core.GameManager;

/**
 * Tela de interface para recursos.
 * @author Fernanda Marana
 */
public class Resources extends javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	GameManager gameData;
    int from;

    public Resources(GameManager gameData, int from) {
        this.setResizable(false);
      
        this.from = from;
        this.gameData = gameData;
        initComponents();
        labelGreatRubies.setText(Integer.toString(this.gameData.resources.getGreatRubies()));
        labelJavaSeeds.setText(Integer.toString(this.gameData.resources.getJavaSeeds()));
        labelMagicPerls.setText(Integer.toString(this.gameData.resources.getMagicPerls()));
        labelPyramids.setText(Integer.toString(this.gameData.resources.getPyramids()));
        labelScalaStones.setText(Integer.toString(this.gameData.resources.getScalaStones()));
        labelSharpCocos.setText(Integer.toString(this.gameData.resources.getSharpCocos()));
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelJavaSeeds = new javax.swing.JLabel();
        labelSharpCocos = new javax.swing.JLabel();
        labelMagicPerls = new javax.swing.JLabel();
        labelPyramids = new javax.swing.JLabel();
        labelScalaStones = new javax.swing.JLabel();
        labelGreatRubies = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Recursos");

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Java Seeds:");

        jLabel3.setText("Sharp Cocos:");

        jLabel4.setText("Magic Perls:");

        jLabel5.setText("Pyramids:");

        jLabel6.setText("Scala Stones:");

        jLabel7.setText("Great Rubies:");

        labelJavaSeeds.setText("QttdJavaSeeds");

        labelSharpCocos.setText("QttdSharpCocos");

        labelMagicPerls.setText("QttdMagicPerls");

        labelPyramids.setText("QttdPyramids");

        labelScalaStones.setText("QttdScalaStones");

        labelGreatRubies.setText("QttdGreatRubies");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJavaSeeds)
                    .addComponent(labelSharpCocos)
                    .addComponent(labelMagicPerls)
                    .addComponent(labelPyramids)
                    .addComponent(labelScalaStones)
                    .addComponent(labelGreatRubies))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelJavaSeeds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelSharpCocos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(labelMagicPerls))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(labelPyramids))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelScalaStones))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(labelGreatRubies))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        if(from==0){
            new Main(gameData).setVisible(true);
        } 
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelGreatRubies;
    private javax.swing.JLabel labelJavaSeeds;
    private javax.swing.JLabel labelMagicPerls;
    private javax.swing.JLabel labelPyramids;
    private javax.swing.JLabel labelScalaStones;
    private javax.swing.JLabel labelSharpCocos;
}
