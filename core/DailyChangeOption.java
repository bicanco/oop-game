package core;

/**
 * Classe que representa uma opcao de troca diaria
 * @author David
 *
 */
public class DailyChangeOption {
	public static final int JavaSeeds = 0;//valores dos tipos
	public static final int SharpCocos = 1;
	public static final int MagicPerls = 2;
	public static final int PYramids = 3;
	public static final int ScalaStones = 4;
	
	private int types[] = new int[3];//tipos das trocas do dia
	private int values[] = new int[3];//valores das trocas do dia
	private boolean isPaid = false;
	
	/**
	 * Metodo Construtor da classe DailyChangeOption
	 */
	public DailyChangeOption(){
		for(int i = 0 ; i < 3; i++)
			types[i] = -1;
	}
	
	/**
	 * Metodo utilizado para definir os tipos e os valores dos recursos da troca diaria
	 * @param n numero do recurso
	 * @param type tipo do recurso
	 * @param value valor do recurso
	 */
	public void setDailyChangeOption(int n, int type, int value){
		for(int i = 0; i < 3; i++)
			if(types[i] == type) throw new IllegalArgumentException("Already have this type");
		types[n] = type;
		values[n] = value;
	}

	/**
	 * Metodo que retorna um recurso
	 * @param n o numero do recurso
	 * @return type o recurso
	 */
	public int getTypes(int n){
		return types[n];
	}
	
	public String getTypesString(int n){
		switch (types[n]){
		case JavaSeeds: return "Java Seeds"; 
		case SharpCocos: return "Sharp Cocos"; 
		case MagicPerls: return "Magic Perls"; 
		case PYramids: return "PYramids";
		case ScalaStones: return "Scala Stones";
		}
		
		return "I AM ERROR";
	}
	
	/**
	 * Metodo que retorna o custo de um recurso
	 * @param n o numero do recurso
	 * @return o custo
	 */
	public int getValues(int n){
		return values[n];
	}
	
	/**
	 * Método que checa se o pagamento é possível
	 * @param resources um ResourceManager do jogo
	 * @return true se tem condições e false se não
	 */
	public boolean checkPayment(ResourceManager resources){
		int actual = -1;
		
		for (int i = 0; i < 3; i++){
			switch (types[i]){
			case JavaSeeds: actual = resources.getJavaSeeds(); break;
			case SharpCocos: actual = resources.getSharpCocos(); break;
			case MagicPerls: actual = resources.getMagicPerls(); break;
			case PYramids: actual = resources.getPyramids(); break; 
			case ScalaStones: actual = resources.getScalaStones(); break;
			}
			
			if (actual < values[i]) return false;
		}
		
		return true;
	}
	
	/**
	 * Método que retorna se a opção diária foi pagada
	 * @return true se sim e false se não
	 */
	public boolean isPaid(){
		return isPaid;
	}
	
	/**
	 * Método que excuta o pafamento de um opção de troca diária
	 * @param resources um ResourceManager do jogo
	 */
	public void pay(ResourceManager resources){
		for (int i = 0; i < 3; i++){
			switch (types[i]){
			case JavaSeeds: resources.updateJavaSeeds(-values[i]); break;
			case SharpCocos: resources.updateSharpCocos(-values[i]); break;
			case MagicPerls: resources.updateMagicPerls(-values[i]);; break;
			case PYramids: resources.updatePyramids(-values[i]); break;
			case ScalaStones: resources.updateScalaStones(-values[i]); break;
			}
		}
		
		resources.updateGreatRubies(1);
		isPaid = true;
	}
}
