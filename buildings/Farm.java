package buildings;

/**
 * Classe que representa uma fazenda
 * @author David
 *
 */
public class Farm extends Building{
	private final static int FARM_CREATIVITY_COST = 0;//custo inicial da fazenda
	private final static int MAX_PRODUCTION = 0;//produção máxima possível
	private final static int SEEDS_PER_PEARL = 0;//valor de seedss produzidas por pearl
	private final static int SEEDS_PER_OOPYIE = 0;//valor de seeds produzidas po oopyie
	private final static int COCOS_PER_OOPYIE = 0;//valor de cocos produzidos por oopyie
	private final static int COCOS_PER_PYRAMID = 0;//valor de cocos produzidos por pyramids

	public final static int FOOD_PRODUCTION = 0;//valores das posições dos métodos no vetor de up grades
	public final static int SEED_FERTILIZER = 1;
	public final static int COCO_FERTILIZER = 2;
	public final static int GREAT_PRODUCTION = 3;
	public final static int NUMBER_OF_UPGRADES = 4;//numero de up grades
	
	public final static boolean SEED = false;//tipo de comida produzida
	public final static boolean COCO = true;
	
 	
	protected boolean foodType;//tipo de comida produzida na fazenda
	
	static{
		name = "Fazenda";//inicialização das variáveis estáticas que são herança da classe Building
		description = "Produz JavaSeeds e SharpCocos";
		creativityCost = FARM_CREATIVITY_COST;
		upgradeNumber = NUMBER_OF_UPGRADES;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[FOOD_PRODUCTION] = true;//o único método que começa já adquirido
		upgradesAvailable[SEED_FERTILIZER] = false;//os outros começam como não adquiridos
		upgradesAvailable[COCO_FERTILIZER] = false;
		upgradesAvailable[GREAT_PRODUCTION] = false;
	}
	
	/**
	 * Método construtor da classe Farm
	 */
	public Farm(){
		super();
		foodType = SEED;//inicializa o objeto produzindo Seeds
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
	 * Método que produz seeds em função do número de pearls alocadas, se não adquiriu o método a produção será 0
	 * @param O número de pearls alocadas
	 * @return A produção
	 */
	public int seedFertilizer(int pearls){
		if(upgradesAvailable[SEED_FERTILIZER] == false){
			return 0;//produz Seeds se o método já foi adquirido
		}else
			return pearls*SEEDS_PER_PEARL*foodProduction();
	}
	
	/**
	 * Método que produz cocos em função do número de pyramids alocadas, se não adquiriu o método a produção será 0
	 * @param O número de pyramids alocadas
	 * @return A produção
	 */
	public int cocoFertilizer(int pyramids){
		if(upgradesAvailable[COCO_FERTILIZER] == false){
			return 0;//produz Cocos se o método já foi adquirido
		}else
			return pyramids*COCOS_PER_PYRAMID*foodProduction();
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
}
