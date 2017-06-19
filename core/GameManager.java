package core;

/**
 * Classe que gerencia o jogo
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class GameManager {
	public HighScores highScores = new HighScores();
	public ResourceManager resources = new ResourceManager();
	public TurnManager turns = new TurnManager();
	public GridManager grid = new GridManager();
	public DailyChangesManager daily = new DailyChangesManager();
	
	public String username;
    public int iconname;
    
    /**
     * Método construtor da classe GameManager
     */
	public GameManager(){
		
	}
}
