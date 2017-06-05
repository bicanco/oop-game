package core;

import buildings.Building;

public class UpgradesManager{

	public void buyUpGrade(Building b, int upgrade, int creativity )throws Exception{
		if(b.getUpgradeCost(upgrade) != creativity){
			throw new IllegalArgumentException("Creativity value not compatible with creativity cost");
		}
		b.setUpgrade(upgrade);
	}
}
