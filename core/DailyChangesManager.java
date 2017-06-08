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
			options[i] = new DailyChangeOption(R.nextInt(4)+1);
			options[i].setDailayChageOption(R.ints(options[i].getSize(), 0, 5).toArray(), R.ints(options[i].getSize(),100,1000).toArray());
		}
	}
	
	public DailyChangeOption[] getOptions(){
		return options;
	}
}
