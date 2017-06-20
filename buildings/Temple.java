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
	 * Método que define a quantidade de Seeds alocadas no templo
	 * @param seeds o número de seeds a serem alocadas
	 */
	public void setSeeds(int seeds){
		seedsUsed = seeds;
	}

	/**
	 * Método que define a quantidade de Cocos alocadas no templo
	 * @param cocos o número de cocos a serem alocados
	 */
	public void setCocos(int cocos){
		cocosUsed = cocos;
	}

	/**
	 * Método que define se o Método greatRitual já foi chamado
	 * @param toUse true se foi chamado e false se não foi
	 */
	public void checkGreatRitual(boolean toUse){
		greatRitualActivated = toUse;
	}
	
	/**
	 * Método que define o tipo de gema a ser produzida no templo
	 * @param type boolean que representa um tipo segundo constantes públicas definidas na classe
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
	 * Método que retorna a produção do templo passando parâmetros para aumentar a produção
	 * @param boost a quantidade de recursos alocados para aumentar a produção
	 * @return a produção
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
	 * Método que retorna a produção do templo
	 * @return a produção
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
	 * Método que melhora a produção de perls do templo
	 * @param seeds o número de seeds alocadas
	 * @return a produção
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
	 * Método que melhora a produção de Pyramids do templo
	 * @param cocos o número de cocos alocados
	 * @return a produção
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
	 * Método que retorna a produção máxima do templo
	 * @return a produção máxima
	 */
	public int greatRitual(){
		if(upgradesAvailable[GREAT_RITUAL] == false){
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
	 *Método que retona o preço para desqloquear um templo
	 *@return o preço para desbloquear um templo
	 */
	@Override
	public int getUnlockCost() {
		return unlockCost;
	}

	/**
	 * Método que retorna o custo de um templo
	 * @return o custo de um templo
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
	 * Método que reinicia os atributos de um templo
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
	 * Método que retorna para os recursos do jogo os recursos que não foram utilizados
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
	 * Método que gerencia uma troca de turno para um templo
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
