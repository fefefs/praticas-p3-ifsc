package ifsc;

import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		
		 ArrayList<Tutor> Donos = new ArrayList<>();
		
		Tutor Mari = new Tutor();
		Mari.setNomeCompleto("Mariana de Azevedo");
		
		Gato Olibano = new Gato();
		Olibano.setApelido("Oli");
		Olibano.setClasse("Mammalia");
		Olibano.setPedigree("gato de Armario");
		Olibano.setNomeCientifico("Felis Catus Domestico");
		
		Mari.setGato(Olibano);
		Donos.add(Mari);
		
		Tutor Anakin = new Tutor();
		Anakin.setNomeCompleto("Guilherme Anakin Galvão");
		
		Gato Lisa = new Gato();
		Lisa.setApelido("lisa bolota");
		Lisa.setClasse("Mammalia");
		Lisa.setPedigree("gato gordo");
		Lisa.setNomeCientifico("Felis Catus Domestico");
		
		Anakin.setGato(Lisa);
		Donos.add(Anakin);
		
		Tutor Fer = new Tutor();
		Fer.setNomeCompleto("Fernanda Cardoso serafim");
		
		Gato Estrela = new Gato();
		Estrela.setApelido("estrela");
		Estrela.setClasse("Mammalia");
		Estrela.setPedigree("gato de Banco do Brasil");
		Estrela.setNomeCientifico("Felis Catus Domestico");
		
		Fer.setGato(Estrela);
		Donos.add(Fer);

////////////////////////////////////////////////////////////
		
		System.out.println("*********Lista de donos e gatos**********\n\n");
		
		for (Tutor tutor : Donos) {
			System.out.println("Nome do dono : " + tutor.getNomeCompleto());
			System.out.println("Apelido do gato : " + tutor.getGato().getApelido());
			System.out.println("Pedigree do gato : " + tutor.getGato().getPedigree());
			System.out.println("Classe do gato : " + tutor.getGato().getClasse());
			System.out.println("Nome Cientifico do gato : " + tutor.getGato().getNomeCientifico());
			System.out.println("\n");
			
		}
		
		System.out.println("\n****************************************");
		
		
		
		

	}

}
