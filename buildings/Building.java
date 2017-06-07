package buildings;

import java.awt.Image;

/**
 * Classe abstrata que representa uma constru��o
 * @author David
 *
 */
abstract public class Building {
	static final int FARM = 1;
	static final int LAB = 2;
	static final int TEMPLE = 3;
	static final int MINE = 4;
	
	protected static String name;
	protected static String description;
	protected static String iconPath;
	protected static int creativityCost;
	protected static int buildCost;
	static protected boolean[] upgradesAvailable;
	static protected int[] upgradesCost;//add cost
	static int upgradeNumber;
	protected int oopyiesAllocated;//quantidade de oopyies alocados

	/**
	 * M�todo construtor para utiliza��o das classes que extendem esta classe abstrata
	 */
	public Building(){
		oopyiesAllocated = 0;
	}
	
	/**
	 * M�todo que retorna o custo de criatividade do edif�cio para ser descoberto
	 * @return
	 */
	public int getCreativityCost(){
		return creativityCost;
	}
	
	/**
	 * Retorna o custo de constru��o de uma certa classe, de acordo com sua identifica��o,
	 * feita por constantes na classe Building.
	 * @param reference identifica��o da classe
	 * @return custo de constru��o de um objeto dessa classe
	 */
	public static int getBuildCost(int reference){
		switch (reference){
		case Building.FARM: return Farm.buildCost;
		case Building.LAB:	return Lab.buildCost;
		case Building.TEMPLE: return Temple.buildCost;
		case Building.MINE: return Mine.buildCost;
		}
		
		return -1;
	}
	
	/**
	 * Instancia uma constru��o a partir da identifica��o de uma classe, feita por
	 * constantes na classe Building.
	 * @param reference identifica��o da classe
	 * @return objeto de constru��o instanciado
	 */
	public static Building instantiateBuilding(int reference){
		switch (reference){
		case Building.FARM: return new Farm();
		case Building.LAB: return new Lab();
		case Building.TEMPLE: return new Temple();
		case Building.MINE: return new Mine();
		}
		
		return null;
	}
	
	/**
	 * M�todo que serve para adquirir os Up grades
	 * @param O n�mero do Up Grade desejado
	 * @exception IllegalArgumentException Se o up grade j� foi adquirido
	 */
	public void setUpgrade(int number)throws Exception{
		if(upgradesAvailable[number] == true){
			throw new IllegalArgumentException("Position already set");
		}else{
			upgradesAvailable[number] = true;
		}
	}
	
	/**
	 * M�todo que serve parqa conferir se um Upgrade foi adquirido
	 * @param O n�mero do Up Grade desejado
	 * @return true se sim e false se n�o
	 * @exception IllegalArgumentException Se o n�mero for maior que o n�mero de upgrades ou se for menor do que 0
	 */
	public boolean getUpgrade(int number)throws Exception{
		if(number >= upgradeNumber || number < 0){
			throw new IllegalArgumentException("Number out of range");
		}else{
			return upgradesAvailable[number];
		}
	}
	/**
	 * M�todo que define o n�mero de oopyies alocados
	 * @param oopyies
	 */
	public void allocateOopyies(int oopyies){
		oopyiesAllocated = oopyies;//define a quantidade de oopyies alocados
	}

	/**
	 * M�todo que compra um Upgrade
	 * @param b Uma constru��o da classe que se quer comprar o Upgrade
	 * @param upgrade O n�mero do Upgrade
	 * @param creativity Quanta criatividade est� gastando
	 * @throws IllegalArgumentException lan�a se o valor gasto nao for compat�vel com o custo
	 */
	public void buyUpGrade(Building b, int upgrade, int creativity )throws Exception{
		if(Building.getUpgradeCost(upgrade) != creativity){
			throw new IllegalArgumentException("Creativity value not compatible with creativity cost");
		}
		b.setUpgrade(upgrade);
	}
	
	/**
	 * M�todo que reinicializa a quantidade de oopyies alocados
	 */
	public void reset(){
		oopyiesAllocated = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String getIcon(){
		return iconPath;
	}
	
	public static int getUpgradeCost(int number){
		return upgradesCost[number];
	}
	
	protected static void setUpgradeCost(int value, int upgrade){
		upgradesCost[upgrade] = value;
	}
}