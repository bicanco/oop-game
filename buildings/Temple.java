package buildings;

import core.ResourceManager;

/**
 * Classe que representa um Templo implementando a interface Building
 * @author Marcelo
 *
 */ 
public class Temple implements Building {
	private final static int TEMPLE_CREATIVITY_COST = 0;//custo inicial do Templo
	private final static int MAX_PRODUCTION = 600;//producao maxima possivel
	private final static double PERL_PER_SEED = 0.4;//valor de Perls produzidos por Seed
	private final static int PERL_PER_OOPYIE = 2;//valor de Perls produzidos por oopyie
	private final static int PYRAMID_PER_OOPYIE = 2;//valor de Pyramids produzidos por oopyie
	private final static double PYRAMID_PER_COCO = 0.4;//valor de Pyramids produzidos por cocos

	public final static int GEM_PRODUCTION = 0;//valores das posicoes dos metodos no vetor de up grades
	public final static int PERL_RITUAL = 1;
	public final static int PYRAMID_RITUAL = 2;
	public final static int GREAT_RITUAL = 3;
	public final static int NUMBER_OF_UPGRADES = 4;//numero de up grades
	
	public final static boolean PERL = false;//tipo de gema produzida
	public final static boolean PYRAMID = true;
	
	private static String name = "Templo";//inicializacao das variaveis estaticas que sao heranca da classe Building
	private static String description = "Produz Magic Perls e PYramids";
	private static String iconPath = "Temple.png";
	private static int unlockCost = TEMPLE_CREATIVITY_COST;
	private static int buildCost = 50;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
		
	private static int[] upgradesCost = new int[upgradeNumber];
	
	static {
		upgradesAvailable[GEM_PRODUCTION] = true;//o unico metodo que comeca ja adquirido
		upgradesAvailable[PERL_RITUAL] = false;//os outros comecam como nao adquiridos
		upgradesAvailable[PYRAMID_RITUAL] = false;
		upgradesAvailable[GREAT_RITUAL] = false;
		
		upgradesCost[GEM_PRODUCTION] = 0;
		upgradesCost[PERL_RITUAL] = 600;
		upgradesCost[PYRAMID_RITUAL] = 600;
		upgradesCost[GREAT_RITUAL] = 1350;
	}
	
	protected boolean gemType; //tipo de gema produzida no templo
	protected int oopyiesAllocated;
	protected int seedsUsed;
	protected int cocosUsed;
	protected boolean greatRitualActivated;
	
	/**
	 * Metodo construtor da classe Temple
	 */
	public Temple(){
		reset();
	}
	
	/**
	 * M�todo que define a quantidade de Seeds alocadas no templo
	 * @param seeds o n�mero de seeds a serem alocadas
	 */
	public void setSeeds(int seeds){
		seedsUsed = seeds;
	}

	/**
	 * M�todo que define a quantidade de Cocos alocadas no templo
	 * @param cocos o n�mero de cocos a serem alocados
	 */
	public void setCocos(int cocos){
		cocosUsed = cocos;
	}

	/**
	 * M�todo que define se o M�todo greatRitual j� foi chamado
	 * @param toUse true se foi chamado e false se n�o foi
	 */
	public void checkGreatRitual(boolean toUse){
		greatRitualActivated = toUse;
	}
	
	/**
	 * M�todo que define o tipo de gema a ser produzida no templo
	 * @param type boolean que representa um tipo segundo constantes p�blicas definidas na classe
	 */
	public void setGemType(boolean type){
		gemType = type;//define o tipo de gema a ser produzida
	}
	
	/**
	 * Metodo que retorna o tipo de gema produzida no templo
	 * @return o tipo de gema produzida
	 */
	public boolean getGemType(){
		return gemType;//retorna o tipo de gema produzida
	}
	
	
	/**
	 * M�todo que retorna a produ��o do templo passando par�metros para aumentar a produ��o
	 * @param boost a quantidade de recursos alocados para aumentar a produ��o
	 * @return a produ��o
	 */
	private int gemProduction(int boost){
		if(gemType == PERL){//produz os rescursos de acordo com o tipo previamente definido na fazenda e faz o boost
			return oopyiesAllocated*PERL_PER_OOPYIE*perlRitual(boost);
		}else if(gemType == PYRAMID){
			return oopyiesAllocated*PYRAMID_PER_OOPYIE*pyramidRitual(boost);
		}
		return 0;
	}
	
