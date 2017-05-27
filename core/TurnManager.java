package core;

import java.util.Random;

/**
 * Classe que gerencia a passagem dos turnos e algumas rotinas do jogo
 * relacionadas a isso, como o pagamento de Rubies em certos turnos e
 * a geração de recursos a partir das construções.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class TurnManager {
	/**
	 * Turno inicial da partida.
	 */
	private final int INITIAL_TURN = 1;
	
	/**
	 * Gerador de números pseudo-aleatórios.
	 */
	Random rand = new Random(System.currentTimeMillis());
	
	/**
	 * Turno atual da partida.
	 */
	private int currentTurn;
	
	/**
	 * Mínimo para escolha aleatória de tempo (em turnos) para o próximo turno
	 * a ser feito um pagamento em Rubies.
	 */
	private int payTurnRangeMin = 17;
	/**
	 * Máximo para escolha aleatória de tempo (em turnos) para o próximo turno
	 * a ser feito um pagamento em Rubies. 
	 */
	private int payTurnRangeMax = 20;
	/**
	 * Acréscimo a ser feito no intervalo de tempo dos pagamentos a cada aumento
	 * na quantidade de Rubies.
	 */
	private int payTurnRangeIncrease = 2;
	/**
	 * Próximo turno de pagamento.
	 */
	private int nextPayTurn = INITIAL_TURN;
	/**
	 * Rubies a serem pagos no próximo turno de pagamento.
	 */
	private int payTurnRubies = 2;
	/**
	 * Acréscimo a ser feito na quantidade de Rubies a serem pagos.
	 */
	private int payTurnRubiesIncrease = 1;
	/**
	 * Se verdadeiro, indica que o número de Rubies a serem pagos no próximo turno
	 * deve aumentar.
	 */
	private boolean increasePayTurn = false;
	
	/**
	 * Construtor padrão, inicia a partida no turno inicial.
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
	 * Gera o próximo turno de pagamento e atualiza a quantidade de rubis e o
	 * novo intervalo de tempo, caso necessário.
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
	 * Retorna o número do próximo turno de pagamento.
	 * @return número do próximo turno de pagamento
	 */
	public int getNextPayTurn(){
		return nextPayTurn;
	}
	
	/**
	 * Retorna a quantidade de Rubies a ser paga no próximo turno de pagamento.
	 * @return quantidade de Rubies para o próximo turno de pagamento
	 */
	public int getPayTurnRubies(){
		return payTurnRubies;
	}
	
	/**
	 * Checa se o turno atual é um turno de pagamento.
	 * @return true, caso o turno atual seja de pagamento; false, caso contrário
	 */
	public boolean isPayTurn(){
		if (currentTurn == nextPayTurn) return true;
		return false;
	}
	
	/**
	 * Executa as rotinas do turno de pagamento, sem checar se, efetivamente,
	 * é um turno de pagamento. 
	 * @param resources gerenciador de recursos da partida
	 * @return false, caso não tenha Rubies suficientes; true, caso contrário
	 */
	public boolean executePayTurn(ResourceManager resources){
		boolean paymentExecuted = true;
		
		// caso não tenha rubis suficientes para pagar
		if (resources.getGreatRubies() < payTurnRubies)		
			paymentExecuted = false;
		
		// diminuia a quantidade de rubis
		resources.updateGreatRubies(-payTurnRubies);
		
		// gere o próximo turno de pagamento
		nextPayTurn = currentTurn; // caso o pagamento seja feito antes do turno correto
		nextPayTurn();
		
		return paymentExecuted;
	}
	
	/**
	 * Retorna uma representação em String, para depuração.
	 */
	@Override
	public String toString(){
		String str = "Current Turn: " + currentTurn + "\n";
		str += "Pay Turn Range: [" + payTurnRangeMin + ", " + payTurnRangeMax + "]\n";
		str += "Next Pay Turn: " + nextPayTurn + " (" + payTurnRubies + " rubies)\n";
		return str;
	}
}
