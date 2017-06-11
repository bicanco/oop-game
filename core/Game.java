package core;

import application.Login;
import buildings.Building;
import buildings.Farm;
import java.awt.Frame;
import javax.swing.JFrame;

/**
 * Classe que gerencia o núcleo do jogo e da partida.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class Game {
	public static GameManager gameData = new GameManager();
        public static ResourceManager resourceTomorrow = new ResourceManager();
	
	public static void main(String[] args) {
		gameData.resources.updateJavaSeeds(500);
		gameData.resources.updateCreativity(100000);
		 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Login(gameData,resourceTomorrow).setVisible(true);
                
            }
        });
		
		
	}
}
