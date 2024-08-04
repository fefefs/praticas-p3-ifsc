package esporte;

public class MainAtleta {

	public static void main(String[] args) {
		
		AbstractAtleta basquete = new Basquete("Lebrom James");
		AbstractAtleta futebol = new Futebol("Marta");
		AbstractAtleta natacao = new Natacao("Bruno Fratus");
		
		basquete.falar();
		futebol.falar();
		natacao.falar();

	}

}
