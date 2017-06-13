package buildings;

import core.ResourceManager;

/**
 * Classe que representa uma fazenda
 * @author David
 *
 */
public class Farm implements Building {
	private final static int FARM_CREATIVITY_COST = 20;//custo inicial da fazenda
	private final static int MAX_PRODUCTION = 500;//produï¿½ï¿½o mï¿½xima possï¿½vel
	private final static int SEEDS_PER_PERL = 2;//valor de seedss produzidas por perl
	private final static int SEEDS_PER_OOPYIE = 1;//valor de seeds produzidas po oopyie
	private final static int COCOS_PER_OOPYIE = 1;//valor de cocos produzidos por oopyie
	private final static int COCOS_PER_PYRAMID = 2;//valor de cocos produzidos por pyramids

	public final static int FOOD_PRODUCTION = 0;//valores das posiï¿½ï¿½es dos mï¿½todos no vetor de up grades
	public final static int SEED_FERTILIZER = 1;
	public final static int COCO_FERTILIZER = 2;
	public final static int GREAT_PRODUCTION = 3;
	public final static int NUMBER_OF_UPGRADES = 4;//numero de upgrades
	
	public final static boolean SEED = false;//tipo de comida produzida
	public final static boolean COCO = true;
	
	private static String name = "Roça";//inicializaï¿½ï¿½o das variï¿½veis estï¿½ticas que sï¿½o heranï¿½a da classe Building
	private static String description = "Produz JavaSeeds e SharpCocos";
	private static String iconPath = "Farm.png"; 
	private static int unlockCost = FARM_CREATIVITY_COST;
	private static int buildCost = 250;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
	private static int[] upgradesCost = new int[upgradeNumber];
	static {
		upgradesAvailable[FOOD_PRODUCTION] = true;//o ï¿½nico mï¿½todo que comeï¿½a jï¿½ adquirido
		upgradesAvailable[SEED_FERTILIZER] = false;//os outros comeï¿½am como nï¿½o adquiridos
		upgradesAvailable[COCO_FERTILIZER] = false;
		upgradesAvailable[GREAT_PRODUCTION] = false;
		upgradesCost[FOOD_PRODUCTION] = 0;
		upgradesCost[SEED_FERTILIZER] = 300;
		upgradesCost[COCO_FERTILIZER] = 300;
		upgradesCost[GREAT_PRODUCTION] = 750;
	}
	protected boolean foodType;//tipo de comida produzida na fazenda
	protected int oopyiesAllocated;
	protected int perlsUsed;
	protected int pyramidsUsed;
	protected boolean greatProductionActivated;	
	/**
	 * Mï¿½todo construtor da classe Farm
	 */
	public Farm(){
		reset();
	}
	
	/**
	 * Mï¿½todo que define o recurso a ser produzido
	 */
	public void setFoodType(boolean type){
		foodType = type;//define o tipo de comida a ser produzida
	}
	
	/**
	 * Mï¿½todo que retorna o tipo de alimento produzido
	 * @return o tipo de alimento produzido
	 */
	public boolean getFoodType(){
		return foodType;//retorna o tipo de alimento produzido
	}
	
	public void setPerls(int perls){
		perlsUsed = perls;
	}
	
	public void setPyramids(int pyramids){
		pyramidsUsed = pyramids;
	}
	
	public void checkGreatProduction(boolean toUse){
		greatProductionActivated = toUse;
	}
	
	/**
	 * Mï¿½todo que produz o rescurso de acordo com o que estï¿½ definido na fazenda e aumenta a produï¿½ï¿½o de acordo com o a quantidade de recurso passada como parï¿½metro
	 * @param A quantidade de recurso para o boost
	 * @return O valor produzido
	 */
	public int foodProduction(int boost){
		if(foodType == SEED){//produz os rescursos de acordo com o tipo previamente definido na fazenda e faz o boost
			return oopyiesAllocated*SEEDS_PER_OOPYIE*seedFertilizer(boost);
		}else if(foodType == COCO){
			return oopyiesAllocated*COCOS_PER_OOPYIE*cocoFertilizer(boost);
		}
		return 0;
	}
	
	/**
	 * Mï¿½todo que produz o rescurso de acordo com o que estï¿½ definido na fazenda
	 * @return O valor produzido
	 */
	public int foodProduction(){
		if(foodType == SEED){//produz os rescursos de acordo com o tipo previamente definido na fazenda
			return oopyiesAllocated*SEEDS_PER_OOPYIE;
		}else if(foodType == COCO){
			return oopyiesAllocated*COCOS_PER_OOPYIE;
		}
		return 0;
	}
	
	/**
	 * Mï¿½todo que produz seeds em funï¿½ï¿½o do nï¿½mero de perls alocadas, se nï¿½o adquiriu o mï¿½todo a produï¿½ï¿½o serï¿½ 0
	 * @param O nï¿½mero de perls alocadas
	 * @return A produï¿½ï¿½o
	 */
	public int seedFertilizer(int perls){
		if(upgradesAvailable[SEED_FERTILIZER] == false){
			return 1;//produz Seeds se o mï¿½todo jï¿½ foi adquirido
		}else{
			return perls*SEEDS_PER_PERL;
		}
	}
	
	/**
	 * Mï¿½todo que produz cocos em funï¿½ï¿½o do nï¿½mero de pyramids alocadas, se nï¿½o adquiriu o mï¿½todo a produï¿½ï¿½o serï¿½ 0
	 * @param O nï¿½mero de pyramids alocadas
	 * @return A produï¿½ï¿½o
	 */
	public int cocoFertilizer(int pyramids){
		if(upgradesAvailable[COCO_FERTILIZER] == false){
			return 1;//produz Cocos se o mï¿½todo jï¿½ foi adquirido
		}else{
			return pyramids*COCOS_PER_PYRAMID;
		}
	}
	
	/**
	 * Mï¿½todo que produz a produï¿½ï¿½o mï¿½xima de uma fazenda, se nï¿½o adquiriu o mï¿½todo a produï¿½ï¿½o serï¿½ 0
	 * @return A produï¿½ï¿½o
	 */
	public int greatProduction(){
		if(upgradesAvailable[GREAT_PRODUCTION] == false){
			return 0;//produz a produï¿½ï¿½o se o mï¿½todo jï¿½ foi adquirido
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
		foodType = SEED; //inicializa o objeto produzindo Seeds
		oopyiesAllocated = 0;
		perlsUsed = 0;
		pyramidsUsed = 0;
		greatProductionActivated = false;
	}
	
	@Override
	public void reconfig(ResourceManager resources){
		resources.updateOopyies(oopyiesAllocated);
		resources.updateMagicPerls(perlsUsed);
		resources.updatePyramids(pyramidsUsed);
		if (greatProductionActivated) resources.updateGreatRubies(1);
		this.reset();
	}
	
	@Override
	public void runTurn(ResourceManager resources){
		if (foodType == SEED){
			if (greatProductionActivated)
				resources.updateJavaSeeds(greatProduction());
			else {
				if (perlsUsed > 0) resources.updateJavaSeeds(foodProduction(perlsUsed));
				else resources.updateJavaSeeds(foodProduction());
			}
		} else { // foodType == COCO
			if (greatProductionActivated)
				resources.updateSharpCocos(greatProduction());
			else {
				if (pyramidsUsed > 0) resources.updateSharpCocos(foodProduction(pyramidsUsed));
				else resources.updateSharpCocos(foodProduction());
			}
		}
	}
}
