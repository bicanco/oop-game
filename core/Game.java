package core;

import application.Login;

/**
 * Classe que gerencia o núcleo do jogo e da partida.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class Game {
	public static GameManager gameData = new GameManager();
	
	public static void main(String[] args) {
		gameData.resources.updateMagicPerls(500);
		gameData.resources.updatePyramids(500);
		gameData.resources.updateGreatRubies(500);
		gameData.resources.updateJavaSeeds(500);
		gameData.resources.updateSharpCocos(500);
		gameData.resources.updateGreatRubies(500);
		gameData.resources.updateOopyies(80000);
		gameData.resources.updateCreativity(1000000);
		 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Login(gameData).setVisible(true);
                
            }
        });
		
		
	}
}
