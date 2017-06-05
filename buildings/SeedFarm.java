package buildings;

/**
 * Classe que representa uma fazenda de sementes
 * @author David
 *
 */
public class SeedFarm extends Farm{
	private final static int FARM_CREATIVITY_COST = 0;//custo inicial da fazenda
	private final static int SEEDS_PER_OOPYIE = 0;//valor de seeds produzidas po oopyie
	private final static int MAX_PRODUCTION = 0;//produção máxima possível
	
	public final static int FOOD_PRODUCTION = 0;//valores das posições dos métodos no vetor de up grades
	public final static int SEED_FERTILIZER = 1;
	public final static int GREAT_PRODUCTION = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	static{
		name = "Fazenda de sementes";//inicialização das variáveis estáticas que são herança da classe Building
		description = "Produz JavaSeeds em grande quantidade";
		creativityCost = FARM_CREATIVITY_COST;
		upgradeNumber = NUMBER_OF_UPGRADES;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[FOOD_PRODUCTION] = true;//o único método que começa já adquirido
		upgradesAvailable[SEED_FERTILIZER] = false;//os outros começam como não adquiridos
		upgradesAvailable[GREAT_PRODUCTION] = false;
	}
	
	/**
	 * Método construtor da classe SeedFarm
	 */
	public SeedFarm(){
		super();
	}
	
	/**
	 * Método que produz JavaSeeds
	 * @return O valor produzido
	 */
	@Override
	public int foodProduction(){
		return oopyiesAllocated*SEEDS_PER_OOPYIE;
	}
	
	/**
	 * Método que produz JavaSeeds e aumenta a produção de acordo com o a quantidade de recurso passada como parâmetro
	 * @param A quantidade de recurso para o boost
	 * @return O valor produzido
	 */
	@Override
	public int foodProduction(int boost){
		return oopyiesAllocated*SEEDS_PER_OOPYIE*seedFertilizer(boost);
	}
	
	/**
	 * Método inutilizado para esta classe
	 */
	@Override
	public void setFoodType(boolean type){
		
	}
	
	/**
	 * Método inutilizado para esta classe
	 */
	@Override
	public int cocoFertilizer(int pyramids) {
		return 0;
	}
	
	/**
	 * Método que produz a produção máxima de uma fazenda, se não adquiriu o método a produção será 0
	 * @return A produção
	 */
	@Override
	public int greatProduction(){
		if(upgradesAvailable[GREAT_PRODUCTION] == false){
			return 0;//produz a produção se o método já foi adquirido
		}else
			return MAX_PRODUCTION;
	}

}
