package buildings;

/**
 * Classe que representa um laboratorio
 * @author Marcelo
 */
public class Lab extends Building{
	private final static int MINE_CREATIVITY_COST = 0;//custo inicial do laboratorio
	private final static int MAX_PRODUCTION = 0;//produ��o m�xima poss�vel
	private final static int CREATIVITY_PER_OOPYIE = 0;//valor de criatividades produzidas por oopyie
	private final static int CREATIVITY_PER_COCO = 0;//valor de criativades produzidas por cocos

	public final static int CREATIVITY_PRODUCTION = 0;//valores das posi��es dos m�todos no vetor de up grades
	public final static int BASIC_RESEARCH = 1;
	public final static int GREAT_RESEARCH = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	
	static{
		name = "Lab";//inicializa��o das vari�veis est�ticas que s�o heran�a da classe Building
		description = "Produz Criatividade";
		iconPath = "Lab.png";
		creativityCost = MINE_CREATIVITY_COST;
		buildCost = 1;
		upgradeNumber = NUMBER_OF_UPGRADES;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[CREATIVITY_PRODUCTION] = true;//o �nico m�todo que come�a j� adquirido
		upgradesAvailable[BASIC_RESEARCH] = false;//os outros come�am como n�o adquiridos
		upgradesAvailable[GREAT_RESEARCH] = false;
	}
	
	/**
	 * M�todo construtor da classe Lab
	 */
	public Lab(){
		super();
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
}
