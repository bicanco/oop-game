package core;

import buildings.Building;

/**
 * Classe que representa uma matriz com as construções
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class GridManager {
	/**
	 * Numero de linhas na grade de construcoes.
	 */
	public static final int GRID_ROW_NUM = 6;
	/**
	 * Numero de colunas na grade de construcoes.
	 */
	public static final int GRID_COL_NUM = 5;
	
	/**
	 * Grade de construcoes atuais na partida.
	 */
	private Building[][] grid = new Building[GRID_ROW_NUM][GRID_COL_NUM];
	
	/**
	 * Construtor basico, que inicializa uma grade de construcoes vazia.
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
	 * Coloca uma nova construcao na grade. Nao e possivel construir em um espaco
	 * que ja tenha outra construcao.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @param building construcaoo a ser colocada
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
	 * Tira uma construcao que esteja na grade. Nao e possivel tirar uma construcao
	 * de um espaco vazio.
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
	 * Retorna o nome de uma construcao da grade.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @return nome da construcao
	 */
	public String getName(int row, int col){
		if (grid[row][col] != null){
			return grid[row][col].getName();
		} else {
			return null;
		}	
	}
	
	/**
	 * Retorna uma construcao da grade.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @return construcao
	 */
	public Building getBuilding(int row, int col){
		if (grid[row][col] != null){
			return grid[row][col];
		} else {
			return null;
		}	
	}
	
	/**
	 * Retorna o nome de uma construcao da grade.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @return nome da construcao
	 */
	public String getDescription(int row, int col){
		if (grid[row][col] != null){
			return grid[row][col].getDescription();
		} else {
			return null;
		}	
	}
	
	/**
	 * Retorna o icone de uma construcao da grade.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @return icone da construcao
	 */
	public String getIcon(int row, int col){
		if (grid[row][col] != null){
			return grid[row][col].getIcon();
		} else {
			return null;
		}	
	}
	
	/**
	 * Método que retorna se a posição da matriz está vazia
	 * @param row linha
	 * @param col coluna
	 * @return true se estiver e false se não
	 */
	public boolean isEmpty(int row, int col){
		if (grid[row][col] == null) return true;
		return false;
	}
	
	/**
	 * Método que gerencia a troca de truno para a matriz de contruções
	 * @return um ResourceManager
	 */
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
	
	/**
	 * Método que reinicia os atributos de um GridManager
	 */
	public void reset(){	
		for (int i = 0; i < GRID_ROW_NUM; i++){
			for (int j = 0; j < GRID_COL_NUM; j++){
				if (grid[i][j] != null)
					grid[i][j].reset();
			}
		}
	}
}
	
