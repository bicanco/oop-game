package buildings;

import java.awt.Image;

/**
 * Classe abstrata que representa uma constru��o
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
	 * M�todo construtor para utiliza��o das classes que extendem esta classe abstrata
	 */
	public Building(){
		oopyiesAllocated = 0;
	}
	
	/**
	 * M�todo que retorna o custo de criatividade do edif�cio
	 * @return
	 */
	public int getCreativtyCost(){
		return creativityCost;
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
	
	public Image getIcon(){
		return icon;
	}
	
	public int getUpgradeCost(int number){
		return upgradesCost[number];
	}
	
	protected void setUpgradeCost(int value, int upgrade){
		upgradesCost[upgrade] = value;
	}
}