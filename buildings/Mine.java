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
	 * Método que retorna a produção da mina passando parâmetros para aumentar a produção
	 * @param boost a quantidade de recursos alocados para aumentar a produção
	 * @return a produção
	 */
	private int stoneProduction(int boost){
		return oopyiesAllocated*STONES_PER_OOPYIE*usePickaxe(boost);
	}
	
	/**
	 * Método que retorna a produção da mina
	 * @return a produção
	 */
	private int stoneProduction(){
		return oopyiesAllocated*STONES_PER_OOPYIE;
	}
	
	
	/**
	 * Método que melhora a produção de Stones da mina
	 * @param seeds o número de seeds alocadas
	 * @return a produção
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
	 * Método que retorna a produção máxima da mina
	 * @return a produção máxima
	 */
	private int greatEscavation(){
		if(upgradesAvailable[GREAT_ESCAVATION] == false){
			return 0;//produz a producao se o metodo ja foi adquirido
		}else
			return MAX_PRODUCTION;
	}
	
	/**
	 * Método que define a quantidade de seeds alocadas na mina
	 * @param seeds o número de seeds a serem alocadas
	 */
	public void setSeeds(int seeds){
		seedsUsed = seeds;
	}
	
	/**
	 * Método que define se o Método greatEscavation já foi chamado
	 * @param toUse true se foi chamado e false se não foi
	 */
	public void checkGreatEscavation(boolean isUsed){
		greatEscavationActivated = isUsed;
	}
	
	/**
	 * Método que retorna o nome da classe
	 * @return o nome da classe
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Método que retorna a descrição da classe
	 * @return a descrição da classe
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 *Método que retorna o ícone da classe
	 *@return o ícone da classe
	 */
	@Override
	public String getIcon() {
		return iconPath;
	}

	/**
	 *Método que retona o preço para desqloquear uma mina
	 *@return o preço para desbloquear uma mina
	 */
	@Override
	public int getUnlockCost() {
		return unlockCost;
	}

	/**
	 * Método que retorna o custo de uma mina
	 * @return o custo de uma mina
	 */
	@Override
	public int getBuildCost() {
		return buildCost;
	}

	/**
	 * Método que retorna o número de Oopyies alocados
	 * @return o número de Oopyiues alocados
	 */
	@Override
	public int getOopyiesAllocated() {
		return oopyiesAllocated;
	}

	/**
	 * Método que aloca Oopyies
	 * @param oopyies o número de oopyies a serem alocados 
	 */
	@Override
	public void allocateOopyies(int oopyies) {
		oopyiesAllocated = oopyies;
	}

	/**
	 * Método que desbloqueia um upgrade da classe
	 * @param upgradeId o id do upgrade
	 * @throws Exception se o upgrade já estiver desbloqueado
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
	 * Método que retorna um boolean que representa se o upgrade já foi desbloqueado ou não
	 * @param upgradeId o id do upgrade
	 * @throws Exception se o upgrade já estiver desbloqueado
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
	 * Método que retorna o custo de um upgrade
	 * @param upgradeId o id do upgrade
	 * @return o custo do upgrade
	 */
	@Override
	public int getUpgradeCost(int upgradeId) {
		return upgradesCost[upgradeId];
	}

	/**
	 * Método que reinicia os atributos de uma mina
	 */
	@Override
	public void reset() {
		oopyiesAllocated = 0;
		seedsUsed = 0;
		greatEscavationActivated = false;
	}

	/**
	 * Método que retorna para os recursos do jogo os recursos que não foram utilizados
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
	 * Método que gerencia uma troca de turno para uma mina
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
