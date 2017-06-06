package buildings;

import java.awt.Image;

/**
 * Classe abstrata que representa uma construção
 * @author David
 *
 */
abstract public class Building {
	protected static String name;
	protected static String description;
	protected static int creativityCost;
	static protected boolean[] upgradesAvailable;
	static protected int[] upgradesCost;//add cost
	static int upgradeNumber;
	public Image icon;
	protected int oopyiesAllocated;//quantidade de oopyies alocados

	/**
	 * Método construtor para utilização das classes que extendem esta classe abstrata
	 */
	public Building(){
		oopyiesAllocated = 0;
	}
	
	/**
	 * Método que retorna o custo de criatividade do edifício
	 * @return
	 */
	public int getCreativtyCost(){
		return creativityCost;
	}
	
	/**
	 * Método que serve para adquirir os Up grades
	 * @param O número do Up Grade desejado
	 * @exception IllegalArgumentException Se o up grade já foi adquirido
	 */
	public void setUpgrade(int number)throws Exception{
		if(upgradesAvailable[number] == true){
			throw new IllegalArgumentException("Position already set");
		}else{
			upgradesAvailable[number] = true;
		}
	}
	
	/**
	 * Método que serve parqa conferir se um Upgrade foi adquirido
	 * @param O número do Up Grade desejado
	 * @return true se sim e false se não
	 * @exception IllegalArgumentException Se o número for maior que o número de upgrades ou se for menor do que 0
	 */
	public boolean getUpgrade(int number)throws Exception{
		if(number >= upgradeNumber || number < 0){
			throw new IllegalArgumentException("Number out of range");
		}else{
			return upgradesAvailable[number];
		}
	}
	/**
	 * Método que define o número de oopyies alocados
	 * @param oopyies
	 */
	public void allocateOopyies(int oopyies){
		oopyiesAllocated = oopyies;//define a quantidade de oopyies alocados
	}

	/**
	 * Método que compra um Upgrade
	 * @param b Uma construção da classe que se quer comprar o Upgrade
	 * @param upgrade O número do Upgrade
	 * @param creativity Quanta criatividade está gastando
	 * @throws IllegalArgumentException lança se o valor gasto nao for compatível com o custo
	 */
	public void buyUpGrade(Building b, int upgrade, int creativity )throws Exception{
		if(Building.getUpgradeCost(upgrade) != creativity){
			throw new IllegalArgumentException("Creativity value not compatible with creativity cost");
		}
		b.setUpgrade(upgrade);
	}
	
	/**
	 * Método que reinicializa a quantidade de oopyies alocados
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
	
	public Image getIcon(){
		return icon;
	}
	
	public static int getUpgradeCost(int number){
		return upgradesCost[number];
	}
	
	protected static void setUpgradeCost(int value, int upgrade){
		upgradesCost[upgrade] = value;
	}
}