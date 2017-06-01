package buildings;

/**
 * Classe que representa uma fazenda
 * @author David
 *
 */
public class Farm extends Building{
	private final static int FARM_CREATIVITY_COST = 0;//custo inicial da fazenda
	private final static int MAX_PRODUCTION = 0;//produ��o m�xima poss�vel
	private final static int SEEDS_PER_PEARL = 0;//valor de seedss produzidas por pearl
	private final static int SEEDS_PER_OOPYIE = 0;//valor de seeds produzidas po oopyie
	private final static int COCOS_PER_OOPYIE = 0;//valor de cocos produzidos por oopyie
	private final static int COCOS_PER_PYRAMID = 0;//valor de cocos produzidos por pyramids

	public final static int FOOD_PRODUCTION = 0;//valores das posi��es dos m�todos no vetor de up grades
	public final static int SEED_FERTILIZER = 1;
	public final static int COCO_FERTILIZER = 2;
	public final static int GREAT_PRODUCTION = 3;
	public final static int NUMBER_OF_UPGRADES = 4;//numero de up grades
	
	public final static boolean SEED = false;//tipo de comida produzida
	public final static boolean COCO = true;
	
 	
	protected boolean foodType;//tipo de comida produzida na fazenda
	
	static{
		name = "Fazenda";//inicializa��o das vari�veis est�ticas que s�o heran�a da classe Building
		description = "Produz JavaSeeds e SharpCocos";
		creativityCost = FARM_CREATIVITY_COST;
		upgradeNumber = NUMBER_OF_UPGRADES;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[FOOD_PRODUCTION] = true;//o �nico m�todo que come�a j� adquirido
		upgradesAvailable[SEED_FERTILIZER] = false;//os outros come�am como n�o adquiridos
		upgradesAvailable[COCO_FERTILIZER] = false;
		upgradesAvailable[GREAT_PRODUCTION] = false;
	}
	
	/**
	 * M�todo construtor da classe Farm
	 */
	public Farm(){
		super();
		foodType = SEED;//inicializa o objeto produzindo Seeds
	}
	
	/**
	 * M�todo que define o recurso a ser produzido
	 */
	public void setFoodType(boolean type){
		foodType = type;//define o tipo de comida a ser produzida
	}
	
	/**
	 * M�todo que retorna o tipo de alimento produzido
	 * @return o tipo de alimento produzido
	 */
	public boolean getFoodType(){
		return foodType;//retorna o tipo de alimento produzido
	}
	
	
	/**
	 * M�todo que produz o rescurso de acordo com o que est� definido na fazenda
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
	 * M�todo que produz seeds em fun��o do n�mero de pearls alocadas, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @param O n�mero de pearls alocadas
	 * @return A produ��o
	 */
	public int seedFertilizer(int pearls){
		if(upgradesAvailable[SEED_FERTILIZER] == false){
			return 0;//produz Seeds se o m�todo j� foi adquirido
		}else
			return pearls*SEEDS_PER_PEARL*foodProduction();
	}
	
	/**
	 * M�todo que produz cocos em fun��o do n�mero de pyramids alocadas, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @param O n�mero de pyramids alocadas
	 * @return A produ��o
	 */
	public int cocoFertilizer(int pyramids){
		if(upgradesAvailable[COCO_FERTILIZER] == false){
			return 0;//produz Cocos se o m�todo j� foi adquirido
		}else
			return pyramids*COCOS_PER_PYRAMID*foodProduction();
	}
	
	/**
	 * M�todo que produz a produ��o m�xima de uma fazenda, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @return A produ��o
	 */
	public int greatProduction(){
		if(upgradesAvailable[GREAT_PRODUCTION] == false){
			return 0;//produz a produ��o se o m�todo j� foi adquirido
		}else
			return MAX_PRODUCTION;
	}
}
