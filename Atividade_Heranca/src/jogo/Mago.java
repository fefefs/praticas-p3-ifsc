package jogo;

public class Mago extends Personagem {
	
	public Mago (String Nome) {
		super(Nome);
	}

	
	@Override
	public String Ataque() {
	
		return"Magia";
	}
	
	@Override
	public String getTipo() {
		
		return "Mago";
	}

}

