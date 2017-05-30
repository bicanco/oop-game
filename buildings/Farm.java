package buildings;

public class Farm extends Building{
	private final static int FARM_CREATIVITY_COST = 0;
	private final static int MAX_PRODUCTION = 0;

	public final static int FOOD_PRODUCTION = 0;
	public final static int SEED_FERTILIZER = 1;
	public final static int COCO_FERTILIZER = 2;
	public final static int GREAT_PRODUCTION = 3;
	public final static boolean SEED = false;
	public final static boolean COCO = true;
	
 	protected int oopyiesAllocated;
	protected boolean foodType;
	protected static int seedsPerOopy;
	protected static int cocosPerOopy;
	
	static{
		creativityCost = FARM_CREATIVITY_COST;
		upgradeNumber = 4;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[FOOD_PRODUCTION] = false;
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
			return oopyiesAllocated*seedsPerOopy;
		}else if(foodType == COCO){
			return oopyiesAllocated*cocosPerOopy;
		}
		return 0;
	}
	
	public static void seedFertilizer(int pearls){
	}
	
	public static void cocoFertilizer(int pyramids){
		
	}
	
	public int greatProduction(int ruby){
		return ruby == 1?MAX_PRODUCTION:0;
	}
}
