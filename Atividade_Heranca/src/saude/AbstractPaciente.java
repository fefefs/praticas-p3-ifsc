package saude;

public abstract class AbstractPaciente {
	
	String nome;
	
	//***********
	
	public AbstractPaciente(String nome) {
		
		this.nome = nome;
		
	}
	
	public abstract String Tratamento();
	public abstract String getDoenca();
	
	public void falar () {
		System.out.println("\n"+"******************" + "\n" + "Paciente : " + nome + "\n" + "Doenca : " + getDoenca() + "\n" + "Tratamentos : " + Tratamento()+ "\n" + "******************");
	}
	
	

	
	

}
