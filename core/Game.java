package core;

import application.Login;

/**
 * Classe que gerencia o núcleo do jogo e da partida.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class Game {
	public static HighScores highScores = new HighScores();
	public static ResourceManager resources = new ResourceManager();
	public static TurnManager turns = new TurnManager();
	public static GridManager grid = new GridManager();
	public static void main(String[] args) {
		 java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Login(resources).setVisible(true);
            }
        });
		
	}
}
