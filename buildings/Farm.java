package buildings;

/**
 * Classe que representa uma fazenda
 * @author David
 *
 */
public class Farm extends Building{
	private final static int FARM_CREATIVITY_COST = 0;
	private final static int MAX_PRODUCTION = 0;
	private final static int SEEDS_PER_PEARL = 0;
	private final static int SEEDS_PER_OOPYIE = 0;
	private final static int COCOS_PER_OOPYIE = 0;
	private final static int COCOS_PER_PYRAMID = 0;

	public final static int FOOD_PRODUCTION = 0;
	public final static int SEED_FERTILIZER = 1;
	public final static int COCO_FERTILIZER = 2;
	public final static int GREAT_PRODUCTION = 3;
	public final static int NUMBER_OF_UPGRADES = 4;
	
	public final static boolean SEED = false;
	public final static boolean COCO = true;
	
 	protected int oopyiesAllocated;
	protected boolean foodType;
	
	static{
		name = "Fazenda";
		description = "Produz JavaSeeds e SharpCocos";
		creativityCost = FARM_CREATIVITY_COST;
		upgradeNumber = NUMBER_OF_UPGRADES;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[FOOD_PRODUCTION] = true;
		upgradesAvailable[SEED_FERTILIZER] = false;
		upgradesAvailable[COCO_FERTILIZER] = false;
		upgradesAvailable[GREAT_PRODUCTION] = false;
	}
	
	/**
	 * M�todo construtor a classe Farm
	 */
	public Farm(){
		foodType = SEED;
	}
	
	/**
	 * M�todo que define o recurso a ser produzido
	 */
	public void setFoodType(boolean type){
		foodType = type;
	}
	
	/**
	 * M�todo que define o n�mero de oopyies alocados
	 * @param oopyies
	 */
	public void allocateOopyies(int oopyies){
		oopyiesAllocated = oopyies;
	}
	
	/**
	 * M�todo que produz o rescurso de acordo com o que est� definido na fazenda
	 * @return O valor produzido
	 */
	public int foodProduction(){
		if(foodType == SEED){
			return oopyiesAllocated*SEEDS_PER_OOPYIE;
		}else if(foodType == COCO){
			return oopyiesAllocated*COCOS_PER_OOPYIE;
		}
		return 0;
	}
	
	/**
	 * M�todo que produz seeds em fun��o do n�mero de pearls alocadas, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @param O n�mero de pearls alocadas
	 * @return A produ��o
	 */
	public static int seedFertilizer(int pearls){
		if(upgradesAvailable[SEED_FERTILIZER] == false){
			return 0;
		}else
			return pearls*SEEDS_PER_PEARL;
	}
	
	/**
	 * M�todo que produz cocos em fun��o do n�mero de pyramids alocadas, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @param O n�mero de pyramids alocadas
	 * @return A produ��o
	 */
	public static int cocoFertilizer(int pyramids){
		if(upgradesAvailable[COCO_FERTILIZER] == false){
			return 0;
		}else
			return pyramids*COCOS_PER_PYRAMID;
	}
	
	/**
	 * M�todo que produz a produ��o m�xima de uma fazenda
	 * @return A produ��o
	 */
	public int greatProduction(){
		if(upgradesAvailable[GREAT_PRODUCTION] == false){
			return 0;
		}else
			return MAX_PRODUCTION;
	}
}
