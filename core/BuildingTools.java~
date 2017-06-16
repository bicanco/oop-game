package core;

import buildings.*;

public class BuildingTools {
	public static final int FARM = 1;
	public static final int LAB = 2;
	public static final int TEMPLE = 3;
	public static final int MINE = 4;
	
	private static Farm farm = new Farm();
	private static Lab lab = new Lab();
	private static Temple temple = new Temple();
	private static Mine mine = new Mine();
	
	/**
	 * Retorna o custo de construção de uma certa classe, de acordo com sua identificação,
	 * feita por constantes em BuildingTools.
	 * @param reference identificação da classe
	 * @return custo de construção de um objeto dessa classe
	 */
	public static int getBuildCost(int reference){
		switch (reference){
		case FARM: return farm.getBuildCost();
		case LAB:	return lab.getBuildCost();
		case TEMPLE: return temple.getBuildCost();
		case MINE: return mine.getBuildCost();
		}
		
		return -1;
	}
	
	/**
	 * Retorna o nome de uma certa classe, de acordo com sua identificação,
	 * feita por constantes em BuildingTools.
	 * @param reference identificação da classe
	 * @return nome da classe
	 */
	public static String getName(int reference){
		switch (reference){
		case FARM: return farm.getName();
		case LAB: return lab.getName();
		case TEMPLE: return temple.getName();
		case MINE: return mine.getName();
		}
		
		return null;
	}
	
	/**
	 * Retorna o caminho do ícone de uma certa classe, de acordo com sua identificação,
	 * feita por constantes em BuildingTools.
	 * @param reference identificação da classe
	 * @return caminho do ícone da classe
	 */
	public static String getIcon(int reference){
		switch (reference){
		case FARM: return farm.getIcon();
		case LAB: return lab.getIcon();
		case TEMPLE: return temple.getIcon();
		case MINE: return mine.getIcon();
		}
		
		return null;
	}
	
	/**
	 * Instancia uma construção a partir da identificação de uma classe, feita por
	 * constantes em BuildingTools.
	 * @param reference identificação da classe
	 * @return objeto de construção instanciado
	 */
	public static Building instantiateBuilding(int reference){
		switch (reference){
		case FARM: return new Farm();
		case LAB: return new Lab();
		case TEMPLE: return new Temple();
		case MINE: return new Mine();
		}
		
		return null;
	}
	
	public static boolean getUpgrade(int reference, int upgradeId) {
		try {
			switch (reference){
			case FARM: return farm.getUpgrade(upgradeId);
			case LAB: return lab.getUpgrade(upgradeId);
			case TEMPLE: return temple.getUpgrade(upgradeId);
			case MINE: return mine.getUpgrade(upgradeId);
			}
		} catch (Exception e){
			return false;
		}
		
		return false;
	}
	
	public static int getUpgradeCost(int reference, int upgradeId){
		try {
			switch (reference){
			case FARM: return farm.getUpgradeCost(upgradeId);
			case LAB: return lab.getUpgradeCost(upgradeId);
			case TEMPLE: return temple.getUpgradeCost(upgradeId);
			case MINE: return mine.getUpgradeCost(upgradeId);
			}
		} catch (Exception e) {
			return -1;
		}
		
		return -1;
	}
	
	public static void unlockUpgrade(int reference, int upgradeId) {
		try {
			switch (reference){
			case FARM: farm.unlockUpgrade(upgradeId);
			case LAB:  lab.unlockUpgrade(upgradeId);
			case TEMPLE: temple.unlockUpgrade(upgradeId);
			case MINE: mine.unlockUpgrade(upgradeId);
			}
		} catch (Exception e){
			// Posição já está preenchida, nada ocorre
		}
	}
}
