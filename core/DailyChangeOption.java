package core;

/**
 * Classe que representa uma op��o de troca di�ria
 * @author David
 *
 */
public class DailyChangeOption {
	public static final int JavaSeeds = 0;//valores dos tipos
	public static final int SharpCocos = 1;
	public static final int MagicPerls = 2;
	public static final int Pyramids = 3;
	public static final int SclaStones = 4;
	
	private int types[] = new int[3];//tipos das trocas do dia
	private int values[] = new int[3];//valores das trocas do dia 
	
	/**
	 * M�todo Construtor da classe DailyChangeOption
	 */
	public DailyChangeOption(){
		for(int i = 0 ; i < 3; i++)
			types[i] = -1;
	}
	
	/**
	 * M�todo utilizado para definir os tipos e os valores dos recursos da troca diaria
	 * @param n n�mero do recurso
	 * @param type tipo do recurso
	 * @param value valor do recurso
	 */
	public void setDailyChageOption(int n, int type, int value){
		for(int i = 0; i < 3; i++)
			if(types[i] == type) throw new IllegalArgumentException("Already have this type");
		types[n] = type;
		values[n] = value;
	}

	/**
	 * M�todo que retorna um recurso
	 * @param n o n�mero do recurso
	 * @return type o recurso
	 */
	public int getTypes(int n){
		return types[n];
	}
	
	/**
	 * M�todo que retorna o custo de um recurso
	 * @param n o n�mero do recurso
	 * @return o custo
	 */
	public int getValues(int n){
		return values[n];
	}
}
