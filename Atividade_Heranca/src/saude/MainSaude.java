package saude;



public class MainSaude {

	public static void main(String[] args) {
		

		AbstractPaciente cardiovascular = new Cardiovascular("Maria");
		AbstractPaciente diabetes = new Diabetes("Joao");
		AbstractPaciente respiratoria = new Respiratoria("Marcio");
		

		cardiovascular.falar();
		diabetes.falar();
		respiratoria.falar();
		
	}

}
