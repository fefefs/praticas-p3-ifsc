package educacao;

public class Professor extends AbstractMenbro {
	
	public Professor (String Nome) {
		super(Nome);
	}

	
	@Override
	public String Acao() {
	
		return"Ensina programacao";
	}
	
	@Override
	public String getTipo() {
		
		return "Professor(a)";
	}


}
