package jogo;

public class Guerreiro extends Personagem {
	
	public Guerreiro (String Nome) {
		super( Nome);
	}
	
	@Override
	public String Ataque() {
	
		return"Espada";
	}
	
	@Override
	public String getTipo() {
		
		return "Gerreiro(a)";
	}

}
