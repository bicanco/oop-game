package core;

import buildings.*;

public class BuildingTools {
	public static final int FARM = 1;
	public static final int LAB = 2;
	public static final int TEMPLE = 3;
	public static final int MINE = 4;
	
	private static Farm farm = new Farm();
	//private static Lab lab = new Lab();
	//private static Temple temple = new Temple();
	//private static Mine mine = new Mine();
	
	/**
	 * Retorna o custo de construção de uma certa classe, de acordo com sua identificação,
	 * feita por constantes na classe Building.
	 * @param reference identificação da classe
	 * @return custo de construção de um objeto dessa classe
	 */
	public static int getBuildCost(int reference){
		switch (reference){
		case FARM: return farm.getBuildCost();
		//case LAB:	return lab.getBuildCost();
		//case TEMPLE: return temple.getBuildCost();
		//case MINE: return mine.getBuildCost();
		}
		
		return -1;
	}
	
	/**
	 * Instancia uma construção a partir da identificação de uma classe, feita por
	 * constantes na classe Building.
	 * @param reference identificação da classe
	 * @return objeto de construção instanciado
	 */
	public static Building instantiateBuilding(int reference){
		switch (reference){
		case FARM: return new Farm();
		//case LAB: return new Lab();
		//case TEMPLE: return new Temple();
		//case MINE: return new Mine();
		}
		
		return null;
	}
}
