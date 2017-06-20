package core;

import application.Login;

/**
 * Classe que gerencia o nucleo do jogo e da partida.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class Game {
	public static GameManager gameData = new GameManager();
	
	public static void main(String[] args) {
		// recursos iniciais
		gameData.resources.updateGreatRubies(0);
		gameData.resources.updateJavaSeeds(50);
		gameData.resources.updateSharpCocos(50);
		gameData.resources.updateMagicPerls(0);
		gameData.resources.updatePyramids(0);
		gameData.resources.updateScalaStones(0);
		gameData.resources.updateOopyies(10);
		gameData.resources.updateCreativity(110);
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Login(gameData).setVisible(true);
                
            }
        });
		
	}
}
