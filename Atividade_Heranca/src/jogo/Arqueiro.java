package jogo;

public class Arqueiro extends Personagem {
	
	public Arqueiro (String Nome) {
		super( Nome);
	}
	
	@Override
	public String Ataque() {
	
		return"Arco e flecha";
	}
	
	@Override
	public String getTipo() {
		
		return "Arqueiro(a)";
	}

}

