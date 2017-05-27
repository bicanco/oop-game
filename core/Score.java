package core;

import java.io.IOException;
import java.io.Serializable;

/**
 * Armazena as informações da pontuação de uma partida.
 * @author Gabriel Toschi
 *
 */
public class Score implements Serializable{
	/**
	 * Necessário para implementar a interface Serializable
	 */
	private static final long serialVersionUID = 1L;

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
	 * Faz a escrita de uma pontuação em um arquivo.
	 * Utilizado por um ObjectOutputStream.
	 * @param stream stream de dados de saída
	 * @throws IOException
	 */
	private void writeObject(java.io.ObjectOutputStream stream)
            throws IOException {
        stream.writeObject(playerName);
        stream.writeInt(points);
    }
	
	/**
	 * Faz a leitura de uma pontuação em um arquivo.
	 * Utilizado por um ObjectInputStream.
	 * @param stream stream de dados de entrada
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private void readObject(java.io.ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        playerName = (String) stream.readObject();
        points = stream.readInt();
    }
	
	/**
	 * Retorna uma representação em String, para depuração.
	 */
	@Override
	public String toString(){
		return "Player: " + this.playerName + " | Points: " + this.points;
	}
}
