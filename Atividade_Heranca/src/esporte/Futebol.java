package esporte;

public class Futebol extends AbstractAtleta {
	
	public Futebol (String Nome) {
		super(Nome);
	}

	
	@Override
	public String Treino() {
	
		return"ponta-esquerda";
	}
	
	@Override
	public String competicao() {
	
		return"copa";
	}
	
	
	@Override
	public String getTipo() {
		
		return "futebol";
	}

}
