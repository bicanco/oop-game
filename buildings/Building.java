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
	public int creativtyCost;
	static public boolean[] attributesAvailable;
	static public boolean[] methodsAvailable;
	static int attributeNumber;
	static int methodNumber;
	public Image icon;

	
}