	/**
	 * M�todo que retorna a produ��o do templo
	 * @return a produ��o
	 */
	private int gemProduction(){
		if(gemType == PERL){//produz os rescursos de acordo com o tipo previamente definido no templo
			return oopyiesAllocated*PERL_PER_OOPYIE;
		}else if(gemType == PYRAMID){
			return oopyiesAllocated*PYRAMID_PER_OOPYIE;
		}
		return 0;
	}
	
	
	/**
	 * M�todo que melhora a produ��o de perls do templo
	 * @param seeds o n�mero de seeds alocadas
	 * @return a produ��o
	 */
	private int perlRitual(int seeds){
		if(upgradesAvailable[PERL_RITUAL] == false){
			return 1;//produz Seeds se o metodo ja foi adquirido
		}else{
			setGemType(PERL);
			Double d = seeds*PERL_PER_SEED;
			return d.intValue();
		}
	}
	
	/**
	 * M�todo que melhora a produ��o de Pyramids do templo
	 * @param cocos o n�mero de cocos alocados
	 * @return a produ��o
	 */
	private int pyramidRitual(int cocos){
		if(upgradesAvailable[PYRAMID_RITUAL] == false){
			return 1;//produz PYramids se o metodo ja foi adquirido
		}else{
			setGemType(PYRAMID);
			Double d = cocos*PYRAMID_PER_COCO;
			return d.intValue();
		}
	}
	
	/**
	 * M�todo que retorna a produ��o m�xima do templo
	 * @return a produ��o m�xima
	 */
	public int greatRitual(){
		if(upgradesAvailable[GREAT_RITUAL] == false){
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
	 *M�todo que retona o pre�o para desqloquear um templo
	 *@return o pre�o para desbloquear um templo
	 */
	@Override
	public int getUnlockCost() {
		return unlockCost;
	}

	/**
	 * M�todo que retorna o custo de um templo
	 * @return o custo de um templo
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
	 * M�todo que reinicia os atributos de um templo
	 */
	@Override
	public void reset() {
		gemType = PERL;//inicializa o objeto produzindo Perls
		oopyiesAllocated = 0;
		seedsUsed = 0;
		cocosUsed = 0;
		greatRitualActivated = false;
	}

	/**
	 * M�todo que retorna para os recursos do jogo os recursos que n�o foram utilizados
	 * @param resources um ResourceManager do jogo
	 */
	@Override
	public void reconfig(ResourceManager resources) {
		resources.updateOopyies(oopyiesAllocated);
		resources.updateJavaSeeds(seedsUsed);
		resources.updateSharpCocos(cocosUsed);
		if (greatRitualActivated) resources.updateGreatRubies(1);
		this.reset();
	}

	/**
	 * M�todo que gerencia uma troca de turno para um templo
	 * @param resources um ResourceManager do jogo
	 */
	@Override
	public void runTurn(ResourceManager resources) {
		if (gemType == PERL){
			if (greatRitualActivated)
				resources.updateMagicPerls(greatRitual());
			else {
				resources.updateOopyies(oopyiesAllocated);
				if (seedsUsed > 0) resources.updateMagicPerls(gemProduction(seedsUsed));
				else resources.updateMagicPerls(gemProduction());
			}
		} else { // gemType == PYRAMID
			if (greatRitualActivated)
				resources.updatePyramids(greatRitual());
			else {
				resources.updateOopyies(oopyiesAllocated);
				if (cocosUsed > 0) resources.updatePyramids(gemProduction(cocosUsed));
				else resources.updatePyramids(gemProduction());
			}
		}
	}
	
}
