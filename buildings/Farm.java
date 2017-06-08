package buildings;

/**
 * Classe que representa uma fazenda
 * @author David
 *
 */
public class Farm implements Building {
	private final static int FARM_CREATIVITY_COST = 20;//custo inicial da fazenda
	private final static int MAX_PRODUCTION = 0;//produção máxima possível
	private final static int SEEDS_PER_PERL = 0;//valor de seedss produzidas por perl
	private final static int SEEDS_PER_OOPYIE = 0;//valor de seeds produzidas po oopyie
	private final static int COCOS_PER_OOPYIE = 0;//valor de cocos produzidos por oopyie
	private final static int COCOS_PER_PYRAMID = 0;//valor de cocos produzidos por pyramids

	public final static int FOOD_PRODUCTION = 0;//valores das posições dos métodos no vetor de up grades
	public final static int SEED_FERTILIZER = 1;
	public final static int COCO_FERTILIZER = 2;
	public final static int GREAT_PRODUCTION = 3;
	public final static int NUMBER_OF_UPGRADES = 4;//numero de upgrades
	
	public final static boolean SEED = false;//tipo de comida produzida
	public final static boolean COCO = true;
	
	protected boolean foodType;//tipo de comida produzida na fazenda
	
	private static String name = "Farm";//inicialização das variáveis estáticas que são herança da classe Building
	private static String description = "Produz JavaSeeds e SharpCocos";
	private static String iconPath = "Farm.png"; 
	private static int unlockCost = FARM_CREATIVITY_COST;
	private static int buildCost = 123;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
	private static int[] upgradesCost = new int[upgradeNumber];
	
	private static int oopyiesAllocated;
	
	/**
	 * Método construtor da classe Farm
	 */
	public Farm(){
		foodType = SEED;//inicializa o objeto produzindo Seeds
		
		upgradesAvailable[FOOD_PRODUCTION] = true;//o único método que começa já adquirido
		upgradesAvailable[SEED_FERTILIZER] = false;//os outros começam como não adquiridos
		upgradesAvailable[COCO_FERTILIZER] = false;
		upgradesAvailable[GREAT_PRODUCTION] = false;
		
		setUpgradeCost(0, FOOD_PRODUCTION);
		setUpgradeCost(0, SEED_FERTILIZER);
		setUpgradeCost(0, COCO_FERTILIZER);
		setUpgradeCost(0, GREAT_PRODUCTION);
	}
	
	/**
	 * Método que define o recurso a ser produzido
	 */
	public void setFoodType(boolean type){
		foodType = type;//define o tipo de comida a ser produzida
	}
	
	/**
	 * Método que retorna o tipo de alimento produzido
	 * @return o tipo de alimento produzido
	 */
	public boolean getFoodType(){
		return foodType;//retorna o tipo de alimento produzido
	}
	
	
	/**
	 * Método que produz o rescurso de acordo com o que está definido na fazenda e aumenta a produção de acordo com o a quantidade de recurso passada como parâmetro
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
	 * Método que produz o rescurso de acordo com o que está definido na fazenda
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
	 * Método que produz seeds em função do número de perls alocadas, se não adquiriu o método a produção será 0
	 * @param O número de perls alocadas
	 * @return A produção
	 */
	public int seedFertilizer(int perls){
		if(upgradesAvailable[SEED_FERTILIZER] == false){
			return 1;//produz Seeds se o método já foi adquirido
		}else{
			setFoodType(SEED);
			return perls*SEEDS_PER_PERL;
		}
	}
	
	/**
	 * Método que produz cocos em função do número de pyramids alocadas, se não adquiriu o método a produção será 0
	 * @param O número de pyramids alocadas
	 * @return A produção
	 */
	public int cocoFertilizer(int pyramids){
		if(upgradesAvailable[COCO_FERTILIZER] == false){
			return 1;//produz Cocos se o método já foi adquirido
		}else{
			setFoodType(COCO);
			return pyramids*COCOS_PER_PYRAMID;
		}
	}
	
	/**
	 * Método que produz a produção máxima de uma fazenda, se não adquiriu o método a produção será 0
	 * @return A produção
	 */
	public int greatProduction(){
		if(upgradesAvailable[GREAT_PRODUCTION] == false){
			return 0;//produz a produção se o método já foi adquirido
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
		oopyiesAllocated = 0;
	}
}
