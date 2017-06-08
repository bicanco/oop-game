package buildings;

/**
 * Classe que representa um laboratorio
 * @author Marcelo
 */
public class Lab implements Building {
	private final static int LAB_CREATIVITY_COST = 0;//custo inicial do laboratorio
	private final static int MAX_PRODUCTION = 0;//produ��o m�xima poss�vel
	private final static int CREATIVITY_PER_OOPYIE = 0;//valor de criatividades produzidas por oopyie
	private final static int CREATIVITY_PER_COCO = 0;//valor de criativades produzidas por cocos

	public final static int CREATIVITY_PRODUCTION = 0;//valores das posi��es dos m�todos no vetor de up grades
	public final static int BASIC_RESEARCH = 1;
	public final static int GREAT_RESEARCH = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	private static String name = "Lab";//inicializa��o das vari�veis est�ticas que s�o heran�a da classe Building
	private static String description = "Produz Criatividade";
	private static String iconPath = "Lab.png";
	private static int unlockCost = LAB_CREATIVITY_COST;
	private static int buildCost = 456;
	private static int upgradeNumber = NUMBER_OF_UPGRADES;
	private static boolean[] upgradesAvailable = new boolean[upgradeNumber];
	private static int[] upgradesCost = new int[upgradeNumber];
	
	static {
		upgradesAvailable[CREATIVITY_PRODUCTION] = true;//o �nico m�todo que come�a j� adquirido
		upgradesAvailable[BASIC_RESEARCH] = false;//os outros come�am como n�o adquiridos
		upgradesAvailable[GREAT_RESEARCH] = false;
		
		upgradesCost[CREATIVITY_PRODUCTION] = 0;
		upgradesCost[BASIC_RESEARCH] = 0;
		upgradesCost[GREAT_RESEARCH] = 0;
	}
	
	protected static int oopyiesAllocated;
	
	/**
	 * M�todo construtor da classe Lab
	 */
	public Lab(){
		reset();
	}
	
	/**
	 * M�todo que produz as Criatividade e aumaneta a produ��o de acordo com o a quantidade de recurso passada como par�metro
	 * @param A quantidade de recurso para o boost
	 * @return O valor produzido
	 */
	public int crativityProduction(int boost){
		return oopyiesAllocated*CREATIVITY_PER_OOPYIE*basicResearch(boost);
	}
	
	/**
	 * M�todo que produz Criatividade
	 * @return O valor produzido
	 */
	public int creativityProduction(){
		return oopyiesAllocated*CREATIVITY_PER_OOPYIE;
	}
	
	
	/**
	 * M�todo que produz Criatividade em fun��o do n�mero de Cocos alocados, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @param O n�mero de cocos alocados
	 * @return A produ��o
	 */
	public int basicResearch(int cocos){
		if(upgradesAvailable[BASIC_RESEARCH] == false){
			return 0;//produz Criatividade se o m�todo j� foi adquirido
		}else
			return cocos*CREATIVITY_PER_COCO;
	}
	
	/**
	 * M�todo que produz a produ��o m�xima de um laboratorio, se n�o adquiriu o m�todo a produ��o ser� 0
	 * @return A produ��o
	 */
	public int greatProduction(){
		if(upgradesAvailable[GREAT_RESEARCH] == false){
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
		oopyiesAllocated = 0;
	}
}
