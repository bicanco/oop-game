package core;

import application.Login;
import buildings.Building;
import buildings.Farm;

/**
 * Classe que gerencia o núcleo do jogo e da partida.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class Game {
	public static GameManager gameData = new GameManager();
	
	public static void main(String[] args) {
		gameData.resources.updateJavaSeeds(500);
		
		/* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Login(gameData).setVisible(true);
            }
        });*/
		
		System.out.println(BuildingTools.getBuildCost(BuildingTools.FARM));
		System.out.println();
	}
}
