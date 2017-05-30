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

	public int getCreativtyCost(){
		return creativityCost;
	}
	
	/**
	 * Método que serve para "comprar" os Up grades
	 * @param O número do Up Grade desejado
	 */
	public void setUpgrade(int number){
		if(upgradesAvailable[number] == true){
			throw new IllegalArgumentException("Position already set");
		}else{
			upgradesAvailable[number] = true;
		}
	}
	
}