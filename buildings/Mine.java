package buildings;

/**
 * Classe que representa uma mina
 * @author David
 */
public class Mine extends Building{
	private final static int MINE_CREATIVITY_COST = 0;//custo inicial da mina
	private final static int MAX_PRODUCTION = 0;//produção máxima possível
	private final static int STONES_PER_OOPYIE = 0;//valor de stones produzidas por oopyie
	private final static int STONES_PER_SEED = 0;//valor de stones produzidas por seeds

	public final static int STONE_PRODUCTION = 0;//valores das posições dos métodos no vetor de up grades
	public final static int USE_PICKAXE = 1;
	public final static int GREAT_ESCAVATION = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	
	static{
		name = "Mina";//inicialização das variáveis estáticas que são herança da classe Building
		description = "Produz Scala Stones";
		creativityCost = MINE_CREATIVITY_COST;
		upgradeNumber = NUMBER_OF_UPGRADES;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[STONE_PRODUCTION] = true;//o único método que começa já adquirido
		upgradesAvailable[USE_PICKAXE] = false;//os outros começam como não adquiridos
		upgradesAvailable[GREAT_ESCAVATION] = false;
	}
	
	/**
	 * Método construtor da classe Mine
	 */
	public Mine(){
		super();
	}
	
	
	/**
	 * Método que produz as Scala Stones
	 * @return O valor produzido
	 */
	public int stoneProduction(){
		return oopyiesAllocated*STONES_PER_OOPYIE;
	}
	
	
	/**
	 * Método que produz Stones em função do número de seeds alocadas, se não adquiriu o método a produção será 0
	 * @param O número de seeds alocadas
	 * @return A produção
	 */
	public int cocoFertilizer(int seeds){
		if(upgradesAvailable[USE_PICKAXE] == false){
			return 0;//produz Stones se o método já foi adquirido
		}else
			return seeds*STONES_PER_SEED*stoneProduction();
	}
	
	/**
	 * Método que produz a produção máxima de uma mina, se não adquiriu o método a produção será 0
	 * @return A produção
	 */
	public int greatProduction(){
		if(upgradesAvailable[GREAT_ESCAVATION] == false){
			return 0;//produz a produção se o método já foi adquirido
		}else
			return MAX_PRODUCTION;
	}
}
