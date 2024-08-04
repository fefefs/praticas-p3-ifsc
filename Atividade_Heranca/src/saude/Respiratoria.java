package saude;

public class Respiratoria extends AbstractPaciente {
	
	public Respiratoria (String Nome) {
		super(Nome);
	}
		
		@Override
		public String Tratamento() {
		
			return"Aerolin";
		}
		
		@Override
		public String getDoenca() {
			
			return "Respiratoria";
		}
	}


