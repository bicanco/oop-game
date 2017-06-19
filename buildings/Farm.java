package buildings;
import core.ResourceManager;/** * Classe que representa uma roça implementando a interface Building * @author David * */
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
	protected boolean greatProductionActivated;	/**	 * Método construtor da classe Farm	 */
	public Farm(){
		reset();
	}	/**	 * Método que define o tipo de comida a ser produzida na roça	 * @param type boolean que representa um tipo segundo constantes públicas definidas na classe	 */
	public void setFoodType(boolean type){
		foodType = type;//define o tipo de comida a ser produzido
	}	/**	 * Método que retorna o tipo de comida produzida na roça	 * @return o tipo de comida produzida	 */
	public boolean getFoodType(){
		return foodType;//retorna o tipo de alimento produzido
	}		/**	 * Método que define a quantidade de Perls alocadas na roça	 * @param perls o número de Perls a serem alocadas	 */
	public void setPerls(int perls){
		perlsUsed = perls;
	}	/**	 * Método que define a quantidade de Pyramids alocadas na roça	 * @param pyramids o número de Peyramids a serem alocadas	 */
	public void setPyramids(int pyramids){
		pyramidsUsed = pyramids;
	}	/**	 * Método que define se o Método greatProduction já foi chamado	 * @param toUse true se foi chamado e false se não foi	 */
	public void checkGreatProduction(boolean toUse){
		greatProductionActivated = toUse;
	}	/**	 * Método que retorna a produção da roça passando parâmetros para aumentar a produção	 * @param boost a quantidade de recursos alocados para aumentar a produção	 * @return a produção	 */
	private int foodProduction(int boost){
		if(foodType == SEED){//produz os rescursos de acordo com o tipo previamente definido na fazenda e faz o boost
			return oopyiesAllocated*SEEDS_PER_OOPYIE*seedFertilizer(boost);
		}else if(foodType == COCO){
			return oopyiesAllocated*COCOS_PER_OOPYIE*cocoFertilizer(boost);
		}
		return 0;
	}	/**	 * Método que retorna a produção da roça	 * @return a produção	 */
	private int foodProduction(){
		if(foodType == SEED){//produz os rescursos de acordo com o tipo previamente definido na fazenda
			return oopyiesAllocated*SEEDS_PER_OOPYIE;
		}else if(foodType == COCO){
			return oopyiesAllocated*COCOS_PER_OOPYIE;
		}		
		return 0;
	}	/**	 * Método que melhora a produção de Seeds da roça	 * @param perls o número de Perls alocadas	 * @return a produção	 */
	private int seedFertilizer(int perls){
		if(upgradesAvailable[SEED_FERTILIZER] == false){
			return 1;//produz Seeds se o metodo ja foi adquirido
		}else{
			return perls*SEEDS_PER_PERL;
		}
	}	/**	 * Método que melhora a produção de Cocos da roça	 * @param pyramids o número de Pyramids alocadas	 * @return a produção	 */
	private int cocoFertilizer(int pyramids){
		if(upgradesAvailable[COCO_FERTILIZER] == false){
			return 1;//produz Cocos se o metodo ja foi adquirido
		}else{
			return pyramids*COCOS_PER_PYRAMID;
		}
	}	/**	 * Método que retorna a produção máxima da roça	 * @return a produção máxima	 */
	public int greatProduction(){
		if(upgradesAvailable[GREAT_PRODUCTION] == false){
			return 0;//produz a producao se o metodo ja foi adquirido
		}else
			return MAX_PRODUCTION;	}
	/**	 * Método que retorna o nome da classe	 * @return o nome da classe	 */
	@Override
	public String getName() {
		return name;
	}	/**	 * Método que retorna a descrição da classe	 * @return a descrição da classe	 */
	@Override
	public String getDescription() {
		return description;
	}	/**	 *Método que retorna o ícone da classe	 *@return o ícone da classe	 */
	@Override
	public String getIcon() {
		return iconPath;
	}
	/**	 *Método que retona o preço para desqloquear uma roça	 *@return o preço para desbloquear uma roça	 */
	@Override
	public int getUnlockCost() {
		return unlockCost;
	}	/**	 * Método que retorna o custo de uma roça	 * @return o custo de uma roça	 */
	@Override
	public int getBuildCost() {
		return buildCost;
	}	/**	 * Método que retorna o número de Oopyies alocados	 * @return o número de Oopyiues alocados	 */
	@Override
	public int getOopyiesAllocated() {
		return oopyiesAllocated;
	}	/**	 * Método que aloca Oopyies	 * @param oopyies o número de oopyies a serem alocados 	 */
	@Override
	public void allocateOopyies(int oopyies) {
		oopyiesAllocated = oopyies;
	}	/**	 * Método que desbloqueia um upgrade da classe	 * @param upgradeId o id do upgrade	 * @throws Exception se o upgrade já estiver desbloqueado	 */
	@Override
	public void unlockUpgrade(int upgradeId) throws Exception {
		if(upgradesAvailable[upgradeId] == true){
			throw new IllegalArgumentException("Position already unlocked");
		}else{
			upgradesAvailable[upgradeId] = true;
		}
	}	/**	 * Método que retorna um boolean que representa se o upgrade já foi desbloqueado ou não	 * @param upgradeId o id do upgrade	 * @throws Exception se o upgrade já estiver desbloqueado	 */
	@Override
	public boolean getUpgrade(int upgradeId) throws Exception {
		if(upgradeId >= upgradeNumber || upgradeId < 0){
			throw new IllegalArgumentException("Number out of range");
		} else {
			return upgradesAvailable[upgradeId];
		}
	}	/**	 * Método que retorna o custo de um upgrade	 * @param upgradeId o id do upgrade	 * @return o custo do upgrade	 */
	@Override
	public int getUpgradeCost(int upgradeId) {
		return upgradesCost[upgradeId];
	}
	/**	 * Método que reinicia os atributos de uma roça	 */
	@Override
	public void reset() {
		foodType = SEED; //inicializa o objeto produzindo Seeds
		oopyiesAllocated = 0;
		perlsUsed = 0;
		pyramidsUsed = 0;
		greatProductionActivated = false;
	}
		/**	 * Método que retorna para os recursos do jogo os recursos que não foram utilizados	 * @param resources um ResourceManager do jogo	 */
	@Override
	public void reconfig(ResourceManager resources){
		resources.updateOopyies(oopyiesAllocated);
		resources.updateMagicPerls(perlsUsed);
		resources.updatePyramids(pyramidsUsed);
		if (greatProductionActivated) resources.updateGreatRubies(1);
		this.reset();
	}	/**	 * Método que gerencia uma troca de turno para uma roça	 * @param resources um ResourceManager do jogo	 */
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
