package jogo;

public abstract class Personagem {
	
	String Nome;
	
	//*******************************
	
	public Personagem( String Nome) {
		this.Nome = Nome;
	}
	//**************************************************
	public abstract String Ataque();
	public abstract String getTipo();
	
	public void falar () {
		System.out.println("O(A) personagem" + "  " + Nome + " do tipo  " + getTipo() + " ataca com " + Ataque());
	}
	

}
