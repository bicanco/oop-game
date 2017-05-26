package core;

/**
 * Armazena as informações da pontuação de uma partida.
 * @author Gabriel Toschi
 *
 */
public class Score {
	/**
	 * Nome do jogador que está com essa pontuação.
	 */
	private String playerName;
	
	/**
	 * Pontuação do jogador.
	 */
	private int points;
	
	/**
	 * Construtor que cria uma nova pontuação de um jogador.
	 * @param playerName nome do jogador
	 * @param points pontuação inicial do jogador
	 */
	public Score(String playerName, int points){
		this.playerName = playerName;
		this.points = points;
	}
	
	/**
	 * Retorna o nome do jogador desta pontuação.
	 * @return nome do jogador
	 */
	public String getPlayerName(){
		return this.playerName;
	}
	
	/**
	 * Retorna a pontuação guardada nesse objeto.
	 * @return pontos
	 */
	public int getPoints(){
		return this.points;
	}
	
	/**
	 * Atualiza a pontuação, a partir de um valor a ser somado na pontuação.
	 * @param offset valor a ser somado na pontuação
	 */
	public void updatePoints(int offset){
		this.points += offset;
	}
	
	/**
	 * Retorna uma representação em String, para depuração.
	 */
	@Override
	public String toString(){
		return "Player: " + this.playerName + " | Points: " + this.points;
	}
}
