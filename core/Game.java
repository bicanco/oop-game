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
		
		resources.updateGreatRubies(500);
		System.out.println(resources);
		
		int j = turnManager.getNextPayTurn() + 1;
		
		for (int i = 0; i < j; i++){
			System.out.println(turnManager);
			if (turnManager.isPayTurn()) turnManager.executePayTurn(resources);
			turnManager.nextTurn();
		}
		
		System.out.println(resources);
		
	}
}
