package esporte;

public abstract class AbstractAtleta {
	
String Nome;
	
	//*******************************
	
	public AbstractAtleta( String Nome) {
		this.Nome = Nome;
	}
	//**************************************************
	public abstract String Treino();
	public abstract String competicao();
	public abstract String getTipo();
	
	public void falar () {
		System.out.println("O(A) atleta de " + getTipo() + "  " + Nome + " treina  " + Treino() + " compete na(s)  " + competicao());
	}

}
