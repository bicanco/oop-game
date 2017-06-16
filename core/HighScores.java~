package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Classe que armazena as maiores pontuações do jogo, além de armazená-las em arquivos
 * para outras vezes que o programa for aberto.
 * @author Gabriel Toschi
 *
 */
public class HighScores implements Serializable{
	/**
	 * Necessário para implementar a interface Serializable
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Número de melhores pontuações a serem guardadas.
	 */
	public int scoreNumber = 3;

	/**
	 * Melhores pontuações.
	 */
	public Score[] highScores;
	
	/**
	 * Nome do arquivo onde ficam guardadas as melhores pontuações.
	 */
	public static String highScoresFilename = "bestUsers.dat";
	
	/**
	 * Faz a escrita de uma tabela de melhores pontuações em um arquivo.
	 * Utilizado por um ObjectOutputStream.
	 * @param stream stream de dados de saída
	 * @throws IOException
	 */
	private void writeObject(java.io.ObjectOutputStream stream)
            throws IOException {
		stream.writeInt(scoreNumber);
		for (int i = 0; i < scoreNumber; i++)
			stream.writeObject(highScores[i]);
    }
	
	/**
	 * Faz a leitura de uma tabela de melhores pontuações em um arquivo.
	 * Utilizado por um ObjectInputStream.
	 * @param stream stream de dados de entrada
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private void readObject(java.io.ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        scoreNumber = stream.readInt();
        highScores = new Score[scoreNumber];
        
        for (int i = 0; i < scoreNumber; i++)
        	highScores[i] = (Score) stream.readObject();
    }
	
	/**
	 * Lê o arquivo de melhores pontuações e recria o objeto salvo no último acesso ao programa.
	 * Caso o arquivo não exista, um novo objeto limpo é criado.
	 */
	public HighScores(){
		HighScores objRead = null;
		
		try {
			// lendo o arquivo de melhores pontuações
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
	 * Adiciona uma nova pontuação ao vetor, caso ele seja maior que algum dos
	 * recordes atuais.
	 * @param score nova ponutação a ser adicionada
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
	 * Salva as maiores pontuações em um arquivo, para ser lido posteriormente.
	 */
	public static void saveHighScore(HighScores hs){
		try {
			FileOutputStream fos = new FileOutputStream(highScoresFilename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(hs);
			oos.close();
		} catch (Exception e){
			System.out.println("Error in writing high scores.\n");
		}		
	}
	
	/**
	 * Retorna uma representação em String, para depuração.
	 */
	@Override
	public String toString(){
		String str = "";
		
		for (int i = 0; i < scoreNumber; i++)
			str += highScores[i].toString() + "\n";
		
		return str;
	}
}
