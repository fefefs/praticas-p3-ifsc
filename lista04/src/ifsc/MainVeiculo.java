package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		
		v1.setNome("Cooper");
		v1.setAno(2023);
		v1.setNumeroDeRodas(4);
		v1.setFabricante("Mini");
		v1.setCor("vermelho");
		
        Veiculo v2 = new Veiculo();
		
		v2.setNome("New Beetle");
		v2.setAno(2019);
		v2.setNumeroDeRodas(4);
		v2.setFabricante("Volkswagen");
		v2.setCor("Verde");
		
        Veiculo v3 = new Veiculo();
		
		v3.setNome("500");
		v3.setAno(2021);
		v3.setNumeroDeRodas(4);
		v3.setFabricante("Fiat");
		v3.setCor("azul");
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		veiculos.add(v1);
		veiculos.add(v2);
		veiculos.add(v3);
		
		System.out.println("******VEICULOS******\n");
		
		for (Veiculo veiculo : veiculos) {
			
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getNumeroDeRodas());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getCor());
			System.out.println("\n********************\n");
			
		}

		
	}

}
