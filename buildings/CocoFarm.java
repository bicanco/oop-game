package buildings;

/**
 *  Classe que representa uma fazenda de cocos
 * @author David
 *
 */
public class CocoFarm extends Farm {
	private final static int FARM_CREATIVITY_COST = 0;//custo inicial da fazenda
	private final static int COCOS_PER_OOPYIE = 0;//valor de cocos produzidas po oopyie
	private final static int MAX_PRODUCTION = 0;//produ��o m�xima poss�vel
	
	public final static int FOOD_PRODUCTION = 0;//valores das posi��es dos m�todos no vetor de up grades
	public final static int COCO_FERTILIZER = 1;
	public final static int GREAT_PRODUCTION = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	static{
		name = "Fazenda de cocos";//inicializa��o das vari�veis est�ticas que s�o heran�a da classe Building
		description = "Produz SharpCocos em grande quantidade";
		creativityCost = FARM_CREATIVITY_COST;
		upgradeNumber = NUMBER_OF_UPGRADES;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[FOOD_PRODUCTION] = true;//o �nico m�todo que come�a j� adquirido
		upgradesAvailable[COCO_FERTILIZER] = false;//os outros come�am como n�o adquiridos
		upgradesAvailable[GREAT_PRODUCTION] = false;
		upgradesCost = new int[upgradeNumber];
		Farm.setUpgradeCost(0, FOOD_PRODUCTION);
		Farm.setUpgradeCost(0, COCO_FERTILIZER);
		Farm.setUpgradeCost(0, GREAT_PRODUCTION);
	}
	
	/**
	 * M�todo construtor da classe CocoFarm
	 */
	public CocoFarm(){
		super();
		super.setFoodType(COCO);
	}
	
	/**
	 * M�todo que produz SharpCocos
	 * @return O valor produzido
	 */
	@Override
	public int foodProduction(){
		return oopyiesAllocated*COCOS_PER_OOPYIE;
	}
	
	/**
	 * M�todo que produz SharpCocos e aumenta a produ��o de acordo com o a quantidade de recurso passada como par�metro
	 * @param A quantidade de recurso para o boost
	 * @return O valor produzido
	 */
	@Override
	public int foodProduction(int boost){
		return oopyiesAllocated*COCOS_PER_OOPYIE*cocoFertilizer(boost);
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
	public int seedFertilizer(int pyramids) {
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
