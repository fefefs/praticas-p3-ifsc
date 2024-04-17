package ifsc;

import java.util.ArrayList;

public class MainProduto {

	public static void main(String[] args) {
		
		//***********************Desktops****************************************//
		
		ArrayList<Desktop> desktops = new ArrayList<>();
		
		Desktop d1 = new Desktop();
		d1.setCodBarras(123l);
		d1.setFabricante("Acer");
		d1.setGamer(true);
		ArrayList<String> pecas1 = new ArrayList<>();
		pecas1.add("Monitor");
		pecas1.add("Mouse");
		pecas1.add("Auto Falante");
		d1.setPecas(pecas1);
		desktops.add(d1);
		
		Desktop d2 = new Desktop();
		d2.setCodBarras(213l);
		d2.setFabricante("Dell");
		d2.setGamer(true);
		ArrayList<String> pecas2 = new ArrayList<>();
		pecas2.add("Monitor");
		pecas2.add("Mouse");
		pecas2.add("teclado");
		d2.setPecas(pecas2);
		desktops.add(d2);
		
		Desktop d3 = new Desktop();
		d3.setCodBarras(321l);
		d3.setFabricante("Samsung");
		d3.setGamer(true);
		ArrayList<String> pecas3 = new ArrayList<>();
		pecas3.add("Monitor");
		pecas3.add("Mouse");
		pecas3.add("Auto Falante");
		pecas3.add("teclado");
		d3.setPecas(pecas3);
		desktops.add(d3);
		
		//*****************Smartphones**************************************//
		
		ArrayList<Smartphone> smartphones = new ArrayList<>();
		
		Smartphone s1 = new Smartphone();
		s1.setModelo("A71");
		s1.setCodBarras(456l);
		s1.setFabricante("Samsung");
		s1.setDimensoesTela("15x5");
		smartphones.add(s1);
		
		Smartphone s2 = new Smartphone();
		s2.setModelo("redmi");
		s2.setCodBarras(546l);
		s2.setFabricante("Xiomi");
		s2.setDimensoesTela("16x7");
		smartphones.add(s2);
		
		Smartphone s3 = new Smartphone();
		s3.setModelo("A23");
		s3.setCodBarras(654l);
		s3.setFabricante("Samsung");
		s3.setDimensoesTela("13x4");
		smartphones.add(s3);
		
		//*****************Exibiçao**************************************//
		
		System.out.println("\n**********DESKTOPS**********\n");
		
		for (Desktop dt : desktops) {
		
		System.out.println("Fabricante : " + dt.getFabricante());
		System.out.println("Codigo de barras : " + dt.getCodBarras());
		System.out.println("Gamer: " + dt.getGamer());
		for (String peca : dt.getPecas()) {
			
			System.out.println("Pecas : " + peca);
			
		}
		System.out.println("\n");
	}
	
		System.out.println("\n*****************************\n");
		
		System.out.println("\n**********SMARTPHONES**********\n");
		
		for (Smartphone s : smartphones) {
			
			System.out.println("Modelo : " + s.getModelo());
			System.out.println("Fabricante : " + s.getFabricante());
			System.out.println("Dimensoes de tela : " + s.getDimensoesTela());
			System.out.println("Dimensoes de tela : " + s.getCodBarras());
			System.out.println("\n");
			
		}
			System.out.println("\n*****************************\n");	
	

    }
}

























