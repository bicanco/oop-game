package core;

import java.util.Random;
/**
 * Classe que representa todas as opções de troca diárias de um dia
 * @author David
 *
 */
public class DailyChangesManager {
	private DailyChangeOption[] options = new DailyChangeOption[3];
	private Random R = new Random(System.currentTimeMillis());
	
	/**
	 * Método construtor da classe DailyChangesManager
	 */
	public DailyChangesManager(){
		turnDay();
	}
	
	/**
	 * Método que troca as opções diárias
	 */
	public void turnDay(){
		for(int i = 0 ; i < 3; i++){
			options[i] = new DailyChangeOption();
			for(int j = 0; j < 3; j++){
				try{
					options[i].setDailyChangeOption(j, R.nextInt(5), R.nextInt(901)+100);
				}catch (Exception e){
					j--;
				}
			}
		}
	}
	
	/**
	 * Método que retorna as opções diárias do dia
	 * @return as opções diárias do dia
	 */
	public DailyChangeOption[] getOptions(){
		return options;
	}
}
