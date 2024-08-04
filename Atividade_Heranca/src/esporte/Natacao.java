package esporte;

public class Natacao extends AbstractAtleta {
	
	public Natacao (String Nome) {
		super(Nome);
	}

	
	@Override
	public String Treino() {
	
		return"50m livres";
	}
	
	@Override
	public String competicao() {
	
		return"Olimpiedas";
	}
	
	
	@Override
	public String getTipo() {
		
		return "natacao";
	}

}
