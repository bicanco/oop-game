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
	static int upgradeNumber;
	public Image icon;

	public int getCreativtyCost(){
		return creativityCost;
	}
	
	/**
	 * M�todo que serve para "comprar" os Up grades
	 * @param O n�mero do Up Grade desejado
	 */
	public void setUpgrade(int number){
		if(upgradesAvailable[number] == true){
			throw new IllegalArgumentException("Position already set");
		}else{
			upgradesAvailable[number] = true;
		}
	}
	
}