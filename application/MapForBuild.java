
package application;

import core.BuildingTools;
import core.GameManager;
import javax.swing.JOptionPane;

/**
 * Tela de interface para o mapa de instanciacao de construcoes.
 * @author Fernanda Marana
 */
public class MapForBuild extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	int type; // se for 0 eh pq abriu pelo Mapa, se for >0 abriu pelo Construir
    GameManager gameData;
    
    public MapForBuild(GameManager gameData, int build) {
        this.setResizable(false);
         this.gameData = gameData;
         type = build;
        initComponents();
        
        labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
        labelParaConstruir.setText(Integer.toString(BuildingTools.getBuildCost(build)));
       
       
    }

    private void initComponents() {

        new javax.swing.ButtonGroup();
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
        jLabel1 = new javax.swing.JLabel();
        labelCriatividade = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelParaConstruir = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        
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
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn0x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
         if(!gameData.grid.isEmpty(0, 0)){
            btn0x0.setText(gameData.grid.getName(0, 0));
            btn0x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(0,0))));
            btn0x0.setEnabled(false);
          
        }else {
            btn0x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn0x0.setText("A Venda");
            
         }
         btn0x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0x0ActionPerformed(evt);
            }
             });

        btn0x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(0, 1)){
            btn0x1.setText(gameData.grid.getName(0, 1));
            btn0x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(0,1))));
            btn0x1.setEnabled(false);
          
        }else {
            
            btn0x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn0x1.setText("A Venda");
            btn0x1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn0x1ActionPerformed(evt);
                }
            });
        }
         btn0x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(0, 2)){
            btn0x2.setText(gameData.grid.getName(0, 2));
            btn0x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(0,2))));
            btn0x2.setEnabled(false);
          
        }else {
           
            btn0x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn0x2.setText("A Venda");
            btn0x2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn0x2ActionPerformed(evt);
                }
            });
        }
        btn0x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11));
        if(!gameData.grid.isEmpty(0, 3)){
            btn0x3.setText(gameData.grid.getName(0, 3));
            btn0x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(0,3))));
            btn0x3.setEnabled(false);
           
        }else {
             
            btn0x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn0x3.setText("A Venda");
            btn0x3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn0x3ActionPerformed(evt);
                }
            });
        }
        btn0x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(0, 4)){
            btn0x4.setText(gameData.grid.getName(0, 4));
            btn0x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(0,4))));
            btn0x4.setEnabled(false);
          
        }else {
            
            btn0x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn0x4.setText("A Venda");
            btn0x4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn0x4ActionPerformed(evt);
                }
            });
        }
        
        btn1x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(1, 0)){
            btn1x0.setText(gameData.grid.getName(1, 0));
            btn1x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(1,0))));
            btn1x0.setEnabled(false);
          
        }else {
            
            btn1x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn1x0.setText("A Venda");
            btn1x0.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn1x0ActionPerformed(evt);
                }
            });
        }
        btn1x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(1, 1)){
            btn1x1.setText(gameData.grid.getName(1, 1));
            btn1x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(1,1))));
            btn1x1.setEnabled(false);
          
        }else {
            
            btn1x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn1x1.setText("A Venda");
            btn1x1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn1x1ActionPerformed(evt);
                }
            });
        }
        btn1x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); btn1x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
        if(!gameData.grid.isEmpty(1, 2)){
            btn1x2.setText(gameData.grid.getName(1, 2));
            btn1x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(1,2))));
            btn1x2.setEnabled(false);
          
        }else {
            
            btn1x2.setText("A Venda");
            btn1x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png")));
            btn1x2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn1x2ActionPerformed(evt);
                }
            });
        }
        btn1x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(1, 3)){
            btn1x3.setText(gameData.grid.getName(1, 3));
            btn1x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(1,3))));
            btn1x3.setEnabled(false);
          
        }else {
            
            btn1x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn1x3.setText("A Venda");
            btn1x3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn1x3ActionPerformed(evt);
                }
            });
        }
        btn1x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(1, 4)){
            btn1x4.setText(gameData.grid.getName(1, 4));
            btn1x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(1,4))));
            btn1x4.setEnabled(false);
          
        }else {
           
            btn1x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn1x4.setText("A Venda");
            btn1x4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn1x4ActionPerformed(evt);
                }
            });
        }
        
        btn2x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(2, 0)){
            btn2x0.setText(gameData.grid.getName(2, 0));
            btn2x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(2,0))));
            btn2x0.setEnabled(false);
          
        }else {
            
            btn2x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn2x0.setText("A Venda");
            btn2x0.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn2x0ActionPerformed(evt);
                }
            });
        }
        btn2x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(2,1)){
            btn2x1.setText(gameData.grid.getName(2,1));
            btn2x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(2,1))));
            btn2x1.setEnabled(false);
          
        }else {
            btn2x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn2x1.setText("A Venda");
            btn2x1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn2x1ActionPerformed(evt);
                }
            });
        }
         btn2x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(2,2)){
            btn2x2.setText(gameData.grid.getName(2,2));
            btn2x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(2,2))));
            btn2x2.setEnabled(false);
          
        }else {
           
            btn2x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn2x2.setText("A Venda");
            btn2x2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn2x2ActionPerformed(evt);
                }
            });
        }
        btn2x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(2,3)){
            btn2x3.setText(gameData.grid.getName(2,3));
            btn2x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(2,3))));
            btn2x3.setEnabled(false);
          
        }else {
            
            btn2x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn2x3.setText("A Venda");
            btn2x3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn2x3ActionPerformed(evt);
                }
            });
        }
        btn2x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(2,4)){
            btn2x4.setText(gameData.grid.getName(2,4));
            btn2x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(2,4))));
            btn2x4.setEnabled(false);
          
        }else {
            
            btn2x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn2x4.setText("A Venda");
            btn2x4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn2x4ActionPerformed(evt);
                }
            });
        }
        
        btn3x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(3, 0)){
            btn3x0.setText(gameData.grid.getName(3, 0));
            btn3x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(3,0))));
            btn3x0.setEnabled(false);
          
        }else {
            
            btn3x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn3x0.setText("A Venda");
            btn3x0.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn3x0ActionPerformed(evt);
                }
            });
        }
        
        btn3x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(3,1)){
            btn3x1.setText(gameData.grid.getName(3,1));
            btn3x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(3,1))));
            btn3x1.setEnabled(false);
          
        }else {
            
            btn3x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn3x1.setText("A Venda");
            btn3x1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn3x1ActionPerformed(evt);
                }
            });
        }
         btn3x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(3,2)){
            btn3x2.setText(gameData.grid.getName(3,2));
            btn3x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(3,2))));
            btn3x2.setEnabled(false);
          
        }else {
           
            btn3x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn3x2.setText("A Venda");
            btn3x2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn3x2ActionPerformed(evt);
                }
            });
        }
         btn3x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(3,3)){
            btn3x3.setText(gameData.grid.getName(3,3));
            btn3x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(3,3))));
            btn3x3.setEnabled(false);
          
        }else {
           
            btn3x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn3x3.setText("A Venda");
            btn3x3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn3x3ActionPerformed(evt);
                }
            });
        }
        btn3x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(3,4)){
            btn3x4.setText(gameData.grid.getName(3,4));
            btn3x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(3,4))));
            btn3x4.setEnabled(false);
          
        }else {
            
            btn3x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn3x4.setText("A Venda");
            btn3x4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn3x4ActionPerformed(evt);
                }
            });
        }
        btn4x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(4, 0)){
            btn4x0.setText(gameData.grid.getName(4, 0));
            btn4x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(4,0))));
            btn4x0.setEnabled(false);
          
        }else {
            
            btn4x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn4x0.setText("A Venda");
            btn4x0.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn4x0ActionPerformed(evt);
                }
            });
        }
        btn4x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(4,1)){
            btn4x1.setText(gameData.grid.getName(4,1));
            btn4x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(4,1))));
            btn4x1.setEnabled(false);
          
        }else {
            
            btn4x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn4x1.setText("A Venda");
            btn4x1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn4x1ActionPerformed(evt);
                }
            });
        }
        btn4x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(4,2)){
            btn4x2.setText(gameData.grid.getName(4,2));
            btn4x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(4,2))));
            btn4x2.setEnabled(false);
          
        }else {
            
            btn4x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn4x2.setText("A Venda");
            btn4x2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn4x2ActionPerformed(evt);
                }
            });
        }
         btn4x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(4,3)){
            btn4x3.setText(gameData.grid.getName(4,3));
            btn4x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(4,3))));
            btn4x3.setEnabled(false);
          
        }else {
           
            btn4x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn4x3.setText("A Venda");
            btn4x3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn4x3ActionPerformed(evt);
                }
            });
        }
         btn4x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(4,4)){
            btn4x4.setText(gameData.grid.getName(4,4));
            btn4x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(4,4))));
            btn4x4.setEnabled(false);
          
        }else {
           
            btn4x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn4x4.setText("A Venda");
            btn4x4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn4x4ActionPerformed(evt);
                }
            });
        }
        btn5x0.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(5, 0)){
            btn5x0.setText(gameData.grid.getName(5, 0));
            btn5x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(5,0))));
            btn5x0.setEnabled(false);
          
        }else {
            
            btn5x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn5x0.setText("A Venda");
            btn5x0.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn5x0ActionPerformed(evt);
                }
            });
        }
        
        btn5x1.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(5,1)){
            btn5x1.setText(gameData.grid.getName(5,1));
            btn5x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(5,1))));
            btn5x1.setEnabled(false);
          
        }else {
            
            btn5x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn5x1.setText("A Venda");
            btn5x1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn5x1ActionPerformed(evt);
                }
            });
        }
         btn5x2.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(5,2)){
            btn5x2.setText(gameData.grid.getName(5,2));
            btn5x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(5,2))));
            btn5x2.setEnabled(false);
          
        }else {
           
            btn5x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn5x2.setText("A Venda");
            btn5x2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn5x2ActionPerformed(evt);
                }
            });
        }
         btn5x3.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 

        if(!gameData.grid.isEmpty(5,3)){
            btn5x3.setText(gameData.grid.getName(5,3));
            btn5x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(5,3))));
            btn5x3.setEnabled(false);
          
        }else {
                       btn5x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn5x3.setText("A Venda");
            btn5x3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn5x3ActionPerformed(evt);
                }
            });
        }
        btn5x4.setFont(new java.awt.Font("BlairMdITC TT", 0, 11)); 
        if(!gameData.grid.isEmpty(5,4)){
            btn5x4.setText(gameData.grid.getName(5,4));
            btn5x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + gameData.grid.getIcon(5,4))));
            btn5x4.setEnabled(false);
          
        }else {
            
            btn5x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sale.png"))); 
            btn5x4.setText("A Venda");
            btn5x4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btn5x4ActionPerformed(evt);
                }
            });
        }
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel1.setText("Criatividade:");

        labelCriatividade.setText("QttdCriatividade");

        jLabel2.setText("Custo para Construir:");

        labelParaConstruir.setText("QttdParaConstruir");
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(0, 147, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(sair))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(labelCriatividade)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(labelParaConstruir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn0x0, btn0x1, btn0x2, btn0x3, btn0x4, btn1x0, btn1x1, btn1x2, btn1x3, btn1x4, btn2x0, btn2x1, btn2x2, btn2x3, btn2x4, btn3x0, btn3x1, btn3x2, btn3x3, btn3x4, btn4x0, btn4x1, btn4x2, btn4x3, btn4x4, btn5x0, btn5x1, btn5x2, btn5x3, btn5x4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCriatividade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(labelParaConstruir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair))
        );

        pack();
    }

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {
         this.dispose();
         new MyClasses(gameData).setVisible(true);
    }
    private void btn0x0ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(0, 0) && gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
            btn0x0.setText(BuildingTools.getName(type));
            btn0x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn0x0.setEnabled(false);
            gameData.grid.build(0, 0, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
            
        
        
    }

   
    private void btn0x1ActionPerformed(java.awt.event.ActionEvent evt) {
         if(gameData.grid.isEmpty(0, 1)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
            btn0x1.setText(BuildingTools.getName(type));
            btn0x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn0x1.setEnabled(false);
            gameData.grid.build(0, 1, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
        
        
    }
     private void btn0x2ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(0, 2)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
            btn0x2.setText(BuildingTools.getName(type));
            btn0x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn0x2.setEnabled(false);
            gameData.grid.build(0, 2, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
        
        
       
    }

    private void btn0x3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(0, 3)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity())); 
           btn0x3.setText(BuildingTools.getName(type));
            btn0x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn0x3.setEnabled(false);
            gameData.grid.build(0, 3, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn0x4ActionPerformed(java.awt.event.ActionEvent evt) {
       if(gameData.grid.isEmpty(0, 4)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn0x4.setText(BuildingTools.getName(type));
            btn0x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn0x4.setEnabled(false);
            gameData.grid.build(0, 4, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn1x0ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(1, 0)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn1x0.setText(BuildingTools.getName(type));
            btn1x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn1x0.setEnabled(false);
            gameData.grid.build(1, 0, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn1x1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(1,1)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn1x1.setText(BuildingTools.getName(type));
            btn1x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn1x1.setEnabled(false);
            gameData.grid.build(1,1, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn1x2ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(1,2)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn1x2.setText(BuildingTools.getName(type));
            btn1x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn1x2.setEnabled(false);
            gameData.grid.build(1,2, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn1x3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(1,3)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn1x3.setText(BuildingTools.getName(type));
            btn1x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn1x3.setEnabled(false);
            gameData.grid.build(1,3, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn1x4ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(1,4)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn1x4.setText(BuildingTools.getName(type));
            btn1x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn1x4.setEnabled(false);
            gameData.grid.build(1,4, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn2x0ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(2,0)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn2x0.setText(BuildingTools.getName(type));
            btn2x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn2x0.setEnabled(false);
            gameData.grid.build(2,0, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn2x1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(2,1)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn2x1.setText(BuildingTools.getName(type));
            btn2x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn2x1.setEnabled(false);
            gameData.grid.build(2,1, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn2x2ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(2,2)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn2x2.setText(BuildingTools.getName(type));
            btn2x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn2x2.setEnabled(false);
            gameData.grid.build(2,2, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }
    
    private void btn2x3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(2,3)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn2x3.setText(BuildingTools.getName(type));
            btn2x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn2x3.setEnabled(false);
            gameData.grid.build(2,3, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn2x4ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(2,4)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
          labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn2x4.setText(BuildingTools.getName(type));
            btn2x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn2x4.setEnabled(false);
            gameData.grid.build(2,4, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn3x0ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(3,0)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn3x0.setText(BuildingTools.getName(type));
            btn3x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn3x0.setEnabled(false);
            gameData.grid.build(3,0, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn3x1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(3,1)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn3x1.setText(BuildingTools.getName(type));
            btn3x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn3x1.setEnabled(false);
            gameData.grid.build(3,1, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn3x2ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(3,2)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn3x2.setText(BuildingTools.getName(type));
            btn3x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn3x2.setEnabled(false);
            gameData.grid.build(3,2, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn3x3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(3,3)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn3x3.setText(BuildingTools.getName(type));
            btn3x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn3x3.setEnabled(false);
            gameData.grid.build(3,3, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn3x4ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(3,4)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));btn3x4.setText(BuildingTools.getName(type));
            btn3x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn3x4.setEnabled(false);
            gameData.grid.build(3,4, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn4x0ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(4,0)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn4x0.setText(BuildingTools.getName(type));
            btn4x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn4x0.setEnabled(false);
            gameData.grid.build(4,0, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn4x1ActionPerformed(java.awt.event.ActionEvent evt) {
         if(gameData.grid.isEmpty(4,1)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn4x1.setText(BuildingTools.getName(type));
            btn4x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn4x1.setEnabled(false);
            gameData.grid.build(4,1, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn4x2ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(gameData.grid.isEmpty(4,2)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
          labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn4x2.setText(BuildingTools.getName(type));
            btn4x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn4x2.setEnabled(false);
            gameData.grid.build(4,2, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn4x3ActionPerformed(java.awt.event.ActionEvent evt) {
         if(gameData.grid.isEmpty(4,3)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn4x3.setText(BuildingTools.getName(type));
            btn4x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn4x3.setEnabled(false);
            gameData.grid.build(4,3, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn4x4ActionPerformed(java.awt.event.ActionEvent evt) {
         if(gameData.grid.isEmpty(4,4)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
          labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn4x4.setText(BuildingTools.getName(type));
            btn4x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn4x4.setEnabled(false);
            gameData.grid.build(4,4, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn5x0ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(5,0)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn5x0.setText(BuildingTools.getName(type));
            btn5x0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn5x0.setEnabled(false);
            gameData.grid.build(5,0, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn5x1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(5,1)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn5x1.setText(BuildingTools.getName(type));
            btn5x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn5x1.setEnabled(false);
            gameData.grid.build(5,1, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn5x2ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(5,2)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn5x2.setText(BuildingTools.getName(type));
            btn5x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn5x2.setEnabled(false);
            gameData.grid.build(5,2, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn5x3ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(5,3)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn5x3.setText(BuildingTools.getName(type));
            btn5x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn5x3.setEnabled(false);
            gameData.grid.build(5,3, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

    private void btn5x4ActionPerformed(java.awt.event.ActionEvent evt) {
        if(gameData.grid.isEmpty(5,4)&& gameData.resources.getCreativity() >= BuildingTools.getBuildCost(type)){
           gameData.resources.updateCreativity(-BuildingTools.getBuildCost(type));
           labelCriatividade.setText(Integer.toString(gameData.resources.getCreativity()));
           btn5x4.setText(BuildingTools.getName(type));
            btn5x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/" + BuildingTools.getIcon(type))));
            btn5x4.setEnabled(false);
            gameData.grid.build(5,4, BuildingTools.instantiateBuilding(type), gameData.resources);
        } else {
    		JOptionPane.showMessageDialog(null, "Voce nao esta inspirado o suficiente para entender como isso funciona... Busque mais criatividade!", "Bloqueio Criativo",
    				JOptionPane.ERROR_MESSAGE);
    	}
    }

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelCriatividade;
    private javax.swing.JLabel labelParaConstruir;
    private javax.swing.JButton sair;

}

