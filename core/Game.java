package core;

/**
 * Classe que gerencia o núcleo do jogo e da partida.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class Game {
	public static HighScores highScores = new HighScores();
	public static ResourceManager resources = new ResourceManager();
	
	public static void main(String[] args) {
		System.out.println(highScores);
		
		resources.updateCreativity(20);
		resources.updateScalaStones(1000);
		resources.updateScalaStones(-500);
		resources.updateGreatRubies(-10);
		
		System.out.println(resources);
	}
}
