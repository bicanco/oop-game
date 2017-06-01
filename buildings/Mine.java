package buildings;

/**
 * Classe que representa uma mina
 * @author David
 */
public class Mine extends Building{
	private final static int MINE_CREATIVITY_COST = 0;//custo inicial da mina
	private final static int MAX_PRODUCTION = 0;//produ��o m�xima poss�vel
	private final static int STONES_PER_OOPYIE = 0;//valor de stones produzidas por oopyie
	private final static int STONES_PER_SEED = 0;//valor de stones produzidas por seeds

	public final static int STONE_PRODUCTION = 0;//valores das posi��es dos m�todos no vetor de up grades
	public final static int USE_PICKAXE = 1;
	public final static int GREAT_ESCAVATION = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	
	static{
		name = "Mina";//inicializa��o das vari�veis est�ticas que s�o heran�a da classe Building
		description = "Produz Scala Stones";
		creativityCost = MINE_CREATIVITY_COST;
		upgradeNumber = NUMBER_OF_UPGRADES;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[STONE_PRODUCTION] = true;//o �nico m�todo que come�a j� adquirido
		upgradesAvailable[USE_PICKAXE] = false;//os outros come�am como n�o adquiridos
		upgradesAvailable[GREAT_ESCAVATION] = false;
	}
	
	/**
	 * M�todo construtor da classe Mine
	 */
	public Mine(){
		super();
	}
	
	
	/**
	 * M�todo que produz as Scala Stones
	 * @return O valor produzido
	 */
	public int stoneProduction(){
		return oopyiesAllocated*STONES_PER_OOPYIE;
	}
	
	
	/**
	 * M�todo que produz Stones em fun��o do n�mero de seeds alocadas, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @param O n�mero de seeds alocadas
	 * @return A produ��o
	 */
	public int cocoFertilizer(int seeds){
		if(upgradesAvailable[USE_PICKAXE] == false){
			return 0;//produz Stones se o m�todo j� foi adquirido
		}else
			return seeds*STONES_PER_SEED*stoneProduction();
	}
	
	/**
	 * M�todo que produz a produ��o m�xima de uma mina, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @return A produ��o
	 */
	public int greatProduction(){
		if(upgradesAvailable[GREAT_ESCAVATION] == false){
			return 0;//produz a produ��o se o m�todo j� foi adquirido
		}else
			return MAX_PRODUCTION;
	}
}
