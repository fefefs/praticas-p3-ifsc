package educacao;

public class Aluno extends AbstractMenbro {
	
	public Aluno (String Nome) {
		super(Nome);
	}

	
	@Override
	public String Acao() {
	
		return"estuda informatica";
	}
	
	@Override
	public String getTipo() {
		
		return "Aluno(a)";
	}


}
