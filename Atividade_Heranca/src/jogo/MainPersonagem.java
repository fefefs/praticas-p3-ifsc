package jogo;

public class MainPersonagem {

	public static void main(String[] args) {
		
		Personagem mago = new Mago("Gandolf");
		Personagem arqueiro = new Arqueiro("Legolas");
		Personagem guerreiro = new Guerreiro("Aragon");
		
		mago.falar();
		arqueiro.falar();
		guerreiro.falar();

	}

}
