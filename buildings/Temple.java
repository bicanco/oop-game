package buildings;

/**
 * Classe que representa um Templo
 * @author Marcelo
 *
 */ 
public class Temple extends Building{
	private final static int TEMPLE_CREATIVITY_COST = 0;//custo inicial do Templo
	private final static int MAX_PRODUCTION = 0;//produção máxima possível
	private final static int PERL_PER_SEED = 0;//valor de Perls produzidos por Seed
	private final static int PERL_PER_OOPYIE = 0;//valor de Perls produzidos por oopyie
	private final static int PYRAMID_PER_OOPYIE = 0;//valor de Pyramids produzidos por oopyie
	private final static int PYRAMID_PER_COCO = 0;//valor de Pyramids produzidos por cocos

	public final static int GEM_PRODUCTION = 0;//valores das posições dos métodos no vetor de up grades
	public final static int PERL_RITUAL = 1;
	public final static int PYRAMID_RITUAL = 2;
	public final static int GREAT_RITUAL = 3;
	public final static int NUMBER_OF_UPGRADES = 4;//numero de up grades
	
	public final static boolean PERL = false;//tipo de gema produzida
	public final static boolean PYRAMID = true;
	
 	
	protected boolean gemType;//tipo de gema produzida no templo
	
	
	static{
		name = "Templo";//inicialização das variáveis estáticas que são herança da classe Building
		description = "Produz Magic Perls e PYramids";
		creativityCost = TEMPLE_CREATIVITY_COST;
		upgradeNumber = NUMBER_OF_UPGRADES;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[GEM_PRODUCTION] = true;//o único método que começa já adquirido
		upgradesAvailable[PERL_RITUAL] = false;//os outros começam como não adquiridos
		upgradesAvailable[PYRAMID_RITUAL] = false;
		upgradesAvailable[GREAT_RITUAL] = false;
	}
	
	/**
	 * Método construtor da classe Temple
	 */
	public Temple(){
		super();
		gemType = PERL;//inicializa o objeto produzindo Perls
	}
	
	/**
	 * Método que define a gema a ser produzida
	 */
	public void setGemType(boolean type){
		gemType = type;//define o tipo de gema a ser produzida
	}
	
	/**
	 * Método que retorna o tipo de gema produzida
	 * @return o tipo de gema produzida
	 */
	public boolean setGemType(){
		return gemType;//retorna o tipo de gema produzida
	}
	
	
	/**
	 * Método que produz o rescurso de acordo com o que está definido no templo e aumenta a produção de acordo com o a quantidade de recurso passada como parâmetro
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
	 * Método que produz o rescurso de acordo com o que está definido na fazenda
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
	 * Método que produz Perls em função do número de Seeds alocadas, se não adquiriu o método a produção será 0
	 * @param O número de Seeds alocadas
	 * @return A produção
	 */
	public int perlRitual(int seeds){
		if(upgradesAvailable[PERL_RITUAL] == false){
			return 1;//produz Seeds se o método já foi adquirido
		}else{
			setGemType(PERL);
			return seeds*PERL_PER_SEED;
		}
	}
	
	/**
	 * Método que produz PYramids em função do número de Cocos alocados, se não adquiriu o método a produção será 0
	 * @param O número de cocos alocados
	 * @return A produção
	 */
	public int pyramidRitual(int cocos){
		if(upgradesAvailable[PYRAMID_RITUAL] == false){
			return 1;//produz PYramids se o método já foi adquirido
		}else{
			setGemType(PYRAMID);
			return cocos*PYRAMID_PER_COCO;
		}
	}
	
	/**
	 * Método que produz a produção máxima de um templo, se não adquiriu o método a produção será 0
	 * @return A produção
	 */
	public int greatRitual(){
		if(upgradesAvailable[GREAT_RITUAL] == false){
			return 0;//produz a produção se o método já foi adquirido
		}else
			return MAX_PRODUCTION;
	}
	
}
