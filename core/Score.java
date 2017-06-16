package core;

import java.io.IOException;
import java.io.Serializable;

/**
 * Armazena as informacoes da pontuacao de uma partida.
 * @author Gabriel Toschi
 *
 */
public class Score implements Serializable{
	/**
	 * Necessario para implementar a interface Serializable
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Nome do jogador que esta com essa pontuacao.
	 */
	private String playerName;
	
	/**
	 * Pontuacao do jogador.
	 */
	private int points;
	
	/**
	 * Construtor que cria uma nova pontuacao de um jogador.
	 * @param playerName nome do jogador
	 * @param points pontuacao inicial do jogador
	 */
	public Score(String playerName, int points){
		this.playerName = playerName;
		this.points = points;
	}
	
	/**
	 * Retorna o nome do jogador desta pontuacao.
	 * @return nome do jogador
	 */
	public String getPlayerName(){
		return this.playerName;
	}
	
	/**
	 * Retorna a pontuacao guardada nesse objeto.
	 * @return pontos
	 */
	public int getPoints(){
		return this.points;
	}
	
	/**
	 * Atualiza a pontuacao, a partir de um valor a ser somado na pontuacao.
	 * @param offset valor a ser somado na pontuacao
	 */
	public void updatePoints(int offset){
		this.points += offset;
	}
	
	/**
	 * Faz a escrita de uma pontuacao em um arquivo.
	 * Utilizado por um ObjectOutputStream.
	 * @param stream stream de dados de saida
	 * @throws IOException
	 */
	private void writeObject(java.io.ObjectOutputStream stream)
            throws IOException {
        stream.writeObject(playerName);
        stream.writeInt(points);
    }
	
	/**
	 * Faz a leitura de uma pontuacao em um arquivo.
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
	 * Retorna uma representacao em String, para depuracao.
	 */
	@Override
	public String toString(){
		return "Player: " + this.playerName + " | Points: " + this.points;
	}
}
