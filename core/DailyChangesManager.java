package core;

import java.util.Random;

public class DailyChangesManager {
	private DailyChangeOption[] options = new DailyChangeOption[3];
	private Random R = new Random(System.currentTimeMillis());
	
	public DailyChangesManager(){
		turnDay();
	}
	
	public void turnDay(){
		for(int i = 0 ; i < 3; i++){
			options[i] = new DailyChangeOption();
			for(int j = 0; j < 3; j++){
				try{
					options[i].setDailyChageOption(i, R.nextInt(5), R.nextInt(901)+100);
				}catch (Exception e){
					j--;
				}
			}
		}
	}
	
	public DailyChangeOption[] getOptions(){
		return options;
	}
}
