package educacao;

public abstract class AbstractMenbro {
	
    String Nome;
	
	//*******************************
	
	public AbstractMenbro( String Nome) {
		this.Nome = Nome;
	}
	//**************************************************
	public abstract String Acao();
	public abstract String getTipo();
	
	public void falar () {
		System.out.println("O(A) " + getTipo() + "  " + Nome + " " + Acao());
	}

}
