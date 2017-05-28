package buildings;

public class Farm extends Building{
	private final static int FARM_CREATIVITY_COST = 0;
	private final static int MAX_PRODUCTION = 0;
	private final static int SEED_FERTILIZER = 0;
	private final static int COCO_FERTILIZER = 0;
	
	public final static int SEED = 0;
	public final static int COCO = 1;
	
 	protected int oopyiesAllocated;
	protected int foodType;
	protected static int seedsPerOopy;
	protected static int cocosPerOopy;
	
	static{
		creativityCost = FARM_CREATIVITY_COST;
		methodsAvailable = new boolean[2];
		methodsAvailable[SEED] = false;
		methodsAvailable[COCO] = false;
	}
	
	public Farm(int type){
		foodType = type;
	}
	
	public void setFoodType(int type){
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
	
	public static void seedFertilizer(int pearls) throws Exception{
		if(methodsAvailable[SEED] == false){
			methodsAvailable[SEED] = true;
			seedsPerOopy *= SEED_FERTILIZER;
		}else
			throw new Exception("Ja possui metodo");
	}
	
	public static void cocoFertilizer(int pyramids) throws Exception{
		if(methodsAvailable[SEED] == false){
			methodsAvailable[SEED] = true;
			cocosPerOopy *= COCO_FERTILIZER;
		}else
			throw new Exception("Ja possui metodo");
	}
	
	public int greatProduction(int ruby){
		return ruby == 1?MAX_PRODUCTION:0;
	}
}
