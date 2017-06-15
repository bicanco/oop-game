package core;

public class GameManager {
	public HighScores highScores = new HighScores();
	public ResourceManager resources = new ResourceManager();
	public TurnManager turns = new TurnManager();
	public GridManager grid = new GridManager();
	public DailyChangesManager daily = new DailyChangesManager();
	
	public String username;
    public int iconname;
        
	public GameManager(){
		
	}
}
