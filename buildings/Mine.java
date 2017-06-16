package buildings;

import core.ResourceManager;

/**
 * Classe que representa uma mina
 * @author David
 */
public class Mine implements Building {
	private final static int MINE_CREATIVITY_COST = 0;//custo inicial da mina
	private final static int MAX_PRODUCTION = 600;//producao maxima possivel
	private final static int STONES_PER_OOPYIE = 5;//valor de stones produzidas por oopyie
	private final static int STONES_PER_SEED = 3;//valor de stones produzidas por seeds

	public final static int STONE_PRODUCTION = 0;//valores das posicoes dos metodos no vetor de up grades
	public final static int USE_PICKAXE = 1;
	public final static int GREAT_ESCAVATION = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	private static String name = "Mina";//inicializacao das variaveis estaticas que sao heranca da classe Building
	private static String description = "Produz Scala Stones";
	private static String iconPath = "Mine.png";
	private static int unlockCost = MINE_CREATIVITY_COST;
	private static int buildCost = 789;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
	private static int[] upgradesCost = new int[upgradeNumber];
	
	static {
		upgradesAvailable[STONE_PRODUCTION] = true;//o unico metodo que comeca ja adquirido
		upgradesAvailable[USE_PICKAXE] = false;//os outros comecam como nao adquiridos
		upgradesAvailable[GREAT_ESCAVATION] = false;
		
		upgradesCost[STONE_PRODUCTION] = 0;
		upgradesCost[USE_PICKAXE] = 200;
		upgradesCost[GREAT_ESCAVATION] = 500;
	}
	
	protected int oopyiesAllocated;
	protected int seedsUsed;
	protected boolean greatEscavationActivated;

	/**
	 * Metodo construtor da classe Mine
	 */
	public Mine(){
		reset();
	}
	
	/**
	 * Metodo que produz as Scala Stones e aumaneta a producao de acordo com o a quantidade de recurso passada como parametro
	 * @param A quantidade de recurso para o boost
	 * @return O valor produzido
	 */
	public int stoneProduction(int boost){
		return oopyiesAllocated*STONES_PER_OOPYIE*usePickaxe(boost);
	}
	
	/**
	 * Metodo que produz as Scala Stones
	 * @return O valor produzido
	 */
	public int stoneProduction(){
		return oopyiesAllocated*STONES_PER_OOPYIE;
	}
	
	
	/**
	 * Metodo que produz Stones em funcao do numero de seeds alocadas, se nao adquiriu o metodo a producao sera 0
	 * @param O n�umero de seeds alocadas
	 * @return A producao
	 */
	public int usePickaxe(int seeds){
		if(upgradesAvailable[USE_PICKAXE] == false){
			return 0;//produz Stones se o metodo ja foi adquirido
		}else
			return seeds*STONES_PER_SEED;
	}
	
	/**
	 * M�todo que produz a producao maxima de uma mina, se nao adquiriu o metodo a producao sera 0
	 * @return A producao
	 */
	public int greatEscavation(){
		if(upgradesAvailable[GREAT_ESCAVATION] == false){
			return 0;//produz a producao se o metodo ja foi adquirido
		}else
			return MAX_PRODUCTION;
	}
	
	public void setSeeds(int seeds){
		seedsUsed = seeds;
	}
	
	public void checkGreatEscavation(boolean isUsed){
		greatEscavationActivated = isUsed;
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
		seedsUsed = 0;
		greatEscavationActivated = false;
	}

	@Override
	public void reconfig(ResourceManager resources){
		resources.updateOopyies(oopyiesAllocated);
		resources.updateMagicPerls(seedsUsed);
		if (greatEscavationActivated) resources.updateGreatRubies(1);
		this.reset();
	}

	@Override
	public void runTurn(ResourceManager resources){
		if (greatEscavationActivated)
			resources.updateScalaStones(greatEscavation());
		else {
			resources.updateOopyies(oopyiesAllocated);
			if (seedsUsed > 0) resources.updateScalaStones(stoneProduction(seedsUsed));
			else resources.updateScalaStones(stoneProduction());
		}
	}
}
