package buildings;

import core.ResourceManager;

/**
 * Interface que indica os requisistos necessários para que se defina uma classe para representar uma construção
 * @author David
 *
 */
public interface Building {
	String getName();
	String getDescription();
	String getIcon();
	
	int getUnlockCost();
	int getBuildCost();
	
	int getOopyiesAllocated();
	void allocateOopyies(int oopyies);
	
	void unlockUpgrade(int upgradeId) throws Exception;
	boolean getUpgrade(int upgradeId) throws Exception;
	
	int getUpgradeCost(int upgradeId);
	
	void reset();
	void reconfig(ResourceManager resources);
	void runTurn(ResourceManager resources);
}
