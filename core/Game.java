package core;

/**
 * Classe que gerencia o núcleo do jogo e da partida.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class Game {
	public static HighScores highScores = new HighScores();
	public static ResourceManager resources = new ResourceManager();
	public static TurnManager turnManager = new TurnManager();
	
	public static void main(String[] args) {
		System.out.println(highScores);
		
		resources.updateOopyies(10);
		resources.updateJavaSeeds(3);
		resources.updateSharpCocos(3);
		System.out.println(resources);
		
		int gone = turnManager.feedOopyies(resources);
		System.out.println(resources);
		System.out.println("Oopyies Gone = " + gone);
		
	}
}
