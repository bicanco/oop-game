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
	 * Método que retorna a produção do lab passando parâmetros para aumentar a produção
	 * @param boost a quantidade de recursos alocados para aumentar a produção
	 * @return a produção
	 */
	private int creativityProduction(int boost){
		return oopyiesAllocated*CREATIVITY_PER_OOPYIE*basicResearch(boost);
	}
	
	/**
	 * Método que retorna a produção do lab
	 * @return a produção
	 */
	private int creativityProduction(){
		return oopyiesAllocated*CREATIVITY_PER_OOPYIE;
	}
	
	
	/**
	 * Método que melhora a produção de criatividade do lab
	 * @param cocos o número de cocos alocados
	 * @return a produção
	 */
	private int basicResearch(int cocos){
		if(upgradesAvailable[BASIC_RESEARCH] == false){
			return 0;//produz Criatividade se o metodo ja foi adquirido
		}else
			return cocos*CREATIVITY_PER_COCO;
	}
	
	/**
	 * Método que retorna a produção máxima do lab
	 * @return a produção máxima
	 */
	private int greatResearch(){
		if(upgradesAvailable[GREAT_RESEARCH] == false){
			return 0;//produz a producao se o metodo ja foi adquirido
		}else
			return MAX_PRODUCTION;
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
	 *Método que retona o preço para desqloquear um lab
	 *@return o preço para desbloquear um lab
	 */
	@Override
	public int getUnlockCost() {
		return unlockCost;
	}

	/**
	 * Método que retorna o custo de um lab
	 * @return o custo de um lab
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
	 * Método que define a quantidade de cocos alocadas no lab
	 * @param cocos o número de cocos a serem alocados
	 */
	public void updateCocosUsed(int cocos){
		cocosUsed = cocos;
	}
	
	/**
	 * Método que define se o Método greatResearch já foi chamado
	 * @param toUse true se foi chamado e false se não foi
	 */
	public void checkGreatResearch(boolean isUsed){
		greatResearchActivated = isUsed;
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
	 * Método que reinicia os atributos de um lab
	 */
	@Override
	public void reset() {
		oopyiesAllocated = 0;
		cocosUsed = 0;
		greatResearchActivated = false;
	}
	
	/**
	 * Método que retorna para os recursos do jogo os recursos que não foram utilizados
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
	 * Método que gerencia uma troca de turno para um lab
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