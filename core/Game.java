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
		gameData.resources.updateMagicPerls(50000);
		gameData.resources.updatePyramids(50000);
		gameData.resources.updateGreatRubies(50000);
		gameData.resources.updateJavaSeeds(50000);
		gameData.resources.updateSharpCocos(50000);
		gameData.resources.updateGreatRubies(50000);
		gameData.resources.updateScalaStones(50000);
		gameData.resources.updateOopyies(10);
		gameData.resources.updateCreativity(1000000);
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Login(gameData).setVisible(true);
                
            }
        });
		
	}
}
