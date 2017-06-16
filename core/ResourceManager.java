package core;

/**
 * Gerencia todos os tipos de recursos que se acumulam durante
 * uma partida, inclusive os recursos especiais.
 * @author Gabriel Toschi (@gabrieltoschi)
 *
 */
public class ResourceManager {
	/**
	 * Quantidade atual de Java Seeds.
	 */
	private int javaSeeds;
	/**
	 * Quantidade atual de Sharp Cocos.
	 */
	private int sharpCocos;
	/**
	 * Quantidade atual de Magic Perls.
	 */
	private int magicPerls;
	/**
	 * Quantidade atual de PYramids.
	 */
	private int pyramids;
	/**
	 * Quantidade atual de Scala Stones.
	 */
	private int scalaStones;
	
	/**
	 * Quantidade atual de pontos de criatividade.
	 */
	private int creativity;
	/**
	 * Quantidade atual de Oopyies na vila.
	 */
	private int oopyies;
	/**
	 * Quantidade atual de Great Rubies.
	 */
	private int greatRubies;
	
	/**
	 * Quantidade atual de Buildins no mapa
	 */
	private int buildings;
	
	/**
	 * Construtor padrao, zera todos os recursos.
	 */
	public ResourceManager(){
		javaSeeds = 0;
		sharpCocos = 0;
		magicPerls = 0;
		pyramids = 0;
		scalaStones = 0;
		
		creativity = 0;
		oopyies = 0;
		greatRubies = 0;
		
		buildings = 0;
	}
	
	/**
	 * Retorna a quantidade atual de Java Seeds.
	 * @return quantidade atual de Java Seeds
	 */
	public int getJavaSeeds() {
		return javaSeeds;
	}
	
	/**
	 * Atualiza a quantidade de Java Seeds, a partir de uma quantidade a ser somada.
	 * @param offset quantidade a ser somada
	 */
	public void updateJavaSeeds(int offset) {
		this.javaSeeds += offset;
		if (javaSeeds < 0) javaSeeds = 0;
	}
	
	/**
	 * Retorna a quantidade atual de Sharp Cocos.
	 * @return quantidade atual de Sharp Cocos.
	 */
	public int getSharpCocos(){
		return sharpCocos;
	}
	
	/**
	 * Atualiza a quantidade de Sharp Cocos, a partir de uma quantidade a ser somada.
	 * @param offset quantidade a ser somada
	 */
	public void updateSharpCocos(int offset){
		this.sharpCocos += offset;
		if (sharpCocos < 0) sharpCocos = 0;
	}
	
	/**
	 * Retorna a quantidade atual de Magic Perls.
	 * @return quantidade atual de Magic Perls
	 */
	public int getMagicPerls(){
		return magicPerls;
	}
	
	/**
	 * Atualiza a quantidade de Magic Perls, a partir de uma quantidade a ser somada.
	 * @param offset quantidade a ser somada
	 */
	public void updateMagicPerls(int offset){
		this.magicPerls += offset;
		if (magicPerls < 0) magicPerls = 0;
	}
	
	/**
	 * Retorna a quantidade atual de PYramids.
	 * @return quantidade atual de PYramids
	 */
	public int getPyramids(){
		return pyramids;
	}
	
	/**
	 * Atualiza a quantidade de PYramids, a partir de uma quantidade a ser somada.
	 * @param offset quantidade a ser somada
	 */
	public void updatePyramids(int offset){
		this.pyramids += offset;
		if (pyramids < 0) pyramids = 0;
	}
	
	/**
	 * Retorna a quantidade atual de Scala Stones.
	 * @return quantidade atual de Scala Stones
	 */
	public int getScalaStones(){
		return scalaStones;
	}
	
	/**
	 * Atualiza a quantidade de Scala Stones, a partir de uma quantidade a ser somada.
	 * @param offset quantidade a ser somada
	 */
	public void updateScalaStones(int offset){
		this.scalaStones += offset;
		if (scalaStones < 0) scalaStones = 0;
	}
	
