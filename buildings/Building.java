package buildings;

import java.awt.Image;

/**
 * Classe abstrata que representa uma construção
 * @author 4461180
 *
 */
abstract public class Building {
	public String name;
	public String description;
	protected static int creativityCost;
//	static public boolean[] attributesAvailable;
	static protected boolean[] upgradesAvailable;
//	static int attributeNumber;
	static int upgradeNumber;
	public Image icon;

	public int getCreativtyCost(){
		return creativityCost;
	}
	
}