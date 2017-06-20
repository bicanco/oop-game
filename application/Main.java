
package application;
import core.GameManager;


/**
 * Tela de interface principal do jogo.
 * @author Fernanda Marana
 */
public class Main extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	int value;
    GameManager gameData;
    
    public Main(GameManager gameData) {
        this.setResizable(false);
      
        value = 0;
        this.gameData = gameData;
        initComponents();  
        setImage(gameData.iconname);
        labelUser.setText(gameData.username);
        labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
        labelOopyies.setText(Integer.toString(gameData.resources.getOopyies()));
        
        labelDiaAtual.setText(Integer.toString(gameData.turns.getCurrentTurn()));
        labelDiadePagamento.setText(Integer.toString(gameData.turns.getNextPayTurn()));
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
    
    private void initComponents() {

        labelImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRecursos = new javax.swing.JButton();
        btnMyClasses = new javax.swing.JButton();
        btnTrocasDiarias = new javax.swing.JButton();
        btnMapa = new javax.swing.JButton();
        btnTurno = new javax.swing.JButton();
        labelUser = new javax.swing.JLabel();
        labelOopyies = new javax.swing.JLabel();
        labelCriatividade = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelDiaAtual = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelDiadePagamento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        labelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CatBig.png"))); 

        jLabel2.setText("Usuario:");

        jLabel3.setText("Oopyies:");

        jLabel4.setText("Criatividade:");

        btnRecursos.setText("Recursos");
        btnRecursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecursosActionPerformed(evt);
            }
        });

        btnMyClasses.setText("Minhas Classes");
        btnMyClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyClassesActionPerformed(evt);
            }
        });

        btnTrocasDiarias.setText("Trocas Diarias");
        btnTrocasDiarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocasDiariasActionPerformed(evt);
            }
        });

        btnMapa.setText("Mapa");
        btnMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMapaActionPerformed(evt);
            }
        });

        btnTurno.setFont(new java.awt.Font("Apple Color Emoji", 0, 14)); 
        btnTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/nascerdosol.png"))); 
        btnTurno.setText("Iniciar Dia");
        btnTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTurnoActionPerformed(evt);
            }
        });

        labelUser.setText("nome");

        labelOopyies.setText("0");

        labelCriatividade.setText("0");

        jLabel1.setText("Dia Atual:");

        labelDiaAtual.setText("0");

        jLabel5.setText("Proximo Dia de Pagamento:");

        labelDiadePagamento.setText("19");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelImage)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(labelDiaAtual)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnMapa)
                                .addComponent(btnRecursos)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelUser)
                                    .addComponent(labelOopyies)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelDiadePagamento))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(labelCriatividade))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMyClasses)
                    .addComponent(btnTrocasDiarias))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(labelUser))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(labelOopyies))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(labelCriatividade)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelDiaAtual)
                            .addComponent(jLabel5)
                            .addComponent(labelDiadePagamento))
                        .addGap(18, 18, 18)
                        .addComponent(labelImage)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRecursos)
                            .addComponent(btnMyClasses))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTrocasDiarias)
                            .addComponent(btnMapa))
                        .addGap(37, 37, 37)))
                .addComponent(btnTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }

    private void btnRecursosActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new Resources(gameData, 0).setVisible(true); 
    }

    private void btnMyClassesActionPerformed(java.awt.event.ActionEvent evt) {
   
         this.dispose();
        new MyClasses(gameData).setVisible(true);
        
    }

    private void btnMapaActionPerformed(java.awt.event.ActionEvent evt) {
        
         this.dispose();
        new MapForUse(gameData).setVisible(true);
    }
    private void btnTrocasDiariasActionPerformed(java.awt.event.ActionEvent evt) {
        new DailyChanges(gameData).setVisible(true);
    }

    private void btnTurnoActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new NextTurn(gameData).setVisible(true);
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
    
        
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {
    }
   
    
    private javax.swing.JButton btnMapa;
    private javax.swing.JButton btnMyClasses;
    private javax.swing.JButton btnRecursos;
    private javax.swing.JButton btnTrocasDiarias;
    private javax.swing.JButton btnTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelCriatividade;
    private javax.swing.JLabel labelDiaAtual;
    private javax.swing.JLabel labelDiadePagamento;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelOopyies;
    private javax.swing.JLabel labelUser;
}
