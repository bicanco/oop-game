package buildings;

/**
 * Classe que representa uma mina
 * @author David
 */
public class Mine implements Building {
	private final static int MINE_CREATIVITY_COST = 0;//custo inicial da mina
	private final static int MAX_PRODUCTION = 0;//produção máxima possível
	private final static int STONES_PER_OOPYIE = 0;//valor de stones produzidas por oopyie
	private final static int STONES_PER_SEED = 0;//valor de stones produzidas por seeds

	public final static int STONE_PRODUCTION = 0;//valores das posições dos métodos no vetor de up grades
	public final static int USE_PICKAXE = 1;
	public final static int GREAT_ESCAVATION = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	private static String name = "Mine";//inicialização das variáveis estáticas que são herança da classe Building
	private static String description = "Produz Scala Stones";
	private static String iconPath = "Mine.png";
	private static int unlockCost = MINE_CREATIVITY_COST;
	private static int buildCost = 789;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
	private static int[] upgradesCost = new int[upgradeNumber];
	
	static {
		upgradesAvailable[STONE_PRODUCTION] = true;//o único método que começa já adquirido
		upgradesAvailable[USE_PICKAXE] = false;//os outros começam como não adquiridos
		upgradesAvailable[GREAT_ESCAVATION] = false;
		
		upgradesCost[STONE_PRODUCTION] = 0;
		upgradesCost[USE_PICKAXE] = 0;
		upgradesCost[GREAT_ESCAVATION] = 0;
	}
	
	protected int oopyiesAllocated;

	/**
	 * Método construtor da classe Mine
	 */
	public Mine(){
		reset();
	}
	
	/**
	 * Método que produz as Scala Stones e aumaneta a produção de acordo com o a quantidade de recurso passada como parâmetro
	 * @param A quantidade de recurso para o boost
	 * @return O valor produzido
	 */
	public int stoneProduction(int boost){
		return oopyiesAllocated*STONES_PER_OOPYIE*usePickaxe(boost);
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
	public int usePickaxe(int seeds){
		if(upgradesAvailable[USE_PICKAXE] == false){
			return 0;//produz Stones se o método já foi adquirido
		}else
			return seeds*STONES_PER_SEED;
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
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getIcon() {
		return iconPath;
	}

	@Override
	public int getUnlockCost() {
		return unlockCost;
	}

	@Override
	public int getBuildCost() {
		return buildCost;
	}

	@Override
	public int getOopyiesAllocated() {
		return oopyiesAllocated;
	}

	@Override
	public void allocateOopyies(int oopyies) {
		oopyiesAllocated = oopyies;
	}

	@Override
	public void unlockUpgrade(int upgradeId) throws Exception {
		if(upgradesAvailable[upgradeId] == true){
			throw new IllegalArgumentException("Position already unlocked");
		}else{
			upgradesAvailable[upgradeId] = true;
		}
	}

	@Override
	public boolean getUpgrade(int upgradeId) throws Exception {
		if(upgradeId >= upgradeNumber || upgradeId < 0){
			throw new IllegalArgumentException("Number out of range");
		} else {
			return upgradesAvailable[upgradeId];
		}
	}

	@Override
	public int getUpgradeCost(int upgradeId) {
		return upgradesCost[upgradeId];
	}

	@Override
	public void setUpgradeCost(int value, int upgrade) {
		upgradesCost[upgrade] = value;
	}

	@Override
	public void reset() {
		oopyiesAllocated = 0;
	}
}
