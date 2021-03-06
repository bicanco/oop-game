package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Classe que armazena as maiores pontuacoes do jogo, alem de armazena-las em arquivos
 * para outras vezes que o programa for aberto.
 * @author Gabriel Toschi
 *
 */
public class HighScores implements Serializable{
	/**
	 * Necessario para implementar a interface Serializable
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Numero de melhores pontuacoes a serem guardadas.
	 */
	public int scoreNumber = 3;

	/**
	 * Melhores pontuacoes.
	 */
	public Score[] highScores;
	
	/**
	 * Nome do arquivo onde ficam guardadas as melhores pontuacoes.
	 */
	public static String highScoresFilename = "bestUsers.dat";
	
	/**
	 * Faz a escrita de uma tabela de melhores pontuacoes em um arquivo.
	 * Utilizado por um ObjectOutputStream.
	 * @param stream stream de dados de saida
	 * @throws IOException
	 */
	private void writeObject(java.io.ObjectOutputStream stream)
            throws IOException {
		stream.writeInt(scoreNumber);
		for (int i = 0; i < scoreNumber; i++)
			stream.writeObject(highScores[i]);
    }
	
	/**
	 * Faz a leitura de uma tabela de melhores pontuacoes em um arquivo.
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
	 * Le o arquivo de melhores pontuacoes e recria o objeto salvo no ultimo acesso ao programa.
	 * Caso o arquivo nao exista, um novo objeto limpo e criado.
	 */
	public HighScores(){
		HighScores objRead = null;
		
		try {
			// lendo o arquivo de melhores pontuacoes
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
	 * Adiciona uma nova pontuacao ao vetor, caso ele seja maior que algum dos
	 * recordes atuais.
	 * @param score nova ponutacao a ser adicionada
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
	 * Salva as maiores pontuacoes em um arquivo, para ser lido posteriormente.
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
	 * Retorna uma representacao em String, para depuracao.
	 */
	@Override
	public String toString(){
		String str = "";
		
		for (int i = 0; i < scoreNumber; i++)
			str += highScores[i].toString() + "\n";
		
		return str;
	}
}