	/**
	 * Retorna a quantidade atual de pontos de criatividade.
	 * @return quantidade atual de pontos de criatividade
	 */
	public int getCreativity(){
		return creativity;
	}
	
	/**
	 * Atualiza a quantidade de pontos de criatividade, a partir
	 * de uma quantidade a ser somada.
	 * @param offset quantidade a ser somada
	 */
	public void updateCreativity(int offset){
		this.creativity += offset;
		if (creativity < 0) creativity = 0;
	}
	
	/**
	 * Retorna a quantidade atual de Oopyies na vila.
	 * @return quantidade atual de Oopyies na vila
	 */
	public int getOopyies(){
		return oopyies;
	}
	
	/**
	 * Atualiza a quantidade de Oopyies, a partir de uma quantidade a ser somada.
	 * @param offset quantidade a ser somada
	 */
	public void updateOopyies(int offset){
		this.oopyies += offset;
		if (oopyies < 0) oopyies = 0;
	}
	
	/**
	 * Retorna a quantidade atual de Great Rubies.
	 * @return quantidade atual de Great Rubies.
	 */
	public int getGreatRubies(){
		return greatRubies;
	}
	
	/**
	 * Atualiza a quantidade de Great Rubies, a partir de uma
	 * quantidade a ser somada.
	 * @param offset quantidade a ser somada
	 */
	public void updateGreatRubies(int offset){
		this.greatRubies += offset;
		if (greatRubies < 0) greatRubies = 0;
	}
	
	/**
	 * Retorna a quantidade atual de Buildings no mapa
	 * @return quantidade de atual de Buildings 
	 */
	public int getBuildings(){
		return buildings;
	}
	
	/**
	 * Atualiza quantidade de Buildings, a partir de uma quantidade a ser somada.
	 * @param offset quantidade a ser somada
	 */
	public void updateBuildings(int offset){
		this.buildings += offset;
		if (buildings < 0) buildings = 0;
	}
        
    /**
     * Reseta todos os recursos para zero
     */
	public void resetAll(){
            javaSeeds = 0;
		sharpCocos = 0;
		magicPerls = 0;
		pyramids = 0;
		scalaStones = 0;
		
		creativity = 0;
		oopyies = 0;
		greatRubies = 0;
    }
        
	
	/**
	 * Retorna uma representacao em String, para depuracao.
	 */
	@Override
	public String toString(){
		String str = "";
		str += "Java Seeds: " + javaSeeds + "\n";
		str += "Sharp Cocos: " + sharpCocos + "\n";
		str += "Magic Perls: " + magicPerls + "\n";
		str += "PYramids: " + pyramids + "\n";
		str += "Scala Stones: " + scalaStones + "\n";
		str += "Creativity Points: " + creativity + "\n";
		str += "Oopyies to Work: " + oopyies + "\n";
		str += "Great Rubies: " + greatRubies + "\n";
		return str;
	}
	
	public String resultsToString(){
		String str = "Durante o dia, os Oopyies produziram:\n";
		str += "Java Seeds: " + javaSeeds + "\n";
		str += "Sharp Cocos: " + sharpCocos + "\n";
		str += "Magic Perls: " + magicPerls + "\n";
		str += "PYramids: " + pyramids + "\n";
		str += "Scala Stones: " + scalaStones + "\n";
		str += "Pontos de Criatividade: " + creativity + "\n";
		return str;
	}
	
	public void incorpore(ResourceManager r2){
		this.updateCreativity(r2.getCreativity());
		this.updateGreatRubies(r2.getGreatRubies());
		this.updateJavaSeeds(r2.getJavaSeeds());
		this.updateMagicPerls(r2.getMagicPerls());
		this.updateOopyies(r2.getOopyies());
		this.updatePyramids(r2.getPyramids());
		this.updateScalaStones(r2.getScalaStones());
		this.updateSharpCocos(r2.getSharpCocos());
	}
}
