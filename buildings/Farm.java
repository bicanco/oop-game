package buildings;
import core.ResourceManager;/** * Classe que representa uma ro�a implementando a interface Building * @author David * */
public class Farm implements Building {
	private final static int FARM_CREATIVITY_COST = 20;//custo inicial da fazenda
	private final static int MAX_PRODUCTION = 500;//producao maxima possivel
	private final static int SEEDS_PER_PERL = 2;//valor de seedss produzidas por perl
	private final static int SEEDS_PER_OOPYIE = 1;//valor de seeds produzidas po oopyie
	private final static int COCOS_PER_OOPYIE = 1;//valor de cocos produzidos por oopyie
	private final static int COCOS_PER_PYRAMID = 2;//valor de cocos produzidos por pyramids
	public final static int FOOD_PRODUCTION = 0;//valores das posiveis dos metodos no vetor de up grades
	public final static int SEED_FERTILIZER = 1;
	public final static int COCO_FERTILIZER = 2;
	public final static int GREAT_PRODUCTION = 3;
	public final static int NUMBER_OF_UPGRADES = 4;//numero de upgrades
	public final static boolean SEED = false;//tipo de comida produzida
	public final static boolean COCO = true;
	private static String name = "Roca";//inicializacao das variaveis estaticas que sao heranca da classe Building
	private static String description = "Produz JavaSeeds e SharpCocos";
	private static String iconPath = "Farm.png"; 
	private static int unlockCost = FARM_CREATIVITY_COST;
	private static int buildCost = 250;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
	private static int[] upgradesCost = new int[upgradeNumber];
	static {
		upgradesAvailable[FOOD_PRODUCTION] = true;//o unico metodo que comeca ja adquirido
		upgradesAvailable[SEED_FERTILIZER] = false;//os outros comecam como nao adquiridos
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
	protected boolean greatProductionActivated;	/**	 * M�todo construtor da classe Farm	 */
	public Farm(){
		reset();
	}	/**	 * M�todo que define o tipo de comida a ser produzida na ro�a	 * @param type boolean que representa um tipo segundo constantes p�blicas definidas na classe	 */
	public void setFoodType(boolean type){
		foodType = type;//define o tipo de comida a ser produzido
	}	/**	 * M�todo que retorna o tipo de comida produzida na ro�a	 * @return o tipo de comida produzida	 */
	public boolean getFoodType(){
		return foodType;//retorna o tipo de alimento produzido
	}		/**	 * M�todo que define a quantidade de Perls alocadas na ro�a	 * @param perls o n�mero de Perls a serem alocadas	 */
	public void setPerls(int perls){
		perlsUsed = perls;
	}	/**	 * M�todo que define a quantidade de Pyramids alocadas na ro�a	 * @param pyramids o n�mero de Peyramids a serem alocadas	 */
	public void setPyramids(int pyramids){
		pyramidsUsed = pyramids;
	}	/**	 * M�todo que define se o M�todo greatProduction j� foi chamado	 * @param toUse true se foi chamado e false se n�o foi	 */
	public void checkGreatProduction(boolean toUse){
		greatProductionActivated = toUse;
	}	/**	 * M�todo que retorna a produ��o da ro�a passando par�metros para aumentar a produ��o	 * @param boost a quantidade de recursos alocados para aumentar a produ��o	 * @return a produ��o	 */
	private int foodProduction(int boost){
		if(foodType == SEED){//produz os rescursos de acordo com o tipo previamente definido na fazenda e faz o boost
			return oopyiesAllocated*SEEDS_PER_OOPYIE*seedFertilizer(boost);
		}else if(foodType == COCO){
			return oopyiesAllocated*COCOS_PER_OOPYIE*cocoFertilizer(boost);
		}
		return 0;
	}	/**	 * M�todo que retorna a produ��o da ro�a	 * @return a produ��o	 */
	private int foodProduction(){
		if(foodType == SEED){//produz os rescursos de acordo com o tipo previamente definido na fazenda
			return oopyiesAllocated*SEEDS_PER_OOPYIE;
		}else if(foodType == COCO){
			return oopyiesAllocated*COCOS_PER_OOPYIE;
		}		
		return 0;
	}	/**	 * M�todo que melhora a produ��o de Seeds da ro�a	 * @param perls o n�mero de Perls alocadas	 * @return a produ��o	 */
	private int seedFertilizer(int perls){
		if(upgradesAvailable[SEED_FERTILIZER] == false){
			return 1;//produz Seeds se o metodo ja foi adquirido
		}else{
			return perls*SEEDS_PER_PERL;
		}
	}	/**	 * M�todo que melhora a produ��o de Cocos da ro�a	 * @param pyramids o n�mero de Pyramids alocadas	 * @return a produ��o	 */
	private int cocoFertilizer(int pyramids){
		if(upgradesAvailable[COCO_FERTILIZER] == false){
			return 1;//produz Cocos se o metodo ja foi adquirido
		}else{
			return pyramids*COCOS_PER_PYRAMID;
		}
	}	/**	 * M�todo que retorna a produ��o m�xima da ro�a	 * @return a produ��o m�xima	 */
	public int greatProduction(){
		if(upgradesAvailable[GREAT_PRODUCTION] == false){
			return 0;//produz a producao se o metodo ja foi adquirido
		}else
			return MAX_PRODUCTION;	}
	/**	 * M�todo que retorna o nome da classe	 * @return o nome da classe	 */
	@Override
	public String getName() {
		return name;
	}	/**	 * M�todo que retorna a descri��o da classe	 * @return a descri��o da classe	 */
	@Override
	public String getDescription() {
		return description;
	}	/**	 *M�todo que retorna o �cone da classe	 *@return o �cone da classe	 */
	@Override
	public String getIcon() {
		return iconPath;
	}
	/**	 *M�todo que retona o pre�o para desqloquear uma ro�a	 *@return o pre�o para desbloquear uma ro�a	 */
	@Override
	public int getUnlockCost() {
		return unlockCost;
	}	/**	 * M�todo que retorna o custo de uma ro�a	 * @return o custo de uma ro�a	 */
	@Override
	public int getBuildCost() {
		return buildCost;
	}	/**	 * M�todo que retorna o n�mero de Oopyies alocados	 * @return o n�mero de Oopyiues alocados	 */
	@Override
	public int getOopyiesAllocated() {
		return oopyiesAllocated;
	}	/**	 * M�todo que aloca Oopyies	 * @param oopyies o n�mero de oopyies a serem alocados 	 */
	@Override
	public void allocateOopyies(int oopyies) {
		oopyiesAllocated = oopyies;
	}	/**	 * M�todo que desbloqueia um upgrade da classe	 * @param upgradeId o id do upgrade	 * @throws Exception se o upgrade j� estiver desbloqueado	 */
	@Override
	public void unlockUpgrade(int upgradeId) throws Exception {
		if(upgradesAvailable[upgradeId] == true){
			throw new IllegalArgumentException("Position already unlocked");
		}else{
			upgradesAvailable[upgradeId] = true;
		}
	}	/**	 * M�todo que retorna um boolean que representa se o upgrade j� foi desbloqueado ou n�o	 * @param upgradeId o id do upgrade	 * @throws Exception se o upgrade j� estiver desbloqueado	 */
	@Override
	public boolean getUpgrade(int upgradeId) throws Exception {
		if(upgradeId >= upgradeNumber || upgradeId < 0){
			throw new IllegalArgumentException("Number out of range");
		} else {
			return upgradesAvailable[upgradeId];
		}
	}	/**	 * M�todo que retorna o custo de um upgrade	 * @param upgradeId o id do upgrade	 * @return o custo do upgrade	 */
	@Override
	public int getUpgradeCost(int upgradeId) {
		return upgradesCost[upgradeId];
	}
	/**	 * M�todo que reinicia os atributos de uma ro�a	 */
	@Override
	public void reset() {
		foodType = SEED; //inicializa o objeto produzindo Seeds
		oopyiesAllocated = 0;
		perlsUsed = 0;
		pyramidsUsed = 0;
		greatProductionActivated = false;
	}
		/**	 * M�todo que retorna para os recursos do jogo os recursos que n�o foram utilizados	 * @param resources um ResourceManager do jogo	 */
	@Override
	public void reconfig(ResourceManager resources){
		resources.updateOopyies(oopyiesAllocated);
		resources.updateMagicPerls(perlsUsed);
		resources.updatePyramids(pyramidsUsed);
		if (greatProductionActivated) resources.updateGreatRubies(1);
		this.reset();
	}	/**	 * M�todo que gerencia uma troca de turno para uma ro�a	 * @param resources um ResourceManager do jogo	 */
	@Override
	public void runTurn(ResourceManager resources){
		if (foodType == SEED){
			if (greatProductionActivated)
				resources.updateJavaSeeds(greatProduction());
			else {				resources.updateOopyies(oopyiesAllocated);
				if (perlsUsed > 0) resources.updateJavaSeeds(foodProduction(perlsUsed));
				else resources.updateJavaSeeds(foodProduction());
			}
		} else { // foodType == COCO
			if (greatProductionActivated)
				resources.updateSharpCocos(greatProduction());
			else {				resources.updateOopyies(oopyiesAllocated);
				if (pyramidsUsed > 0) resources.updateSharpCocos(foodProduction(pyramidsUsed));
				else resources.updateSharpCocos(foodProduction());
			}
		}
	}
}
