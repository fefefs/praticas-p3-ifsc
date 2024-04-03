package lista3.ex3;


public class animalMain {

	public static void main(String[] args) {
		
		
		Animal gato = new Animal();
		gato.nomePopular = new String[5];
		
		gato.nomeCientifico = "Felis catus";
		gato.nomePopular[0] = "Gato";
		gato.nomePopular[1] = "Gatinho";
		gato.nomePopular[2] = "Gatao";
		gato.nomePopular[3] = "Gatonho";
		gato.nomePopular[4] = "Gatucho";
		gato.familia = "felideos";
		gato.reino = "vertebrata";
		
		System.out.println(  "nome cinetifico : " + gato.nomeCientifico );
		System.out.println( "familia : " + gato.familia );
		System.out.println( "reino : " + gato.reino);
		System.out.println("Os nomes populares para gatos sao : ");
		
		for (int i = 0; i < gato.nomePopular.length; i++) {
			
			System.out.println(gato.nomePopular[i]);
			
		}
		
		
	}

}
