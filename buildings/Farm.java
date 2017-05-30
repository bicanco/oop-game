package buildings;

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
		creativityCost = FARM_CREATIVITY_COST;
		upgradeNumber = NUMBER_OF_UPGRADES;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[FOOD_PRODUCTION] = true;
		upgradesAvailable[SEED_FERTILIZER] = false;
		upgradesAvailable[COCO_FERTILIZER] = false;
		upgradesAvailable[GREAT_PRODUCTION] = false;
	}
	
	public Farm(){
		foodType = SEED;
	}
	
	public void setFoodType(boolean type){
		foodType = type;
	}
	
	public void allocateOopyies(int oopyies){
		oopyiesAllocated = oopyies;
	}
	
	public int foodProduction(){
		if(foodType == SEED){
			return oopyiesAllocated*SEEDS_PER_OOPYIE;
		}else if(foodType == COCO){
			return oopyiesAllocated*COCOS_PER_OOPYIE;
		}
		return 0;
	}
	
	public static int seedFertilizer(int pearls){
		if(upgradesAvailable[SEED_FERTILIZER] == false){
			return 0;
		}else
			return pearls*SEEDS_PER_PEARL;
	}
	
	public static int cocoFertilizer(int pyramids){
		if(upgradesAvailable[COCO_FERTILIZER] == false){
			return 0;
		}else
			return pyramids*COCOS_PER_PYRAMID;
	}
	
	public int greatProduction(int ruby){
		return ruby == 1?MAX_PRODUCTION:0;
	}
}
