package core;

/**
 * Classe que representa uma opção de troca diária
 * @author David
 *
 */
public class DailyChangeOption {
	public static final int JavaSeeds = 0;//valores dos tipos
	public static final int SharpCocos = 1;
	public static final int MagicPerls = 2;
	public static final int Pyramids = 3;
	public static final int SclaStones = 4;
	
	private int types[];//tipos das trocas do dia
	private int values[];//valores das trocas do dia
	private int size;//número de 
	
	/**
	 * Método Construtor da classe DailyChangeOption
	 * @param size o número de Recursos para a troca
	 */
	public DailyChangeOption(int size){
		if(size > 5) throw new IllegalArgumentException("Size must be less than 6");
		this.size = size;
		types = new int[size];
		values = new int[size];
	}
	
	/**
	 * 
	 * @param types vetor com os tipos de recursos
	 * @param values vetor com os valores dos recursos
	 */
	public void setDailayChageOption(int types[], int values[]){
		this.types = types;
		this.values = values;
	}
	
	/**
	 * Método que retorna o tamanho do objeto
	 * @return size
	 */
	public int getSize(){
		return size;
	}

	/**
	 * Método que retorna um recurso
	 * @param n
	 * @return type o recurso
	 */
	public int getTypes(int n){
		return types[n];
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int getValues(int n){
		return values[n];
	}
}
