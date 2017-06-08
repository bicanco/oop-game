package buildings;

/**
 * Classe que representa um Templo
 * @author Marcelo
 *
 */ 
public class Temple implements Building {
	private final static int TEMPLE_CREATIVITY_COST = 0;//custo inicial do Templo
	private final static int MAX_PRODUCTION = 0;//produ��o m�xima poss�vel
	private final static int PERL_PER_SEED = 0;//valor de Perls produzidos por Seed
	private final static int PERL_PER_OOPYIE = 0;//valor de Perls produzidos por oopyie
	private final static int PYRAMID_PER_OOPYIE = 0;//valor de Pyramids produzidos por oopyie
	private final static int PYRAMID_PER_COCO = 0;//valor de Pyramids produzidos por cocos

	public final static int GEM_PRODUCTION = 0;//valores das posi��es dos m�todos no vetor de up grades
	public final static int PERL_RITUAL = 1;
	public final static int PYRAMID_RITUAL = 2;
	public final static int GREAT_RITUAL = 3;
	public final static int NUMBER_OF_UPGRADES = 4;//numero de up grades
	
	public final static boolean PERL = false;//tipo de gema produzida
	public final static boolean PYRAMID = true;
	
	private static String name = "Temple";//inicializa��o das vari�veis est�ticas que s�o heran�a da classe Building
	private static String description = "Produz Magic Perls e PYramids";
	private static String iconPath = "Temple.png";
	private static int unlockCost = TEMPLE_CREATIVITY_COST;
	private static int buildCost = 100100;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
		
	private static int[] upgradesCost = new int[upgradeNumber];
	
	static {
		upgradesAvailable[GEM_PRODUCTION] = true;//o �nico m�todo que come�a j� adquirido
		upgradesAvailable[PERL_RITUAL] = false;//os outros come�am como n�o adquiridos
		upgradesAvailable[PYRAMID_RITUAL] = false;
		upgradesAvailable[GREAT_RITUAL] = false;
		
		upgradesCost[GEM_PRODUCTION] = 0;
		upgradesCost[PERL_RITUAL] = 0;
		upgradesCost[PYRAMID_RITUAL] = 0;
		upgradesCost[GREAT_RITUAL] = 0;
	}
	
	protected boolean gemType; //tipo de gema produzida no templo
	protected int oopyiesAllocated; 
	
	/**
	 * M�todo construtor da classe Temple
	 */
	public Temple(){
		reset();
	}
	
	/**
	 * M�todo que define a gema a ser produzida
	 */
	public void setGemType(boolean type){
		gemType = type;//define o tipo de gema a ser produzida
	}
	
	/**
	 * M�todo que retorna o tipo de gema produzida
	 * @return o tipo de gema produzida
	 */
	public boolean setGemType(){
		return gemType;//retorna o tipo de gema produzida
	}
	
	
	/**
	 * M�todo que produz o rescurso de acordo com o que est� definido no templo e aumenta a produ��o de acordo com o a quantidade de recurso passada como par�metro
	 * @param A quantidade de recurso para o boost
	 * @return O valor produzido
	 */
	public int gemProduction(int boost){
		if(gemType == PERL){//produz os rescursos de acordo com o tipo previamente definido na fazenda e faz o boost
			return oopyiesAllocated*PERL_PER_OOPYIE*perlRitual(boost);
		}else if(gemType == PYRAMID){
			return oopyiesAllocated*PYRAMID_PER_OOPYIE*pyramidRitual(boost);
		}
		return 0;
	}
	
	/**
	 * M�todo que produz o rescurso de acordo com o que est� definido na fazenda
	 * @return O valor produzido
	 */
	public int gemProduction(){
		if(gemType == PERL){//produz os rescursos de acordo com o tipo previamente definido no templo
			return oopyiesAllocated*PERL_PER_OOPYIE;
		}else if(gemType == PYRAMID){
			return oopyiesAllocated*PYRAMID_PER_OOPYIE;
		}
		return 0;
	}
	
	
	/**
	 * M�todo que produz Perls em fun��o do n�mero de Seeds alocadas, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @param O n�mero de Seeds alocadas
	 * @return A produ��o
	 */
	public int perlRitual(int seeds){
		if(upgradesAvailable[PERL_RITUAL] == false){
			return 1;//produz Seeds se o m�todo j� foi adquirido
		}else{
			setGemType(PERL);
			return seeds*PERL_PER_SEED;
		}
	}
	
	/**
	 * M�todo que produz PYramids em fun��o do n�mero de Cocos alocados, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @param O n�mero de cocos alocados
	 * @return A produ��o
	 */
	public int pyramidRitual(int cocos){
		if(upgradesAvailable[PYRAMID_RITUAL] == false){
			return 1;//produz PYramids se o m�todo j� foi adquirido
		}else{
			setGemType(PYRAMID);
			return cocos*PYRAMID_PER_COCO;
		}
	}
	
	/**
	 * M�todo que produz a produ��o m�xima de um templo, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @return A produ��o
	 */
	public int greatRitual(){
		if(upgradesAvailable[GREAT_RITUAL] == false){
			return 0;//produz a produ��o se o m�todo j� foi adquirido
		}else
			return MAX_PRODUCTION;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getIcon() {
		return iconPath;
	}

	@Override
	public int getUnlockCost() {
		return unlockCost;
	}

	@Override
	public int getBuildCost() {
		return buildCost;
	}

	@Override
	public int getOopyiesAllocated() {
		return oopyiesAllocated;
	}

	@Override
	public void allocateOopyies(int oopyies) {
		oopyiesAllocated = oopyies;
	}

	@Override
	public void unlockUpgrade(int upgradeId) throws Exception {
		if(upgradesAvailable[upgradeId] == true){
			throw new IllegalArgumentException("Position already unlocked");
		}else{
			upgradesAvailable[upgradeId] = true;
		}
	}

	@Override
	public boolean getUpgrade(int upgradeId) throws Exception {
		if(upgradeId >= upgradeNumber || upgradeId < 0){
			throw new IllegalArgumentException("Number out of range");
		} else {
			return upgradesAvailable[upgradeId];
		}
	}

	@Override
	public int getUpgradeCost(int upgradeId) {
		return upgradesCost[upgradeId];
	}

	@Override
	public void setUpgradeCost(int value, int upgrade) {
		upgradesCost[upgrade] = value;
	}

	@Override
	public void reset() {
		gemType = PERL;//inicializa o objeto produzindo Perls
		oopyiesAllocated = 0;
	}
}
