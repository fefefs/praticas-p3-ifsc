package esporte;

public class Basquete extends AbstractAtleta {
	
	public Basquete (String Nome) {
		super(Nome);
	}

	
	@Override
	public String Treino() {
	
		return"proficionalmente";
	}
	
	@Override
	public String competicao() {
	
		return"NBA";
	}
	
	
	@Override
	public String getTipo() {
		
		return "basquete";
	}

}
