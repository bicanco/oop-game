package buildings;

import core.ResourceManager;

/**
 * Classe que representa um laboratorio implementando a interface Building
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
	 * M�todo que retorna a produ��o do lab passando par�metros para aumentar a produ��o
	 * @param boost a quantidade de recursos alocados para aumentar a produ��o
	 * @return a produ��o
	 */
	private int creativityProduction(int boost){
		return oopyiesAllocated*CREATIVITY_PER_OOPYIE*basicResearch(boost);
	}
	
	/**
	 * M�todo que retorna a produ��o do lab
	 * @return a produ��o
	 */
	private int creativityProduction(){
		return oopyiesAllocated*CREATIVITY_PER_OOPYIE;
	}
	
	
	/**
	 * M�todo que melhora a produ��o de criatividade do lab
	 * @param cocos o n�mero de cocos alocados
	 * @return a produ��o
	 */
	private int basicResearch(int cocos){
		if(upgradesAvailable[BASIC_RESEARCH] == false){
			return 0;//produz Criatividade se o metodo ja foi adquirido
		}else
			return cocos*CREATIVITY_PER_COCO;
	}
	
	/**
	 * M�todo que retorna a produ��o m�xima do lab
	 * @return a produ��o m�xima
	 */
	private int greatResearch(){
		if(upgradesAvailable[GREAT_RESEARCH] == false){
			return 0;//produz a producao se o metodo ja foi adquirido
		}else
			return MAX_PRODUCTION;
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
	 *M�todo que retona o pre�o para desqloquear um lab
	 *@return o pre�o para desbloquear um lab
	 */
	@Override
	public int getUnlockCost() {
		return unlockCost;
	}

	/**
	 * M�todo que retorna o custo de um lab
	 * @return o custo de um lab
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
	 * M�todo que define a quantidade de cocos alocadas no lab
	 * @param cocos o n�mero de cocos a serem alocados
	 */
	public void updateCocosUsed(int cocos){
		cocosUsed = cocos;
	}
	
	/**
	 * M�todo que define se o M�todo greatResearch j� foi chamado
	 * @param toUse true se foi chamado e false se n�o foi
	 */
	public void checkGreatResearch(boolean isUsed){
		greatResearchActivated = isUsed;
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
	 * M�todo que reinicia os atributos de um lab
	 */
	@Override
	public void reset() {
		oopyiesAllocated = 0;
		cocosUsed = 0;
		greatResearchActivated = false;
	}
	
	/**
	 * M�todo que retorna para os recursos do jogo os recursos que n�o foram utilizados
	 * @param resources um ResourceManager do jogo
	 */
	@Override
	public void reconfig(ResourceManager resources) {
		resources.updateOopyies(oopyiesAllocated);
		resources.updateSharpCocos(cocosUsed);
		if (greatResearchActivated) resources.updateGreatRubies(1);
		this.reset();
	}
		
	/**
	 * M�todo que gerencia uma troca de turno para um lab
	 * @param resources um ResourceManager do jogo
	 */
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