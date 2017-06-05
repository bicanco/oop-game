package core;

import java.awt.Image;

import buildings.Building;

public class GridManager {
	/**
	 * N�mero de linhas na grade de constru��es.
	 */
	private final int GRID_ROW_NUM = 6;
	/**
	 * N�mero de colunas na grade de constru��es.
	 */
	private final int GRID_COL_NUM = 5;
	
	/**
	 * Grade de constru��es atuais na partida.
	 */
	private Building[][] grid = new Building[GRID_ROW_NUM][GRID_COL_NUM];
	
	/**
	 * Construtor b�sico, que inicializa uma grade de constru��es vazia.
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
	 * Coloca uma nova constru��o na grade. N�o � poss�vel construir em um espa�o
	 * que j� tenha outra constru��o.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @param building constru��o a ser colocada
	 */
	public void build(int row, int col, Building building){		
		if (grid[row][col] == null){
			grid[row][col] = building;
		} else {
			throw new IllegalArgumentException("Grid space already full.");
		}	
	}
	
	/**
	 * Tira uma constru��o que esteja na grade. N�o � poss�vel tirar uma constru��o
	 * de um espa�o vazio.
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
	 * Retorna o nome de uma constru��o da grade.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @return nome da constru��o
	 */
	public String getName(int row, int col){
		if (grid[row][col] != null){
			return grid[row][col].getName();
		} else {
			return null;
		}	
	}
	
	/**
	 * Retorna o nome de uma constru��o da grade.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @return nome da constru��o
	 */
	public String getDescription(int row, int col){
		if (grid[row][col] != null){
			return grid[row][col].getDescription();
		} else {
			return null;
		}	
	}
	
	/**
	 * Retorna o �cone de uma constru��o da grade.
	 * @param row linha da grade
	 * @param col coluna da grade
	 * @return �cone da constru��o
	 */
	public Image getIcon(int row, int col){
		if (grid[row][col] != null){
			return grid[row][col].getIcon();
		} else {
			return null;
		}	
	}
}
