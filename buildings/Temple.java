package buildings;

import core.ResourceManager;

/**
 * Classe que representa um Templo
 * @author Marcelo
 *
 */ 
public class Temple implements Building {
	private final static int TEMPLE_CREATIVITY_COST = 0;//custo inicial do Templo
	private final static int MAX_PRODUCTION = 200;//producao maxima possivel
	private final static int PERL_PER_SEED = 2;//valor de Perls produzidos por Seed
	private final static int PERL_PER_OOPYIE = 1;//valor de Perls produzidos por oopyie
	private final static int PYRAMID_PER_OOPYIE = 1;//valor de Pyramids produzidos por oopyie
	private final static int PYRAMID_PER_COCO = 2;//valor de Pyramids produzidos por cocos

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
	private static int buildCost = 300;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
		
	private static int[] upgradesCost = new int[upgradeNumber];
	
	static {
		upgradesAvailable[GEM_PRODUCTION] = true;//o unico metodo que comeca ja adquirido
		upgradesAvailable[PERL_RITUAL] = false;//os outros comecam como nao adquiridos
		upgradesAvailable[PYRAMID_RITUAL] = false;
		upgradesAvailable[GREAT_RITUAL] = false;
		
		upgradesCost[GEM_PRODUCTION] = 0;
		upgradesCost[PERL_RITUAL] = 300;
		upgradesCost[PYRAMID_RITUAL] = 300;
		upgradesCost[GREAT_RITUAL] = 750;
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
	
	public void setSeeds(int seeds){
		seedsUsed = seeds;
	}

	public void setCocos(int cocos){
		cocosUsed = cocos;
	}

	public void checkGreatRitual(boolean toUse){
		greatRitualActivated = toUse;
	}
	
	/**
	 * Metodo que define a gema a ser produzida
	 */
	public void setGemType(boolean type){
		gemType = type;//define o tipo de gema a ser produzida
	}
	
	/**
	 * Metodo que retorna o tipo de gema produzida
	 * @return o tipo de gema produzida
	 */
	public boolean setGemType(){
		return gemType;//retorna o tipo de gema produzida
	}
	
	
	/**
	 * Metodo que produz o rescurso de acordo com o que esta definido no templo e aumenta a producao de acordo com o a quantidade de recurso passada como par�metro
	 * @param A quantidade de recurso para o boost
	 * @return O valor produzido
	 */
	public int gemProduction(int boost){
		if(gemType == PERL){//produz os rescursos de acordo com o tipo previamente definido na fazenda e faz o boost
			return oopyiesAllocated*PERL_PER_OOPYIE*perlRitual(boost);
		}else if(gemType == PYRAMID){
			return oopyiesAllocated*PYRAMID_PER_OOPYIE*pyramidRitual(boost);
		}
		return 0;
	}
	
	/**
	 * Metodo que produz o rescurso de acordo com o que esta definido na fazenda
	 * @return O valor produzido
	 */
	public int gemProduction(){
		if(gemType == PERL){//produz os rescursos de acordo com o tipo previamente definido no templo
			return oopyiesAllocated*PERL_PER_OOPYIE;
		}else if(gemType == PYRAMID){
			return oopyiesAllocated*PYRAMID_PER_OOPYIE;
		}
		return 0;
	}
	
	
	/**
	 * Metodo que produz Perls em funcao do numero de Seeds alocadas, se nao adquiriu o metodo a producao sera 0
	 * @param O numero de Seeds alocadas
	 * @return A producao
	 */
	public int perlRitual(int seeds){
		if(upgradesAvailable[PERL_RITUAL] == false){
			return 1;//produz Seeds se o metodo ja foi adquirido
		}else{
			setGemType(PERL);
			return seeds*PERL_PER_SEED;
		}
	}
	
	/**
	 * Metodo que produz PYramids em funcao do numero de Cocos alocados, se nao adquiriu o metodo a producao sera 0
	 * @param O numero de cocos alocados
	 * @return A producao
	 */
	public int pyramidRitual(int cocos){
		if(upgradesAvailable[PYRAMID_RITUAL] == false){
			return 1;//produz PYramids se o metodo ja foi adquirido
		}else{
			setGemType(PYRAMID);
			return cocos*PYRAMID_PER_COCO;
		}
	}
	
	/**
	 * M�todo que produz a producao maxima de um templo, se nao adquiriu o metodo a producao sera 0
	 * @return A producao
	 */
	public int greatRitual(){
		if(upgradesAvailable[GREAT_RITUAL] == false){
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
		gemType = PERL;//inicializa o objeto produzindo Perls
		oopyiesAllocated = 0;
		seedsUsed = 0;
		cocosUsed = 0;
		greatRitualActivated = false;
	}

	@Override
	public void reconfig(ResourceManager resources) {
		resources.updateOopyies(oopyiesAllocated);
		resources.updateJavaSeeds(seedsUsed);
		resources.updateSharpCocos(cocosUsed);
		if (greatRitualActivated) resources.updateGreatRubies(1);
		this.reset();
	}

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
