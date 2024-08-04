package educacao;

public class Funcionario extends AbstractMenbro {
	
	public Funcionario (String Nome) {
		super(Nome);
	}

	
	@Override
	public String Acao() {
	
		return"trabalha no IFSC";
	}
	
	@Override
	public String getTipo() {
		
		return "funcionario(a)";
	}


}
