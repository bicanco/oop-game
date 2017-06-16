package core;

import java.util.Random;

/**
 * Classe que gerencia a passagem dos turnos e algumas rotinas do jogo
 * relacionadas a isso, como o pagamento de Rubies em certos turnos e
 * a geracao de recursos a partir das construcoes.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class TurnManager {
	/**
	 * Turno inicial da partida.
	 */
	private final int INITIAL_TURN = 1;
	
	/**
	 * Gerador de numeros pseudo-aleatorios.
	 */
	Random rand = new Random(System.currentTimeMillis());
	
	/**
	 * Turno atual da partida.
	 */
	private int currentTurn;
	
	/**
	 * Minimo para escolha aleatoria de tempo (em turnos) para o proximo turno
	 * a ser feito um pagamento em Rubies.
	 */
	private int payTurnRangeMin = 17;
	/**
	 * Maximo para escolha aleatoria de tempo (em turnos) para o proximo turno
	 * a ser feito um pagamento em Rubies. 
	 */
	private int payTurnRangeMax = 20;
	/**
	 * Acrescimo a ser feito no intervalo de tempo dos pagamentos a cada aumento
	 * na quantidade de Rubies.
	 */
	private int payTurnRangeIncrease = 2;
	/**
	 * Proximo turno de pagamento.
	 */
	private int nextPayTurn = INITIAL_TURN;
	/**
	 * Rubies a serem pagos no proximo turno de pagamento.
	 */
	private int payTurnRubies = 2;
	/**
	 * Acrescimo a ser feito na quantidade de Rubies a serem pagos.
	 */
	private int payTurnRubiesIncrease = 1;
	/**
	 * Se verdadeiro, indica que o numero de Rubies a serem pagos no proximo turno
	 * deve aumentar.
	 */
	private boolean increasePayTurn = false;
	
	
	/**
	 * Numero de Oopyies que compoem cada grupo de comida.
	 */
	private int oopyiesPerFoodGroup = 5;
	/**
	 * Numero de Java Seeds usadas para alimentar cada grupo de comida.
	 */
	private int seedsPerFoodGroup = 2;
	/**
	 * Numero de Sharp Cocos usados para alimentar cada grupo de comida.
	 */
	private int cocosPerFoodGroup = 2;
	
	private int lastOopyiesGone = 0;
	private int lastSeedsUsed = 0;
	private int lastCocosUsed = 0;
	
	/**
	 * Construtor padrao, inicia a partida no turno inicial.
	 */
	public TurnManager(){
		// inicializa no turno inicial
		currentTurn = INITIAL_TURN;
		
		// gera o primeiro turno de pagamento
		nextPayTurn();
	}
	
	/**
	 * Retorna o turno atual da partida.
	 * @return turno atual da partida
	 */
	public int getCurrentTurn(){
		return currentTurn;
	}
	
	/**
	 * Inicia um novo turno.
	 */
	public void nextTurn(){
		currentTurn++;
	}
	
	/**
	 * Gera o proximo turno de pagamento e atualiza a quantidade de rubis e o
	 * novo intervalo de tempo, caso necessario.
	 */
	private void nextPayTurn(){
		// se a quantidade de rubis deve ser incrementada
		if (increasePayTurn){
			// aumenta o intervalo de tempo
			payTurnRangeMin += payTurnRangeIncrease;
			payTurnRangeMax += payTurnRangeIncrease;
			
			// aumenta o numero de rubis
			payTurnRubies += payTurnRubiesIncrease;
		}
		
		// gera o novo turno de pagamento
		nextPayTurn += rand.nextInt(payTurnRangeMax - payTurnRangeMin) + payTurnRangeMin;
		
		// prepara o aumento da quantidade
		increasePayTurn ^= true;
	}
	
	/**
	 * Retorna o numero do proximo turno de pagamento.
	 * @return numero do proximo turno de pagamento
	 */
	public int getNextPayTurn(){
		return nextPayTurn;
	}
	
	/**
	 * Retorna a quantidade de Rubies a ser paga no proximo turno de pagamento.
	 * @return quantidade de Rubies para o proximo turno de pagamento
	 */
	public int getPayTurnRubies(){
		return payTurnRubies;
	}
	
	/**
	 * Checa se o turno atual e um turno de pagamento.
	 * @return true, caso o turno atual seja de pagamento; false, caso contrario
	 */
	public boolean isPayTurn(){
		if (currentTurn == nextPayTurn) return true;
		return false;
	}
	
	/**
	 * Executa as rotinas do turno de pagamento, sem checar se, efetivamente,
	 * e um turno de pagamento. 
	 * @param resources gerenciador de recursos da partida
	 * @return false, caso nao tenha Rubies suficientes; true, caso contrario
	 */
	public boolean executePayTurn(ResourceManager resources){
		boolean paymentExecuted = true;
		
		// caso nao tenha rubis suficientes para pagar
		if (resources.getGreatRubies() < payTurnRubies)		
			paymentExecuted = false;
		
		// diminuia a quantidade de rubis
		//acho que era pra ter um else aqui, att marcelo <<<<<<<<<<<<
		resources.updateGreatRubies(-payTurnRubies);
		
		// gere o proximo turno de pagamento
		nextPayTurn = currentTurn; // caso o pagamento seja feito antes do turno correto
		nextPayTurn();
		
		return paymentExecuted;
	}
	
	/**
	 * Alimenta os Oopyies para um turno de jogo, a partir de grupos de comida. Cada grupo de comida precisa
	 * ser alimentado com um numero fixo de Java Seeds e Sharp Cocos por turno. Caso nao tenha comida suficiente
	 * para um grupo, eles saem da vila. 
	 * 
	 * @param resources gerenciador de recursos
	 */
	public void feedOopyies(ResourceManager resources){
		lastOopyiesGone = 0;
		lastSeedsUsed = 0;
		lastCocosUsed = 0;
		
		int foodGroups = resources.getOopyies() / oopyiesPerFoodGroup;
		
		// para cada um dos grupos de oopyies
		for (int i = 0; i < foodGroups; i++){
			// se houver comida suficiente para alimenta-los
			if (resources.getJavaSeeds() >= seedsPerFoodGroup &&
					resources.getSharpCocos() >= cocosPerFoodGroup){
				// diminuia os recursos, mantenha os oopyies
				resources.updateJavaSeeds(-seedsPerFoodGroup);
				resources.updateSharpCocos(-cocosPerFoodGroup);
				lastSeedsUsed += seedsPerFoodGroup;
				lastCocosUsed += cocosPerFoodGroup;
			} else {
				// oopyies foram embora da cidade
				lastOopyiesGone += oopyiesPerFoodGroup;
				resources.updateOopyies(-oopyiesPerFoodGroup);
			}
		}
	}
	
	public int getLastOopyiesGone(){
		return lastOopyiesGone;
	}
	
	public int getLastSeedsUsed(){
		return lastSeedsUsed;
	}
	
	public int getLastCocosUsed(){
		return lastCocosUsed;
	}
	
	/**
	 * Determina quantidade de Oopyies novos no turno
	 * @param resources gerenciador de recursos
	 * @return numero de Oopyies que entraram na vila
	 */
	public int newOopyies(ResourceManager resources){
		int oopyiesNumber = 0;
		
		oopyiesNumber = (rand.nextInt(resources.getBuildings() + 1) * currentTurn)/2; 
		return oopyiesNumber + 2;
	}
	
	/**
	 * Retorna uma representacao em String, para depuracao.
	 */
	@Override
	public String toString(){
		String str = "Current Turn: " + currentTurn + "\n";
		str += "Pay Turn Range: [" + payTurnRangeMin + ", " + payTurnRangeMax + "]\n";
		str += "Next Pay Turn: " + nextPayTurn + " (" + payTurnRubies + " rubies)\n";
		return str;
	}
	
}
