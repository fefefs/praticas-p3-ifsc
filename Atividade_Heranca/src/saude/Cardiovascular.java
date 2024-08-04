package saude;

public class Cardiovascular extends AbstractPaciente {
	
	public Cardiovascular (String Nome) {
		super(Nome);
	}
	
	@Override
	public String Tratamento() {
	
		return"Praticar atividades físicas, evitar fumar e verificar a pressão regularmente.";
	}
	
	@Override
	public String getDoenca() {
		
		return "Cardiovascular";
	}

}
