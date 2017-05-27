package core;

import java.util.Random;

/**
 * Classe que gerencia a passagem dos turnos e algumas rotinas do jogo
 * relacionadas a isso, como o pagamento de Rubies em certos turnos e
 * a gera��o de recursos a partir das constru��es.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class TurnManager {
	/**
	 * Turno inicial da partida.
	 */
	private final int INITIAL_TURN = 1;
	
	/**
	 * Gerador de n�meros pseudo-aleat�rios.
	 */
	Random rand = new Random(System.currentTimeMillis());
	
	/**
	 * Turno atual da partida.
	 */
	private int currentTurn;
	
	/**
	 * M�nimo para escolha aleat�ria de tempo (em turnos) para o pr�ximo turno
	 * a ser feito um pagamento em Rubies.
	 */
	private int payTurnRangeMin = 17;
	/**
	 * M�ximo para escolha aleat�ria de tempo (em turnos) para o pr�ximo turno
	 * a ser feito um pagamento em Rubies. 
	 */
	private int payTurnRangeMax = 20;
	/**
	 * Acr�scimo a ser feito no intervalo de tempo dos pagamentos a cada aumento
	 * na quantidade de Rubies.
	 */
	private int payTurnRangeIncrease = 2;
	/**
	 * Pr�ximo turno de pagamento.
	 */
	private int nextPayTurn = INITIAL_TURN;
	/**
	 * Rubies a serem pagos no pr�ximo turno de pagamento.
	 */
	private int payTurnRubies = 2;
	/**
	 * Acr�scimo a ser feito na quantidade de Rubies a serem pagos.
	 */
	private int payTurnRubiesIncrease = 1;
	/**
	 * Se verdadeiro, indica que o n�mero de Rubies a serem pagos no pr�ximo turno
	 * deve aumentar.
	 */
	private boolean increasePayTurn = false;
	
	/**
	 * Construtor padr�o, inicia a partida no turno inicial.
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
	 * Gera o pr�ximo turno de pagamento e atualiza a quantidade de rubis e o
	 * novo intervalo de tempo, caso necess�rio.
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
	 * Retorna o n�mero do pr�ximo turno de pagamento.
	 * @return n�mero do pr�ximo turno de pagamento
	 */
	public int getNextPayTurn(){
		return nextPayTurn;
	}
	
	/**
	 * Retorna a quantidade de Rubies a ser paga no pr�ximo turno de pagamento.
	 * @return quantidade de Rubies para o pr�ximo turno de pagamento
	 */
	public int getPayTurnRubies(){
		return payTurnRubies;
	}
	
	/**
	 * Checa se o turno atual � um turno de pagamento.
	 * @return true, caso o turno atual seja de pagamento; false, caso contr�rio
	 */
	public boolean isPayTurn(){
		if (currentTurn == nextPayTurn) return true;
		return false;
	}
	
	/**
	 * Executa as rotinas do turno de pagamento, sem checar se, efetivamente,
	 * � um turno de pagamento. 
	 * @param resources gerenciador de recursos da partida
	 * @return false, caso n�o tenha Rubies suficientes; true, caso contr�rio
	 */
	public boolean executePayTurn(ResourceManager resources){
		boolean paymentExecuted = true;
		
		// caso n�o tenha rubis suficientes para pagar
		if (resources.getGreatRubies() < payTurnRubies)		
			paymentExecuted = false;
		
		// diminuia a quantidade de rubis
		resources.updateGreatRubies(-payTurnRubies);
		
		// gere o pr�ximo turno de pagamento
		nextPayTurn = currentTurn; // caso o pagamento seja feito antes do turno correto
		nextPayTurn();
		
		return paymentExecuted;
	}
	
	/**
	 * Retorna uma representa��o em String, para depura��o.
	 */
	@Override
	public String toString(){
		String str = "Current Turn: " + currentTurn + "\n";
		str += "Pay Turn Range: [" + payTurnRangeMin + ", " + payTurnRangeMax + "]\n";
		str += "Next Pay Turn: " + nextPayTurn + " (" + payTurnRubies + " rubies)\n";
		return str;
	}
}
