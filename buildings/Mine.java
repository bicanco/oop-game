package buildings;

import core.ResourceManager;

/**
 * Classe que representa uma mina implementando a interface Building
 * @author David
 */
public class Mine implements Building {
	private final static int MINE_CREATIVITY_COST = 45;//custo inicial da mina
	private final static int MAX_PRODUCTION = 1000;//producao maxima possivel
	private final static int STONES_PER_OOPYIE = 4;//valor de stones produzidas por oopyie
	private final static double STONES_PER_SEED = 0.5;//valor de stones produzidas por seeds

	public final static int STONE_PRODUCTION = 0;//valores das posicoes dos metodos no vetor de up grades
	public final static int USE_PICKAXE = 1;
	public final static int GREAT_ESCAVATION = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	private static String name = "Mina";//inicializacao das variaveis estaticas que sao heranca da classe Building
	private static String description = "Escavacao de Pedras Interdimensional";
	private static String iconPath = "Mine.png";
	private static int unlockCost = MINE_CREATIVITY_COST;
	private static int buildCost = 45;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
	private static int[] upgradesCost = new int[upgradeNumber];
	
	static {
		upgradesAvailable[STONE_PRODUCTION] = true;//o unico metodo que comeca ja adquirido
		upgradesAvailable[USE_PICKAXE] = false;//os outros comecam como nao adquiridos
		upgradesAvailable[GREAT_ESCAVATION] = false;
		
		upgradesCost[STONE_PRODUCTION] = 0;
		upgradesCost[USE_PICKAXE] = 500;
		upgradesCost[GREAT_ESCAVATION] = 800;
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
	 * M�todo que retorna a produ��o da mina passando par�metros para aumentar a produ��o
	 * @param boost a quantidade de recursos alocados para aumentar a produ��o
	 * @return a produ��o
	 */
	private int stoneProduction(int boost){
		return oopyiesAllocated*STONES_PER_OOPYIE*usePickaxe(boost);
	}
	
	/**
	 * M�todo que retorna a produ��o da mina
	 * @return a produ��o
	 */
	private int stoneProduction(){
		return oopyiesAllocated*STONES_PER_OOPYIE;
	}
	
	
	/**
	 * M�todo que melhora a produ��o de Stones da mina
	 * @param seeds o n�mero de seeds alocadas
	 * @return a produ��o
	 */
	private int usePickaxe(int seeds){
		if(upgradesAvailable[USE_PICKAXE] == false){
			return 0;//produz Stones se o metodo ja foi adquirido
		}else{
			Double d = seeds*STONES_PER_SEED;
			return d.intValue();
		}
	}
	
	/**
	 * M�todo que retorna a produ��o m�xima da mina
	 * @return a produ��o m�xima
	 */
	private int greatEscavation(){
		if(upgradesAvailable[GREAT_ESCAVATION] == false){
			return 0;//produz a producao se o metodo ja foi adquirido
		}else
			return MAX_PRODUCTION;
	}
	
	/**
	 * M�todo que define a quantidade de seeds alocadas na mina
	 * @param seeds o n�mero de seeds a serem alocadas
	 */
	public void setSeeds(int seeds){
		seedsUsed = seeds;
	}
	
	/**
	 * M�todo que define se o M�todo greatEscavation j� foi chamado
	 * @param toUse true se foi chamado e false se n�o foi
	 */
	public void checkGreatEscavation(boolean isUsed){
		greatEscavationActivated = isUsed;
	}
	
	/**
	 * M�todo que retorna o nome da classe
	 * @return o nome da classe
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * M�todo que retorna a descri��o da classe
	 * @return a descri��o da classe
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 *M�todo que retorna o �cone da classe
	 *@return o �cone da classe
	 */
	@Override
	public String getIcon() {
		return iconPath;
	}

	/**
	 *M�todo que retona o pre�o para desqloquear uma mina
	 *@return o pre�o para desbloquear uma mina
	 */
	@Override
	public int getUnlockCost() {
		return unlockCost;
	}

	/**
	 * M�todo que retorna o custo de uma mina
	 * @return o custo de uma mina
	 */
	@Override
	public int getBuildCost() {
		return buildCost;
	}

	/**
	 * M�todo que retorna o n�mero de Oopyies alocados
	 * @return o n�mero de Oopyiues alocados
	 */
	@Override
	public int getOopyiesAllocated() {
		return oopyiesAllocated;
	}

	/**
	 * M�todo que aloca Oopyies
	 * @param oopyies o n�mero de oopyies a serem alocados 
	 */
	@Override
	public void allocateOopyies(int oopyies) {
		oopyiesAllocated = oopyies;
	}

	/**
	 * M�todo que desbloqueia um upgrade da classe
	 * @param upgradeId o id do upgrade
	 * @throws Exception se o upgrade j� estiver desbloqueado
	 */
	@Override
	public void unlockUpgrade(int upgradeId) throws Exception {
		if(upgradesAvailable[upgradeId] == true){
			throw new IllegalArgumentException("Position already unlocked");
		}else{
			upgradesAvailable[upgradeId] = true;
		}
	}

	/**
	 * M�todo que retorna um boolean que representa se o upgrade j� foi desbloqueado ou n�o
	 * @param upgradeId o id do upgrade
	 * @throws Exception se o upgrade j� estiver desbloqueado
	 */
	@Override
	public boolean getUpgrade(int upgradeId) throws Exception {
		if(upgradeId >= upgradeNumber || upgradeId < 0){
			throw new IllegalArgumentException("Number out of range");
		} else {
			return upgradesAvailable[upgradeId];
		}
	}

	/**
	 * M�todo que retorna o custo de um upgrade
	 * @param upgradeId o id do upgrade
	 * @return o custo do upgrade
	 */
	@Override
	public int getUpgradeCost(int upgradeId) {
		return upgradesCost[upgradeId];
	}

	/**
	 * M�todo que reinicia os atributos de uma mina
	 */
	@Override
	public void reset() {
		oopyiesAllocated = 0;
		seedsUsed = 0;
		greatEscavationActivated = false;
	}

	/**
	 * M�todo que retorna para os recursos do jogo os recursos que n�o foram utilizados
	 * @param resources um ResourceManager do jogo
	 */
	@Override
	public void reconfig(ResourceManager resources){
		resources.updateOopyies(oopyiesAllocated);
		resources.updateMagicPerls(seedsUsed);
		if (greatEscavationActivated) resources.updateGreatRubies(1);
		this.reset();
	}

	/**
	 * M�todo que gerencia uma troca de turno para uma mina
	 * @param resources um ResourceManager do jogo
	 */
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
