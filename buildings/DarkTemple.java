package buildings;

import static buildings.Temple.description;
import static buildings.Temple.name;
import static buildings.Temple.upgradeNumber;
import static buildings.Temple.upgradesAvailable;
import static buildings.Temple.upgradesCost;

/**
 * Classe que representa um Templo Sombrio
 * @author Marcelo
 *
 */ 
public class DarkTemple extends Temple{
	private final static int TEMPLE_CREATIVITY_COST = 0;//custo inicial do Templo
	private final static int MAX_PRODUCTION = 0;//produ��o m�xima poss�vel
	private final static int PERL_PER_OOPYIE = 0;//valor de Perls produzidos por oopyie
	private final static int PERL_PER_SEED = 0;//valor de Perls produzidos por cocos

	public final static int GEM_PRODUCTION = 0;//valores das posi��es dos m�todos no vetor de up grades
	public final static int PERL_RITUAL = 1;
	public final static int GREAT_RITUAL = 2;
	public final static int NUMBER_OF_UPGRADES = 3;//numero de up grades
	
	static{
		name = "Templo Sombrio";//inicializa��o das vari�veis est�ticas que s�o heran�a da classe Building
		description = "Produz Java Seeds";
		creativityCost = TEMPLE_CREATIVITY_COST;
		upgradeNumber = NUMBER_OF_UPGRADES;
		upgradesAvailable = new boolean[upgradeNumber];
		upgradesAvailable[GEM_PRODUCTION] = true;//o �nico m�todo que come�a j� adquirido
		upgradesAvailable[PERL_RITUAL] = false;
		upgradesAvailable[GREAT_RITUAL] = false;
		upgradesCost = new int[upgradeNumber];
		DarkTemple.setUpgradeCost(0, GEM_PRODUCTION);
		DarkTemple.setUpgradeCost(0, PERL_RITUAL);
		DarkTemple.setUpgradeCost(0, GREAT_RITUAL);
	}
	
	/**
	 * M�todo construtor da classe DarkTemple
	 */
	public DarkTemple(){
		super();
		super.setGemType(PERL);//inicializa o objeto produzindo Perls
	}
	
	/**
	 * Metodo inutilizado
	 */
	public void setGemType(boolean type){

	}
	
	/**
	 * Metodo que produz Perls de acordo com o boost recebido e oopyies alocados
	 * @param boost
	 * @return producao
	 */
	@Override
	public int gemProduction(int boost){
		return oopyiesAllocated*PERL_PER_OOPYIE*pyramidRitual(boost);
	}
	
	/**
	 * Metodo que produz Perls de acordo com o a quantidade de oopyies alocados
	 * @return producao
	 */
	@Override
	public int gemProduction(){
		return oopyiesAllocated*PERL_PER_OOPYIE;
	}
	

	/**
	 * Metodo inutilizado
	 */
	public int perlRitual(int seeds){
		return 0;
	}
	
	/**
	 * Producao maxima de um Templo Sombrio
	 * @return producao
	 */
	public int greatRitual(){
		if(upgradesAvailable[GREAT_RITUAL] == false){
			return 0;//produz a produ��o se o m�todo j� foi adquirido
		}else
			return MAX_PRODUCTION;
	}
	
}
