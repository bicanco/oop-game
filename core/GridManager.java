package core;

import buildings.Building;

public class GridManager {
	/**
	 * Número de linhas na grade de construções.
	 */
	public static final int GRID_ROW_NUM = 6;
	/**
	 * Número de colunas na grade de construções.
	 */
	public static final int GRID_COL_NUM = 5;
	
	/**
	 * Grade de construções atuais na partida.
	 */
	private Building[][] grid = new Building[GRID_ROW_NUM][GRID_COL_NUM];
	
	/**
	 * Construtor básico, que inicializa uma grade de construções vazia.
	 */
	public GridManager(){
		// inicializando a grade de construcoes
		grid = new Building[GRID_ROW_NUM][GRID_COL_NUM];
		for (int i = 0; i < GRID_ROW_NUM; i++){
			for (int j = 0; j < GRID_COL_NUM; j++)
				grid[i][j] = null;
		}
	}
	
	/**
	 * Coloca uma nova construção na grade. Não é possível construir em um espaço
	 * que já tenha outra construção.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @param building construção a ser colocada
	 */
	public void build(int row, int col, Building building, ResourceManager resources){		
		if (grid[row][col] == null){
			grid[row][col] = building;
			resources.updateBuildings(1);
		} else {
			throw new IllegalArgumentException("Grid space already full.");
		}	
	}
	
	/**
	 * Tira uma construção que esteja na grade. Não é possível tirar uma construção
	 * de um espaço vazio.
	 * @param row linha da grade
	 * @param col coluna da grade 
	 */
	public void destroy(int row, int col){
		if (grid[row][col] != null){
			grid[row][col] = null;
		} else {
			throw new IllegalArgumentException("Grid space already empty.");
		}	
	}
	
	/**
	 * Retorna o nome de uma construção da grade.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @return nome da construção
	 */
	public String getName(int row, int col){
		if (grid[row][col] != null){
			return grid[row][col].getName();
		} else {
			return null;
		}	
	}
	
	/**
	 * Retorna uma construção da grade.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @return construção
	 */
	public Building getBuilding(int row, int col){
		if (grid[row][col] != null){
			return grid[row][col];
		} else {
			return null;
		}	
	}
	
	/**
	 * Retorna o nome de uma construção da grade.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @return nome da construção
	 */
	public String getDescription(int row, int col){
		if (grid[row][col] != null){
			return grid[row][col].getDescription();
		} else {
			return null;
		}	
	}
	
	/**
	 * Retorna o ícone de uma construção da grade.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @return ícone da construção
	 */
	public String getIcon(int row, int col){
		if (grid[row][col] != null){
			return grid[row][col].getIcon();
		} else {
			return null;
		}	
	}
	
	public boolean isEmpty(int row, int col){
		if (grid[row][col] == null) return true;
		return false;
	}
	
	public ResourceManager runTurn(){
		ResourceManager tomorrow = new ResourceManager();
		
		for (int i = 0; i < GRID_ROW_NUM; i++){
			for (int j = 0; j < GRID_COL_NUM; j++){
				if (grid[i][j] != null)
					grid[i][j].runTurn(tomorrow);
			}
		}
		
		return tomorrow;
	}
	
	public void reset(){	
		for (int i = 0; i < GRID_ROW_NUM; i++){
			for (int j = 0; j < GRID_COL_NUM; j++){
				if (grid[i][j] != null)
					grid[i][j].reset();
			}
		}
	}
}
	
