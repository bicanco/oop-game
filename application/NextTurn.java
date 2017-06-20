package application;

import core.GameManager;
import core.ResourceManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * Tela de interface para passagem de dia (turno).
 * @author Fernanda Marana
 */

public class NextTurn extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	GameManager gameData;

    public NextTurn(GameManager gameData) {
        this.setResizable(false);
        this.gameData = gameData;
        initComponents();
        jProgressBar1.setValue(0);
        
        jButton1.setVisible(false);
    }

    public class progresso implements ActionListener{
        public void actionPerformed(ActionEvent evt){
            
            int n = jProgressBar1.getValue();
            if(n<100){
                n++;
                 jProgressBar1.setValue(n);
                
            }else{
                timer.stop();
                jLabel1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wow.gif")));
                JOptionPane.showMessageDialog(null, "O sol acabou de se por!", null, 0, new javax.swing.ImageIcon(getClass().getResource("/Imagens/pordosol.png")));
                jButton1.setVisible(true);
            }
            
        }
    
}

    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jProgressBar1.setBackground(java.awt.SystemColor.textHighlight);
        jProgressBar1.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setStringPainted(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wow.gif"))); // NOI18N

        jButton1.setText("Encerrar Dia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        timer = new Timer(50, new progresso());
        timer.start();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	ResourceManager tomorrow = gameData.grid.runTurn();
    	JOptionPane.showMessageDialog(null, tomorrow.resultsToString(), "Batendo o Ponto",
				JOptionPane.INFORMATION_MESSAGE);
    	gameData.resources.incorpore(tomorrow);
    	gameData.grid.reset();
    	
    	gameData.turns.nextTurn();
    	
    	// novas trocas diarias
    	gameData.daily.turnDay();
    	
    	// alimentar oopyies
    	gameData.turns.feedOopyies(gameData.resources);
    	if (gameData.turns.getLastOopyiesGone() > 0) {
    		JOptionPane.showMessageDialog(this, "Por falta de comida, " + gameData.turns.getLastOopyiesGone() + " Oopyies foram embora. Triste. "
    				+ "Nao deixe mais isso acontecer. Eles nao merecem.", "Bando de Antropologos Noruegueses Dando Estruturas de Comida para Oopyies",
					JOptionPane.ERROR_MESSAGE);
    	} else {
    		JOptionPane.showMessageDialog(this, "Todos os seus Oopyies foram alimentados. Seus armazens, agora, tem "
    				+ gameData.turns.getLastSeedsUsed() + " Java Seeds e " + gameData.turns.getLastCocosUsed()
    				+ " Sharp Cocos a menos.", "Bando de Antropologos Noruegueses Dando Estruturas de Comida para Oopyies",
					JOptionPane.INFORMATION_MESSAGE);
    	}
    	
    	// sem oopyies, fim de jogo
    	if(gameData.resources.getOopyies() == 0){
    		this.dispose();
			new GameOver(gameData).setVisible(true);
    	} else {
	    	// novos oopyies
	    	int newOopyies = gameData.turns.newOopyies(gameData.resources);
	    	int acceptOopyies = JOptionPane.showConfirmDialog(this, "Acabaram de chegar "
	    			+ newOopyies + " Oopyies por aqui. Eles querem trabalhar para voce."
	    					+ " Voce aceita?", "Exodo Oopyral", JOptionPane.YES_NO_OPTION);
	    	if (acceptOopyies == JOptionPane.YES_OPTION)
	    		gameData.resources.updateOopyies(newOopyies);
	   
	    	// checagem do dia de pagamento
	    	if (gameData.turns.isPayTurn()){
	    		if (gameData.turns.executePayTurn(gameData.resources)){
	    			JOptionPane.showMessageDialog(this, "Para continuar usando o sistema, voce devera pagar " +
								gameData.turns.getPayTurnRubies() + " Great Rubies no dia " +
								gameData.turns.getNextPayTurn() + ".", "Servico Semi-Voluntario de Colaboracao Monetaria",
								JOptionPane.INFORMATION_MESSAGE);
	    			new Main(gameData).setVisible(true);
	    		} else {
	    			JOptionPane.showMessageDialog(this, "Voce nao colaborou com Great Rubies no dia correto. Voce esta sendo"
	    					+ "desligado do nosso sistema.", "Servico Semi-Voluntario de Colaboracao Monetaria",
							JOptionPane.ERROR_MESSAGE);
	    			this.dispose();
	    			new GameOver(gameData).setVisible(true);
	    		}
	    	} else {
	    		new Main(gameData).setVisible(true);
	    	}
    	}
        this.dispose();
        
    }

    private Timer timer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
}
