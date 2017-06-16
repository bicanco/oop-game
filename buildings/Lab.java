package buildings;

import core.ResourceManager;

/**
 * Classe que representa um laboratorio
 * @author Marcelo
 */
public class Lab implements Building {
	private final static int LAB_CREATIVITY_COST = 0;//custo inicial do laboratorio
	private final static int MAX_PRODUCTION = 0;//producao maxima possivel
	private final static int CREATIVITY_PER_OOPYIE = 2;//valor de criatividades produzidas por oopyie
	private final static int CREATIVITY_PER_COCO = 2;//valor de criativades produzidas por cocos

	public final static int CREATIVITY_PRODUCTION = 0;//valores das posicoes dos metodos no vetor de up grades
	public final static int BASIC_RESEARCH = 1;
	public final static int GREAT_RESEARCH = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	private static String name = "Lab";//inicializacao das variaveis estaticas que sao heranca da classe Building
	private static String description = "Produz Criatividade";
	private static String iconPath = "Lab.png";
	private static int unlockCost = LAB_CREATIVITY_COST;
	private static int buildCost = 456;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
	private static int[] upgradesCost = new int[upgradeNumber];
	
	static {
		upgradesAvailable[CREATIVITY_PRODUCTION] = true;//o unico metodo que comeca ja adquirido
		upgradesAvailable[BASIC_RESEARCH] = false;//os outros comecam como nao adquiridos
		upgradesAvailable[GREAT_RESEARCH] = false;
		
		upgradesCost[CREATIVITY_PRODUCTION] = 0;
		upgradesCost[BASIC_RESEARCH] = 500;
		upgradesCost[GREAT_RESEARCH] = 2000;
	}
	
	protected static int oopyiesAllocated;
	protected int cocosUsed;
	protected boolean greatResearchActivated;
	
	/**
	 * Metodo construtor da classe Lab
	 */
	public Lab(){
		reset();
	}
	
	/**
	 * Metodo que produz as Criatividade e aumaneta a producao de acordo com o a quantidade de recurso passada como parametro
	 * @param A quantidade de recurso para o boost
	 * @return O valor produzido
	 */
	public int creativityProduction(int boost){
		return oopyiesAllocated*CREATIVITY_PER_OOPYIE*basicResearch(boost);
	}
	
	/**
	 * Metodo que produz Criatividade
	 * @return O valor produzido
	 */
	public int creativityProduction(){
		return oopyiesAllocated*CREATIVITY_PER_OOPYIE;
	}
	
	
	/**
	 * Metodo que produz Criatividade em funcao do numero de Cocos alocados, se nao adquiriu o metodo a producao sera 0
	 * @param O numero de cocos alocados
	 * @return A producao
	 */
	public int basicResearch(int cocos){
		if(upgradesAvailable[BASIC_RESEARCH] == false){
			return 0;//produz Criatividade se o metodo ja foi adquirido
		}else
			return cocos*CREATIVITY_PER_COCO;
	}
	
	/**
	 * M�todo que produz a producao maxima de um laboratorio, se nao adquiriu o metodo a producao sera 0
	 * @return A producao
	 */
	public int greatResearch(){
		if(upgradesAvailable[GREAT_RESEARCH] == false){
			return 0;//produz a producao se o metodo ja foi adquirido
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
	
	public void updateCocosUsed(int cocos){
		cocosUsed = cocos;
	}
	
	public void checkGreatResearch(boolean isUsed){
		greatResearchActivated = isUsed;
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
		cocosUsed = 0;
		greatResearchActivated = false;
	}
	
	@Override
	public void reconfig(ResourceManager resources) {
		resources.updateOopyies(oopyiesAllocated);
		resources.updateSharpCocos(cocosUsed);
		if (greatResearchActivated) resources.updateGreatRubies(1);
		this.reset();
	}
		
	@Override
	public void runTurn(ResourceManager resources) {
		if (greatResearchActivated)
			resources.updateCreativity(greatResearch());
		else {
			resources.updateOopyies(oopyiesAllocated);
			if (cocosUsed > 0) resources.updateCreativity(creativityProduction(cocosUsed));
			else resources.updateCreativity(creativityProduction());
		}
		
	}
}

















