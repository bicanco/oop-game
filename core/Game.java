package core;

/**
 * Classe que gerencia o núcleo do jogo e da partida.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class Game {
	public static void main(String[] args) {
		HighScores hs = new HighScores();
		
		hs.insertNewScore(new Score("Renata", 300));
		hs.insertNewScore(new Score("Toschi", 500));
		hs.insertNewScore(new Score("Eclipse", 1000));
		hs.insertNewScore(new Score("Tiquinho", 1500));
		hs.insertNewScore(new Score("Renata", 1200));
		hs.insertNewScore(new Score("Toschi", 1100));
		
		System.out.println(hs);
	}
}
