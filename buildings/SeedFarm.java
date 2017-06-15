package buildings;

import core.ResourceManager;

/**
 * Classe que representa uma fazenda de sementes
 * @author David
 *
 */
public class SeedFarm extends Farm{
	private final static int FARM_CREATIVITY_COST = 0;//custo inicial da fazenda
	private final static int SEEDS_PER_OOPYIE = 0;//valor de seeds produzidas po oopyie
	private final static int MAX_PRODUCTION = 0;//produ��o m�xima poss�vel
	
	public final static int FOOD_PRODUCTION = 0;//valores das posi��es dos m�todos no vetor de up grades
	public final static int SEED_FERTILIZER = 1;
	public final static int GREAT_PRODUCTION = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	private static String name = "Ro�a de sementes";//inicializa��o das vari�veis est�ticas que s�o heran�a da classe Building
	private static String description = "Produz JavaSeeds";
	private static String iconPath = "Farm.png"; 
	private static int unlockCost = FARM_CREATIVITY_COST;
	private static int buildCost = 250;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
	private static int[] upgradesCost = new int[upgradeNumber];
	
	static{
		upgradesAvailable[FOOD_PRODUCTION] = true;//o �nico m�todo que come�a j� adquirido
		upgradesAvailable[SEED_FERTILIZER] = false;//os outros come�am como n�o adquiridos
		upgradesAvailable[GREAT_PRODUCTION] = false;
		
		upgradesCost[FOOD_PRODUCTION] = 0;
		upgradesCost[SEED_FERTILIZER] = 300;
		upgradesCost[GREAT_PRODUCTION] = 300;
	}
	/**
	 * M�todo construtor da classe SeedFarm
	 */
	public SeedFarm(){
		super();
	}
	
	/**
	 * M�todo que produz JavaSeeds
	 * @return O valor produzido
	 */
	@Override
	public int foodProduction(){
		return oopyiesAllocated*SEEDS_PER_OOPYIE;
	}
	
	/**
	 * M�todo que produz JavaSeeds e aumenta a produ��o de acordo com o a quantidade de recurso passada como par�metro
	 * @param A quantidade de recurso para o boost
	 * @return O valor produzido
	 */
	@Override
	public int foodProduction(int boost){
		return oopyiesAllocated*SEEDS_PER_OOPYIE*seedFertilizer(boost);
	}
	
	/**
	 * M�todo inutilizado para esta classe
	 */
	@Override
	public void setFoodType(boolean type){
		
	}
	
	/**
	 * M�todo inutilizado para esta classe
	 */
	@Override
	public int cocoFertilizer(int pyramids) {
		return 0;
	}
	
	/**
	 * M�todo que produz a produ��o m�xima de uma fazenda, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @return A produ��o
	 */
	@Override
	public int greatProduction(){
		if(upgradesAvailable[GREAT_PRODUCTION] == false){
			return 0;//produz a produ��o se o m�todo j� foi adquirido
		}else
			return MAX_PRODUCTION;
	}
	
}
