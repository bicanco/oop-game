package core;

/**
 * Armazena as informa��es da pontua��o de uma partida.
 * @author Gabriel Toschi
 *
 */
public class Score {
	/**
	 * Nome do jogador que est� com essa pontua��o.
	 */
	private String playerName;
	
	/**
	 * Pontua��o do jogador.
	 */
	private int points;
	
	/**
	 * Construtor que cria uma nova pontua��o de um jogador.
	 * @param playerName nome do jogador
	 * @param points pontua��o inicial do jogador
	 */
	public Score(String playerName, int points){
		this.playerName = playerName;
		this.points = points;
	}
	
	/**
	 * Retorna o nome do jogador desta pontua��o.
	 * @return nome do jogador
	 */
	public String getPlayerName(){
		return this.playerName;
	}
	
	/**
	 * Retorna a pontua��o guardada nesse objeto.
	 * @return pontos
	 */
	public int getPoints(){
		return this.points;
	}
	
	/**
	 * Atualiza a pontua��o, a partir de um valor a ser somado na pontua��o.
	 * @param offset valor a ser somado na pontua��o
	 */
	public void updatePoints(int offset){
		this.points += offset;
	}
	
	/**
	 * Retorna uma representa��o em String, para depura��o.
	 */
	@Override
	public String toString(){
		return "Player: " + this.playerName + " | Points: " + this.points;
	}
}
