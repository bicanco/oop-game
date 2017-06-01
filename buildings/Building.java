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
	static int upgradeNumber;
	public Image icon;
	protected int oopyiesAllocated;//quantidade de oopyies alocados

	public int getCreativtyCost(){
		return creativityCost;
	}
	
	/**
	 * Método que serve para adquirir os Up grades
	 * @param O número do Up Grade desejado
	 * @exception IllegalArgumentException Se o up grade já foi adquirido
	 */
	public void setUpgrade(int number){
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
	public boolean getUpgrade(int number){
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
	
}