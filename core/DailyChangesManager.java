package core;

import java.util.Random;
/**
 * Classe que representa todas as op��es de troca di�rias de um dia
 * @author David
 *
 */
public class DailyChangesManager {
	private DailyChangeOption[] options = new DailyChangeOption[3];
	private Random R = new Random(System.currentTimeMillis());
	
	/**
	 * M�todo construtor da classe DailyChangesManager
	 */
	public DailyChangesManager(){
		turnDay();
	}
	
	/**
	 * M�todo que troca as op��es di�rias
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
	 * M�todo que retorna as op��es di�rias do dia
	 * @return as op��es di�rias do dia
	 */
	public DailyChangeOption[] getOptions(){
		return options;
	}
}
