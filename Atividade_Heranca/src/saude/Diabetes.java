package saude;

public class Diabetes extends AbstractPaciente {
	
	public Diabetes (String Nome) {
		super(Nome);
	}
	
	@Override
	public String Tratamento() {
	
		return"Alterações no estilo de vida, como dieta saudável e exercícios físicos.";
	}
	
	@Override
	public String getDoenca() {
		
		return "Diabetes";
	}

}
