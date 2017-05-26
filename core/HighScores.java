package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Classe que armazena as maiores pontua��es do jogo, al�m de armazen�-las em arquivos
 * para outras vezes que o programa for aberto.
 * @author Gabriel Toschi
 *
 */
public class HighScores {
	/**
	 * N�mero de melhores pontua��es a serem guardadas.
	 */
	public int scoreNumber = 3;

	/**
	 * Melhores pontua��es.
	 */
	public Score[] highScores;
	
	/**
	 * Nome do arquivo onde ficam guardadas as melhores pontua��es.
	 */
	public static String highScoresFilename = "bestUsers.dat";
	
	/**
	 * L� o arquivo de melhores pontua��es e recria o objeto salvo no �ltimo acesso ao programa.
	 * Caso o arquivo n�o exista, um novo objeto limpo � criado.
	 */
	public HighScores(){
		HighScores objRead = null;
		
		try {
			// lendo o arquivo de melhores pontua��es
			FileInputStream fis = new FileInputStream(highScoresFilename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			objRead = (HighScores) ois.readObject();
			ois.close();
		} catch (Exception e){
			// caso o arquivo nao possa ser lido
			objRead = null;
		} finally {
			if (objRead != null){
				this.scoreNumber = objRead.scoreNumber;
				this.highScores = objRead.highScores;
			} else {
				this.highScores = new Score[scoreNumber];
				for (int i = 0; i < scoreNumber; i++)
					highScores[i] = new Score("", Integer.MIN_VALUE);
			}
		}
	}
	
	/**
	 * Adiciona uma nova pontua��o ao vetor, caso ele seja maior que algum dos
	 * recordes atuais.
	 * @param score nova ponuta��o a ser adicionada
	 * @return true, caso tenha sido adicionada
	 */
	public boolean insertNewScore(Score score){
		boolean isInserted = false;
		Score aux;
		
		for (int i = 0; i < scoreNumber; i++){
			if (score.getPoints() > highScores[i].getPoints()){
				aux = highScores[i];
				highScores[i] = score;
				score = aux;
				
				isInserted = true;
			}
		}
			
		return isInserted;
	}
	
	/**
	 * Salva as maiores pontua��es em um arquivo, para ser lido posteriormente.
	 */
	public void saveHighScore(){
		try {
			FileOutputStream fos = new FileOutputStream(highScoresFilename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this);
			oos.close();
		} catch (Exception e){
			System.out.println("Error in writing high scores.\n");
		}		
	}
	
	/**
	 * Retorna uma representa��o em String, para depura��o.
	 */
	@Override
	public String toString(){
		String str = "";
		
		for (int i = 0; i < scoreNumber; i++)
			str += highScores[i].toString() + "\n";
		
		return str;
	}
}
